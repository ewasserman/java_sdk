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
 *
 * @copyright Aria Systems, Inc
 */
public abstract class BaseAriaBilling {
    /*************** CLASS ATTRIBUTES ****************/
    protected static final String wsdlName = "complete-doc_literal_wrapped.wsdl";
    protected static final String wsdlVersion = "6.45";
    protected static final String objectQueryWsdlName = "integration_services-doc_literal_wrapped.wsdl";
    protected static final String objectQueryWsdlVersion = "6.45";

    private static final Logger logger;
    static {
        logger = Logger.getLogger(BaseAriaBilling.class.getCanonicalName());
        logger.setLevel(Level.ALL);
    }

    public final String URL;
    protected final OutPutFormat outPutFormat;
    protected final LibraryType libraryType;
    protected final String logFile;
    protected final CallType callType;

    private final FileHandler fileHandler;

    /*************** END - CLASS ATTRIBUTES  ****************/

    /********************** CONSTRUCTOR ***********************/
    public BaseAriaBilling(BaseAriaBillingDTO baseAriaBillingDTO) throws Exception {
        logFile = baseAriaBillingDTO.getLogFile();
        if (getLogFile() == null) throw new RuntimeException("Log file route required");
        try {
            fileHandler = new FileHandler(getLogFile());
        } catch (SecurityException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        fileHandler.setFormatter(new SimpleFormatter());
        callType = baseAriaBillingDTO.getCallType();
        outPutFormat = baseAriaBillingDTO.getOutPutFormat() != null ? baseAriaBillingDTO.getOutPutFormat() : OutPutFormat.OUTPUT_JSON;
        libraryType = baseAriaBillingDTO.getLibraryType();
        URL = computeUrl(baseAriaBillingDTO);


    }

    /********************** BASE AND GENERAL METHODS ***********************/
    protected static String computeUrl(BaseAriaBillingDTO baseAriaBillingDTO) {
        String baseUrl = baseAriaBillingDTO.getUrl();
        if (baseUrl == null) {
            throw new RuntimeException("URL parameter required" );
        }
        if (baseAriaBillingDTO.getCallType().equals(CallType.SOAP)) {
            if ((baseAriaBillingDTO.getLibraryType() == null || baseAriaBillingDTO.getLibraryType().equals(LibraryType.CORE)) ) {
                String dispatcherString = "ws/api_ws_class_dispatcher.php";
                int dispatcherStringIndex = baseUrl.indexOf(dispatcherString);
                if (dispatcherStringIndex > 0) {
                    String url = baseUrl.substring(0, dispatcherStringIndex);
                    url += "Advanced/wsdl/";
                    url += wsdlVersion + "/";
                    url += wsdlName;
                    return url;
                }
            } else if (baseAriaBillingDTO.getLibraryType() != null && baseAriaBillingDTO.getLibraryType().equals(LibraryType.OBJECT_QUERY) ) {
                String dispatcherString = "api/AriaQuery/objects.php";
                int dispatcherStringIndex = baseUrl.indexOf(dispatcherString);
                if (dispatcherStringIndex > 0) {
                    String url = baseUrl.substring(0, baseUrl.indexOf(dispatcherString));
                    url += "api/AriaQuery/wsdl/";
                    url += objectQueryWsdlVersion + "/";
                    url += objectQueryWsdlName;
                    return url;
                }
            }
        }
        return baseUrl;
    }

    public FileHandler getFileHandler() {
        return fileHandler;
    }

    public static Logger getLogger() {
        return logger;
    }

    public void setMessageToLogger(Level level,String message) {
        logger.log(level, message);
    }

    public String getValue(String type, Object value) {
        return RestUtilities.getValue(type, value);
    }

    protected HashMap<String, Object> buildHashMapReturnValues(String response, String[] returnValues) {
        if (getOutPutFormat().equals(OutPutFormat.OUTPUT_JSON)){
            if (getLibraryType() == null || getLibraryType().equals(LibraryType.CORE)) {
                return RestUtilities.buildJSonReturn(response,returnValues);
            } else if (getLibraryType().equals(LibraryType.ADMINTOOLS)) {
                return com.aria.common.rest.admin.RestUtilities.buildJSonReturn(response,returnValues);
            } else if (getLibraryType().equals(LibraryType.OBJECT_QUERY)) {
                return com.aria.common.rest.object.RestUtilities.buildJSonReturn(response,returnValues);
            }
        }else if (getOutPutFormat().equals(OutPutFormat.OUTPUT_WDDX)){
        }
        return new HashMap<String, Object>();
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

    public String getLogFile() {
        return logFile;
    }

    public CallType getCallType() { return callType; }

    public OutPutFormat getOutPutFormat() {
        return outPutFormat;
    }

    public LibraryType getLibraryType() { return libraryType; }

    public String getWsdlName() {
        return wsdlName;
    }

    public String getWsdlVersion() { return wsdlVersion; }

    public String getURL() { return URL; }

    /*************** END - GETTERS ****************/

}
