package com.aria.sdk.classes;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.ws.rs.core.MultivaluedMap;

import com.aria.common.rest.RestUtilities;

/**
 * BaseAriaBilling
 * Web Service class that abstracts SOAP and REST calls
 * @copyright Aria Systems, Inc
 */
public abstract class BaseAriaBilling {
    /*************** CLASS ATTRIBUTES ****************/
    protected String version = "";
    public static final String OUTPUT_JSON = "json";
    public static final String OUTPUT_WDDX = "wddx";
    public static final String OUTPUT_HTML = "html";
    public static final String OUTPUT_XML = "xml";
    protected static String logFile;
    protected CallType callType = CallType.REST;
    protected int timeout = 120;
    protected boolean debug;
    protected String wsdlName = "complete-doc_literal_wrapped.wsdl";
    protected String wsdlVersion = "6.32";
    protected String objectQueryWsdlName = "integration_services-doc_literal_wrapped.wsdl";
    protected String objectQueryWsdlVersion = "6.32";
    public String URL;
    public javax.xml.ws.Holder<java.lang.String> errorMsg;
    public javax.xml.ws.Holder<java.lang.Long> errorCode;
    public final String RESULT = "result";
    private OutPutFormat outPutFormat;
    private LibraryType libraryType;
    private HashMap<String,Object> hashMapReturnValues;
    private static Logger logger;
    private static FileHandler fileHandler;
    /*************** END - CLASS ATTRIBUTES  ****************/

    /********************** CONSTRUCTOR ***********************/
    public BaseAriaBilling(BaseAriaBillingDTO baseAriaBillingDTO) throws Exception {
        setClassAttributes(baseAriaBillingDTO);
    }

    /********************** BASE AND GENERAL METHODS ***********************/
    public void setClassAttributes(BaseAriaBillingDTO baseAriaBillingDTO) throws Exception{
        if (baseAriaBillingDTO.getUrl() == null) {
            throw new RuntimeException("URL parameter required" );
        }
        setLogFile(baseAriaBillingDTO.getLogFile());
        setDebug(baseAriaBillingDTO.getDebug());
        setCallType(baseAriaBillingDTO.getCallType());
        setURL(baseAriaBillingDTO.getUrl());
        setOutPutFormat(baseAriaBillingDTO.getOutPutFormat());
        setLibraryType(baseAriaBillingDTO.getLibraryType());
        validateOutPutFormat();

        if ((baseAriaBillingDTO.getLibraryType() == null || baseAriaBillingDTO.getLibraryType().equals(LibraryType.CORE)) && getCallType().equals(CallType.SOAP)){
            String dispatcherString = "ws/api_ws_class_dispatcher.php";
            if (getURL().contains(dispatcherString)){
                String url = getURL().substring(0, getURL().indexOf(dispatcherString));
                url += "Advanced/wsdl/";
                url += getWsdlVersion()+"/";
                url += getWsdlName();
                setURL(url);
            }
        }
        if (baseAriaBillingDTO.getLibraryType() != null && baseAriaBillingDTO.getLibraryType().equals(LibraryType.OBJECT_QUERY) && getCallType().equals(CallType.SOAP)){
            String dispatcherString = "api/AriaQuery/objects.php";
            if (getURL().contains(dispatcherString)){
                String url = getURL().substring(0, getURL().indexOf(dispatcherString));
                url += "api/AriaQuery/wsdl/";
                url += objectQueryWsdlVersion+"/";
                url += objectQueryWsdlName;
                setURL(url);
            }
        }
    }

    public static FileHandler getFileHandler() {
        if (fileHandler == null){
            if (getLogFile() == null) throw new RuntimeException("Log file route required");
            try {
                fileHandler = new FileHandler(getLogFile());
            } catch (SecurityException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            fileHandler.setFormatter(new SimpleFormatter());
        }
        return fileHandler;
    }

    public static Logger getLogger() {
        if (logger == null){
            String pack = BaseAriaBilling.class.getPackage().getName();
            logger = Logger.getLogger(pack+".BaseAriaBilling");
            logger.setLevel(Level.ALL);
        }
        return logger;
    }

    public void setMessageToLogger(Level level,String message) {
        if (isDebug()){
            getLogger().addHandler(getFileHandler());
            if (getLogger() == null) throw new RuntimeException("Logger not initialized" );
            logger.log(level,message);
        }
    }

    private void validateOutPutFormat() {
        if(getOutPutFormat()==null
                ||(!getOutPutFormat().equals(OutPutFormat.OUTPUT_WDDX)
                        &!getOutPutFormat().equals(OutPutFormat.OUTPUT_JSON)
                        &!getOutPutFormat().equals(OutPutFormat.OUTPUT_HTML)
                        &!getOutPutFormat().equals(OutPutFormat.OUTPUT_XML))){
            setOutPutFormat(OutPutFormat.OUTPUT_JSON);
        }
        setOutPutFormat(OutPutFormat.OUTPUT_JSON);
    }

    public String getValue(String type, Object value) {
        return RestUtilities.getValue(type, value);
    }

    protected void buildHashMapReturnValues(String response,String[] returnValues) {
        if (getOutPutFormat().equals(OutPutFormat.OUTPUT_JSON)){
            if (getLibraryType() == null || getLibraryType().equals(LibraryType.CORE)) {
                setHashMapReturnValues(RestUtilities.buildJSonReturn(response,returnValues));
            } else if (getLibraryType().equals(LibraryType.ADMINTOOLS)) {
                setHashMapReturnValues(com.aria.common.rest.admin.RestUtilities.buildJSonReturn(response,returnValues));
            } else if (getLibraryType().equals(LibraryType.OBJECT_QUERY)) {
                setHashMapReturnValues(com.aria.common.rest.object.RestUtilities.buildJSonReturn(response,returnValues));
            }
        }else if (getOutPutFormat().equals(OutPutFormat.OUTPUT_WDDX)){
            /*
            InputSource source = new InputSource(new StringReader(response));
            try {
                WddxDeserializer wddx = new WddxDeserializer();
                Hashtable wddxData = (Hashtable)wddx.deserialize(source);
                for (int i = 0;i < returnValues.length;i++){
                    if (!wddxData.containsKey(returnValues[i])) continue;
                    getHashMapReturnValues().put(returnValues[i],wddxData.get(returnValues[i]));
                }
            } catch (WddxDeserializationException e) {
            } catch (IOException e) { }
             * */
        }
    }

    protected String buildUrl(String restCallMethod) {
        if (getOutPutFormat() == null){
            return getURL()+"?rest_call="+restCallMethod;
        }else{
            String outPutFormat = "json";
            if (getOutPutFormat().equals(OutPutFormat.OUTPUT_JSON)){
                outPutFormat = "json";
            }
            return getURL()+"?output_format="+outPutFormat+"&rest_call="+restCallMethod;
        }
    }

    protected void addParameters(MultivaluedMap<String, String> parameters, String parmName, String value) {
        if (value == null || value.length() <= 0){
            return;
        }
        parameters.add(parmName,value);
    }
    /********************** END - BASE AND GENERAL METHODS ***********************/

    /*************** GETTERS ****************/
    public javax.xml.ws.Holder<java.lang.String> getErrorMsg() {
        return errorMsg;
    }

    public javax.xml.ws.Holder<java.lang.Long> getErrorCode() {
        return errorCode;
    }

    public HashMap<String, Object> getHashMapReturnValues() {
        if (this.hashMapReturnValues == null)
            this.hashMapReturnValues = new HashMap<String,Object>();
        return this.hashMapReturnValues;
    }

    public String getVersion() {
        return version;
    }

    public static String getLogFile() {
        return logFile;
    }

    public CallType getCallType() {
        return callType;
    }

    public int getTimeout() {
        return timeout;
    }

    public boolean isDebug() {
        return debug;
    }

    public OutPutFormat getOutPutFormat() {
        return outPutFormat;
    }

    public LibraryType getLibraryType() {
        return libraryType;
    }

    public String getWsdlName() {
        return wsdlName;
    }

    public String getWsdlVersion() {
        return wsdlVersion;
    }

    public String getURL() {
        return URL;
    }
    /*************** END - GETTERS ****************/

    /******************* SETTERS ********************/
    public void setErrorMsg(javax.xml.ws.Holder<java.lang.String> errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setErrorCode(javax.xml.ws.Holder<java.lang.Long> errorCode) {
        this.errorCode = errorCode;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setLogFile(String logger) {
        BaseAriaBilling.logFile = logger;
    }

    public void setCallType(CallType type) {
        this.callType = type;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public void setOutPutFormat(OutPutFormat outPutFormat) {
        this.outPutFormat = outPutFormat;
    }

    public void setLibraryType(LibraryType libraryType) {
        this.libraryType = libraryType;
    }

    public void setURL(String url) {
        this.URL = url;
    }

    public void setHashMapReturnValues(HashMap<String, Object> hashMapReturnValues) {
        this.hashMapReturnValues = hashMapReturnValues;
    }

    /******************* END - SETTERS ********************/
}
