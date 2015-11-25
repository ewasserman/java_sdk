package com.aria.sdk.classes;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import com.aria.common.shared.object.AriaIntegrationServicesApi;
import com.aria.common.shared.object.IntegrationServicesPort;

/**
 * AriaBillingIntegrationSoap
 * Web Service class
 * @copyright Aria Systems, Inc
 * @author (Automatic generated)
 */
public class AriaBillingIntegrationSoap extends BaseAriaBilling implements AriaBillingIntegration {
    /*************** CLASS ATTRIBUTES ****************/
    private IntegrationServicesPort completePort = null;
    /*************** END - CLASS ATTRIBUTES ****************/

    /************** CONSTRUCTOR ************************/
    public AriaBillingIntegrationSoap(BaseAriaBillingDTO baseAriaBillingDTO) throws Exception {
        super(baseAriaBillingDTO);
    }
    /*************** END - CONSTRUCTOR ****************/

    /*************** GETTERS ****************/
    public IntegrationServicesPort getIntegrationServicesPort() {
        if (completePort == null){
            try {
                URL wsdlURL = new URL(getURL());
                AriaIntegrationServicesApi ss = new AriaIntegrationServicesApi(wsdlURL);
                completePort = ss.getIntegrationServicesPort();
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        return completePort;
    }
    /*************** END - GETTERS ****************/

    /********************************** METHODS IMPLEMENTATION ***********************************************/

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAccountDetails(Long client_no, String auth_key, String query_string, Long limit, Long offset){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_account_details = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().getAccountDetails(client_no, auth_key, query_string, limit, offset, h_error_code, h_error_msg, h_starting_record, h_total_records, h_account_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("account_details",((javax.xml.ws.Holder)h_account_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAccountDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String query_string = (String) map.get("query_string");
                                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                
        return getAccountDetails(client_no, auth_key, query_string, limit, offset);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAccountStatusHistory(Long client_no, String auth_key, String query_string, Long limit, Long offset){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_account_status_history = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().getAccountStatusHistory(client_no, auth_key, query_string, limit, offset, h_error_code, h_error_msg, h_starting_record, h_total_records, h_account_status_history);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("account_status_history",((javax.xml.ws.Holder)h_account_status_history).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAccountStatusHistory(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String query_string = (String) map.get("query_string");
                                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                
        return getAccountStatusHistory(client_no, auth_key, query_string, limit, offset);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAccountPlanHistory(Long client_no, String auth_key, String query_string, Long limit, Long offset){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_account_plan_history = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().getAccountPlanHistory(client_no, auth_key, query_string, limit, offset, h_error_code, h_error_msg, h_starting_record, h_total_records, h_account_plan_history);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("account_plan_history",((javax.xml.ws.Holder)h_account_plan_history).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAccountPlanHistory(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String query_string = (String) map.get("query_string");
                                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                
        return getAccountPlanHistory(client_no, auth_key, query_string, limit, offset);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getPaymentDetails(Long client_no, String auth_key, String query_string, Long limit, Long offset){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_payment_details = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().getPaymentDetails(client_no, auth_key, query_string, limit, offset, h_error_code, h_error_msg, h_starting_record, h_total_records, h_payment_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("payment_details",((javax.xml.ws.Holder)h_payment_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPaymentDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String query_string = (String) map.get("query_string");
                                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                
        return getPaymentDetails(client_no, auth_key, query_string, limit, offset);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getOrderDetails(Long client_no, String auth_key, String query_string, Long limit, Long offset){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_order_details = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().getOrderDetails(client_no, auth_key, query_string, limit, offset, h_error_code, h_error_msg, h_starting_record, h_total_records, h_order_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("order_details",((javax.xml.ws.Holder)h_order_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getOrderDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String query_string = (String) map.get("query_string");
                                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                
        return getOrderDetails(client_no, auth_key, query_string, limit, offset);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getInvoiceInformation(Long client_no, String auth_key, String query_string, Long limit, Long offset){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_details = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().getInvoiceInformation(client_no, auth_key, query_string, limit, offset, h_error_code, h_error_msg, h_starting_record, h_total_records, h_invoice_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("invoice_details",((javax.xml.ws.Holder)h_invoice_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getInvoiceInformation(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String query_string = (String) map.get("query_string");
                                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                
        return getInvoiceInformation(client_no, auth_key, query_string, limit, offset);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getTransactionInformation(Long client_no, String auth_key, String query_string, Long limit, Long offset){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_transaction_information = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().getTransactionInformation(client_no, auth_key, query_string, limit, offset, h_error_code, h_error_msg, h_starting_record, h_total_records, h_transaction_information);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("transaction_information",((javax.xml.ws.Holder)h_transaction_information).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getTransactionInformation(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String query_string = (String) map.get("query_string");
                                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                
        return getTransactionInformation(client_no, auth_key, query_string, limit, offset);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getRefundInformation(Long client_no, String auth_key, String query_string, Long limit, Long offset){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_refund_information = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().getRefundInformation(client_no, auth_key, query_string, limit, offset, h_error_code, h_error_msg, h_starting_record, h_total_records, h_refund_information);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("refund_information",((javax.xml.ws.Holder)h_refund_information).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getRefundInformation(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String query_string = (String) map.get("query_string");
                                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                
        return getRefundInformation(client_no, auth_key, query_string, limit, offset);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getCouponHistory(Long client_no, String auth_key, String query_string, Long limit, Long offset){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_coupon_history = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().getCouponHistory(client_no, auth_key, query_string, limit, offset, h_error_code, h_error_msg, h_starting_record, h_total_records, h_coupon_history);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("coupon_history",((javax.xml.ws.Holder)h_coupon_history).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getCouponHistory(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String query_string = (String) map.get("query_string");
                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                
        return getCouponHistory(client_no, auth_key, query_string, limit, offset);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> listTransactionTypes(Long client_no, String auth_key, Long limit, Long offset, String query_string){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_map_record = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().listTransactionTypes(client_no, auth_key, limit, offset, query_string, h_error_code, h_error_msg, h_starting_record, h_total_records, h_map_record);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("map_record",((javax.xml.ws.Holder)h_map_record).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> listTransactionTypes(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
                        Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                String query_string = (String) map.get("query_string");
                
        return listTransactionTypes(client_no, auth_key, limit, offset, query_string);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> listPaymentMethods(Long client_no, String auth_key, Long limit, Long offset, String query_string){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_map_record = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().listPaymentMethods(client_no, auth_key, limit, offset, query_string, h_error_code, h_error_msg, h_starting_record, h_total_records, h_map_record);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("map_record",((javax.xml.ws.Holder)h_map_record).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> listPaymentMethods(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
                        Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                String query_string = (String) map.get("query_string");
                
        return listPaymentMethods(client_no, auth_key, limit, offset, query_string);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> listPaymentProcessors(Long client_no, String auth_key, Long limit, Long offset, String query_string){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_map_record = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().listPaymentProcessors(client_no, auth_key, limit, offset, query_string, h_error_code, h_error_msg, h_starting_record, h_total_records, h_map_record);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("map_record",((javax.xml.ws.Holder)h_map_record).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> listPaymentProcessors(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
                        Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                String query_string = (String) map.get("query_string");
                
        return listPaymentProcessors(client_no, auth_key, limit, offset, query_string);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAllInvoiceInformation(Long client_no, String auth_key, String query_string, Long limit, Long offset){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_invoice_details = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().getAllInvoiceInformation(client_no, auth_key, query_string, limit, offset, h_error_code, h_error_msg, h_starting_record, h_total_records, h_all_invoice_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("all_invoice_details",((javax.xml.ws.Holder)h_all_invoice_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAllInvoiceInformation(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String query_string = (String) map.get("query_string");
                                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                
        return getAllInvoiceInformation(client_no, auth_key, query_string, limit, offset);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getPlanInstanceInformationM(Long client_no, String auth_key, String query_string, Long limit, Long offset){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plan_instance_details = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().getPlanInstanceInformationM(client_no, auth_key, query_string, limit, offset, h_error_code, h_error_msg, h_plan_instance_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("plan_instance_details",((javax.xml.ws.Holder)h_plan_instance_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPlanInstanceInformationM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String query_string = (String) map.get("query_string");
                                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                
        return getPlanInstanceInformationM(client_no, auth_key, query_string, limit, offset);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAccountDetailsM(Long client_no, String auth_key, String query_string, Long limit, Long offset){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_account_details_m = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().getAccountDetailsM(client_no, auth_key, query_string, limit, offset, h_error_code, h_error_msg, h_starting_record, h_total_records, h_account_details_m);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("account_details_m",((javax.xml.ws.Holder)h_account_details_m).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAccountDetailsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String query_string = (String) map.get("query_string");
                                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                
        return getAccountDetailsM(client_no, auth_key, query_string, limit, offset);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getCouponHistoryM(Long client_no, String auth_key, String query_string, Long limit, Long offset){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_coupon_history_m = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().getCouponHistoryM(client_no, auth_key, query_string, limit, offset, h_error_code, h_error_msg, h_starting_record, h_total_records, h_coupon_history_m);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("coupon_history_m",((javax.xml.ws.Holder)h_coupon_history_m).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getCouponHistoryM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String query_string = (String) map.get("query_string");
                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                
        return getCouponHistoryM(client_no, auth_key, query_string, limit, offset);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getInvoiceInformationM(Long client_no, String auth_key, String query_string, Long limit, Long offset){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_details_m = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().getInvoiceInformationM(client_no, auth_key, query_string, limit, offset, h_error_code, h_error_msg, h_starting_record, h_total_records, h_invoice_details_m);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("invoice_details_m",((javax.xml.ws.Holder)h_invoice_details_m).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getInvoiceInformationM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String query_string = (String) map.get("query_string");
                                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                
        return getInvoiceInformationM(client_no, auth_key, query_string, limit, offset);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAllInvoiceInformationM(Long client_no, String auth_key, String query_string, Long limit, Long offset){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_invoice_details_m = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().getAllInvoiceInformationM(client_no, auth_key, query_string, limit, offset, h_error_code, h_error_msg, h_starting_record, h_total_records, h_all_invoice_details_m);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("all_invoice_details_m",((javax.xml.ws.Holder)h_all_invoice_details_m).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAllInvoiceInformationM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String query_string = (String) map.get("query_string");
                                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                
        return getAllInvoiceInformationM(client_no, auth_key, query_string, limit, offset);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAccountPlanHistoryM(Long client_no, String auth_key, String query_string, Long limit, Long offset){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_starting_record = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_records = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_account_plan_history_m = new javax.xml.ws.Holder();

        
        getIntegrationServicesPort().getAccountPlanHistoryM(client_no, auth_key, query_string, limit, offset, h_error_code, h_error_msg, h_starting_record, h_total_records, h_account_plan_history_m);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("starting_record",((javax.xml.ws.Holder)h_starting_record).value);
        getHashMapReturnValues().put("total_records",((javax.xml.ws.Holder)h_total_records).value);
        getHashMapReturnValues().put("account_plan_history_m",((javax.xml.ws.Holder)h_account_plan_history_m).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAccountPlanHistoryM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String query_string = (String) map.get("query_string");
                                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                
        return getAccountPlanHistoryM(client_no, auth_key, query_string, limit, offset);
    }

    /********************************** END - METHODS IMPLEMENTATION ***********************************************/
}
