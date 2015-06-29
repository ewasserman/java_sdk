package com.aria.common.rest.object;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import javax.ws.rs.core.MultivaluedMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.aria.common.shared.object.*;

/**
 * RestUtilities
 * Web Service class which has method used on rest service calls
 * @copyright Aria Systems, Inc
 */
public class RestUtilities {

    public static HashMap<String, Object> buildJSonReturn(String response, String[] returnValues) {
        HashMap<String,Object> returnHashMap = new HashMap<String,Object>();
        JSONObject jsonObj = (JSONObject)JSONValue.parse(response);
        if (jsonObj == null) return null;
        for (int i = 0;i < returnValues.length;i++){
            if (!jsonObj.containsKey(returnValues[i])) continue;
            if (jsonObj.get(returnValues[i]) instanceof JSONArray){
                returnHashMap.put(returnValues[i], buildReturnElement(jsonObj,returnValues[i]));
            }else{
                returnHashMap.put(returnValues[i], jsonObj.get(returnValues[i]));
            }
        }
        return returnHashMap;
    }

    public static String getValue(String type, Object value) {
        String ret = "";
        if (type.equalsIgnoreCase("long")){
            Long longValue = (Long) value;
            if (longValue!=null){
                ret = Long.toString(longValue);
            }
        }else if (type.equalsIgnoreCase("double")){
            Double doubleValue = (Double) value;
            if (doubleValue!=null){
                ret = Double.toString(doubleValue);
            }
        }else if (type.equalsIgnoreCase("string")){
            String stringValue = (String) value;
            if (stringValue!=null){
                ret = stringValue;
            }
        }
        return ret;
    }

    private static Double getDoubleValue(JSONObject jsonObject, String field) {
        if (jsonObject.get(field)==null) return 0D;
        Double doubleValue = 0D;
        try {
            doubleValue = Double.parseDouble(jsonObject.get(field).toString());
        } catch (NumberFormatException e) {
            String newValue = jsonObject.get(field).toString()+".0";
            try {
                doubleValue = Double.parseDouble(newValue);
            } catch (NumberFormatException ex) {
                doubleValue = 0D;
            }
        }
        return doubleValue;
    }

    private static Long getLongValue(JSONObject jsonObject, String field) {
        if (jsonObject.get(field)==null) return 0L;
        Long longValue = 0L;
        try {
            longValue = Long.parseLong(jsonObject.get(field).toString());
        } catch (NumberFormatException e) {
            longValue = 0L;
        }
        return longValue;
    }

    private static String getStringValue(JSONObject jsonObject, String field) {
        String ret = "";
        if (jsonObject.get(field)==null) return ret;
        return jsonObject.get(field).toString();
    }

    /* ****************** RETURN ELEMENT BASE METHOD ********************************* */
    private static Object buildReturnElement(JSONObject jsonObj, String value) {
        JSONArray jsonArray=(JSONArray)jsonObj.get(value);
        Object ret = new Object();
        if (value.equalsIgnoreCase(value)){
            try {
                String methodName = buildJavaName(value);
                methodName = "build"+methodName+"ReturnElement";
                Class<?>[] classes = {JSONArray.class};
                Method method = RestUtilities.class.getDeclaredMethod (methodName, classes);
                ret = method.invoke(new RestUtilities(), jsonArray);
            } catch (SecurityException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        return ret;
    }

    /** Wsdl to Java For example parm_name to ParmName  */
    private static String buildJavaName(String name) {
        String ret = "";
        boolean toUpper = true;
        /*SpecialCase*/
        for (char character : name.toCharArray()) {
            if (toUpper) character = Character.toUpperCase(character);
            toUpper = character == '_' || Character.toString(character).matches("[0-9]");
            if (character != '_') ret += character;
        }
        return ret;
    }
    /* ****************** END - RETURN ELEMENT BASE METHOD ********************************* */

    /* ****************** SPECIFIC METHODS FOR EACH RETURN ELEMENT (build<#name#>) ********************************************** */
    public static ArrayList<CurrentBillingInfoReturnElement> buildCurrentBillingInfoReturnElement(JSONArray jsonArray) {
        ArrayList<CurrentBillingInfoReturnElement> returnElement = new ArrayList<CurrentBillingInfoReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            CurrentBillingInfoReturnElement entity = new CurrentBillingInfoReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setBillingFirstName(getStringValue(jsonObject,"billing_first_name"));
            entity.setBillingMiddleInitial(getStringValue(jsonObject,"billing_middle_initial"));
            entity.setBillingLastName(getStringValue(jsonObject,"billing_last_name"));
            entity.setBillingAddress1(getStringValue(jsonObject,"billing_address1"));
            entity.setBillingAddress2(getStringValue(jsonObject,"billing_address2"));
            entity.setBillingCity(getStringValue(jsonObject,"billing_city"));
            entity.setBillingState(getStringValue(jsonObject,"billing_state"));
            entity.setBillingLocality(getStringValue(jsonObject,"billing_locality"));
            entity.setBillingZip(getStringValue(jsonObject,"billing_zip"));
            entity.setBillingCountry(getStringValue(jsonObject,"billing_country"));
            entity.setBillingPhoneNpa(getStringValue(jsonObject,"billing_phone_npa"));
            entity.setBillingPhoneNxx(getStringValue(jsonObject,"billing_phone_nxx"));
            entity.setBillingPhoneSuffix(getStringValue(jsonObject,"billing_phone_suffix"));
            entity.setBillingPhoneExtension(getStringValue(jsonObject,"billing_phone_extension"));
            entity.setBillingIntlPhone(getStringValue(jsonObject,"billing_intl_phone"));
            entity.setBillingEmail(getStringValue(jsonObject,"billing_email"));
            entity.setBillingPayMethod(getStringValue(jsonObject,"billing_pay_method"));
            entity.setBillingCcExpireMm(getStringValue(jsonObject,"billing_cc_expire_mm"));
            entity.setBillingCcExpireYyyy(getStringValue(jsonObject,"billing_cc_expire_yyyy"));
            entity.setBillingBankRoutingNum(getStringValue(jsonObject,"billing_bank_routing_num"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<SuppFieldReturnElement> buildSuppFieldReturnElement(JSONArray jsonArray) {
        ArrayList<SuppFieldReturnElement> returnElement = new ArrayList<SuppFieldReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            SuppFieldReturnElement entity = new SuppFieldReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setSuppFieldName(getStringValue(jsonObject,"supp_field_name"));
            entity.setSuppFieldValue(getStringValue(jsonObject,"supp_field_value"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<SuppPlanReturnElement> buildSuppPlanReturnElement(JSONArray jsonArray) {
        ArrayList<SuppPlanReturnElement> returnElement = new ArrayList<SuppPlanReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            SuppPlanReturnElement entity = new SuppPlanReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setSuppPlanNo(getLongValue(jsonObject,"supp_plan_no"));
            entity.setSuppPlanName(getStringValue(jsonObject,"supp_plan_name"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<AccountDetailsReturnElement> buildAccountDetailsReturnElement(JSONArray jsonArray) {
        ArrayList<AccountDetailsReturnElement> returnElement = new ArrayList<AccountDetailsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AccountDetailsReturnElement entity = new AccountDetailsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setAcctNo(getLongValue(jsonObject,"acct_no"));
            entity.setSeniorAcctNo(getLongValue(jsonObject,"senior_acct_no"));
            entity.setUserId(getStringValue(jsonObject,"user_id"));
            entity.setPassword(getStringValue(jsonObject,"password"));
            entity.setStatusCd(getStringValue(jsonObject,"status_cd"));
            entity.setPlanNo(getLongValue(jsonObject,"plan_no"));
            entity.setFirstName(getStringValue(jsonObject,"first_name"));
            entity.setMi(getStringValue(jsonObject,"mi"));
            entity.setLastName(getStringValue(jsonObject,"last_name"));
            entity.setAddress1(getStringValue(jsonObject,"address_1"));
            entity.setAddress2(getStringValue(jsonObject,"address_2"));
            entity.setCity(getStringValue(jsonObject,"city"));
            entity.setLocality(getStringValue(jsonObject,"locality"));
            entity.setPostalCode(getStringValue(jsonObject,"postal_code"));
            entity.setCountry(getStringValue(jsonObject,"country"));
            entity.setPhoneNpa(getLongValue(jsonObject,"phone_npa"));
            entity.setPhoneNxx(getLongValue(jsonObject,"phone_nxx"));
            entity.setPhoneSuffix(getStringValue(jsonObject,"phone_suffix"));
            entity.setPhoneExtension(getStringValue(jsonObject,"phone_extension"));
            entity.setIntlPhone(getStringValue(jsonObject,"intl_phone"));
            entity.setAltEmail(getStringValue(jsonObject,"alt_email"));
            entity.setClientAcctId(getStringValue(jsonObject,"client_acct_id"));
            entity.setPromoCd(getStringValue(jsonObject,"promo_cd"));
            entity.setRespLevelCd(getStringValue(jsonObject,"resp_level_cd"));
            entity.setPayMethod(getStringValue(jsonObject,"pay_method"));
            entity.setCreated(getStringValue(jsonObject,"created"));
            entity.setLastUpdated(getStringValue(jsonObject,"last_updated"));
            entity.setClient1(getStringValue(jsonObject,"client_1"));
            entity.setCompanyName(getStringValue(jsonObject,"company_name"));
                        ArrayList<CurrentBillingInfoReturnElement> arrayListCurrentBillingInfoReturnElement = buildCurrentBillingInfoReturnElement((JSONArray)jsonObject.get("current_billing_info"));
            for (CurrentBillingInfoReturnElement element : arrayListCurrentBillingInfoReturnElement){
                entity.getCurrentBillingInfo().add(element);
            }
            entity.setPlanName(getStringValue(jsonObject,"plan_name"));
            entity.setStateProv(getStringValue(jsonObject,"state_prov"));
            entity.setCountryEnglish(getStringValue(jsonObject,"country_english"));
            entity.setPromoName(getStringValue(jsonObject,"promo_name"));
            entity.setNoProvisionInd(getStringValue(jsonObject,"no_provision_ind"));
            entity.setBillActionCd(getStringValue(jsonObject,"bill_action_cd"));
            entity.setStatusName(getStringValue(jsonObject,"status_name"));
            entity.setAcctBalance(getDoubleValue(jsonObject,"acct_balance"));
                        ArrayList<SuppFieldReturnElement> arrayListSuppFieldReturnElement = buildSuppFieldReturnElement((JSONArray)jsonObject.get("supp_field"));
            for (SuppFieldReturnElement element : arrayListSuppFieldReturnElement){
                entity.getSuppField().add(element);
            }
            entity.setBillDay(getLongValue(jsonObject,"bill_day"));
                        ArrayList<SuppPlanReturnElement> arrayListSuppPlanReturnElement = buildSuppPlanReturnElement((JSONArray)jsonObject.get("supp_plan"));
            for (SuppPlanReturnElement element : arrayListSuppPlanReturnElement){
                entity.getSuppPlan().add(element);
            }
            entity.setInvoicePostingMethodCd(getLongValue(jsonObject,"invoice_posting_method_cd"));
            entity.setAcctStartDate(getStringValue(jsonObject,"acct_start_date"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<AccountStatusHistoryReturnElement> buildAccountStatusHistoryReturnElement(JSONArray jsonArray) {
        ArrayList<AccountStatusHistoryReturnElement> returnElement = new ArrayList<AccountStatusHistoryReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AccountStatusHistoryReturnElement entity = new AccountStatusHistoryReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setAcctNo(getStringValue(jsonObject,"acct_no"));
            entity.setUserId(getStringValue(jsonObject,"user_id"));
            entity.setCompanyName(getStringValue(jsonObject,"company_name"));
            entity.setClient1(getStringValue(jsonObject,"client_1"));
            entity.setPromoCd(getStringValue(jsonObject,"promo_cd"));
            entity.setAccountCreationDate(getStringValue(jsonObject,"account_creation_date"));
            entity.setPlanNo(getStringValue(jsonObject,"plan_no"));
            entity.setNewStatus(getStringValue(jsonObject,"new_status"));
            entity.setNewStatusCd(getLongValue(jsonObject,"new_status_cd"));
            entity.setOldStatus(getStringValue(jsonObject,"old_status"));
            entity.setOldStatusCd(getLongValue(jsonObject,"old_status_cd"));
            entity.setChangeDate(getStringValue(jsonObject,"change_date"));
            entity.setComments(getStringValue(jsonObject,"comments"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<AccountPlanHistoryReturnElement> buildAccountPlanHistoryReturnElement(JSONArray jsonArray) {
        ArrayList<AccountPlanHistoryReturnElement> returnElement = new ArrayList<AccountPlanHistoryReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AccountPlanHistoryReturnElement entity = new AccountPlanHistoryReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setAcctNo(getStringValue(jsonObject,"acct_no"));
            entity.setUserId(getStringValue(jsonObject,"user_id"));
            entity.setClient1(getStringValue(jsonObject,"client_1"));
            entity.setPromoCd(getStringValue(jsonObject,"promo_cd"));
            entity.setAccountCreationDate(getStringValue(jsonObject,"account_creation_date"));
            entity.setPlanNo(getLongValue(jsonObject,"plan_no"));
            entity.setFromDate(getStringValue(jsonObject,"from_date"));
            entity.setToDate(getStringValue(jsonObject,"to_date"));
            entity.setOldPlanName(getStringValue(jsonObject,"old_plan_name"));
            entity.setOldPlanNo(getLongValue(jsonObject,"old_plan_no"));
            entity.setNewPlanName(getStringValue(jsonObject,"new_plan_name"));
            entity.setNewPlanNo(getLongValue(jsonObject,"new_plan_no"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<PaymentDetailsReturnElement> buildPaymentDetailsReturnElement(JSONArray jsonArray) {
        ArrayList<PaymentDetailsReturnElement> returnElement = new ArrayList<PaymentDetailsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PaymentDetailsReturnElement entity = new PaymentDetailsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPaymentId(getLongValue(jsonObject,"payment_id"));
            entity.setProcessorPaymentId(getLongValue(jsonObject,"processor_payment_id"));
            entity.setAcctNo(getLongValue(jsonObject,"acct_no"));
            entity.setUserId(getStringValue(jsonObject,"user_id"));
            entity.setCurrencyCd(getStringValue(jsonObject,"currency_cd"));
            entity.setPaymentDate(getStringValue(jsonObject,"payment_date"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setCollectionStatusCd(getStringValue(jsonObject,"collection_status_cd"));
            entity.setCollectionStatusText(getStringValue(jsonObject,"collection_status_text"));
            entity.setProcessorName(getStringValue(jsonObject,"processor_name"));
            entity.setMethod(getStringValue(jsonObject,"method"));
            entity.setReferenceNum(getStringValue(jsonObject,"reference_num"));
            entity.setLastUpdated(getStringValue(jsonObject,"last_updated"));
            entity.setVoidingEventNo(getLongValue(jsonObject,"voiding_event_no"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<OrderItemReturnElement> buildOrderItemReturnElement(JSONArray jsonArray) {
        ArrayList<OrderItemReturnElement> returnElement = new ArrayList<OrderItemReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            OrderItemReturnElement entity = new OrderItemReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setSku(getStringValue(jsonObject,"sku"));
            entity.setDescription(getStringValue(jsonObject,"description"));
            entity.setUnits(getDoubleValue(jsonObject,"units"));
            entity.setUnitPrice(getDoubleValue(jsonObject,"unit_price"));
            entity.setSubtotal(getDoubleValue(jsonObject,"subtotal"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<OrderDetailsReturnElement> buildOrderDetailsReturnElement(JSONArray jsonArray) {
        ArrayList<OrderDetailsReturnElement> returnElement = new ArrayList<OrderDetailsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            OrderDetailsReturnElement entity = new OrderDetailsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setOrderNo(getLongValue(jsonObject,"order_no"));
            entity.setAcctNo(getLongValue(jsonObject,"acct_no"));
            entity.setUserId(getStringValue(jsonObject,"user_id"));
            entity.setInvoiceNo(getStringValue(jsonObject,"invoice_no"));
            entity.setCreateDate(getStringValue(jsonObject,"create_date"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setCurrencyCd(getStringValue(jsonObject,"currency_cd"));
            entity.setLastUpdated(getStringValue(jsonObject,"last_updated"));
            entity.setOrderStatus(getStringValue(jsonObject,"order_status"));
                        ArrayList<OrderItemReturnElement> arrayListOrderItemReturnElement = buildOrderItemReturnElement((JSONArray)jsonObject.get("order_item"));
            for (OrderItemReturnElement element : arrayListOrderItemReturnElement){
                entity.getOrderItem().add(element);
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<InvoiceLineTaxReturnElement> buildInvoiceLineTaxReturnElement(JSONArray jsonArray) {
        ArrayList<InvoiceLineTaxReturnElement> returnElement = new ArrayList<InvoiceLineTaxReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            InvoiceLineTaxReturnElement entity = new InvoiceLineTaxReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setTaxId(getLongValue(jsonObject,"tax_id"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setBeforeCreditAmount(getDoubleValue(jsonObject,"before_credit_amount"));
            entity.setJurisdiction(getStringValue(jsonObject,"jurisdiction"));
            entity.setDescription(getStringValue(jsonObject,"description"));
            entity.setIsExcluded(getLongValue(jsonObject,"is_excluded"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<InvoiceLineReturnElement> buildInvoiceLineReturnElement(JSONArray jsonArray) {
        ArrayList<InvoiceLineReturnElement> returnElement = new ArrayList<InvoiceLineReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            InvoiceLineReturnElement entity = new InvoiceLineReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setLineItemNo(getLongValue(jsonObject,"line_item_no"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setComments(getStringValue(jsonObject,"comments"));
            entity.setPlanName(getStringValue(jsonObject,"plan_name"));
            entity.setPlanNo(getLongValue(jsonObject,"plan_no"));
            entity.setServiceName(getStringValue(jsonObject,"service_name"));
            entity.setServiceNo(getLongValue(jsonObject,"service_no"));
            entity.setLedgerCode(getStringValue(jsonObject,"ledger_code"));
            entity.setCoaId(getLongValue(jsonObject,"coa_id"));
            entity.setCoaDescription(getStringValue(jsonObject,"coa_description"));
            entity.setUsageUnits(getDoubleValue(jsonObject,"usage_units"));
            entity.setUsageRate(getDoubleValue(jsonObject,"usage_rate"));
            entity.setUsageTypeNo(getDoubleValue(jsonObject,"usage_type_no"));
            entity.setStartDate(getStringValue(jsonObject,"start_date"));
            entity.setEndDate(getStringValue(jsonObject,"end_date"));
            entity.setClientSku(getStringValue(jsonObject,"client_sku"));
            entity.setOrderNo(getLongValue(jsonObject,"order_no"));
            entity.setItemNo(getLongValue(jsonObject,"item_no"));
            entity.setBasePlanUnits(getLongValue(jsonObject,"base_plan_units"));
            entity.setProrationFactor(getDoubleValue(jsonObject,"proration_factor"));
            entity.setProrationText(getStringValue(jsonObject,"proration_text"));
            entity.setAdvBillingPeriodTotalDays(getLongValue(jsonObject,"adv_billing_period_total_days"));
            entity.setProrationRemainingDays(getLongValue(jsonObject,"proration_remaining_days"));
            entity.setProrationDescription(getStringValue(jsonObject,"proration_description"));
                        ArrayList<InvoiceLineTaxReturnElement> arrayListInvoiceLineTaxReturnElement = buildInvoiceLineTaxReturnElement((JSONArray)jsonObject.get("invoice_line_tax"));
            for (InvoiceLineTaxReturnElement element : arrayListInvoiceLineTaxReturnElement){
                entity.getInvoiceLineTax().add(element);
            }
            entity.setRateScheduleNo(getDoubleValue(jsonObject,"rate_schedule_no"));
            entity.setRateScheduleTierNo(getDoubleValue(jsonObject,"rate_schedule_tier_no"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<InvoiceDetailsReturnElement> buildInvoiceDetailsReturnElement(JSONArray jsonArray) {
        ArrayList<InvoiceDetailsReturnElement> returnElement = new ArrayList<InvoiceDetailsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            InvoiceDetailsReturnElement entity = new InvoiceDetailsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setInvoiceNo(getLongValue(jsonObject,"invoice_no"));
            entity.setAcctNo(getLongValue(jsonObject,"acct_no"));
            entity.setUserId(getStringValue(jsonObject,"user_id"));
            entity.setDebit(getDoubleValue(jsonObject,"debit"));
            entity.setCredit(getDoubleValue(jsonObject,"credit"));
            entity.setBillDate(getStringValue(jsonObject,"bill_date"));
            entity.setDueDate(getStringValue(jsonObject,"due_date"));
            entity.setPaidDate(getStringValue(jsonObject,"paid_date"));
            entity.setNotifyDate(getStringValue(jsonObject,"notify_date"));
            entity.setFromDate(getStringValue(jsonObject,"from_date"));
            entity.setToDate(getStringValue(jsonObject,"to_date"));
            entity.setCurrencyCd(getStringValue(jsonObject,"currency_cd"));
            entity.setBalanceForward(getDoubleValue(jsonObject,"balance_forward"));
            entity.setStatementBalanceForward(getDoubleValue(jsonObject,"statement_balance_forward"));
            entity.setTotalDue(getDoubleValue(jsonObject,"total_due"));
            entity.setComments(getStringValue(jsonObject,"comments"));
            entity.setAdditionalComments(getStringValue(jsonObject,"additional_comments"));
            entity.setTransactionType(getStringValue(jsonObject,"transaction_type"));
            entity.setLastUpdated(getStringValue(jsonObject,"last_updated"));
            entity.setAriaEventNo(getLongValue(jsonObject,"aria_event_no"));
            entity.setAriaStatementNo(getLongValue(jsonObject,"aria_statement_no"));
            entity.setAcctStatementSeqStr(getStringValue(jsonObject,"acct_statement_seq_str"));
            entity.setSecondAcctStatementSeqStr(getStringValue(jsonObject,"second_acct_statement_seq_str"));
            entity.setVoidingEventNo(getLongValue(jsonObject,"voiding_event_no"));
            entity.setCustomStatusLabel(getStringValue(jsonObject,"custom_status_label"));
            entity.setClientNotes(getStringValue(jsonObject,"client_notes"));
            entity.setInvoiceTypeCd(getStringValue(jsonObject,"invoice_type_cd"));
            entity.setPostingStatusCd(getLongValue(jsonObject,"posting_status_cd"));
            entity.setPostingDate(getStringValue(jsonObject,"posting_date"));
            entity.setPostingUser(getStringValue(jsonObject,"posting_user"));
                        ArrayList<InvoiceLineReturnElement> arrayListInvoiceLineReturnElement = buildInvoiceLineReturnElement((JSONArray)jsonObject.get("invoice_line"));
            for (InvoiceLineReturnElement element : arrayListInvoiceLineReturnElement){
                entity.getInvoiceLine().add(element);
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<RelatedTransactionReturnElement> buildRelatedTransactionReturnElement(JSONArray jsonArray) {
        ArrayList<RelatedTransactionReturnElement> returnElement = new ArrayList<RelatedTransactionReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            RelatedTransactionReturnElement entity = new RelatedTransactionReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setAriaEventNo(getLongValue(jsonObject,"aria_event_no"));
            entity.setTransactionDate(getStringValue(jsonObject,"transaction_date"));
            entity.setTransactionType(getStringValue(jsonObject,"transaction_type"));
            entity.setTransactionTypeNo(getLongValue(jsonObject,"transaction_type_no"));
            entity.setIsChargeType(getLongValue(jsonObject,"is_charge_type"));
            entity.setTypeSpecificId(getLongValue(jsonObject,"type_specific_id"));
            entity.setAcctNo(getLongValue(jsonObject,"acct_no"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setCurrencyCd(getStringValue(jsonObject,"currency_cd"));
            entity.setAriaStatementNo(getLongValue(jsonObject,"aria_statement_no"));
            entity.setTotalAmountApplied(getDoubleValue(jsonObject,"total_amount_applied"));
            entity.setRelatedAmountApplied(getDoubleValue(jsonObject,"related_amount_applied"));
            entity.setUpdateDate(getStringValue(jsonObject,"update_date"));
            entity.setVoidDate(getStringValue(jsonObject,"void_date"));
            entity.setFullyAppliedDate(getStringValue(jsonObject,"fully_applied_date"));
            entity.setMasterPlanInstanceNo(getLongValue(jsonObject,"master_plan_instance_no"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<TransactionInformationReturnElement> buildTransactionInformationReturnElement(JSONArray jsonArray) {
        ArrayList<TransactionInformationReturnElement> returnElement = new ArrayList<TransactionInformationReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            TransactionInformationReturnElement entity = new TransactionInformationReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setAriaEventNo(getLongValue(jsonObject,"aria_event_no"));
            entity.setTransactionDate(getStringValue(jsonObject,"transaction_date"));
            entity.setTransactionType(getStringValue(jsonObject,"transaction_type"));
            entity.setTransactionTypeNo(getLongValue(jsonObject,"transaction_type_no"));
            entity.setIsChargeType(getLongValue(jsonObject,"is_charge_type"));
            entity.setTypeSpecificId(getLongValue(jsonObject,"type_specific_id"));
            entity.setAcctNo(getLongValue(jsonObject,"acct_no"));
            entity.setUserId(getStringValue(jsonObject,"user_id"));
            entity.setClientAcctId(getStringValue(jsonObject,"client_acct_id"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setCurrencyCd(getStringValue(jsonObject,"currency_cd"));
            entity.setAriaStatementNo(getLongValue(jsonObject,"aria_statement_no"));
            entity.setTotalAmountApplied(getDoubleValue(jsonObject,"total_amount_applied"));
            entity.setRelatedAmountApplied(getDoubleValue(jsonObject,"related_amount_applied"));
            entity.setUpdateDate(getStringValue(jsonObject,"update_date"));
            entity.setVoidDate(getStringValue(jsonObject,"void_date"));
            entity.setFullyAppliedDate(getStringValue(jsonObject,"fully_applied_date"));
            entity.setMasterPlanInstanceNo(getLongValue(jsonObject,"master_plan_instance_no"));
                        ArrayList<RelatedTransactionReturnElement> arrayListRelatedTransactionReturnElement = buildRelatedTransactionReturnElement((JSONArray)jsonObject.get("related_transaction"));
            for (RelatedTransactionReturnElement element : arrayListRelatedTransactionReturnElement){
                entity.getRelatedTransaction().add(element);
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<RefundInformationReturnElement> buildRefundInformationReturnElement(JSONArray jsonArray) {
        ArrayList<RefundInformationReturnElement> returnElement = new ArrayList<RefundInformationReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            RefundInformationReturnElement entity = new RefundInformationReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setAriaEventNo(getLongValue(jsonObject,"aria_event_no"));
            entity.setAcctNo(getLongValue(jsonObject,"acct_no"));
            entity.setUserId(getStringValue(jsonObject,"user_id"));
            entity.setRefundAmount(getDoubleValue(jsonObject,"refund_amount"));
            entity.setCreateDate(getStringValue(jsonObject,"create_date"));
            entity.setCreateUser(getStringValue(jsonObject,"create_user"));
            entity.setRefundReasonCode(getLongValue(jsonObject,"refund_reason_code"));
            entity.setRefundReasonLabel(getStringValue(jsonObject,"refund_reason_label"));
            entity.setRefundReasonDescription(getStringValue(jsonObject,"refund_reason_description"));
            entity.setCurrencyCd(getStringValue(jsonObject,"currency_cd"));
            entity.setAriaStatementNo(getLongValue(jsonObject,"aria_statement_no"));
            entity.setRefPaymentEventNo(getLongValue(jsonObject,"ref_payment_event_no"));
            entity.setRefPaymentTransactionType(getLongValue(jsonObject,"ref_payment_transaction_type"));
            entity.setRefPaymentTransactionDesc(getStringValue(jsonObject,"ref_payment_transaction_desc"));
            entity.setRefPaymentAmount(getDoubleValue(jsonObject,"ref_payment_amount"));
            entity.setRefundTransactionType(getLongValue(jsonObject,"refund_transaction_type"));
            entity.setRefundTransactionDesc(getStringValue(jsonObject,"refund_transaction_desc"));
            entity.setRefundCheckNum(getStringValue(jsonObject,"refund_check_num"));
            entity.setRefundBillSeqNo(getLongValue(jsonObject,"refund_bill_seq_no"));
            entity.setRefundPayMethodId(getLongValue(jsonObject,"refund_pay_method_id"));
            entity.setRefundPayMethodName(getStringValue(jsonObject,"refund_pay_method_name"));
            entity.setRefundCcId(getLongValue(jsonObject,"refund_cc_id"));
            entity.setRefundCcType(getStringValue(jsonObject,"refund_cc_type"));
            entity.setRefundPaymentSrcSuffix(getStringValue(jsonObject,"refund_payment_src_suffix"));
            entity.setRefundIsVoidedInd(getLongValue(jsonObject,"refund_is_voided_ind"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<CouponHistoryReturnElement> buildCouponHistoryReturnElement(JSONArray jsonArray) {
        ArrayList<CouponHistoryReturnElement> returnElement = new ArrayList<CouponHistoryReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            CouponHistoryReturnElement entity = new CouponHistoryReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setAcctNo(getLongValue(jsonObject,"acct_no"));
            entity.setUserId(getStringValue(jsonObject,"user_id"));
            entity.setClientAcctId(getStringValue(jsonObject,"client_acct_id"));
            entity.setCurrencyCd(getStringValue(jsonObject,"currency_cd"));
            entity.setCouponCd(getStringValue(jsonObject,"coupon_cd"));
            entity.setCouponCreateDate(getStringValue(jsonObject,"coupon_create_date"));
            entity.setCouponStatus(getStringValue(jsonObject,"coupon_status"));
            entity.setCouponCancelDate(getStringValue(jsonObject,"coupon_cancel_date"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<MapRecordReturnElement> buildMapRecordReturnElement(JSONArray jsonArray) {
        ArrayList<MapRecordReturnElement> returnElement = new ArrayList<MapRecordReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            MapRecordReturnElement entity = new MapRecordReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setNumber(getLongValue(jsonObject,"number"));
            entity.setDescription(getStringValue(jsonObject,"description"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<AllInvoiceLineTaxReturnElement> buildAllInvoiceLineTaxReturnElement(JSONArray jsonArray) {
        ArrayList<AllInvoiceLineTaxReturnElement> returnElement = new ArrayList<AllInvoiceLineTaxReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AllInvoiceLineTaxReturnElement entity = new AllInvoiceLineTaxReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setTaxId(getLongValue(jsonObject,"tax_id"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setBeforeCreditAmount(getDoubleValue(jsonObject,"before_credit_amount"));
            entity.setJurisdiction(getStringValue(jsonObject,"jurisdiction"));
            entity.setDescription(getStringValue(jsonObject,"description"));
            entity.setIsExcluded(getLongValue(jsonObject,"is_excluded"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<AllInvoiceLineReturnElement> buildAllInvoiceLineReturnElement(JSONArray jsonArray) {
        ArrayList<AllInvoiceLineReturnElement> returnElement = new ArrayList<AllInvoiceLineReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AllInvoiceLineReturnElement entity = new AllInvoiceLineReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setLineItemNo(getLongValue(jsonObject,"line_item_no"));
            entity.setCreditReasonCodeDescription(getStringValue(jsonObject,"credit_reason_code_description"));
            entity.setDescription(getStringValue(jsonObject,"description"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setComments(getStringValue(jsonObject,"comments"));
            entity.setPlanName(getStringValue(jsonObject,"plan_name"));
            entity.setPlanNo(getLongValue(jsonObject,"plan_no"));
            entity.setServiceName(getStringValue(jsonObject,"service_name"));
            entity.setServiceNo(getLongValue(jsonObject,"service_no"));
            entity.setLedgerCode(getStringValue(jsonObject,"ledger_code"));
            entity.setCoaId(getLongValue(jsonObject,"coa_id"));
            entity.setCoaDescription(getStringValue(jsonObject,"coa_description"));
            entity.setUsageUnits(getDoubleValue(jsonObject,"usage_units"));
            entity.setUsageRate(getDoubleValue(jsonObject,"usage_rate"));
            entity.setUsageTypeNo(getDoubleValue(jsonObject,"usage_type_no"));
            entity.setStartDate(getStringValue(jsonObject,"start_date"));
            entity.setEndDate(getStringValue(jsonObject,"end_date"));
            entity.setClientSku(getStringValue(jsonObject,"client_sku"));
            entity.setOrderNo(getLongValue(jsonObject,"order_no"));
            entity.setItemNo(getLongValue(jsonObject,"item_no"));
            entity.setBasePlanUnits(getLongValue(jsonObject,"base_plan_units"));
            entity.setProrationFactor(getDoubleValue(jsonObject,"proration_factor"));
            entity.setProrationText(getStringValue(jsonObject,"proration_text"));
            entity.setAdvBillingPeriodTotalDays(getLongValue(jsonObject,"adv_billing_period_total_days"));
            entity.setProrationRemainingDays(getLongValue(jsonObject,"proration_remaining_days"));
            entity.setProrationDescription(getStringValue(jsonObject,"proration_description"));
                        ArrayList<AllInvoiceLineTaxReturnElement> arrayListAllInvoiceLineTaxReturnElement = buildAllInvoiceLineTaxReturnElement((JSONArray)jsonObject.get("all_invoice_line_tax"));
            for (AllInvoiceLineTaxReturnElement element : arrayListAllInvoiceLineTaxReturnElement){
                entity.getAllInvoiceLineTax().add(element);
            }
            entity.setRateScheduleNo(getDoubleValue(jsonObject,"rate_schedule_no"));
            entity.setRateScheduleTierNo(getDoubleValue(jsonObject,"rate_schedule_tier_no"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<AllInvoiceDetailsReturnElement> buildAllInvoiceDetailsReturnElement(JSONArray jsonArray) {
        ArrayList<AllInvoiceDetailsReturnElement> returnElement = new ArrayList<AllInvoiceDetailsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AllInvoiceDetailsReturnElement entity = new AllInvoiceDetailsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setInvoiceNo(getLongValue(jsonObject,"invoice_no"));
            entity.setAcctNo(getLongValue(jsonObject,"acct_no"));
            entity.setUserId(getStringValue(jsonObject,"user_id"));
            entity.setInvoiceType(getStringValue(jsonObject,"invoice_type"));
            entity.setFromDate(getStringValue(jsonObject,"from_date"));
            entity.setToDate(getStringValue(jsonObject,"to_date"));
            entity.setUsageBillFromDate(getStringValue(jsonObject,"usage_bill_from_date"));
            entity.setUsageBillThruDate(getStringValue(jsonObject,"usage_bill_thru_date"));
            entity.setTaxedEmail(getStringValue(jsonObject,"taxed_email"));
            entity.setTaxedFirstName(getStringValue(jsonObject,"taxed_first_name"));
            entity.setTaxedMiddleInitial(getStringValue(jsonObject,"taxed_middle_initial"));
            entity.setTaxedLastName(getStringValue(jsonObject,"taxed_last_name"));
            entity.setTaxedAddress1(getStringValue(jsonObject,"taxed_address1"));
            entity.setTaxedAddress2(getStringValue(jsonObject,"taxed_address2"));
            entity.setTaxedAddress3(getStringValue(jsonObject,"taxed_address3"));
            entity.setTaxedCity(getStringValue(jsonObject,"taxed_city"));
            entity.setTaxedState(getStringValue(jsonObject,"taxed_state"));
            entity.setTaxedLocality(getStringValue(jsonObject,"taxed_locality"));
            entity.setTaxedZip(getStringValue(jsonObject,"taxed_zip"));
            entity.setTaxedCountry(getStringValue(jsonObject,"taxed_country"));
            entity.setDebit(getDoubleValue(jsonObject,"debit"));
            entity.setCredit(getDoubleValue(jsonObject,"credit"));
            entity.setBillDate(getStringValue(jsonObject,"bill_date"));
            entity.setDueDate(getStringValue(jsonObject,"due_date"));
            entity.setPaidDate(getStringValue(jsonObject,"paid_date"));
            entity.setNotifyDate(getStringValue(jsonObject,"notify_date"));
            entity.setCurrencyCd(getStringValue(jsonObject,"currency_cd"));
            entity.setBalanceForward(getDoubleValue(jsonObject,"balance_forward"));
            entity.setStatementBalanceForward(getDoubleValue(jsonObject,"statement_balance_forward"));
            entity.setTotalDue(getDoubleValue(jsonObject,"total_due"));
            entity.setComments(getStringValue(jsonObject,"comments"));
            entity.setAdditionalComments(getStringValue(jsonObject,"additional_comments"));
            entity.setTransactionType(getStringValue(jsonObject,"transaction_type"));
            entity.setLastUpdated(getStringValue(jsonObject,"last_updated"));
            entity.setAriaEventNo(getLongValue(jsonObject,"aria_event_no"));
            entity.setAriaStatementNo(getLongValue(jsonObject,"aria_statement_no"));
            entity.setAcctStatementSeqStr(getStringValue(jsonObject,"acct_statement_seq_str"));
            entity.setSecondAcctStatementSeqStr(getStringValue(jsonObject,"second_acct_statement_seq_str"));
            entity.setInvoiceLineItems(getStringValue(jsonObject,"invoice_line_items"));
            entity.setVoidingEventNo(getLongValue(jsonObject,"voiding_event_no"));
            entity.setBillCompanyName(getStringValue(jsonObject,"bill_company_name"));
            entity.setPayMethodType(getLongValue(jsonObject,"pay_method_type"));
            entity.setPayMethodName(getStringValue(jsonObject,"pay_method_name"));
            entity.setCustomStatusLabel(getStringValue(jsonObject,"custom_status_label"));
            entity.setClientNotes(getStringValue(jsonObject,"client_notes"));
            entity.setPostingStatusCd(getLongValue(jsonObject,"posting_status_cd"));
            entity.setPostingDate(getStringValue(jsonObject,"posting_date"));
            entity.setPostingUser(getStringValue(jsonObject,"posting_user"));
                        ArrayList<AllInvoiceLineReturnElement> arrayListAllInvoiceLineReturnElement = buildAllInvoiceLineReturnElement((JSONArray)jsonObject.get("all_invoice_line"));
            for (AllInvoiceLineReturnElement element : arrayListAllInvoiceLineReturnElement){
                entity.getAllInvoiceLine().add(element);
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ProductFieldsReturnElement> buildProductFieldsReturnElement(JSONArray jsonArray) {
        ArrayList<ProductFieldsReturnElement> returnElement = new ArrayList<ProductFieldsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ProductFieldsReturnElement entity = new ProductFieldsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setProductFieldNo(getLongValue(jsonObject,"product_field_no"));
            entity.setProductFieldDesc(getStringValue(jsonObject,"product_field_desc"));
            entity.setProductFieldName(getStringValue(jsonObject,"product_field_name"));
            entity.setProductFieldValue(getStringValue(jsonObject,"product_field_value"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<PrimaryPaymentMethodReturnElement> buildPrimaryPaymentMethodReturnElement(JSONArray jsonArray) {
        ArrayList<PrimaryPaymentMethodReturnElement> returnElement = new ArrayList<PrimaryPaymentMethodReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PrimaryPaymentMethodReturnElement entity = new PrimaryPaymentMethodReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setBillingFirstName(getStringValue(jsonObject,"billing_first_name"));
            entity.setBillingMiddleInitial(getStringValue(jsonObject,"billing_middle_initial"));
            entity.setBillingLastName(getStringValue(jsonObject,"billing_last_name"));
            entity.setBillingAddress1(getStringValue(jsonObject,"billing_address1"));
            entity.setBillingAddress2(getStringValue(jsonObject,"billing_address2"));
            entity.setBillingCity(getStringValue(jsonObject,"billing_city"));
            entity.setBillingState(getStringValue(jsonObject,"billing_state"));
            entity.setBillingLocality(getStringValue(jsonObject,"billing_locality"));
            entity.setBillingZip(getStringValue(jsonObject,"billing_zip"));
            entity.setBillingCountry(getStringValue(jsonObject,"billing_country"));
            entity.setBillingIntlPhone(getStringValue(jsonObject,"billing_intl_phone"));
            entity.setBillingEmail(getStringValue(jsonObject,"billing_email"));
            entity.setPayMethodType(getLongValue(jsonObject,"pay_method_type"));
            entity.setCcExpireMm(getStringValue(jsonObject,"cc_expire_mm"));
            entity.setCcExpireYyyy(getStringValue(jsonObject,"cc_expire_yyyy"));
            entity.setBankRoutingNum(getStringValue(jsonObject,"bank_routing_num"));
            entity.setPaymentInstrumentSuffix(getStringValue(jsonObject,"payment_instrument_suffix"));
            entity.setPrimaryPaymentMethodName(getStringValue(jsonObject,"primary_payment_method_name"));
            entity.setPrimaryPaymentMethodDescription(getStringValue(jsonObject,"primary_payment_method_description"));
            entity.setPrimaryPaymentMethodClientDefinedId(getStringValue(jsonObject,"primary_payment_method_client_defined_id"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<BackupPaymentMethodReturnElement> buildBackupPaymentMethodReturnElement(JSONArray jsonArray) {
        ArrayList<BackupPaymentMethodReturnElement> returnElement = new ArrayList<BackupPaymentMethodReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            BackupPaymentMethodReturnElement entity = new BackupPaymentMethodReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setBkupBillingFirstName(getStringValue(jsonObject,"bkup_billing_first_name"));
            entity.setBkupBillingMiddleInitial(getStringValue(jsonObject,"bkup_billing_middle_initial"));
            entity.setBkupBillingLastName(getStringValue(jsonObject,"bkup_billing_last_name"));
            entity.setBkupBillingAddress1(getStringValue(jsonObject,"bkup_billing_address1"));
            entity.setBkupBillingAddress2(getStringValue(jsonObject,"bkup_billing_address2"));
            entity.setBkupBillingCity(getStringValue(jsonObject,"bkup_billing_city"));
            entity.setBkupBillingState(getStringValue(jsonObject,"bkup_billing_state"));
            entity.setBkupBillingLocality(getStringValue(jsonObject,"bkup_billing_locality"));
            entity.setBkupBillingZip(getStringValue(jsonObject,"bkup_billing_zip"));
            entity.setBkupBillingCountry(getStringValue(jsonObject,"bkup_billing_country"));
            entity.setBkupBillingIntlPhone(getStringValue(jsonObject,"bkup_billing_intl_phone"));
            entity.setBkupBillingEmail(getStringValue(jsonObject,"bkup_billing_email"));
            entity.setBkupPayMethodType(getLongValue(jsonObject,"bkup_pay_method_type"));
            entity.setBkupCcExpireMm(getStringValue(jsonObject,"bkup_cc_expire_mm"));
            entity.setBkupCcExpireYyyy(getStringValue(jsonObject,"bkup_cc_expire_yyyy"));
            entity.setBkupBankRoutingNum(getStringValue(jsonObject,"bkup_bank_routing_num"));
            entity.setBkupPaymentInstrumentSuffix(getStringValue(jsonObject,"bkup_payment_instrument_suffix"));
            entity.setBackupPaymentMethodName(getStringValue(jsonObject,"backup_payment_method_name"));
            entity.setBackupPaymentMethodDescription(getStringValue(jsonObject,"backup_payment_method_description"));
            entity.setBackupPaymentMethodClientDefinedId(getStringValue(jsonObject,"backup_payment_method_client_defined_id"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<PlanInstanceDetailsReturnElement> buildPlanInstanceDetailsReturnElement(JSONArray jsonArray) {
        ArrayList<PlanInstanceDetailsReturnElement> returnElement = new ArrayList<PlanInstanceDetailsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PlanInstanceDetailsReturnElement entity = new PlanInstanceDetailsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setAcctNo(getLongValue(jsonObject,"acct_no"));
            entity.setUserId(getStringValue(jsonObject,"user_id"));
            entity.setClientAcctId(getStringValue(jsonObject,"client_acct_id"));
            entity.setPlanInstanceNo(getStringValue(jsonObject,"plan_instance_no"));
            entity.setClientPlanInstanceId(getStringValue(jsonObject,"client_plan_instance_id"));
                        ArrayList<ProductFieldsReturnElement> arrayListProductFieldsReturnElement = buildProductFieldsReturnElement((JSONArray)jsonObject.get("product_fields"));
            for (ProductFieldsReturnElement element : arrayListProductFieldsReturnElement){
                entity.getProductFields().add(element);
            }
            entity.setPlanNo(getLongValue(jsonObject,"plan_no"));
            entity.setClientPlanId(getStringValue(jsonObject,"client_plan_id"));
            entity.setPlanName(getStringValue(jsonObject,"plan_name"));
            entity.setPlanUnits(getLongValue(jsonObject,"plan_units"));
            entity.setLastBillDate(getStringValue(jsonObject,"last_bill_date"));
            entity.setNextBillDate(getStringValue(jsonObject,"next_bill_date"));
            entity.setBillThruDate(getStringValue(jsonObject,"bill_thru_date"));
            entity.setStatusCd(getStringValue(jsonObject,"status_cd"));
            entity.setStatusDate(getStringValue(jsonObject,"status_date"));
            entity.setScheduleNo(getStringValue(jsonObject,"schedule_no"));
            entity.setMasterPlanInstanceBalance(getLongValue(jsonObject,"master_plan_instance_balance"));
            entity.setBillingGroupNo(getLongValue(jsonObject,"billing_group_no"));
            entity.setClientBillingGroupId(getStringValue(jsonObject,"client_billing_group_id"));
            entity.setDunningGroupNo(getLongValue(jsonObject,"dunning_group_no"));
                        ArrayList<PrimaryPaymentMethodReturnElement> arrayListPrimaryPaymentMethodReturnElement = buildPrimaryPaymentMethodReturnElement((JSONArray)jsonObject.get("primary_payment_method"));
            for (PrimaryPaymentMethodReturnElement element : arrayListPrimaryPaymentMethodReturnElement){
                entity.getPrimaryPaymentMethod().add(element);
            }
                        ArrayList<BackupPaymentMethodReturnElement> arrayListBackupPaymentMethodReturnElement = buildBackupPaymentMethodReturnElement((JSONArray)jsonObject.get("backup_payment_method"));
            for (BackupPaymentMethodReturnElement element : arrayListBackupPaymentMethodReturnElement){
                entity.getBackupPaymentMethod().add(element);
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<SuppPlansReturnElement> buildSuppPlansReturnElement(JSONArray jsonArray) {
        ArrayList<SuppPlansReturnElement> returnElement = new ArrayList<SuppPlansReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            SuppPlansReturnElement entity = new SuppPlansReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setSuppPlanInstanceNo(getStringValue(jsonObject,"supp_plan_instance_no"));
            entity.setClientSuppPlanInstanceId(getStringValue(jsonObject,"client_supp_plan_instance_id"));
            entity.setClientSuppPlanId(getStringValue(jsonObject,"client_supp_plan_id"));
            entity.setSuppPlanNo(getStringValue(jsonObject,"supp_plan_no"));
            entity.setSuppPlanInstanceDescription(getStringValue(jsonObject,"supp_plan_instance_description"));
            entity.setSuppPlanInstanceStatus(getStringValue(jsonObject,"supp_plan_instance_status"));
            entity.setParentPlanInstanceNo(getStringValue(jsonObject,"parent_plan_instance_no"));
            entity.setClientParentPlanInstanceId(getStringValue(jsonObject,"client_parent_plan_instance_id"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<CouponCdReturnElement> buildCouponCdReturnElement(JSONArray jsonArray) {
        ArrayList<CouponCdReturnElement> returnElement = new ArrayList<CouponCdReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            CouponCdReturnElement entity = new CouponCdReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setCouponCd(getStringValue(jsonObject,"coupon_cd"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<FunctionalAcctGroupsReturnElement> buildFunctionalAcctGroupsReturnElement(JSONArray jsonArray) {
        ArrayList<FunctionalAcctGroupsReturnElement> returnElement = new ArrayList<FunctionalAcctGroupsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            FunctionalAcctGroupsReturnElement entity = new FunctionalAcctGroupsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setFunctionalAcctGroupNo(getLongValue(jsonObject,"functional_acct_group_no"));
            entity.setClientFunctionalAcctGroupId(getStringValue(jsonObject,"client_functional_acct_group_id"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<CollectionAcctGroupsReturnElement> buildCollectionAcctGroupsReturnElement(JSONArray jsonArray) {
        ArrayList<CollectionAcctGroupsReturnElement> returnElement = new ArrayList<CollectionAcctGroupsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            CollectionAcctGroupsReturnElement entity = new CollectionAcctGroupsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setCollectionAcctGroupNo(getLongValue(jsonObject,"collection_acct_group_no"));
            entity.setClientCollectionAcctGroupId(getStringValue(jsonObject,"client_collection_acct_group_id"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<AcctSuppFieldsReturnElement> buildAcctSuppFieldsReturnElement(JSONArray jsonArray) {
        ArrayList<AcctSuppFieldsReturnElement> returnElement = new ArrayList<AcctSuppFieldsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AcctSuppFieldsReturnElement entity = new AcctSuppFieldsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setAcctSuppFieldName(getStringValue(jsonObject,"acct_supp_field_name"));
            entity.setAcctSuppFieldValue(getStringValue(jsonObject,"acct_supp_field_value"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<SurchargeNoReturnElement> buildSurchargeNoReturnElement(JSONArray jsonArray) {
        ArrayList<SurchargeNoReturnElement> returnElement = new ArrayList<SurchargeNoReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            SurchargeNoReturnElement entity = new SurchargeNoReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setSurchargeNo(getLongValue(jsonObject,"surcharge_no"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<BillingGroupsReturnElement> buildBillingGroupsReturnElement(JSONArray jsonArray) {
        ArrayList<BillingGroupsReturnElement> returnElement = new ArrayList<BillingGroupsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            BillingGroupsReturnElement entity = new BillingGroupsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setBillingGroupNo(getStringValue(jsonObject,"billing_group_no"));
            entity.setBillingGroupName(getStringValue(jsonObject,"billing_group_name"));
            entity.setBillingGroupDescription(getStringValue(jsonObject,"billing_group_description"));
            entity.setClientBillingGroupId(getStringValue(jsonObject,"client_billing_group_id"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<MasterPlanInstancesReturnElement> buildMasterPlanInstancesReturnElement(JSONArray jsonArray) {
        ArrayList<MasterPlanInstancesReturnElement> returnElement = new ArrayList<MasterPlanInstancesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            MasterPlanInstancesReturnElement entity = new MasterPlanInstancesReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setMasterPlanInstanceId(getStringValue(jsonObject,"master_plan_instance_id"));
            entity.setClientMasterPlanInstanceId(getStringValue(jsonObject,"client_master_plan_instance_id"));
            entity.setClientMasterPlanId(getStringValue(jsonObject,"client_master_plan_id"));
            entity.setMasterPlanNo(getStringValue(jsonObject,"master_plan_no"));
            entity.setMasterPlanInstanceDescription(getStringValue(jsonObject,"master_plan_instance_description"));
                        ArrayList<SuppPlansReturnElement> arrayListSuppPlansReturnElement = buildSuppPlansReturnElement((JSONArray)jsonObject.get("supp_plans"));
            for (SuppPlansReturnElement element : arrayListSuppPlansReturnElement){
                entity.getSuppPlans().add(element);
            }
                        ArrayList<CouponCdReturnElement> arrayListCouponCdReturnElement = buildCouponCdReturnElement((JSONArray)jsonObject.get("coupon_cd"));
            for (CouponCdReturnElement element : arrayListCouponCdReturnElement){
                entity.getCouponCd().add(element);
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<AccountDetailsMReturnElement> buildAccountDetailsMReturnElement(JSONArray jsonArray) {
        ArrayList<AccountDetailsMReturnElement> returnElement = new ArrayList<AccountDetailsMReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AccountDetailsMReturnElement entity = new AccountDetailsMReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setAcctNo(getLongValue(jsonObject,"acct_no"));
            entity.setClientAcctId(getStringValue(jsonObject,"client_acct_id"));
            entity.setUserId(getStringValue(jsonObject,"user_id"));
            entity.setFirstName(getStringValue(jsonObject,"first_name"));
            entity.setMi(getStringValue(jsonObject,"mi"));
            entity.setLastName(getStringValue(jsonObject,"last_name"));
            entity.setCompanyName(getStringValue(jsonObject,"company_name"));
            entity.setAddress1(getStringValue(jsonObject,"address1"));
            entity.setAddress2(getStringValue(jsonObject,"address2"));
            entity.setAddress3(getStringValue(jsonObject,"address3"));
            entity.setCity(getStringValue(jsonObject,"city"));
            entity.setLocality(getStringValue(jsonObject,"locality"));
            entity.setStateProv(getStringValue(jsonObject,"state_prov"));
            entity.setCountryCd(getStringValue(jsonObject,"country_cd"));
            entity.setPostalCode(getStringValue(jsonObject,"postal_code"));
            entity.setPhone(getLongValue(jsonObject,"phone"));
            entity.setPhoneExt(getStringValue(jsonObject,"phone_ext"));
            entity.setCellPhone(getLongValue(jsonObject,"cell_phone"));
            entity.setWorkPhone(getLongValue(jsonObject,"work_phone"));
            entity.setWorkPhoneExt(getStringValue(jsonObject,"work_phone_ext"));
            entity.setFax(getLongValue(jsonObject,"fax"));
            entity.setEmail(getStringValue(jsonObject,"email"));
            entity.setBirthdate(getStringValue(jsonObject,"birthdate"));
            entity.setStatusCd(getStringValue(jsonObject,"status_cd"));
            entity.setNotifyMethod(getLongValue(jsonObject,"notify_method"));
            entity.setSeniorAcctNo(getLongValue(jsonObject,"senior_acct_no"));
            entity.setSeniorAcctUserId(getStringValue(jsonObject,"senior_acct_user_id"));
            entity.setSeniorClientAcctId(getStringValue(jsonObject,"senior_client_acct_id"));
            entity.setTestAcctInd(getLongValue(jsonObject,"test_acct_ind"));
            entity.setTaxpayerId(getLongValue(jsonObject,"taxpayer_id"));
            entity.setAcctStartDate(getStringValue(jsonObject,"acct_start_date"));
            entity.setAltMsgTemplateNo(getLongValue(jsonObject,"alt_msg_template_no"));
            entity.setSeqFuncGroupNo(getLongValue(jsonObject,"seq_func_group_no"));
            entity.setTaxExemptionLevel(getLongValue(jsonObject,"tax_exemption_level"));
            entity.setClientAltMsgTemplateId(getStringValue(jsonObject,"client_alt_msg_template_id"));
            entity.setClientCnAltMsgTemplateId(getStringValue(jsonObject,"client_cn_alt_msg_template_id"));
                        ArrayList<FunctionalAcctGroupsReturnElement> arrayListFunctionalAcctGroupsReturnElement = buildFunctionalAcctGroupsReturnElement((JSONArray)jsonObject.get("functional_acct_groups"));
            for (FunctionalAcctGroupsReturnElement element : arrayListFunctionalAcctGroupsReturnElement){
                entity.getFunctionalAcctGroups().add(element);
            }
                        ArrayList<CollectionAcctGroupsReturnElement> arrayListCollectionAcctGroupsReturnElement = buildCollectionAcctGroupsReturnElement((JSONArray)jsonObject.get("collection_acct_groups"));
            for (CollectionAcctGroupsReturnElement element : arrayListCollectionAcctGroupsReturnElement){
                entity.getCollectionAcctGroups().add(element);
            }
                        ArrayList<AcctSuppFieldsReturnElement> arrayListAcctSuppFieldsReturnElement = buildAcctSuppFieldsReturnElement((JSONArray)jsonObject.get("acct_supp_fields"));
            for (AcctSuppFieldsReturnElement element : arrayListAcctSuppFieldsReturnElement){
                entity.getAcctSuppFields().add(element);
            }
                        ArrayList<SurchargeNoReturnElement> arrayListSurchargeNoReturnElement = buildSurchargeNoReturnElement((JSONArray)jsonObject.get("surcharge_no"));
            for (SurchargeNoReturnElement element : arrayListSurchargeNoReturnElement){
                entity.getSurchargeNo().add(element);
            }
            entity.setAcctCurrency(getStringValue(jsonObject,"acct_currency"));
            entity.setAcctBalance(getStringValue(jsonObject,"acct_balance"));
            entity.setAddressVerificationCode(getStringValue(jsonObject,"address_verification_code"));
            entity.setAddressMatchScore(getLongValue(jsonObject,"address_match_score"));
                        ArrayList<BillingGroupsReturnElement> arrayListBillingGroupsReturnElement = buildBillingGroupsReturnElement((JSONArray)jsonObject.get("billing_groups"));
            for (BillingGroupsReturnElement element : arrayListBillingGroupsReturnElement){
                entity.getBillingGroups().add(element);
            }
                        ArrayList<MasterPlanInstancesReturnElement> arrayListMasterPlanInstancesReturnElement = buildMasterPlanInstancesReturnElement((JSONArray)jsonObject.get("master_plan_instances"));
            for (MasterPlanInstancesReturnElement element : arrayListMasterPlanInstancesReturnElement){
                entity.getMasterPlanInstances().add(element);
            }
            entity.setConsumerAcctInd(getStringValue(jsonObject,"consumer_acct_ind"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<CouponHistoryMReturnElement> buildCouponHistoryMReturnElement(JSONArray jsonArray) {
        ArrayList<CouponHistoryMReturnElement> returnElement = new ArrayList<CouponHistoryMReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            CouponHistoryMReturnElement entity = new CouponHistoryMReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setAcctNo(getLongValue(jsonObject,"acct_no"));
            entity.setUserId(getStringValue(jsonObject,"user_id"));
            entity.setClientAcctId(getStringValue(jsonObject,"client_acct_id"));
            entity.setMasterPlanInstanceId(getStringValue(jsonObject,"master_plan_instance_id"));
            entity.setClientMasterPlanInstanceId(getStringValue(jsonObject,"client_master_plan_instance_id"));
            entity.setCurrencyCd(getStringValue(jsonObject,"currency_cd"));
            entity.setCouponCd(getStringValue(jsonObject,"coupon_cd"));
            entity.setCouponCreateDate(getStringValue(jsonObject,"coupon_create_date"));
            entity.setCouponStatus(getStringValue(jsonObject,"coupon_status"));
            entity.setCouponCancelDate(getStringValue(jsonObject,"coupon_cancel_date"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<InvoiceLineTaxMReturnElement> buildInvoiceLineTaxMReturnElement(JSONArray jsonArray) {
        ArrayList<InvoiceLineTaxMReturnElement> returnElement = new ArrayList<InvoiceLineTaxMReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            InvoiceLineTaxMReturnElement entity = new InvoiceLineTaxMReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setTaxId(getLongValue(jsonObject,"tax_id"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setBeforeCreditAmount(getDoubleValue(jsonObject,"before_credit_amount"));
            entity.setJurisdiction(getStringValue(jsonObject,"jurisdiction"));
            entity.setDescription(getStringValue(jsonObject,"description"));
            entity.setIsExcluded(getLongValue(jsonObject,"is_excluded"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<InvoiceLineMReturnElement> buildInvoiceLineMReturnElement(JSONArray jsonArray) {
        ArrayList<InvoiceLineMReturnElement> returnElement = new ArrayList<InvoiceLineMReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            InvoiceLineMReturnElement entity = new InvoiceLineMReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setLineItemNo(getLongValue(jsonObject,"line_item_no"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setComments(getStringValue(jsonObject,"comments"));
            entity.setPlanName(getStringValue(jsonObject,"plan_name"));
            entity.setPlanNo(getLongValue(jsonObject,"plan_no"));
            entity.setServiceName(getStringValue(jsonObject,"service_name"));
            entity.setServiceNo(getLongValue(jsonObject,"service_no"));
            entity.setLedgerCode(getStringValue(jsonObject,"ledger_code"));
            entity.setCoaId(getLongValue(jsonObject,"coa_id"));
            entity.setCoaDescription(getStringValue(jsonObject,"coa_description"));
            entity.setUsageUnits(getDoubleValue(jsonObject,"usage_units"));
            entity.setUsageRate(getDoubleValue(jsonObject,"usage_rate"));
            entity.setUsageTypeNo(getDoubleValue(jsonObject,"usage_type_no"));
            entity.setStartDate(getStringValue(jsonObject,"start_date"));
            entity.setEndDate(getStringValue(jsonObject,"end_date"));
            entity.setClientSku(getStringValue(jsonObject,"client_sku"));
            entity.setOrderNo(getLongValue(jsonObject,"order_no"));
            entity.setItemNo(getLongValue(jsonObject,"item_no"));
            entity.setBasePlanUnits(getLongValue(jsonObject,"base_plan_units"));
            entity.setProrationFactor(getDoubleValue(jsonObject,"proration_factor"));
            entity.setProrationText(getStringValue(jsonObject,"proration_text"));
            entity.setAdvBillingPeriodTotalDays(getLongValue(jsonObject,"adv_billing_period_total_days"));
            entity.setProrationRemainingDays(getLongValue(jsonObject,"proration_remaining_days"));
            entity.setProrationDescription(getStringValue(jsonObject,"proration_description"));
            entity.setTransactionType(getStringValue(jsonObject,"transaction_type"));
            entity.setMasterPlanInstanceId(getLongValue(jsonObject,"master_plan_instance_id"));
            entity.setClientMasterPlanInstanceId(getStringValue(jsonObject,"client_master_plan_instance_id"));
            entity.setInvoiceTransactionId(getLongValue(jsonObject,"invoice_transaction_id"));
                        ArrayList<InvoiceLineTaxMReturnElement> arrayListInvoiceLineTaxMReturnElement = buildInvoiceLineTaxMReturnElement((JSONArray)jsonObject.get("invoice_line_tax_m"));
            for (InvoiceLineTaxMReturnElement element : arrayListInvoiceLineTaxMReturnElement){
                entity.getInvoiceLineTaxM().add(element);
            }
            entity.setRateScheduleNo(getDoubleValue(jsonObject,"rate_schedule_no"));
            entity.setRateScheduleTierNo(getDoubleValue(jsonObject,"rate_schedule_tier_no"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<InvoiceDetailsMReturnElement> buildInvoiceDetailsMReturnElement(JSONArray jsonArray) {
        ArrayList<InvoiceDetailsMReturnElement> returnElement = new ArrayList<InvoiceDetailsMReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            InvoiceDetailsMReturnElement entity = new InvoiceDetailsMReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setInvoiceNo(getLongValue(jsonObject,"invoice_no"));
            entity.setAcctNo(getLongValue(jsonObject,"acct_no"));
            entity.setUserId(getStringValue(jsonObject,"user_id"));
            entity.setClientAcctId(getStringValue(jsonObject,"client_acct_id"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setBillDate(getStringValue(jsonObject,"bill_date"));
            entity.setDueDate(getStringValue(jsonObject,"due_date"));
            entity.setPaidDate(getStringValue(jsonObject,"paid_date"));
            entity.setNotifyDate(getStringValue(jsonObject,"notify_date"));
            entity.setFromDate(getStringValue(jsonObject,"from_date"));
            entity.setToDate(getStringValue(jsonObject,"to_date"));
            entity.setCurrencyCd(getStringValue(jsonObject,"currency_cd"));
            entity.setBalanceForward(getDoubleValue(jsonObject,"balance_forward"));
            entity.setStatementBalanceForward(getDoubleValue(jsonObject,"statement_balance_forward"));
            entity.setTotalDue(getDoubleValue(jsonObject,"total_due"));
            entity.setComments(getStringValue(jsonObject,"comments"));
            entity.setAdditionalComments(getStringValue(jsonObject,"additional_comments"));
            entity.setLastUpdated(getStringValue(jsonObject,"last_updated"));
            entity.setAriaStatementNo(getLongValue(jsonObject,"aria_statement_no"));
            entity.setAcctStatementSeqStr(getStringValue(jsonObject,"acct_statement_seq_str"));
            entity.setSecondAcctStatementSeqStr(getStringValue(jsonObject,"second_acct_statement_seq_str"));
            entity.setVoidingEventNo(getLongValue(jsonObject,"voiding_event_no"));
            entity.setCustomStatusLabel(getStringValue(jsonObject,"custom_status_label"));
            entity.setClientNotes(getStringValue(jsonObject,"client_notes"));
            entity.setInvoiceTypeCd(getStringValue(jsonObject,"invoice_type_cd"));
            entity.setBillingGroupNo(getLongValue(jsonObject,"billing_group_no"));
            entity.setClientBillingGroupId(getLongValue(jsonObject,"client_billing_group_id"));
                        ArrayList<InvoiceLineMReturnElement> arrayListInvoiceLineMReturnElement = buildInvoiceLineMReturnElement((JSONArray)jsonObject.get("invoice_line_m"));
            for (InvoiceLineMReturnElement element : arrayListInvoiceLineMReturnElement){
                entity.getInvoiceLineM().add(element);
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<AllInvoiceLineTaxMReturnElement> buildAllInvoiceLineTaxMReturnElement(JSONArray jsonArray) {
        ArrayList<AllInvoiceLineTaxMReturnElement> returnElement = new ArrayList<AllInvoiceLineTaxMReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AllInvoiceLineTaxMReturnElement entity = new AllInvoiceLineTaxMReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setTaxId(getLongValue(jsonObject,"tax_id"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setBeforeCreditAmount(getDoubleValue(jsonObject,"before_credit_amount"));
            entity.setJurisdiction(getStringValue(jsonObject,"jurisdiction"));
            entity.setDescription(getStringValue(jsonObject,"description"));
            entity.setIsExcluded(getLongValue(jsonObject,"is_excluded"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<AllInvoiceLineMReturnElement> buildAllInvoiceLineMReturnElement(JSONArray jsonArray) {
        ArrayList<AllInvoiceLineMReturnElement> returnElement = new ArrayList<AllInvoiceLineMReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AllInvoiceLineMReturnElement entity = new AllInvoiceLineMReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setLineItemNo(getLongValue(jsonObject,"line_item_no"));
            entity.setCreditReasonCodeDescription(getStringValue(jsonObject,"credit_reason_code_description"));
            entity.setDescription(getStringValue(jsonObject,"description"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setComments(getStringValue(jsonObject,"comments"));
            entity.setPlanName(getStringValue(jsonObject,"plan_name"));
            entity.setPlanNo(getLongValue(jsonObject,"plan_no"));
            entity.setServiceName(getStringValue(jsonObject,"service_name"));
            entity.setServiceNo(getLongValue(jsonObject,"service_no"));
            entity.setLedgerCode(getStringValue(jsonObject,"ledger_code"));
            entity.setCoaId(getLongValue(jsonObject,"coa_id"));
            entity.setCoaDescription(getStringValue(jsonObject,"coa_description"));
            entity.setUsageUnits(getDoubleValue(jsonObject,"usage_units"));
            entity.setUsageRate(getDoubleValue(jsonObject,"usage_rate"));
            entity.setUsageTypeNo(getDoubleValue(jsonObject,"usage_type_no"));
            entity.setStartDate(getStringValue(jsonObject,"start_date"));
            entity.setEndDate(getStringValue(jsonObject,"end_date"));
            entity.setClientSku(getStringValue(jsonObject,"client_sku"));
            entity.setOrderNo(getLongValue(jsonObject,"order_no"));
            entity.setItemNo(getLongValue(jsonObject,"item_no"));
            entity.setBasePlanUnits(getLongValue(jsonObject,"base_plan_units"));
            entity.setProrationFactor(getDoubleValue(jsonObject,"proration_factor"));
            entity.setProrationText(getStringValue(jsonObject,"proration_text"));
            entity.setAdvBillingPeriodTotalDays(getLongValue(jsonObject,"adv_billing_period_total_days"));
            entity.setProrationRemainingDays(getLongValue(jsonObject,"proration_remaining_days"));
            entity.setProrationDescription(getStringValue(jsonObject,"proration_description"));
            entity.setTransactionType(getStringValue(jsonObject,"transaction_type"));
            entity.setMasterPlanInstanceId(getLongValue(jsonObject,"master_plan_instance_id"));
            entity.setClientMasterPlanInstanceId(getStringValue(jsonObject,"client_master_plan_instance_id"));
            entity.setInvoiceTransactionId(getLongValue(jsonObject,"invoice_transaction_id"));
                        ArrayList<AllInvoiceLineTaxMReturnElement> arrayListAllInvoiceLineTaxMReturnElement = buildAllInvoiceLineTaxMReturnElement((JSONArray)jsonObject.get("all_invoice_line_tax_m"));
            for (AllInvoiceLineTaxMReturnElement element : arrayListAllInvoiceLineTaxMReturnElement){
                entity.getAllInvoiceLineTaxM().add(element);
            }
            entity.setRateScheduleNo(getDoubleValue(jsonObject,"rate_schedule_no"));
            entity.setRateScheduleTierNo(getDoubleValue(jsonObject,"rate_schedule_tier_no"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<AllInvoiceDetailsMReturnElement> buildAllInvoiceDetailsMReturnElement(JSONArray jsonArray) {
        ArrayList<AllInvoiceDetailsMReturnElement> returnElement = new ArrayList<AllInvoiceDetailsMReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AllInvoiceDetailsMReturnElement entity = new AllInvoiceDetailsMReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setInvoiceNo(getLongValue(jsonObject,"invoice_no"));
            entity.setAcctNo(getLongValue(jsonObject,"acct_no"));
            entity.setUserId(getStringValue(jsonObject,"user_id"));
            entity.setClientAcctId(getStringValue(jsonObject,"client_acct_id"));
            entity.setInvoiceType(getStringValue(jsonObject,"invoice_type"));
            entity.setFromDate(getStringValue(jsonObject,"from_date"));
            entity.setToDate(getStringValue(jsonObject,"to_date"));
            entity.setUsageBillFromDate(getStringValue(jsonObject,"usage_bill_from_date"));
            entity.setUsageBillThruDate(getStringValue(jsonObject,"usage_bill_thru_date"));
            entity.setTaxedEmail(getStringValue(jsonObject,"taxed_email"));
            entity.setTaxedFirstName(getStringValue(jsonObject,"taxed_first_name"));
            entity.setTaxedMiddleInitial(getStringValue(jsonObject,"taxed_middle_initial"));
            entity.setTaxedLastName(getStringValue(jsonObject,"taxed_last_name"));
            entity.setTaxedAddress1(getStringValue(jsonObject,"taxed_address1"));
            entity.setTaxedAddress2(getStringValue(jsonObject,"taxed_address2"));
            entity.setTaxedAddress3(getStringValue(jsonObject,"taxed_address3"));
            entity.setTaxedCity(getStringValue(jsonObject,"taxed_city"));
            entity.setTaxedState(getStringValue(jsonObject,"taxed_state"));
            entity.setTaxedLocality(getStringValue(jsonObject,"taxed_locality"));
            entity.setTaxedZip(getStringValue(jsonObject,"taxed_zip"));
            entity.setTaxedCountry(getStringValue(jsonObject,"taxed_country"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setBillDate(getStringValue(jsonObject,"bill_date"));
            entity.setDueDate(getStringValue(jsonObject,"due_date"));
            entity.setPaidDate(getStringValue(jsonObject,"paid_date"));
            entity.setNotifyDate(getStringValue(jsonObject,"notify_date"));
            entity.setCurrencyCd(getStringValue(jsonObject,"currency_cd"));
            entity.setBalanceForward(getDoubleValue(jsonObject,"balance_forward"));
            entity.setStatementBalanceForward(getDoubleValue(jsonObject,"statement_balance_forward"));
            entity.setTotalDue(getDoubleValue(jsonObject,"total_due"));
            entity.setComments(getStringValue(jsonObject,"comments"));
            entity.setAdditionalComments(getStringValue(jsonObject,"additional_comments"));
            entity.setLastUpdated(getStringValue(jsonObject,"last_updated"));
            entity.setAriaStatementNo(getLongValue(jsonObject,"aria_statement_no"));
            entity.setAcctStatementSeqStr(getStringValue(jsonObject,"acct_statement_seq_str"));
            entity.setSecondAcctStatementSeqStr(getStringValue(jsonObject,"second_acct_statement_seq_str"));
            entity.setInvoiceLineItems(getStringValue(jsonObject,"invoice_line_items"));
            entity.setVoidingEventNo(getLongValue(jsonObject,"voiding_event_no"));
            entity.setBillCompanyName(getStringValue(jsonObject,"bill_company_name"));
            entity.setPayMethodType(getLongValue(jsonObject,"pay_method_type"));
            entity.setPayMethodName(getStringValue(jsonObject,"pay_method_name"));
            entity.setCustomStatusLabel(getStringValue(jsonObject,"custom_status_label"));
            entity.setClientNotes(getStringValue(jsonObject,"client_notes"));
            entity.setBillingGroupNo(getLongValue(jsonObject,"billing_group_no"));
            entity.setClientBillingGroupId(getLongValue(jsonObject,"client_billing_group_id"));
                        ArrayList<AllInvoiceLineMReturnElement> arrayListAllInvoiceLineMReturnElement = buildAllInvoiceLineMReturnElement((JSONArray)jsonObject.get("all_invoice_line_m"));
            for (AllInvoiceLineMReturnElement element : arrayListAllInvoiceLineMReturnElement){
                entity.getAllInvoiceLineM().add(element);
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<AccountPlanHistoryMReturnElement> buildAccountPlanHistoryMReturnElement(JSONArray jsonArray) {
        ArrayList<AccountPlanHistoryMReturnElement> returnElement = new ArrayList<AccountPlanHistoryMReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AccountPlanHistoryMReturnElement entity = new AccountPlanHistoryMReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPlanInstanceNo(getLongValue(jsonObject,"plan_instance_no"));
            entity.setClientPlanInstanceId(getLongValue(jsonObject,"client_plan_instance_id"));
            entity.setMasterPlanInstanceNo(getLongValue(jsonObject,"master_plan_instance_no"));
            entity.setMpClientPlanInstanceId(getLongValue(jsonObject,"mp_client_plan_instance_id"));
            entity.setOldPlanName(getStringValue(jsonObject,"old_plan_name"));
            entity.setOldPlanNo(getLongValue(jsonObject,"old_plan_no"));
            entity.setOldClientPlanId(getStringValue(jsonObject,"old_client_plan_id"));
            entity.setOldClientPlanInstanceId(getLongValue(jsonObject,"old_client_plan_instance_id"));
            entity.setOldPromoCd(getStringValue(jsonObject,"old_promo_cd"));
            entity.setOldStatusCd(getStringValue(jsonObject,"old_status_cd"));
            entity.setOldPlanUnits(getLongValue(jsonObject,"old_plan_units"));
            entity.setOldRateScheduleNo(getLongValue(jsonObject,"old_rate_schedule_no"));
            entity.setOldClientRateScheduleId(getLongValue(jsonObject,"old_client_rate_schedule_id"));
            entity.setNewPlanName(getStringValue(jsonObject,"new_plan_name"));
            entity.setNewPlanNo(getLongValue(jsonObject,"new_plan_no"));
            entity.setNewClientPlanId(getStringValue(jsonObject,"new_client_plan_id"));
            entity.setNewClientPlanInstanceId(getLongValue(jsonObject,"new_client_plan_instance_id"));
            entity.setNewPromoCd(getStringValue(jsonObject,"new_promo_cd"));
            entity.setNewStatusCd(getStringValue(jsonObject,"new_status_cd"));
            entity.setNewPlanUnits(getLongValue(jsonObject,"new_plan_units"));
            entity.setNewRateScheduleNo(getLongValue(jsonObject,"new_rate_schedule_no"));
            entity.setNewClientRateScheduleId(getLongValue(jsonObject,"new_client_rate_schedule_id"));
            returnElement.add(entity);
        }
        return returnElement;
    }
    /* ****************** END - SPECIFIC METHODS FOR EACH RETURN ELEMENT (build<#name#>) **************************************** */

    /* ****************** ARRAY TO PARAM METHODS FOR EACH ARRAY ELEMENT ********************************************** */
    /* ****************** END - ARRAY TO PARAM METHODS FOR EACH ARRAY ELEMENT **************************************** */

}
