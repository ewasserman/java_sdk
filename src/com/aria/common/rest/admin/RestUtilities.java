package com.aria.common.rest.admin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import javax.ws.rs.core.MultivaluedMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.aria.common.shared.admin.*;

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
    public static ArrayList<PromoPlanSetReturnElement> buildPromoPlanSetReturnElement(JSONArray jsonArray) {
        ArrayList<PromoPlanSetReturnElement> returnElement = new ArrayList<PromoPlanSetReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PromoPlanSetReturnElement entity = new PromoPlanSetReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPromoPlanSetNo(getLongValue(jsonObject,"promo_plan_set_no"));
            entity.setPromoPlanSetName(getStringValue(jsonObject,"promo_plan_set_name"));
            entity.setPromoPlanSetDesc(getStringValue(jsonObject,"promo_plan_set_desc"));
            entity.setClientPlanTypeId(getStringValue(jsonObject,"client_plan_type_id"));
            } else {
            try {
                entity.setPromoPlanSetNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setPromoPlanSetNo(null);
            }
            entity.setPromoPlanSetName(jsonArray.get(i).toString());
            entity.setPromoPlanSetDesc(jsonArray.get(i).toString());
            entity.setClientPlanTypeId(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<PlanReturnElement> buildPlanReturnElement(JSONArray jsonArray) {
        ArrayList<PlanReturnElement> returnElement = new ArrayList<PlanReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PlanReturnElement entity = new PlanReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPlanNo(getLongValue(jsonObject,"plan_no"));
            entity.setPlanName(getStringValue(jsonObject,"plan_name"));
            entity.setPlanDesc(getStringValue(jsonObject,"plan_desc"));
            entity.setClientPlanId(getStringValue(jsonObject,"client_plan_id"));
            } else {
            try {
                entity.setPlanNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setPlanNo(null);
            }
            entity.setPlanName(jsonArray.get(i).toString());
            entity.setPlanDesc(jsonArray.get(i).toString());
            entity.setClientPlanId(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ClientReturnElement> buildClientReturnElement(JSONArray jsonArray) {
        ArrayList<ClientReturnElement> returnElement = new ArrayList<ClientReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ClientReturnElement entity = new ClientReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setClientName(getStringValue(jsonObject,"client_name"));
            entity.setDomain(getStringValue(jsonObject,"domain"));
            entity.setAddress1(getStringValue(jsonObject,"address1"));
            entity.setAddress2(getStringValue(jsonObject,"address2"));
            entity.setCity(getStringValue(jsonObject,"city"));
            entity.setLocality(getStringValue(jsonObject,"locality"));
            entity.setStateProv(getStringValue(jsonObject,"state_prov"));
            entity.setCountry(getStringValue(jsonObject,"country"));
            entity.setPostalCode(getStringValue(jsonObject,"postal_code"));
            entity.setPhone(getStringValue(jsonObject,"phone"));
            entity.setContact(getStringValue(jsonObject,"contact"));
            entity.setContactAddress1(getStringValue(jsonObject,"contact_address1"));
            entity.setContactAddress2(getStringValue(jsonObject,"contact_address2"));
            entity.setContactCity(getStringValue(jsonObject,"contact_city"));
            entity.setContactState(getStringValue(jsonObject,"contact_state"));
            entity.setContactZip(getStringValue(jsonObject,"contact_zip"));
            entity.setContactPhone(getStringValue(jsonObject,"contact_phone"));
            entity.setContactEmail(getStringValue(jsonObject,"contact_email"));
            entity.setBillingContact(getStringValue(jsonObject,"billing_contact"));
            entity.setBillingAddress1(getStringValue(jsonObject,"billing_address1"));
            entity.setBillingAddress2(getStringValue(jsonObject,"billing_address2"));
            entity.setBillingCity(getStringValue(jsonObject,"billing_city"));
            entity.setBillingState(getStringValue(jsonObject,"billing_state"));
            entity.setBillingZip(getStringValue(jsonObject,"billing_zip"));
            entity.setBillingPhone(getStringValue(jsonObject,"billing_phone"));
            entity.setBillingEmail(getStringValue(jsonObject,"billing_email"));
            entity.setContactCountry(getStringValue(jsonObject,"contact_country"));
            entity.setContactLocality(getStringValue(jsonObject,"contact_locality"));
            entity.setBillingCountry(getStringValue(jsonObject,"billing_country"));
            entity.setBillingLocality(getStringValue(jsonObject,"billing_locality"));
            } else {
            entity.setClientName(jsonArray.get(i).toString());
            entity.setDomain(jsonArray.get(i).toString());
            entity.setAddress1(jsonArray.get(i).toString());
            entity.setAddress2(jsonArray.get(i).toString());
            entity.setCity(jsonArray.get(i).toString());
            entity.setLocality(jsonArray.get(i).toString());
            entity.setStateProv(jsonArray.get(i).toString());
            entity.setCountry(jsonArray.get(i).toString());
            entity.setPostalCode(jsonArray.get(i).toString());
            entity.setPhone(jsonArray.get(i).toString());
            entity.setContact(jsonArray.get(i).toString());
            entity.setContactAddress1(jsonArray.get(i).toString());
            entity.setContactAddress2(jsonArray.get(i).toString());
            entity.setContactCity(jsonArray.get(i).toString());
            entity.setContactState(jsonArray.get(i).toString());
            entity.setContactZip(jsonArray.get(i).toString());
            entity.setContactPhone(jsonArray.get(i).toString());
            entity.setContactEmail(jsonArray.get(i).toString());
            entity.setBillingContact(jsonArray.get(i).toString());
            entity.setBillingAddress1(jsonArray.get(i).toString());
            entity.setBillingAddress2(jsonArray.get(i).toString());
            entity.setBillingCity(jsonArray.get(i).toString());
            entity.setBillingState(jsonArray.get(i).toString());
            entity.setBillingZip(jsonArray.get(i).toString());
            entity.setBillingPhone(jsonArray.get(i).toString());
            entity.setBillingEmail(jsonArray.get(i).toString());
            entity.setContactCountry(jsonArray.get(i).toString());
            entity.setContactLocality(jsonArray.get(i).toString());
            entity.setBillingCountry(jsonArray.get(i).toString());
            entity.setBillingLocality(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<InventoryItemsReturnElement> buildInventoryItemsReturnElement(JSONArray jsonArray) {
        ArrayList<InventoryItemsReturnElement> returnElement = new ArrayList<InventoryItemsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            InventoryItemsReturnElement entity = new InventoryItemsReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setItemNo(getLongValue(jsonObject,"item_no"));
            entity.setItemName(getStringValue(jsonObject,"item_name"));
            entity.setItemType(getLongValue(jsonObject,"item_type"));
            entity.setClientSku(getStringValue(jsonObject,"client_sku"));
            entity.setActiveInd(getLongValue(jsonObject,"active_ind"));
            entity.setStockLevel(getDoubleValue(jsonObject,"stock_level"));
            entity.setClientItemId(getStringValue(jsonObject,"client_item_id"));
            } else {
            try {
                entity.setItemNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setItemNo(null);
            }
            entity.setItemName(jsonArray.get(i).toString());
            try {
                entity.setItemType(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setItemType(null);
            }
            entity.setClientSku(jsonArray.get(i).toString());
            try {
                entity.setActiveInd(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setActiveInd(null);
            }
            try {
                entity.setStockLevel(Double.parseDouble(jsonArray.get(i).toString()+".0"));
            } catch (NumberFormatException e) {
                entity.setStockLevel(null);
            }
            entity.setClientItemId(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ResourcesReturnElement> buildResourcesReturnElement(JSONArray jsonArray) {
        ArrayList<ResourcesReturnElement> returnElement = new ArrayList<ResourcesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ResourcesReturnElement entity = new ResourcesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setResources(getLongValue(jsonObject,"resources"));
            entity.setResourceTypeNo(getLongValue(jsonObject,"resource_type_no"));
            entity.setResourceUnits(getLongValue(jsonObject,"resource_units"));
            entity.setExpireOnPaidThrough(getLongValue(jsonObject,"expire_on_paid_through"));
            entity.setResetOnUpdate(getLongValue(jsonObject,"reset_on_update"));
            entity.setAddDaysToExpiry(getLongValue(jsonObject,"add_days_to_expiry"));
            } else {
            try {
                entity.setResources(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setResources(null);
            }
            try {
                entity.setResourceTypeNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setResourceTypeNo(null);
            }
            try {
                entity.setResourceUnits(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setResourceUnits(null);
            }
            try {
                entity.setExpireOnPaidThrough(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setExpireOnPaidThrough(null);
            }
            try {
                entity.setResetOnUpdate(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setResetOnUpdate(null);
            }
            try {
                entity.setAddDaysToExpiry(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setAddDaysToExpiry(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<PricingReturnElement> buildPricingReturnElement(JSONArray jsonArray) {
        ArrayList<PricingReturnElement> returnElement = new ArrayList<PricingReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PricingReturnElement entity = new PricingReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setCurrencyCd(getStringValue(jsonObject,"currency_cd"));
            entity.setPrice(getDoubleValue(jsonObject,"price"));
            entity.setPricePerUnit(getDoubleValue(jsonObject,"price_per_unit"));
            } else {
            entity.setCurrencyCd(jsonArray.get(i).toString());
            try {
                entity.setPrice(Double.parseDouble(jsonArray.get(i).toString()+".0"));
            } catch (NumberFormatException e) {
                entity.setPrice(null);
            }
            try {
                entity.setPricePerUnit(Double.parseDouble(jsonArray.get(i).toString()+".0"));
            } catch (NumberFormatException e) {
                entity.setPricePerUnit(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ImageReturnElement> buildImageReturnElement(JSONArray jsonArray) {
        ArrayList<ImageReturnElement> returnElement = new ArrayList<ImageReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ImageReturnElement entity = new ImageReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setThumbnailImageUrl(getStringValue(jsonObject,"thumbnail_image_url"));
            entity.setImageText(getStringValue(jsonObject,"image_text"));
            entity.setDefaultInd(getLongValue(jsonObject,"default_ind"));
            entity.setImageClassSeqNo(getLongValue(jsonObject,"image_class_seq_no"));
            entity.setActive(getLongValue(jsonObject,"active"));
            entity.setMainImageUrl(getStringValue(jsonObject,"main_image_url"));
            } else {
            entity.setThumbnailImageUrl(jsonArray.get(i).toString());
            entity.setImageText(jsonArray.get(i).toString());
            try {
                entity.setDefaultInd(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setDefaultInd(null);
            }
            try {
                entity.setImageClassSeqNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setImageClassSeqNo(null);
            }
            try {
                entity.setActive(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setActive(null);
            }
            entity.setMainImageUrl(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<SupplementalObjFieldsReturnElement> buildSupplementalObjFieldsReturnElement(JSONArray jsonArray) {
        ArrayList<SupplementalObjFieldsReturnElement> returnElement = new ArrayList<SupplementalObjFieldsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            SupplementalObjFieldsReturnElement entity = new SupplementalObjFieldsReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setFieldNo(getLongValue(jsonObject,"field_no"));
            entity.setFieldValue(getStringValue(jsonObject,"field_value"));
            entity.setFieldName(getStringValue(jsonObject,"field_name"));
            } else {
            try {
                entity.setFieldNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setFieldNo(null);
            }
            entity.setFieldValue(jsonArray.get(i).toString());
            entity.setFieldName(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ServiceTypesReturnElement> buildServiceTypesReturnElement(JSONArray jsonArray) {
        ArrayList<ServiceTypesReturnElement> returnElement = new ArrayList<ServiceTypesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ServiceTypesReturnElement entity = new ServiceTypesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setServiceTypeCd(getStringValue(jsonObject,"service_type_cd"));
            entity.setServiceTypeName(getStringValue(jsonObject,"service_type_name"));
            entity.setServiceDesc(getStringValue(jsonObject,"service_desc"));
            } else {
            entity.setServiceTypeCd(jsonArray.get(i).toString());
            entity.setServiceTypeName(jsonArray.get(i).toString());
            entity.setServiceDesc(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ServicesReturnElement> buildServicesReturnElement(JSONArray jsonArray) {
        ArrayList<ServicesReturnElement> returnElement = new ArrayList<ServicesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ServicesReturnElement entity = new ServicesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setServiceNo(getLongValue(jsonObject,"service_no"));
            entity.setClientServiceId(getStringValue(jsonObject,"client_service_id"));
            } else {
            try {
                entity.setServiceNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setServiceNo(null);
            }
            entity.setClientServiceId(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<RateInfoReturnElement> buildRateInfoReturnElement(JSONArray jsonArray) {
        ArrayList<RateInfoReturnElement> returnElement = new ArrayList<RateInfoReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            RateInfoReturnElement entity = new RateInfoReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setScheduleNo(getLongValue(jsonObject,"schedule_no"));
            entity.setScheduleName(getStringValue(jsonObject,"schedule_name"));
            entity.setClientRateScheduleId(getStringValue(jsonObject,"client_rate_schedule_id"));
            entity.setFromUnit(getLongValue(jsonObject,"from_unit"));
            entity.setToUnit(getLongValue(jsonObject,"to_unit"));
            entity.setRatePerUnit(getDoubleValue(jsonObject,"rate_per_unit"));
            entity.setDescription(getStringValue(jsonObject,"description"));
            } else {
            try {
                entity.setScheduleNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setScheduleNo(null);
            }
            entity.setScheduleName(jsonArray.get(i).toString());
            entity.setClientRateScheduleId(jsonArray.get(i).toString());
            try {
                entity.setFromUnit(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setFromUnit(null);
            }
            try {
                entity.setToUnit(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setToUnit(null);
            }
            try {
                entity.setRatePerUnit(Double.parseDouble(jsonArray.get(i).toString()+".0"));
            } catch (NumberFormatException e) {
                entity.setRatePerUnit(null);
            }
            entity.setDescription(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<RateSchedulesReturnElement> buildRateSchedulesReturnElement(JSONArray jsonArray) {
        ArrayList<RateSchedulesReturnElement> returnElement = new ArrayList<RateSchedulesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            RateSchedulesReturnElement entity = new RateSchedulesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setCurrency(getStringValue(jsonObject,"currency"));
                        ArrayList<RateInfoReturnElement> arrayListRateInfoReturnElement = buildRateInfoReturnElement((JSONArray)jsonObject.get("rate_info"));
            for (RateInfoReturnElement element : arrayListRateInfoReturnElement){
                entity.getRateInfo().add(element);
            }
            entity.setIsDefault(getLongValue(jsonObject,"is_default"));
            } else {
            entity.setCurrency(jsonArray.get(i).toString());
            try {
                entity.setIsDefault(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setIsDefault(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ParentPlansReturnElement> buildParentPlansReturnElement(JSONArray jsonArray) {
        ArrayList<ParentPlansReturnElement> returnElement = new ArrayList<ParentPlansReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ParentPlansReturnElement entity = new ParentPlansReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setParentPlan(getLongValue(jsonObject,"parent_plan"));
            } else {
            try {
                entity.setParentPlan(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setParentPlan(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ParentPlanIdsReturnElement> buildParentPlanIdsReturnElement(JSONArray jsonArray) {
        ArrayList<ParentPlanIdsReturnElement> returnElement = new ArrayList<ParentPlanIdsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ParentPlanIdsReturnElement entity = new ParentPlanIdsReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setParentPlanId(getStringValue(jsonObject,"parent_plan_id"));
            } else {
            entity.setParentPlanId(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ExclusionPlansReturnElement> buildExclusionPlansReturnElement(JSONArray jsonArray) {
        ArrayList<ExclusionPlansReturnElement> returnElement = new ArrayList<ExclusionPlansReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ExclusionPlansReturnElement entity = new ExclusionPlansReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setExclusionPlan(getLongValue(jsonObject,"exclusion_plan"));
            } else {
            try {
                entity.setExclusionPlan(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setExclusionPlan(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<SuppFieldsReturnElement> buildSuppFieldsReturnElement(JSONArray jsonArray) {
        ArrayList<SuppFieldsReturnElement> returnElement = new ArrayList<SuppFieldsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            SuppFieldsReturnElement entity = new SuppFieldsReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setFieldName(getStringValue(jsonObject,"field_name"));
            entity.setFieldDesc(getStringValue(jsonObject,"field_desc"));
            entity.setFieldOrder(getLongValue(jsonObject,"field_order"));
            } else {
            entity.setFieldName(jsonArray.get(i).toString());
            entity.setFieldDesc(jsonArray.get(i).toString());
            try {
                entity.setFieldOrder(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setFieldOrder(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<SelOptionsReturnElement> buildSelOptionsReturnElement(JSONArray jsonArray) {
        ArrayList<SelOptionsReturnElement> returnElement = new ArrayList<SelOptionsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            SelOptionsReturnElement entity = new SelOptionsReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setDisplayText(getStringValue(jsonObject,"display_text"));
            entity.setOptionValue(getStringValue(jsonObject,"option_value"));
            entity.setOptionValueOrder(getLongValue(jsonObject,"option_value_order"));
            } else {
            entity.setDisplayText(jsonArray.get(i).toString());
            entity.setOptionValue(jsonArray.get(i).toString());
            try {
                entity.setOptionValueOrder(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setOptionValueOrder(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<CouponsReturnElement> buildCouponsReturnElement(JSONArray jsonArray) {
        ArrayList<CouponsReturnElement> returnElement = new ArrayList<CouponsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            CouponsReturnElement entity = new CouponsReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setCouponCd(getStringValue(jsonObject,"coupon_cd"));
            } else {
            entity.setCouponCd(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<RulesReturnElement> buildRulesReturnElement(JSONArray jsonArray) {
        ArrayList<RulesReturnElement> returnElement = new ArrayList<RulesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            RulesReturnElement entity = new RulesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setRule(getLongValue(jsonObject,"rule"));
            } else {
            try {
                entity.setRule(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setRule(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<RuleIdsReturnElement> buildRuleIdsReturnElement(JSONArray jsonArray) {
        ArrayList<RuleIdsReturnElement> returnElement = new ArrayList<RuleIdsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            RuleIdsReturnElement entity = new RuleIdsReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setRule(getStringValue(jsonObject,"rule"));
            } else {
            entity.setRule(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<PlanNoReturnElement> buildPlanNoReturnElement(JSONArray jsonArray) {
        ArrayList<PlanNoReturnElement> returnElement = new ArrayList<PlanNoReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PlanNoReturnElement entity = new PlanNoReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPlanNos(getLongValue(jsonObject,"plan_nos"));
            } else {
            try {
                entity.setPlanNos(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setPlanNos(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ClientPlanIdReturnElement> buildClientPlanIdReturnElement(JSONArray jsonArray) {
        ArrayList<ClientPlanIdReturnElement> returnElement = new ArrayList<ClientPlanIdReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ClientPlanIdReturnElement entity = new ClientPlanIdReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setClientPlanIds(getStringValue(jsonObject,"client_plan_ids"));
            } else {
            entity.setClientPlanIds(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ServiceNoReturnElement> buildServiceNoReturnElement(JSONArray jsonArray) {
        ArrayList<ServiceNoReturnElement> returnElement = new ArrayList<ServiceNoReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ServiceNoReturnElement entity = new ServiceNoReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setServiceNos(getLongValue(jsonObject,"service_nos"));
            } else {
            try {
                entity.setServiceNos(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setServiceNos(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ClientServiceIdReturnElement> buildClientServiceIdReturnElement(JSONArray jsonArray) {
        ArrayList<ClientServiceIdReturnElement> returnElement = new ArrayList<ClientServiceIdReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ClientServiceIdReturnElement entity = new ClientServiceIdReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setClientServiceIds(getStringValue(jsonObject,"client_service_ids"));
            } else {
            entity.setClientServiceIds(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ItemNoReturnElement> buildItemNoReturnElement(JSONArray jsonArray) {
        ArrayList<ItemNoReturnElement> returnElement = new ArrayList<ItemNoReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ItemNoReturnElement entity = new ItemNoReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setItemNos(getLongValue(jsonObject,"item_nos"));
            } else {
            try {
                entity.setItemNos(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setItemNos(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ClientItemIdReturnElement> buildClientItemIdReturnElement(JSONArray jsonArray) {
        ArrayList<ClientItemIdReturnElement> returnElement = new ArrayList<ClientItemIdReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ClientItemIdReturnElement entity = new ClientItemIdReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setClientItemIds(getStringValue(jsonObject,"client_item_ids"));
            } else {
            entity.setClientItemIds(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<EligibleServiceTypesReturnElement> buildEligibleServiceTypesReturnElement(JSONArray jsonArray) {
        ArrayList<EligibleServiceTypesReturnElement> returnElement = new ArrayList<EligibleServiceTypesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            EligibleServiceTypesReturnElement entity = new EligibleServiceTypesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setEligibleServiceType(getStringValue(jsonObject,"eligible_service_type"));
            } else {
            entity.setEligibleServiceType(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<CreditTemplateReturnElement> buildCreditTemplateReturnElement(JSONArray jsonArray) {
        ArrayList<CreditTemplateReturnElement> returnElement = new ArrayList<CreditTemplateReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            CreditTemplateReturnElement entity = new CreditTemplateReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setCreditTemplateNo(getLongValue(jsonObject,"credit_template_no"));
            entity.setCreditTemplateId(getStringValue(jsonObject,"credit_template_id"));
            entity.setCreditTemplateName(getStringValue(jsonObject,"credit_template_name"));
            entity.setClientCreditTemplateId(getStringValue(jsonObject,"client_credit_template_id"));
            entity.setEligiblePlanNo(getLongValue(jsonObject,"eligible_plan_no"));
            entity.setEligibleClientPlanId(getStringValue(jsonObject,"eligible_client_plan_id"));
            entity.setEligibleServiceNo(getLongValue(jsonObject,"eligible_service_no"));
            entity.setEligibleClientServiceId(getStringValue(jsonObject,"eligible_client_service_id"));
            entity.setNoOfCredits(getLongValue(jsonObject,"no_of_credits"));
            entity.setTimeBetweenCredits(getLongValue(jsonObject,"time_between_credits"));
            entity.setDiscountType(getLongValue(jsonObject,"discount_type"));
            entity.setDiscountAmt(getDoubleValue(jsonObject,"discount_amt"));
            entity.setPercentagePlanNo(getLongValue(jsonObject,"percentage_plan_no"));
            entity.setPercentageClientPlanId(getStringValue(jsonObject,"percentage_client_plan_id"));
            entity.setPercentageServiceNo(getLongValue(jsonObject,"percentage_service_no"));
            entity.setPercentageClientServiceId(getStringValue(jsonObject,"percentage_client_service_id"));
            entity.setAltServiceNo(getLongValue(jsonObject,"alt_service_no"));
            entity.setAltClientServiceId(getStringValue(jsonObject,"alt_client_service_id"));
                        ArrayList<EligibleServiceTypesReturnElement> arrayListEligibleServiceTypesReturnElement = buildEligibleServiceTypesReturnElement((JSONArray)jsonObject.get("eligible_service_types"));
            for (EligibleServiceTypesReturnElement element : arrayListEligibleServiceTypesReturnElement){
                entity.getEligibleServiceTypes().add(element);
            }
            } else {
            try {
                entity.setCreditTemplateNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setCreditTemplateNo(null);
            }
            entity.setCreditTemplateId(jsonArray.get(i).toString());
            entity.setCreditTemplateName(jsonArray.get(i).toString());
            entity.setClientCreditTemplateId(jsonArray.get(i).toString());
            try {
                entity.setEligiblePlanNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setEligiblePlanNo(null);
            }
            entity.setEligibleClientPlanId(jsonArray.get(i).toString());
            try {
                entity.setEligibleServiceNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setEligibleServiceNo(null);
            }
            entity.setEligibleClientServiceId(jsonArray.get(i).toString());
            try {
                entity.setNoOfCredits(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setNoOfCredits(null);
            }
            try {
                entity.setTimeBetweenCredits(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setTimeBetweenCredits(null);
            }
            try {
                entity.setDiscountType(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setDiscountType(null);
            }
            try {
                entity.setDiscountAmt(Double.parseDouble(jsonArray.get(i).toString()+".0"));
            } catch (NumberFormatException e) {
                entity.setDiscountAmt(null);
            }
            try {
                entity.setPercentagePlanNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setPercentagePlanNo(null);
            }
            entity.setPercentageClientPlanId(jsonArray.get(i).toString());
            try {
                entity.setPercentageServiceNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setPercentageServiceNo(null);
            }
            entity.setPercentageClientServiceId(jsonArray.get(i).toString());
            try {
                entity.setAltServiceNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setAltServiceNo(null);
            }
            entity.setAltClientServiceId(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<DiscountRuleReturnElement> buildDiscountRuleReturnElement(JSONArray jsonArray) {
        ArrayList<DiscountRuleReturnElement> returnElement = new ArrayList<DiscountRuleReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            DiscountRuleReturnElement entity = new DiscountRuleReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setRuleNo(getLongValue(jsonObject,"rule_no"));
            entity.setRuleName(getStringValue(jsonObject,"rule_name"));
            entity.setRuleId(getStringValue(jsonObject,"rule_id"));
            entity.setDescription(getStringValue(jsonObject,"description"));
            entity.setExtDescription(getStringValue(jsonObject,"ext_description"));
            entity.setDiscountType(getStringValue(jsonObject,"discount_type"));
            entity.setFlatPercentInd(getLongValue(jsonObject,"flat_percent_ind"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setCurrency(getStringValue(jsonObject,"currency"));
            entity.setApplicableTransScope(getStringValue(jsonObject,"applicable_trans_scope"));
            entity.setDurationTypeInd(getStringValue(jsonObject,"duration_type_ind"));
            entity.setMaxApplicableMonths(getLongValue(jsonObject,"max_applicable_months"));
            entity.setMaxApplicationsPerAcct(getLongValue(jsonObject,"max_applications_per_acct"));
            entity.setInlineOffsetInd(getStringValue(jsonObject,"inline_offset_ind"));
            entity.setServiceCodeToUse(getLongValue(jsonObject,"service_code_to_use"));
            entity.setAltServiceNo2Apply(getLongValue(jsonObject,"alt_service_no_2_apply"));
            entity.setAltServiceId2Apply(getStringValue(jsonObject,"alt_service_id_2_apply"));
            entity.setScopeNo(getLongValue(jsonObject,"scope_no"));
                        ArrayList<PlanNoReturnElement> arrayListPlanNoReturnElement = buildPlanNoReturnElement((JSONArray)jsonObject.get("plan_no"));
            for (PlanNoReturnElement element : arrayListPlanNoReturnElement){
                entity.getPlanNo().add(element);
            }
                        ArrayList<ClientPlanIdReturnElement> arrayListClientPlanIdReturnElement = buildClientPlanIdReturnElement((JSONArray)jsonObject.get("client_plan_id"));
            for (ClientPlanIdReturnElement element : arrayListClientPlanIdReturnElement){
                entity.getClientPlanId().add(element);
            }
                        ArrayList<ServiceNoReturnElement> arrayListServiceNoReturnElement = buildServiceNoReturnElement((JSONArray)jsonObject.get("service_no"));
            for (ServiceNoReturnElement element : arrayListServiceNoReturnElement){
                entity.getServiceNo().add(element);
            }
                        ArrayList<ClientServiceIdReturnElement> arrayListClientServiceIdReturnElement = buildClientServiceIdReturnElement((JSONArray)jsonObject.get("client_service_id"));
            for (ClientServiceIdReturnElement element : arrayListClientServiceIdReturnElement){
                entity.getClientServiceId().add(element);
            }
                        ArrayList<ItemNoReturnElement> arrayListItemNoReturnElement = buildItemNoReturnElement((JSONArray)jsonObject.get("item_no"));
            for (ItemNoReturnElement element : arrayListItemNoReturnElement){
                entity.getItemNo().add(element);
            }
                        ArrayList<ClientItemIdReturnElement> arrayListClientItemIdReturnElement = buildClientItemIdReturnElement((JSONArray)jsonObject.get("client_item_id"));
            for (ClientItemIdReturnElement element : arrayListClientItemIdReturnElement){
                entity.getClientItemId().add(element);
            }
            } else {
            try {
                entity.setRuleNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setRuleNo(null);
            }
            entity.setRuleName(jsonArray.get(i).toString());
            entity.setRuleId(jsonArray.get(i).toString());
            entity.setDescription(jsonArray.get(i).toString());
            entity.setExtDescription(jsonArray.get(i).toString());
            entity.setDiscountType(jsonArray.get(i).toString());
            try {
                entity.setFlatPercentInd(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setFlatPercentInd(null);
            }
            try {
                entity.setAmount(Double.parseDouble(jsonArray.get(i).toString()+".0"));
            } catch (NumberFormatException e) {
                entity.setAmount(null);
            }
            entity.setCurrency(jsonArray.get(i).toString());
            entity.setApplicableTransScope(jsonArray.get(i).toString());
            entity.setDurationTypeInd(jsonArray.get(i).toString());
            try {
                entity.setMaxApplicableMonths(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setMaxApplicableMonths(null);
            }
            try {
                entity.setMaxApplicationsPerAcct(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setMaxApplicationsPerAcct(null);
            }
            entity.setInlineOffsetInd(jsonArray.get(i).toString());
            try {
                entity.setServiceCodeToUse(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setServiceCodeToUse(null);
            }
            try {
                entity.setAltServiceNo2Apply(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setAltServiceNo2Apply(null);
            }
            entity.setAltServiceId2Apply(jsonArray.get(i).toString());
            try {
                entity.setScopeNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setScopeNo(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<DiscountBundleReturnElement> buildDiscountBundleReturnElement(JSONArray jsonArray) {
        ArrayList<DiscountBundleReturnElement> returnElement = new ArrayList<DiscountBundleReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            DiscountBundleReturnElement entity = new DiscountBundleReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setBundleNo(getLongValue(jsonObject,"bundle_no"));
            entity.setBundleName(getStringValue(jsonObject,"bundle_name"));
            entity.setBundleId(getStringValue(jsonObject,"bundle_id"));
            entity.setDescription(getStringValue(jsonObject,"description"));
                        ArrayList<RulesReturnElement> arrayListRulesReturnElement = buildRulesReturnElement((JSONArray)jsonObject.get("rules"));
            for (RulesReturnElement element : arrayListRulesReturnElement){
                entity.getRules().add(element);
            }
                        ArrayList<RuleIdsReturnElement> arrayListRuleIdsReturnElement = buildRuleIdsReturnElement((JSONArray)jsonObject.get("rule_ids"));
            for (RuleIdsReturnElement element : arrayListRuleIdsReturnElement){
                entity.getRuleIds().add(element);
            }
            entity.setAllowOverlapInd(getStringValue(jsonObject,"allow_overlap_ind"));
            } else {
            try {
                entity.setBundleNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setBundleNo(null);
            }
            entity.setBundleName(jsonArray.get(i).toString());
            entity.setBundleId(jsonArray.get(i).toString());
            entity.setDescription(jsonArray.get(i).toString());
            entity.setAllowOverlapInd(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<CreditTemplatesReturnElement> buildCreditTemplatesReturnElement(JSONArray jsonArray) {
        ArrayList<CreditTemplatesReturnElement> returnElement = new ArrayList<CreditTemplatesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            CreditTemplatesReturnElement entity = new CreditTemplatesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setRecurringCreditTemplateNo(getLongValue(jsonObject,"recurring_credit_template_no"));
            entity.setCreditTemplateName(getStringValue(jsonObject,"credit_template_name"));
            entity.setClientCreditTemplateId(getStringValue(jsonObject,"client_credit_template_id"));
            } else {
            try {
                entity.setRecurringCreditTemplateNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setRecurringCreditTemplateNo(null);
            }
            entity.setCreditTemplateName(jsonArray.get(i).toString());
            entity.setClientCreditTemplateId(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<DiscountBundlesReturnElement> buildDiscountBundlesReturnElement(JSONArray jsonArray) {
        ArrayList<DiscountBundlesReturnElement> returnElement = new ArrayList<DiscountBundlesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            DiscountBundlesReturnElement entity = new DiscountBundlesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setBundleNo(getLongValue(jsonObject,"bundle_no"));
            entity.setBundleName(getStringValue(jsonObject,"bundle_name"));
            entity.setBundleId(getStringValue(jsonObject,"bundle_id"));
            entity.setDescription(getStringValue(jsonObject,"description"));
            entity.setAllowOverlapInd(getStringValue(jsonObject,"allow_overlap_ind"));
                        ArrayList<RulesReturnElement> arrayListRulesReturnElement = buildRulesReturnElement((JSONArray)jsonObject.get("rules"));
            for (RulesReturnElement element : arrayListRulesReturnElement){
                entity.getRules().add(element);
            }
                        ArrayList<RuleIdsReturnElement> arrayListRuleIdsReturnElement = buildRuleIdsReturnElement((JSONArray)jsonObject.get("rule_ids"));
            for (RuleIdsReturnElement element : arrayListRuleIdsReturnElement){
                entity.getRuleIds().add(element);
            }
            } else {
            try {
                entity.setBundleNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setBundleNo(null);
            }
            entity.setBundleName(jsonArray.get(i).toString());
            entity.setBundleId(jsonArray.get(i).toString());
            entity.setDescription(jsonArray.get(i).toString());
            entity.setAllowOverlapInd(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<DiscountRulesReturnElement> buildDiscountRulesReturnElement(JSONArray jsonArray) {
        ArrayList<DiscountRulesReturnElement> returnElement = new ArrayList<DiscountRulesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            DiscountRulesReturnElement entity = new DiscountRulesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setRuleNo(getLongValue(jsonObject,"rule_no"));
            entity.setRuleName(getStringValue(jsonObject,"rule_name"));
            entity.setRuleId(getStringValue(jsonObject,"rule_id"));
            entity.setDescription(getStringValue(jsonObject,"description"));
            entity.setExtDescription(getStringValue(jsonObject,"ext_description"));
            entity.setDiscountType(getStringValue(jsonObject,"discount_type"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setCurrency(getStringValue(jsonObject,"currency"));
            entity.setApplicableTransScope(getStringValue(jsonObject,"applicable_trans_scope"));
            entity.setDurationTypeInd(getStringValue(jsonObject,"duration_type_ind"));
            entity.setMaxApplicableMonths(getLongValue(jsonObject,"max_applicable_months"));
            entity.setMaxApplicationsPerAcct(getLongValue(jsonObject,"max_applications_per_acct"));
            entity.setInlineOffsetInd(getStringValue(jsonObject,"inline_offset_ind"));
            entity.setServiceCodeToUse(getLongValue(jsonObject,"service_code_to_use"));
            entity.setAltServiceNo2Apply(getLongValue(jsonObject,"alt_service_no_2_apply"));
            entity.setAltServiceId2Apply(getStringValue(jsonObject,"alt_service_id_2_apply"));
            entity.setScopeNo(getLongValue(jsonObject,"scope_no"));
            entity.setDiscountBehaviorTypeInd(getStringValue(jsonObject,"discount_behavior_type_ind"));
                        ArrayList<PlanNoReturnElement> arrayListPlanNoReturnElement = buildPlanNoReturnElement((JSONArray)jsonObject.get("plan_no"));
            for (PlanNoReturnElement element : arrayListPlanNoReturnElement){
                entity.getPlanNo().add(element);
            }
                        ArrayList<ClientPlanIdReturnElement> arrayListClientPlanIdReturnElement = buildClientPlanIdReturnElement((JSONArray)jsonObject.get("client_plan_id"));
            for (ClientPlanIdReturnElement element : arrayListClientPlanIdReturnElement){
                entity.getClientPlanId().add(element);
            }
                        ArrayList<ServiceNoReturnElement> arrayListServiceNoReturnElement = buildServiceNoReturnElement((JSONArray)jsonObject.get("service_no"));
            for (ServiceNoReturnElement element : arrayListServiceNoReturnElement){
                entity.getServiceNo().add(element);
            }
                        ArrayList<ClientServiceIdReturnElement> arrayListClientServiceIdReturnElement = buildClientServiceIdReturnElement((JSONArray)jsonObject.get("client_service_id"));
            for (ClientServiceIdReturnElement element : arrayListClientServiceIdReturnElement){
                entity.getClientServiceId().add(element);
            }
                        ArrayList<ItemNoReturnElement> arrayListItemNoReturnElement = buildItemNoReturnElement((JSONArray)jsonObject.get("item_no"));
            for (ItemNoReturnElement element : arrayListItemNoReturnElement){
                entity.getItemNo().add(element);
            }
                        ArrayList<ClientItemIdReturnElement> arrayListClientItemIdReturnElement = buildClientItemIdReturnElement((JSONArray)jsonObject.get("client_item_id"));
            for (ClientItemIdReturnElement element : arrayListClientItemIdReturnElement){
                entity.getClientItemId().add(element);
            }
            entity.setUseAllOrNthSubsRule(getStringValue(jsonObject,"use_all_or_nth_subs_rule"));
            } else {
            try {
                entity.setRuleNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setRuleNo(null);
            }
            entity.setRuleName(jsonArray.get(i).toString());
            entity.setRuleId(jsonArray.get(i).toString());
            entity.setDescription(jsonArray.get(i).toString());
            entity.setExtDescription(jsonArray.get(i).toString());
            entity.setDiscountType(jsonArray.get(i).toString());
            try {
                entity.setAmount(Double.parseDouble(jsonArray.get(i).toString()+".0"));
            } catch (NumberFormatException e) {
                entity.setAmount(null);
            }
            entity.setCurrency(jsonArray.get(i).toString());
            entity.setApplicableTransScope(jsonArray.get(i).toString());
            entity.setDurationTypeInd(jsonArray.get(i).toString());
            try {
                entity.setMaxApplicableMonths(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setMaxApplicableMonths(null);
            }
            try {
                entity.setMaxApplicationsPerAcct(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setMaxApplicationsPerAcct(null);
            }
            entity.setInlineOffsetInd(jsonArray.get(i).toString());
            try {
                entity.setServiceCodeToUse(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setServiceCodeToUse(null);
            }
            try {
                entity.setAltServiceNo2Apply(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setAltServiceNo2Apply(null);
            }
            entity.setAltServiceId2Apply(jsonArray.get(i).toString());
            try {
                entity.setScopeNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setScopeNo(null);
            }
            entity.setDiscountBehaviorTypeInd(jsonArray.get(i).toString());
            entity.setUseAllOrNthSubsRule(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<PlansReturnElement> buildPlansReturnElement(JSONArray jsonArray) {
        ArrayList<PlansReturnElement> returnElement = new ArrayList<PlansReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PlansReturnElement entity = new PlansReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPlanDesc(getStringValue(jsonObject,"plan_desc"));
            } else {
            entity.setPlanDesc(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<RateSchedReturnElement> buildRateSchedReturnElement(JSONArray jsonArray) {
        ArrayList<RateSchedReturnElement> returnElement = new ArrayList<RateSchedReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            RateSchedReturnElement entity = new RateSchedReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setScheduleNo(getLongValue(jsonObject,"schedule_no"));
            entity.setClientRateScheduleId(getStringValue(jsonObject,"client_rate_schedule_id"));
            entity.setScheduleName(getStringValue(jsonObject,"schedule_name"));
            entity.setScheduleCurrency(getStringValue(jsonObject,"schedule_currency"));
            entity.setRecurringBillingInterval(getLongValue(jsonObject,"recurring_billing_interval"));
            entity.setUsageBillingInterval(getLongValue(jsonObject,"usage_billing_interval"));
            entity.setDefaultInd(getLongValue(jsonObject,"default_ind"));
            entity.setDefaultIndCurr(getLongValue(jsonObject,"default_ind_curr"));
            } else {
            try {
                entity.setScheduleNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setScheduleNo(null);
            }
            entity.setClientRateScheduleId(jsonArray.get(i).toString());
            entity.setScheduleName(jsonArray.get(i).toString());
            entity.setScheduleCurrency(jsonArray.get(i).toString());
            try {
                entity.setRecurringBillingInterval(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setRecurringBillingInterval(null);
            }
            try {
                entity.setUsageBillingInterval(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setUsageBillingInterval(null);
            }
            try {
                entity.setDefaultInd(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setDefaultInd(null);
            }
            try {
                entity.setDefaultIndCurr(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setDefaultIndCurr(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<SurchargeNoReturnElement> buildSurchargeNoReturnElement(JSONArray jsonArray) {
        ArrayList<SurchargeNoReturnElement> returnElement = new ArrayList<SurchargeNoReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            SurchargeNoReturnElement entity = new SurchargeNoReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setSurchargeNos(getLongValue(jsonObject,"surcharge_nos"));
            } else {
            try {
                entity.setSurchargeNos(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setSurchargeNos(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ClientSurchargeIdReturnElement> buildClientSurchargeIdReturnElement(JSONArray jsonArray) {
        ArrayList<ClientSurchargeIdReturnElement> returnElement = new ArrayList<ClientSurchargeIdReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ClientSurchargeIdReturnElement entity = new ClientSurchargeIdReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setClientSurchargeIds(getStringValue(jsonObject,"client_surcharge_ids"));
            } else {
            entity.setClientSurchargeIds(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<PlanGroupsReturnElement> buildPlanGroupsReturnElement(JSONArray jsonArray) {
        ArrayList<PlanGroupsReturnElement> returnElement = new ArrayList<PlanGroupsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PlanGroupsReturnElement entity = new PlanGroupsReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setGroupNo(getLongValue(jsonObject,"group_no"));
            entity.setGroupName(getStringValue(jsonObject,"group_name"));
            } else {
            try {
                entity.setGroupNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setGroupNo(null);
            }
            entity.setGroupName(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<PlanGroupIdsReturnElement> buildPlanGroupIdsReturnElement(JSONArray jsonArray) {
        ArrayList<PlanGroupIdsReturnElement> returnElement = new ArrayList<PlanGroupIdsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PlanGroupIdsReturnElement entity = new PlanGroupIdsReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPlanGroupId(getStringValue(jsonObject,"plan_group_id"));
            } else {
            entity.setPlanGroupId(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<SurchargesReturnElement> buildSurchargesReturnElement(JSONArray jsonArray) {
        ArrayList<SurchargesReturnElement> returnElement = new ArrayList<SurchargesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            SurchargesReturnElement entity = new SurchargesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setSurchargeNo(getLongValue(jsonObject,"surcharge_no"));
            entity.setClientSurchargeId(getStringValue(jsonObject,"client_surcharge_id"));
            entity.setSurchargeName(getStringValue(jsonObject,"surcharge_name"));
            entity.setSurchargeTypeCd(getStringValue(jsonObject,"surcharge_type_cd"));
            entity.setCurrencyCd(getStringValue(jsonObject,"currency_cd"));
            entity.setScopeLabel(getStringValue(jsonObject,"scope_label"));
            entity.setDeleteable(getStringValue(jsonObject,"deleteable"));
            entity.setSurchargeScope(getLongValue(jsonObject,"surcharge_scope"));
            } else {
            try {
                entity.setSurchargeNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setSurchargeNo(null);
            }
            entity.setClientSurchargeId(jsonArray.get(i).toString());
            entity.setSurchargeName(jsonArray.get(i).toString());
            entity.setSurchargeTypeCd(jsonArray.get(i).toString());
            entity.setCurrencyCd(jsonArray.get(i).toString());
            entity.setScopeLabel(jsonArray.get(i).toString());
            entity.setDeleteable(jsonArray.get(i).toString());
            try {
                entity.setSurchargeScope(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setSurchargeScope(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ContractRolloverRateSchedReturnElement> buildContractRolloverRateSchedReturnElement(JSONArray jsonArray) {
        ArrayList<ContractRolloverRateSchedReturnElement> returnElement = new ArrayList<ContractRolloverRateSchedReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ContractRolloverRateSchedReturnElement entity = new ContractRolloverRateSchedReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setCurrentRateSchedNo(getLongValue(jsonObject,"current_rate_sched_no"));
            entity.setCurrentClientRateSchedId(getStringValue(jsonObject,"current_client_rate_sched_id"));
            entity.setRolloverRateSchedNo(getLongValue(jsonObject,"rollover_rate_sched_no"));
            entity.setRolloverClientRateSchedId(getStringValue(jsonObject,"rollover_client_rate_sched_id"));
            } else {
            try {
                entity.setCurrentRateSchedNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setCurrentRateSchedNo(null);
            }
            entity.setCurrentClientRateSchedId(jsonArray.get(i).toString());
            try {
                entity.setRolloverRateSchedNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setRolloverRateSchedNo(null);
            }
            entity.setRolloverClientRateSchedId(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<PromotionsReturnElement> buildPromotionsReturnElement(JSONArray jsonArray) {
        ArrayList<PromotionsReturnElement> returnElement = new ArrayList<PromotionsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PromotionsReturnElement entity = new PromotionsReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPromoCd(getStringValue(jsonObject,"promo_cd"));
            entity.setPromoDesc(getStringValue(jsonObject,"promo_desc"));
            entity.setExpiresAfter(getStringValue(jsonObject,"expires_after"));
            } else {
            entity.setPromoCd(jsonArray.get(i).toString());
            entity.setPromoDesc(jsonArray.get(i).toString());
            entity.setExpiresAfter(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<UsageTypesReturnElement> buildUsageTypesReturnElement(JSONArray jsonArray) {
        ArrayList<UsageTypesReturnElement> returnElement = new ArrayList<UsageTypesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            UsageTypesReturnElement entity = new UsageTypesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setUsageTypeNo(getLongValue(jsonObject,"usage_type_no"));
            entity.setUsageTypeDesc(getStringValue(jsonObject,"usage_type_desc"));
            entity.setUsageUnitType(getStringValue(jsonObject,"usage_unit_type"));
            entity.setUsageTypeName(getStringValue(jsonObject,"usage_type_name"));
            entity.setIsEditable(getLongValue(jsonObject,"is_editable"));
            } else {
            try {
                entity.setUsageTypeNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setUsageTypeNo(null);
            }
            entity.setUsageTypeDesc(jsonArray.get(i).toString());
            entity.setUsageUnitType(jsonArray.get(i).toString());
            entity.setUsageTypeName(jsonArray.get(i).toString());
            try {
                entity.setIsEditable(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setIsEditable(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<UsageUnitTypesReturnElement> buildUsageUnitTypesReturnElement(JSONArray jsonArray) {
        ArrayList<UsageUnitTypesReturnElement> returnElement = new ArrayList<UsageUnitTypesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            UsageUnitTypesReturnElement entity = new UsageUnitTypesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setUsageUnitTypeNo(getLongValue(jsonObject,"usage_unit_type_no"));
            entity.setUsageUnitTypeDesc(getStringValue(jsonObject,"usage_unit_type_desc"));
            } else {
            try {
                entity.setUsageUnitTypeNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setUsageUnitTypeNo(null);
            }
            entity.setUsageUnitTypeDesc(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<AllowedValuesReturnElement> buildAllowedValuesReturnElement(JSONArray jsonArray) {
        ArrayList<AllowedValuesReturnElement> returnElement = new ArrayList<AllowedValuesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AllowedValuesReturnElement entity = new AllowedValuesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setValue(getStringValue(jsonObject,"value"));
            } else {
            entity.setValue(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<AssociatedObjectsReturnElement> buildAssociatedObjectsReturnElement(JSONArray jsonArray) {
        ArrayList<AssociatedObjectsReturnElement> returnElement = new ArrayList<AssociatedObjectsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AssociatedObjectsReturnElement entity = new AssociatedObjectsReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setAssociatedObject(getStringValue(jsonObject,"associated_object"));
            } else {
            entity.setAssociatedObject(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<FieldCategoriesReturnElement> buildFieldCategoriesReturnElement(JSONArray jsonArray) {
        ArrayList<FieldCategoriesReturnElement> returnElement = new ArrayList<FieldCategoriesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            FieldCategoriesReturnElement entity = new FieldCategoriesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setFieldCategoryNo(getLongValue(jsonObject,"field_category_no"));
            entity.setFieldCategoryName(getStringValue(jsonObject,"field_category_name"));
            } else {
            try {
                entity.setFieldCategoryNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setFieldCategoryNo(null);
            }
            entity.setFieldCategoryName(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ObjectValuesReturnElement> buildObjectValuesReturnElement(JSONArray jsonArray) {
        ArrayList<ObjectValuesReturnElement> returnElement = new ArrayList<ObjectValuesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ObjectValuesReturnElement entity = new ObjectValuesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setObjectType(getStringValue(jsonObject,"object_type"));
            entity.setObjectId(getLongValue(jsonObject,"object_id"));
            entity.setValueText(getStringValue(jsonObject,"value_text"));
            entity.setPrimacy(getLongValue(jsonObject,"primacy"));
            } else {
            entity.setObjectType(jsonArray.get(i).toString());
            try {
                entity.setObjectId(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setObjectId(null);
            }
            entity.setValueText(jsonArray.get(i).toString());
            try {
                entity.setPrimacy(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setPrimacy(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<FieldDetailsReturnElement> buildFieldDetailsReturnElement(JSONArray jsonArray) {
        ArrayList<FieldDetailsReturnElement> returnElement = new ArrayList<FieldDetailsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            FieldDetailsReturnElement entity = new FieldDetailsReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setFieldNo(getLongValue(jsonObject,"field_no"));
            entity.setFieldName(getStringValue(jsonObject,"field_name"));
            entity.setDescription(getLongValue(jsonObject,"description"));
            entity.setDatatype(getLongValue(jsonObject,"datatype"));
            entity.setMinNoSel(getLongValue(jsonObject,"min_no_sel"));
            entity.setMaxNoSel(getLongValue(jsonObject,"max_no_sel"));
            entity.setFormInputType(getStringValue(jsonObject,"form_input_type"));
                        ArrayList<AllowedValuesReturnElement> arrayListAllowedValuesReturnElement = buildAllowedValuesReturnElement((JSONArray)jsonObject.get("allowed_values"));
            for (AllowedValuesReturnElement element : arrayListAllowedValuesReturnElement){
                entity.getAllowedValues().add(element);
            }
            entity.setAssociatedTypes(getStringValue(jsonObject,"associated_types"));
                        ArrayList<FieldCategoriesReturnElement> arrayListFieldCategoriesReturnElement = buildFieldCategoriesReturnElement((JSONArray)jsonObject.get("field_categories"));
            for (FieldCategoriesReturnElement element : arrayListFieldCategoriesReturnElement){
                entity.getFieldCategories().add(element);
            }
                        ArrayList<ObjectValuesReturnElement> arrayListObjectValuesReturnElement = buildObjectValuesReturnElement((JSONArray)jsonObject.get("object_values"));
            for (ObjectValuesReturnElement element : arrayListObjectValuesReturnElement){
                entity.getObjectValues().add(element);
            }
            entity.setAllowInstanceOverride(getLongValue(jsonObject,"allow_instance_override"));
            } else {
            try {
                entity.setFieldNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setFieldNo(null);
            }
            entity.setFieldName(jsonArray.get(i).toString());
            try {
                entity.setDescription(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setDescription(null);
            }
            try {
                entity.setDatatype(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setDatatype(null);
            }
            try {
                entity.setMinNoSel(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setMinNoSel(null);
            }
            try {
                entity.setMaxNoSel(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setMaxNoSel(null);
            }
            entity.setFormInputType(jsonArray.get(i).toString());
            entity.setAssociatedTypes(jsonArray.get(i).toString());
            try {
                entity.setAllowInstanceOverride(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setAllowInstanceOverride(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<CoaListReturnElement> buildCoaListReturnElement(JSONArray jsonArray) {
        ArrayList<CoaListReturnElement> returnElement = new ArrayList<CoaListReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            CoaListReturnElement entity = new CoaListReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setCoaId(getLongValue(jsonObject,"coa_id"));
            entity.setCoaCode(getStringValue(jsonObject,"coa_code"));
            entity.setCoaDescription(getStringValue(jsonObject,"coa_description"));
            } else {
            try {
                entity.setCoaId(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setCoaId(null);
            }
            entity.setCoaCode(jsonArray.get(i).toString());
            entity.setCoaDescription(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<CoaReturnElement> buildCoaReturnElement(JSONArray jsonArray) {
        ArrayList<CoaReturnElement> returnElement = new ArrayList<CoaReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            CoaReturnElement entity = new CoaReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setCoaId(getLongValue(jsonObject,"coa_id"));
            entity.setCoaCode(getStringValue(jsonObject,"coa_code"));
            entity.setCoaDescription(getStringValue(jsonObject,"coa_description"));
            } else {
            try {
                entity.setCoaId(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setCoaId(null);
            }
            entity.setCoaCode(jsonArray.get(i).toString());
            entity.setCoaDescription(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<SurchargeTierReturnElement> buildSurchargeTierReturnElement(JSONArray jsonArray) {
        ArrayList<SurchargeTierReturnElement> returnElement = new ArrayList<SurchargeTierReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            SurchargeTierReturnElement entity = new SurchargeTierReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setFrom(getLongValue(jsonObject,"from"));
            entity.setTo(getLongValue(jsonObject,"to"));
            entity.setRate(getDoubleValue(jsonObject,"rate"));
            entity.setDescription(getStringValue(jsonObject,"description"));
            } else {
            try {
                entity.setFrom(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setFrom(null);
            }
            try {
                entity.setTo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setTo(null);
            }
            try {
                entity.setRate(Double.parseDouble(jsonArray.get(i).toString()+".0"));
            } catch (NumberFormatException e) {
                entity.setRate(null);
            }
            entity.setDescription(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<PlanServiceReturnElement> buildPlanServiceReturnElement(JSONArray jsonArray) {
        ArrayList<PlanServiceReturnElement> returnElement = new ArrayList<PlanServiceReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PlanServiceReturnElement entity = new PlanServiceReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPlanNo(getLongValue(jsonObject,"plan_no"));
            entity.setClientPlanId(getStringValue(jsonObject,"client_plan_id"));
                        ArrayList<ServiceNoReturnElement> arrayListServiceNoReturnElement = buildServiceNoReturnElement((JSONArray)jsonObject.get("service_no"));
            for (ServiceNoReturnElement element : arrayListServiceNoReturnElement){
                entity.getServiceNo().add(element);
            }
                        ArrayList<ClientServiceIdReturnElement> arrayListClientServiceIdReturnElement = buildClientServiceIdReturnElement((JSONArray)jsonObject.get("client_service_id"));
            for (ClientServiceIdReturnElement element : arrayListClientServiceIdReturnElement){
                entity.getClientServiceId().add(element);
            }
            } else {
            try {
                entity.setPlanNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setPlanNo(null);
            }
            entity.setClientPlanId(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ProfilesReturnElement> buildProfilesReturnElement(JSONArray jsonArray) {
        ArrayList<ProfilesReturnElement> returnElement = new ArrayList<ProfilesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ProfilesReturnElement entity = new ProfilesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setProfileId(getLongValue(jsonObject,"profile_id"));
            entity.setClientProfileId(getStringValue(jsonObject,"client_profile_id"));
            entity.setProfileName(getStringValue(jsonObject,"profile_name"));
            entity.setProfileDesc(getStringValue(jsonObject,"profile_desc"));
            } else {
            try {
                entity.setProfileId(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setProfileId(null);
            }
            entity.setClientProfileId(jsonArray.get(i).toString());
            entity.setProfileName(jsonArray.get(i).toString());
            entity.setProfileDesc(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<ProductFieldCategoryReturnElement> buildProductFieldCategoryReturnElement(JSONArray jsonArray) {
        ArrayList<ProductFieldCategoryReturnElement> returnElement = new ArrayList<ProductFieldCategoryReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ProductFieldCategoryReturnElement entity = new ProductFieldCategoryReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setFieldCategoryNo(getLongValue(jsonObject,"field_category_no"));
            entity.setFieldCategoryName(getStringValue(jsonObject,"field_category_name"));
            } else {
            try {
                entity.setFieldCategoryNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setFieldCategoryNo(null);
            }
            entity.setFieldCategoryName(jsonArray.get(i).toString());
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
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setProductFieldNo(getLongValue(jsonObject,"product_field_no"));
            entity.setProductFieldName(getStringValue(jsonObject,"product_field_name"));
            entity.setProductFieldDesc(getLongValue(jsonObject,"product_field_desc"));
            entity.setProductFieldValue(getStringValue(jsonObject,"product_field_value"));
            entity.setAllowInstanceOverride(getLongValue(jsonObject,"allow_instance_override"));
            } else {
            try {
                entity.setProductFieldNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setProductFieldNo(null);
            }
            entity.setProductFieldName(jsonArray.get(i).toString());
            try {
                entity.setProductFieldDesc(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setProductFieldDesc(null);
            }
            entity.setProductFieldValue(jsonArray.get(i).toString());
            try {
                entity.setAllowInstanceOverride(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setAllowInstanceOverride(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<CouponGroupsReturnElement> buildCouponGroupsReturnElement(JSONArray jsonArray) {
        ArrayList<CouponGroupsReturnElement> returnElement = new ArrayList<CouponGroupsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            CouponGroupsReturnElement entity = new CouponGroupsReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setGroupNo(getLongValue(jsonObject,"group_no"));
            entity.setClientDefinedId(getStringValue(jsonObject,"client_defined_id"));
            entity.setGroupName(getStringValue(jsonObject,"group_name"));
            entity.setDescription(getStringValue(jsonObject,"description"));
            entity.setPrecedence(getStringValue(jsonObject,"precedence"));
                        ArrayList<CouponsReturnElement> arrayListCouponsReturnElement = buildCouponsReturnElement((JSONArray)jsonObject.get("coupons"));
            for (CouponsReturnElement element : arrayListCouponsReturnElement){
                entity.getCoupons().add(element);
            }
            } else {
            try {
                entity.setGroupNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setGroupNo(null);
            }
            entity.setClientDefinedId(jsonArray.get(i).toString());
            entity.setGroupName(jsonArray.get(i).toString());
            entity.setDescription(jsonArray.get(i).toString());
            entity.setPrecedence(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<AllPayMethodsReturnElement> buildAllPayMethodsReturnElement(JSONArray jsonArray) {
        ArrayList<AllPayMethodsReturnElement> returnElement = new ArrayList<AllPayMethodsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AllPayMethodsReturnElement entity = new AllPayMethodsReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPayMethodType(getLongValue(jsonObject,"pay_method_type"));
            entity.setPayMethodName(getStringValue(jsonObject,"pay_method_name"));
            entity.setDaysUntilPaymentReminder01(getLongValue(jsonObject,"days_until_payment_reminder_01"));
            entity.setDaysUntilPaymentReminder02(getLongValue(jsonObject,"days_until_payment_reminder_02"));
            entity.setDaysUntilPaymentReminder03(getLongValue(jsonObject,"days_until_payment_reminder_03"));
            } else {
            try {
                entity.setPayMethodType(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setPayMethodType(null);
            }
            entity.setPayMethodName(jsonArray.get(i).toString());
            try {
                entity.setDaysUntilPaymentReminder01(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setDaysUntilPaymentReminder01(null);
            }
            try {
                entity.setDaysUntilPaymentReminder02(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setDaysUntilPaymentReminder02(null);
            }
            try {
                entity.setDaysUntilPaymentReminder03(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setDaysUntilPaymentReminder03(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<MappedMasterPlansReturnElement> buildMappedMasterPlansReturnElement(JSONArray jsonArray) {
        ArrayList<MappedMasterPlansReturnElement> returnElement = new ArrayList<MappedMasterPlansReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            MappedMasterPlansReturnElement entity = new MappedMasterPlansReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPlanNo(getLongValue(jsonObject,"plan_no"));
            entity.setClientPlanId(getStringValue(jsonObject,"client_plan_id"));
            entity.setPlanName(getStringValue(jsonObject,"plan_name"));
            } else {
            try {
                entity.setPlanNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setPlanNo(null);
            }
            entity.setClientPlanId(jsonArray.get(i).toString());
            entity.setPlanName(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<MappedPayMethodTypesReturnElement> buildMappedPayMethodTypesReturnElement(JSONArray jsonArray) {
        ArrayList<MappedPayMethodTypesReturnElement> returnElement = new ArrayList<MappedPayMethodTypesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            MappedPayMethodTypesReturnElement entity = new MappedPayMethodTypesReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPayMethodTypeCd(getLongValue(jsonObject,"pay_method_type_cd"));
            entity.setPayMethodType(getStringValue(jsonObject,"pay_method_type"));
            } else {
            try {
                entity.setPayMethodTypeCd(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setPayMethodTypeCd(null);
            }
            entity.setPayMethodType(jsonArray.get(i).toString());
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    public static ArrayList<DunningProcessDetailsReturnElement> buildDunningProcessDetailsReturnElement(JSONArray jsonArray) {
        ArrayList<DunningProcessDetailsReturnElement> returnElement = new ArrayList<DunningProcessDetailsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            DunningProcessDetailsReturnElement entity = new DunningProcessDetailsReturnElement();
            JSONObject jsonObject = null;
            if (jsonArray.get(i) instanceof JSONObject){
            jsonObject = (JSONObject)jsonArray.get(i);
            entity.setDunningProcessNo(getLongValue(jsonObject,"dunning_process_no"));
            entity.setClientDunningProcessId(getStringValue(jsonObject,"client_dunning_process_id"));
            entity.setDunningProcessName(getStringValue(jsonObject,"dunning_process_name"));
            entity.setDunningProcessDescription(getStringValue(jsonObject,"dunning_process_description"));
            entity.setClientDefaultInd(getLongValue(jsonObject,"client_default_ind"));
            entity.setTotalStepCount(getLongValue(jsonObject,"total_step_count"));
                        ArrayList<MappedMasterPlansReturnElement> arrayListMappedMasterPlansReturnElement = buildMappedMasterPlansReturnElement((JSONArray)jsonObject.get("mapped_master_plans"));
            for (MappedMasterPlansReturnElement element : arrayListMappedMasterPlansReturnElement){
                entity.getMappedMasterPlans().add(element);
            }
                        ArrayList<MappedPayMethodTypesReturnElement> arrayListMappedPayMethodTypesReturnElement = buildMappedPayMethodTypesReturnElement((JSONArray)jsonObject.get("mapped_pay_method_types"));
            for (MappedPayMethodTypesReturnElement element : arrayListMappedPayMethodTypesReturnElement){
                entity.getMappedPayMethodTypes().add(element);
            }
            } else {
            try {
                entity.setDunningProcessNo(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setDunningProcessNo(null);
            }
            entity.setClientDunningProcessId(jsonArray.get(i).toString());
            entity.setDunningProcessName(jsonArray.get(i).toString());
            entity.setDunningProcessDescription(jsonArray.get(i).toString());
            try {
                entity.setClientDefaultInd(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setClientDefaultInd(null);
            }
            try {
                entity.setTotalStepCount(Long.parseLong(jsonArray.get(i).toString()));
            } catch (NumberFormatException e) {
                entity.setTotalStepCount(null);
            }
            }
            returnElement.add(entity);
        }
        return returnElement;
    }
    /* ****************** END - SPECIFIC METHODS FOR EACH RETURN ELEMENT (build<#name#>) **************************************** */

    /* ****************** ARRAY TO PARAM METHODS FOR EACH ARRAY ELEMENT ********************************************** */
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.FieldValueArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.FieldValueRow row : arrayList.getFieldValueRow()){
            parameters.add("field_value["+i+"]", getValue("String", row.getFieldValue()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.FieldValueArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.FieldValueRow row : arrayList.getFieldValueRow()){
            parameters.add(paramPrefix + "field_value["+i+"]", getValue("String", row.getFieldValue()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PriceArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PriceRow row : arrayList.getPriceRow()){
            parameters.add("amount["+i+"]", getValue("Double", row.getAmount()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PriceArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PriceRow row : arrayList.getPriceRow()){
            parameters.add(paramPrefix + "amount["+i+"]", getValue("Double", row.getAmount()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.TierArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.TierRow row : arrayList.getTierRow()){
            parameters.add("from["+i+"]", getValue("Long", row.getFrom()));
            parameters.add("to["+i+"]", getValue("Long", row.getTo()));
            parameters.add("description["+i+"]", getValue("String", row.getDescription()));
                        addParameterValuesFromArray(parameters, row.getPrice(), "price["+i+"]");
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.TierArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.TierRow row : arrayList.getTierRow()){
            parameters.add(paramPrefix + "from["+i+"]", getValue("Long", row.getFrom()));
            parameters.add(paramPrefix + "to["+i+"]", getValue("Long", row.getTo()));
            parameters.add(paramPrefix + "description["+i+"]", getValue("String", row.getDescription()));
                        addParameterValuesFromArray(parameters, row.getPrice(), paramPrefix + "price["+i+"]");
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ServiceArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ServiceRow row : arrayList.getServiceRow()){
            parameters.add("service_no["+i+"]", getValue("Long", row.getServiceNo()));
            parameters.add("name["+i+"]", getValue("String", row.getName()));
            parameters.add("client_service_id["+i+"]", getValue("String", row.getClientServiceId()));
            parameters.add("service_type["+i+"]", getValue("String", row.getServiceType()));
            parameters.add("gl_cd["+i+"]", getValue("String", row.getGlCd()));
            parameters.add("taxable_ind["+i+"]", getValue("String", row.getTaxableInd()));
            parameters.add("tax_group["+i+"]", getValue("String", row.getTaxGroup()));
            parameters.add("usage_type["+i+"]", getValue("Long", row.getUsageType()));
            parameters.add("commodity_cd["+i+"]", getValue("String", row.getCommodityCd()));
            parameters.add("rate_type["+i+"]", getValue("String", row.getRateType()));
            parameters.add("pricing_rule["+i+"]", getValue("String", row.getPricingRule()));
            parameters.add("high_water["+i+"]", getValue("String", row.getHighWater()));
            parameters.add("billing_option["+i+"]", getValue("Long", row.getBillingOption()));
            parameters.add("threshold["+i+"]", getValue("Long", row.getThreshold()));
            parameters.add("tax_inclusive_ind["+i+"]", getValue("Long", row.getTaxInclusiveInd()));
                        addParameterValuesFromArray(parameters, row.getUsageThreshold(), "usage_threshold["+i+"]");
                        addParameterValuesFromArray(parameters, row.getTier(), "tier["+i+"]");
            parameters.add("fulfillment_based_ind["+i+"]", getValue("Long", row.getFulfillmentBasedInd()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ServiceArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ServiceRow row : arrayList.getServiceRow()){
            parameters.add(paramPrefix + "service_no["+i+"]", getValue("Long", row.getServiceNo()));
            parameters.add(paramPrefix + "name["+i+"]", getValue("String", row.getName()));
            parameters.add(paramPrefix + "client_service_id["+i+"]", getValue("String", row.getClientServiceId()));
            parameters.add(paramPrefix + "service_type["+i+"]", getValue("String", row.getServiceType()));
            parameters.add(paramPrefix + "gl_cd["+i+"]", getValue("String", row.getGlCd()));
            parameters.add(paramPrefix + "taxable_ind["+i+"]", getValue("String", row.getTaxableInd()));
            parameters.add(paramPrefix + "tax_group["+i+"]", getValue("String", row.getTaxGroup()));
            parameters.add(paramPrefix + "usage_type["+i+"]", getValue("Long", row.getUsageType()));
            parameters.add(paramPrefix + "commodity_cd["+i+"]", getValue("String", row.getCommodityCd()));
            parameters.add(paramPrefix + "rate_type["+i+"]", getValue("String", row.getRateType()));
            parameters.add(paramPrefix + "pricing_rule["+i+"]", getValue("String", row.getPricingRule()));
            parameters.add(paramPrefix + "high_water["+i+"]", getValue("String", row.getHighWater()));
            parameters.add(paramPrefix + "billing_option["+i+"]", getValue("Long", row.getBillingOption()));
            parameters.add(paramPrefix + "threshold["+i+"]", getValue("Long", row.getThreshold()));
            parameters.add(paramPrefix + "tax_inclusive_ind["+i+"]", getValue("Long", row.getTaxInclusiveInd()));
                        addParameterValuesFromArray(parameters, row.getUsageThreshold(), paramPrefix + "usage_threshold["+i+"]");
                        addParameterValuesFromArray(parameters, row.getTier(), paramPrefix + "tier["+i+"]");
            parameters.add(paramPrefix + "fulfillment_based_ind["+i+"]", getValue("Long", row.getFulfillmentBasedInd()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ImageArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ImageRow row : arrayList.getImageRow()){
            parameters.add("default_image_url["+i+"]", getValue("String", row.getDefaultImageUrl()));
            parameters.add("thumbnail_image_url["+i+"]", getValue("String", row.getThumbnailImageUrl()));
            parameters.add("image_text["+i+"]", getValue("String", row.getImageText()));
            parameters.add("default_ind["+i+"]", getValue("Long", row.getDefaultInd()));
            parameters.add("active["+i+"]", getValue("Long", row.getActive()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ImageArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ImageRow row : arrayList.getImageRow()){
            parameters.add(paramPrefix + "default_image_url["+i+"]", getValue("String", row.getDefaultImageUrl()));
            parameters.add(paramPrefix + "thumbnail_image_url["+i+"]", getValue("String", row.getThumbnailImageUrl()));
            parameters.add(paramPrefix + "image_text["+i+"]", getValue("String", row.getImageText()));
            parameters.add(paramPrefix + "default_ind["+i+"]", getValue("Long", row.getDefaultInd()));
            parameters.add(paramPrefix + "active["+i+"]", getValue("Long", row.getActive()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ParentClassArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ParentClassRow row : arrayList.getParentClassRow()){
            parameters.add("class_no["+i+"]", getValue("Long", row.getClassNo()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ParentClassArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ParentClassRow row : arrayList.getParentClassRow()){
            parameters.add(paramPrefix + "class_no["+i+"]", getValue("Long", row.getClassNo()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.SupplementalObjFieldArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.SupplementalObjFieldRow row : arrayList.getSupplementalObjFieldRow()){
            parameters.add("field_no["+i+"]", getValue("Long", row.getFieldNo()));
            parameters.add("field_name["+i+"]", getValue("String", row.getFieldName()));
                        addParameterValuesFromArray(parameters, row.getFieldValue(), "field_value["+i+"]");
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.SupplementalObjFieldArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.SupplementalObjFieldRow row : arrayList.getSupplementalObjFieldRow()){
            parameters.add(paramPrefix + "field_no["+i+"]", getValue("Long", row.getFieldNo()));
            parameters.add(paramPrefix + "field_name["+i+"]", getValue("String", row.getFieldName()));
                        addParameterValuesFromArray(parameters, row.getFieldValue(), paramPrefix + "field_value["+i+"]");
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.RulesArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.RulesRow row : arrayList.getRulesRow()){
            parameters.add("rule["+i+"]", getValue("Long", row.getRule()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.RulesArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.RulesRow row : arrayList.getRulesRow()){
            parameters.add(paramPrefix + "rule["+i+"]", getValue("Long", row.getRule()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.RuleIdsArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.RuleIdsRow row : arrayList.getRuleIdsRow()){
            parameters.add("rule_id["+i+"]", getValue("String", row.getRuleId()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.RuleIdsArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.RuleIdsRow row : arrayList.getRuleIdsRow()){
            parameters.add(paramPrefix + "rule_id["+i+"]", getValue("String", row.getRuleId()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PlanNoArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PlanNoRow row : arrayList.getPlanNoRow()){
            parameters.add("plan_nos["+i+"]", getValue("Long", row.getPlanNos()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PlanNoArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PlanNoRow row : arrayList.getPlanNoRow()){
            parameters.add(paramPrefix + "plan_nos["+i+"]", getValue("Long", row.getPlanNos()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ClientPlanIdArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ClientPlanIdRow row : arrayList.getClientPlanIdRow()){
            parameters.add("client_plan_ids["+i+"]", getValue("String", row.getClientPlanIds()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ClientPlanIdArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ClientPlanIdRow row : arrayList.getClientPlanIdRow()){
            parameters.add(paramPrefix + "client_plan_ids["+i+"]", getValue("String", row.getClientPlanIds()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ServiceNoArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ServiceNoRow row : arrayList.getServiceNoRow()){
            parameters.add("service_nos["+i+"]", getValue("Long", row.getServiceNos()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ServiceNoArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ServiceNoRow row : arrayList.getServiceNoRow()){
            parameters.add(paramPrefix + "service_nos["+i+"]", getValue("Long", row.getServiceNos()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ClientServiceIdArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ClientServiceIdRow row : arrayList.getClientServiceIdRow()){
            parameters.add("client_service_ids["+i+"]", getValue("String", row.getClientServiceIds()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ClientServiceIdArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ClientServiceIdRow row : arrayList.getClientServiceIdRow()){
            parameters.add(paramPrefix + "client_service_ids["+i+"]", getValue("String", row.getClientServiceIds()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ItemNoArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ItemNoRow row : arrayList.getItemNoRow()){
            parameters.add("item_nos["+i+"]", getValue("Long", row.getItemNos()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ItemNoArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ItemNoRow row : arrayList.getItemNoRow()){
            parameters.add(paramPrefix + "item_nos["+i+"]", getValue("Long", row.getItemNos()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ClientItemIdArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ClientItemIdRow row : arrayList.getClientItemIdRow()){
            parameters.add("client_item_ids["+i+"]", getValue("String", row.getClientItemIds()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ClientItemIdArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ClientItemIdRow row : arrayList.getClientItemIdRow()){
            parameters.add(paramPrefix + "client_item_ids["+i+"]", getValue("String", row.getClientItemIds()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.EligibleServiceTypesArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.EligibleServiceTypesRow row : arrayList.getEligibleServiceTypesRow()){
            parameters.add("eligible_service_type["+i+"]", getValue("String", row.getEligibleServiceType()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.EligibleServiceTypesArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.EligibleServiceTypesRow row : arrayList.getEligibleServiceTypesRow()){
            parameters.add(paramPrefix + "eligible_service_type["+i+"]", getValue("String", row.getEligibleServiceType()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.TemplateArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.TemplateRow row : arrayList.getTemplateRow()){
            parameters.add("credit_template_name["+i+"]", getValue("String", row.getCreditTemplateName()));
            parameters.add("client_credit_template_id["+i+"]", getValue("String", row.getClientCreditTemplateId()));
            parameters.add("eligible_plan_no["+i+"]", getValue("Long", row.getEligiblePlanNo()));
            parameters.add("eligible_client_plan_id["+i+"]", getValue("String", row.getEligibleClientPlanId()));
            parameters.add("eligible_service_no["+i+"]", getValue("Long", row.getEligibleServiceNo()));
            parameters.add("eligible_client_service_id["+i+"]", getValue("String", row.getEligibleClientServiceId()));
                        addParameterValuesFromArray(parameters, row.getEligibleServiceTypes(), "eligible_service_types["+i+"]");
            parameters.add("discount_type["+i+"]", getValue("Long", row.getDiscountType()));
            parameters.add("discount_amt["+i+"]", getValue("Double", row.getDiscountAmt()));
            parameters.add("no_of_credits["+i+"]", getValue("Long", row.getNoOfCredits()));
            parameters.add("credit_interval_months["+i+"]", getValue("Long", row.getCreditIntervalMonths()));
            parameters.add("percentage_plan_no["+i+"]", getValue("Long", row.getPercentagePlanNo()));
            parameters.add("percentage_client_plan_id["+i+"]", getValue("String", row.getPercentageClientPlanId()));
            parameters.add("percentage_service_no["+i+"]", getValue("Long", row.getPercentageServiceNo()));
            parameters.add("percentage_client_service_id["+i+"]", getValue("String", row.getPercentageClientServiceId()));
            parameters.add("alt_service_no["+i+"]", getValue("Long", row.getAltServiceNo()));
            parameters.add("alt_client_service_id["+i+"]", getValue("String", row.getAltClientServiceId()));
            parameters.add("currency_cd["+i+"]", getValue("String", row.getCurrencyCd()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.TemplateArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.TemplateRow row : arrayList.getTemplateRow()){
            parameters.add(paramPrefix + "credit_template_name["+i+"]", getValue("String", row.getCreditTemplateName()));
            parameters.add(paramPrefix + "client_credit_template_id["+i+"]", getValue("String", row.getClientCreditTemplateId()));
            parameters.add(paramPrefix + "eligible_plan_no["+i+"]", getValue("Long", row.getEligiblePlanNo()));
            parameters.add(paramPrefix + "eligible_client_plan_id["+i+"]", getValue("String", row.getEligibleClientPlanId()));
            parameters.add(paramPrefix + "eligible_service_no["+i+"]", getValue("Long", row.getEligibleServiceNo()));
            parameters.add(paramPrefix + "eligible_client_service_id["+i+"]", getValue("String", row.getEligibleClientServiceId()));
                        addParameterValuesFromArray(parameters, row.getEligibleServiceTypes(), paramPrefix + "eligible_service_types["+i+"]");
            parameters.add(paramPrefix + "discount_type["+i+"]", getValue("Long", row.getDiscountType()));
            parameters.add(paramPrefix + "discount_amt["+i+"]", getValue("Double", row.getDiscountAmt()));
            parameters.add(paramPrefix + "no_of_credits["+i+"]", getValue("Long", row.getNoOfCredits()));
            parameters.add(paramPrefix + "credit_interval_months["+i+"]", getValue("Long", row.getCreditIntervalMonths()));
            parameters.add(paramPrefix + "percentage_plan_no["+i+"]", getValue("Long", row.getPercentagePlanNo()));
            parameters.add(paramPrefix + "percentage_client_plan_id["+i+"]", getValue("String", row.getPercentageClientPlanId()));
            parameters.add(paramPrefix + "percentage_service_no["+i+"]", getValue("Long", row.getPercentageServiceNo()));
            parameters.add(paramPrefix + "percentage_client_service_id["+i+"]", getValue("String", row.getPercentageClientServiceId()));
            parameters.add(paramPrefix + "alt_service_no["+i+"]", getValue("Long", row.getAltServiceNo()));
            parameters.add(paramPrefix + "alt_client_service_id["+i+"]", getValue("String", row.getAltClientServiceId()));
            parameters.add(paramPrefix + "currency_cd["+i+"]", getValue("String", row.getCurrencyCd()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingTemplateArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExistingTemplateRow row : arrayList.getExistingTemplateRow()){
            parameters.add("existing_templates["+i+"]", getValue("Long", row.getExistingTemplates()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingTemplateArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExistingTemplateRow row : arrayList.getExistingTemplateRow()){
            parameters.add(paramPrefix + "existing_templates["+i+"]", getValue("Long", row.getExistingTemplates()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingTemplateIdArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExistingTemplateIdRow row : arrayList.getExistingTemplateIdRow()){
            parameters.add("existing_template_ids["+i+"]", getValue("String", row.getExistingTemplateIds()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingTemplateIdArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExistingTemplateIdRow row : arrayList.getExistingTemplateIdRow()){
            parameters.add(paramPrefix + "existing_template_ids["+i+"]", getValue("String", row.getExistingTemplateIds()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.DiscountRuleArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.DiscountRuleRow row : arrayList.getDiscountRuleRow()){
            parameters.add("label["+i+"]", getValue("String", row.getLabel()));
            parameters.add("rule_id["+i+"]", getValue("String", row.getRuleId()));
            parameters.add("description["+i+"]", getValue("String", row.getDescription()));
            parameters.add("ext_description["+i+"]", getValue("String", row.getExtDescription()));
            parameters.add("flat_percent_ind["+i+"]", getValue("String", row.getFlatPercentInd()));
            parameters.add("amount["+i+"]", getValue("Double", row.getAmount()));
            parameters.add("currency["+i+"]", getValue("String", row.getCurrency()));
            parameters.add("duration_type_ind["+i+"]", getValue("String", row.getDurationTypeInd()));
            parameters.add("max_applicable_months["+i+"]", getValue("Long", row.getMaxApplicableMonths()));
            parameters.add("max_applications_per_acct["+i+"]", getValue("Long", row.getMaxApplicationsPerAcct()));
            parameters.add("inline_offset_ind["+i+"]", getValue("String", row.getInlineOffsetInd()));
            parameters.add("discount_behavior_type_ind["+i+"]", getValue("String", row.getDiscountBehaviorTypeInd()));
            parameters.add("service_code_to_use["+i+"]", getValue("Long", row.getServiceCodeToUse()));
            parameters.add("alt_service_no_2_apply["+i+"]", getValue("Long", row.getAltServiceNo2Apply()));
            parameters.add("alt_service_id_2_apply["+i+"]", getValue("String", row.getAltServiceId2Apply()));
            parameters.add("applicable_trans_scope["+i+"]", getValue("String", row.getApplicableTransScope()));
            parameters.add("scope_no["+i+"]", getValue("Long", row.getScopeNo()));
                        addParameterValuesFromArray(parameters, row.getPlanNo(), "plan_no["+i+"]");
                        addParameterValuesFromArray(parameters, row.getClientPlanId(), "client_plan_id["+i+"]");
                        addParameterValuesFromArray(parameters, row.getServiceNo(), "service_no["+i+"]");
                        addParameterValuesFromArray(parameters, row.getClientServiceId(), "client_service_id["+i+"]");
                        addParameterValuesFromArray(parameters, row.getItemNo(), "item_no["+i+"]");
                        addParameterValuesFromArray(parameters, row.getClientItemId(), "client_item_id["+i+"]");
            parameters.add("use_all_or_nth_subs_rule["+i+"]", getValue("String", row.getUseAllOrNthSubsRule()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.DiscountRuleArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.DiscountRuleRow row : arrayList.getDiscountRuleRow()){
            parameters.add(paramPrefix + "label["+i+"]", getValue("String", row.getLabel()));
            parameters.add(paramPrefix + "rule_id["+i+"]", getValue("String", row.getRuleId()));
            parameters.add(paramPrefix + "description["+i+"]", getValue("String", row.getDescription()));
            parameters.add(paramPrefix + "ext_description["+i+"]", getValue("String", row.getExtDescription()));
            parameters.add(paramPrefix + "flat_percent_ind["+i+"]", getValue("String", row.getFlatPercentInd()));
            parameters.add(paramPrefix + "amount["+i+"]", getValue("Double", row.getAmount()));
            parameters.add(paramPrefix + "currency["+i+"]", getValue("String", row.getCurrency()));
            parameters.add(paramPrefix + "duration_type_ind["+i+"]", getValue("String", row.getDurationTypeInd()));
            parameters.add(paramPrefix + "max_applicable_months["+i+"]", getValue("Long", row.getMaxApplicableMonths()));
            parameters.add(paramPrefix + "max_applications_per_acct["+i+"]", getValue("Long", row.getMaxApplicationsPerAcct()));
            parameters.add(paramPrefix + "inline_offset_ind["+i+"]", getValue("String", row.getInlineOffsetInd()));
            parameters.add(paramPrefix + "discount_behavior_type_ind["+i+"]", getValue("String", row.getDiscountBehaviorTypeInd()));
            parameters.add(paramPrefix + "service_code_to_use["+i+"]", getValue("Long", row.getServiceCodeToUse()));
            parameters.add(paramPrefix + "alt_service_no_2_apply["+i+"]", getValue("Long", row.getAltServiceNo2Apply()));
            parameters.add(paramPrefix + "alt_service_id_2_apply["+i+"]", getValue("String", row.getAltServiceId2Apply()));
            parameters.add(paramPrefix + "applicable_trans_scope["+i+"]", getValue("String", row.getApplicableTransScope()));
            parameters.add(paramPrefix + "scope_no["+i+"]", getValue("Long", row.getScopeNo()));
                        addParameterValuesFromArray(parameters, row.getPlanNo(), paramPrefix + "plan_no["+i+"]");
                        addParameterValuesFromArray(parameters, row.getClientPlanId(), paramPrefix + "client_plan_id["+i+"]");
                        addParameterValuesFromArray(parameters, row.getServiceNo(), paramPrefix + "service_no["+i+"]");
                        addParameterValuesFromArray(parameters, row.getClientServiceId(), paramPrefix + "client_service_id["+i+"]");
                        addParameterValuesFromArray(parameters, row.getItemNo(), paramPrefix + "item_no["+i+"]");
                        addParameterValuesFromArray(parameters, row.getClientItemId(), paramPrefix + "client_item_id["+i+"]");
            parameters.add(paramPrefix + "use_all_or_nth_subs_rule["+i+"]", getValue("String", row.getUseAllOrNthSubsRule()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingDiscountRuleArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExistingDiscountRuleRow row : arrayList.getExistingDiscountRuleRow()){
            parameters.add("existing_rules["+i+"]", getValue("Long", row.getExistingRules()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingDiscountRuleArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExistingDiscountRuleRow row : arrayList.getExistingDiscountRuleRow()){
            parameters.add(paramPrefix + "existing_rules["+i+"]", getValue("Long", row.getExistingRules()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingDiscountRuleIdArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExistingDiscountRuleIdRow row : arrayList.getExistingDiscountRuleIdRow()){
            parameters.add("existing_discount_rule_ids["+i+"]", getValue("String", row.getExistingDiscountRuleIds()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingDiscountRuleIdArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExistingDiscountRuleIdRow row : arrayList.getExistingDiscountRuleIdRow()){
            parameters.add(paramPrefix + "existing_discount_rule_ids["+i+"]", getValue("String", row.getExistingDiscountRuleIds()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.DiscountBundleArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.DiscountBundleRow row : arrayList.getDiscountBundleRow()){
            parameters.add("bundle_name["+i+"]", getValue("String", row.getBundleName()));
            parameters.add("bundle_id["+i+"]", getValue("String", row.getBundleId()));
            parameters.add("bundle_description["+i+"]", getValue("String", row.getBundleDescription()));
            parameters.add("allow_overlap_ind["+i+"]", getValue("String", row.getAllowOverlapInd()));
                        addParameterValuesFromArray(parameters, row.getRules(), "rules["+i+"]");
                        addParameterValuesFromArray(parameters, row.getRuleIds(), "rule_ids["+i+"]");
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.DiscountBundleArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.DiscountBundleRow row : arrayList.getDiscountBundleRow()){
            parameters.add(paramPrefix + "bundle_name["+i+"]", getValue("String", row.getBundleName()));
            parameters.add(paramPrefix + "bundle_id["+i+"]", getValue("String", row.getBundleId()));
            parameters.add(paramPrefix + "bundle_description["+i+"]", getValue("String", row.getBundleDescription()));
            parameters.add(paramPrefix + "allow_overlap_ind["+i+"]", getValue("String", row.getAllowOverlapInd()));
                        addParameterValuesFromArray(parameters, row.getRules(), paramPrefix + "rules["+i+"]");
                        addParameterValuesFromArray(parameters, row.getRuleIds(), paramPrefix + "rule_ids["+i+"]");
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingDiscountBundleArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExistingDiscountBundleRow row : arrayList.getExistingDiscountBundleRow()){
            parameters.add("existing_bundles["+i+"]", getValue("Long", row.getExistingBundles()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingDiscountBundleArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExistingDiscountBundleRow row : arrayList.getExistingDiscountBundleRow()){
            parameters.add(paramPrefix + "existing_bundles["+i+"]", getValue("Long", row.getExistingBundles()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingDiscountBundleIdArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExistingDiscountBundleIdRow row : arrayList.getExistingDiscountBundleIdRow()){
            parameters.add("existing_bundle_ids["+i+"]", getValue("String", row.getExistingBundleIds()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingDiscountBundleIdArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExistingDiscountBundleIdRow row : arrayList.getExistingDiscountBundleIdRow()){
            parameters.add(paramPrefix + "existing_bundle_ids["+i+"]", getValue("String", row.getExistingBundleIds()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.CouponNosArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.CouponNosRow row : arrayList.getCouponNosRow()){
            parameters.add("coupon_no["+i+"]", getValue("Long", row.getCouponNo()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.CouponNosArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.CouponNosRow row : arrayList.getCouponNosRow()){
            parameters.add(paramPrefix + "coupon_no["+i+"]", getValue("Long", row.getCouponNo()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.CouponArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.CouponRow row : arrayList.getCouponRow()){
            parameters.add("coupon_cd["+i+"]", getValue("String", row.getCouponCd()));
            parameters.add("coupon_desc["+i+"]", getValue("String", row.getCouponDesc()));
            parameters.add("coupon_msg["+i+"]", getValue("String", row.getCouponMsg()));
            parameters.add("status_ind["+i+"]", getValue("Long", row.getStatusInd()));
            parameters.add("no_of_uses["+i+"]", getValue("Long", row.getNoOfUses()));
            parameters.add("start_date["+i+"]", getValue("String", row.getStartDate()));
            parameters.add("end_date["+i+"]", getValue("String", row.getEndDate()));
            parameters.add("coupon_scope["+i+"]", getValue("Long", row.getCouponScope()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.CouponArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.CouponRow row : arrayList.getCouponRow()){
            parameters.add(paramPrefix + "coupon_cd["+i+"]", getValue("String", row.getCouponCd()));
            parameters.add(paramPrefix + "coupon_desc["+i+"]", getValue("String", row.getCouponDesc()));
            parameters.add(paramPrefix + "coupon_msg["+i+"]", getValue("String", row.getCouponMsg()));
            parameters.add(paramPrefix + "status_ind["+i+"]", getValue("Long", row.getStatusInd()));
            parameters.add(paramPrefix + "no_of_uses["+i+"]", getValue("Long", row.getNoOfUses()));
            parameters.add(paramPrefix + "start_date["+i+"]", getValue("String", row.getStartDate()));
            parameters.add(paramPrefix + "end_date["+i+"]", getValue("String", row.getEndDate()));
            parameters.add(paramPrefix + "coupon_scope["+i+"]", getValue("Long", row.getCouponScope()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingCouponArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExistingCouponRow row : arrayList.getExistingCouponRow()){
            parameters.add("existing_coupons["+i+"]", getValue("Long", row.getExistingCoupons()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingCouponArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExistingCouponRow row : arrayList.getExistingCouponRow()){
            parameters.add(paramPrefix + "existing_coupons["+i+"]", getValue("Long", row.getExistingCoupons()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.TemplateNosArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.TemplateNosRow row : arrayList.getTemplateNosRow()){
            parameters.add("template_nos["+i+"]", getValue("Long", row.getTemplateNos()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.TemplateNosArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.TemplateNosRow row : arrayList.getTemplateNosRow()){
            parameters.add(paramPrefix + "template_nos["+i+"]", getValue("Long", row.getTemplateNos()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.RuleNosArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.RuleNosRow row : arrayList.getRuleNosRow()){
            parameters.add("rule_nos["+i+"]", getValue("Long", row.getRuleNos()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.RuleNosArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.RuleNosRow row : arrayList.getRuleNosRow()){
            parameters.add(paramPrefix + "rule_nos["+i+"]", getValue("Long", row.getRuleNos()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.BundleNosArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.BundleNosRow row : arrayList.getBundleNosRow()){
            parameters.add("bundle_nos["+i+"]", getValue("Long", row.getBundleNos()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.BundleNosArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.BundleNosRow row : arrayList.getBundleNosRow()){
            parameters.add(paramPrefix + "bundle_nos["+i+"]", getValue("Long", row.getBundleNos()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ScheduleArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ScheduleRow row : arrayList.getScheduleRow()){
            parameters.add("schedule_name["+i+"]", getValue("String", row.getScheduleName()));
            parameters.add("currency_cd["+i+"]", getValue("String", row.getCurrencyCd()));
            parameters.add("is_default["+i+"]", getValue("Long", row.getIsDefault()));
            parameters.add("min_surcharge_to_apply["+i+"]", getValue("Double", row.getMinSurchargeToApply()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ScheduleArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ScheduleRow row : arrayList.getScheduleRow()){
            parameters.add(paramPrefix + "schedule_name["+i+"]", getValue("String", row.getScheduleName()));
            parameters.add(paramPrefix + "currency_cd["+i+"]", getValue("String", row.getCurrencyCd()));
            parameters.add(paramPrefix + "is_default["+i+"]", getValue("Long", row.getIsDefault()));
            parameters.add(paramPrefix + "min_surcharge_to_apply["+i+"]", getValue("Double", row.getMinSurchargeToApply()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.UsageThresholdArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.UsageThresholdRow row : arrayList.getUsageThresholdRow()){
            parameters.add("notice_dest_type["+i+"]", getValue("String", row.getNoticeDestType()));
            parameters.add("notice_balance_type["+i+"]", getValue("String", row.getNoticeBalanceType()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.UsageThresholdArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.UsageThresholdRow row : arrayList.getUsageThresholdRow()){
            parameters.add(paramPrefix + "notice_dest_type["+i+"]", getValue("String", row.getNoticeDestType()));
            parameters.add(paramPrefix + "notice_balance_type["+i+"]", getValue("String", row.getNoticeBalanceType()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PlanGroupArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PlanGroupRow row : arrayList.getPlanGroupRow()){
            parameters.add("plan_groups["+i+"]", getValue("Long", row.getPlanGroups()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PlanGroupArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PlanGroupRow row : arrayList.getPlanGroupRow()){
            parameters.add(paramPrefix + "plan_groups["+i+"]", getValue("Long", row.getPlanGroups()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PlanGroupIdArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PlanGroupIdRow row : arrayList.getPlanGroupIdRow()){
            parameters.add("plan_group_id["+i+"]", getValue("String", row.getPlanGroupId()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PlanGroupIdArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PlanGroupIdRow row : arrayList.getPlanGroupIdRow()){
            parameters.add(paramPrefix + "plan_group_id["+i+"]", getValue("String", row.getPlanGroupId()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ResourceArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ResourceRow row : arrayList.getResourceRow()){
            parameters.add("resource_no["+i+"]", getValue("Long", row.getResourceNo()));
            parameters.add("resource_name["+i+"]", getValue("String", row.getResourceName()));
            parameters.add("resource_description["+i+"]", getValue("String", row.getResourceDescription()));
            parameters.add("flat_threshold["+i+"]", getValue("Long", row.getFlatThreshold()));
            parameters.add("resource_units["+i+"]", getValue("Long", row.getResourceUnits()));
            parameters.add("expire_on_paid_through["+i+"]", getValue("String", row.getExpireOnPaidThrough()));
            parameters.add("additional_days["+i+"]", getValue("Long", row.getAdditionalDays()));
            parameters.add("reset_on_update["+i+"]", getValue("String", row.getResetOnUpdate()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ResourceArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ResourceRow row : arrayList.getResourceRow()){
            parameters.add(paramPrefix + "resource_no["+i+"]", getValue("Long", row.getResourceNo()));
            parameters.add(paramPrefix + "resource_name["+i+"]", getValue("String", row.getResourceName()));
            parameters.add(paramPrefix + "resource_description["+i+"]", getValue("String", row.getResourceDescription()));
            parameters.add(paramPrefix + "flat_threshold["+i+"]", getValue("Long", row.getFlatThreshold()));
            parameters.add(paramPrefix + "resource_units["+i+"]", getValue("Long", row.getResourceUnits()));
            parameters.add(paramPrefix + "expire_on_paid_through["+i+"]", getValue("String", row.getExpireOnPaidThrough()));
            parameters.add(paramPrefix + "additional_days["+i+"]", getValue("Long", row.getAdditionalDays()));
            parameters.add(paramPrefix + "reset_on_update["+i+"]", getValue("String", row.getResetOnUpdate()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ParentPlansArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ParentPlansRow row : arrayList.getParentPlansRow()){
            parameters.add("parent_plan["+i+"]", getValue("Long", row.getParentPlan()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ParentPlansArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ParentPlansRow row : arrayList.getParentPlansRow()){
            parameters.add(paramPrefix + "parent_plan["+i+"]", getValue("Long", row.getParentPlan()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ParentClientPlanIdsArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ParentClientPlanIdsRow row : arrayList.getParentClientPlanIdsRow()){
            parameters.add("parent_client_plan_id["+i+"]", getValue("String", row.getParentClientPlanId()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ParentClientPlanIdsArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ParentClientPlanIdsRow row : arrayList.getParentClientPlanIdsRow()){
            parameters.add(paramPrefix + "parent_client_plan_id["+i+"]", getValue("String", row.getParentClientPlanId()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExclusionPlansArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExclusionPlansRow row : arrayList.getExclusionPlansRow()){
            parameters.add("exclusion_plan["+i+"]", getValue("Long", row.getExclusionPlan()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExclusionPlansArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExclusionPlansRow row : arrayList.getExclusionPlansRow()){
            parameters.add(paramPrefix + "exclusion_plan["+i+"]", getValue("Long", row.getExclusionPlan()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ChildPlansArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ChildPlansRow row : arrayList.getChildPlansRow()){
            parameters.add("child_plan["+i+"]", getValue("String", row.getChildPlan()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ChildPlansArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ChildPlansRow row : arrayList.getChildPlansRow()){
            parameters.add(paramPrefix + "child_plan["+i+"]", getValue("String", row.getChildPlan()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.SurchargeNoArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.SurchargeNoRow row : arrayList.getSurchargeNoRow()){
            parameters.add("surcharge_nos["+i+"]", getValue("Long", row.getSurchargeNos()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.SurchargeNoArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.SurchargeNoRow row : arrayList.getSurchargeNoRow()){
            parameters.add(paramPrefix + "surcharge_nos["+i+"]", getValue("Long", row.getSurchargeNos()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ClientSurchargeIdArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ClientSurchargeIdRow row : arrayList.getClientSurchargeIdRow()){
            parameters.add("client_surcharge_ids["+i+"]", getValue("String", row.getClientSurchargeIds()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ClientSurchargeIdArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ClientSurchargeIdRow row : arrayList.getClientSurchargeIdRow()){
            parameters.add(paramPrefix + "client_surcharge_ids["+i+"]", getValue("String", row.getClientSurchargeIds()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.AssignFieldCategoriesArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.AssignFieldCategoriesRow row : arrayList.getAssignFieldCategoriesRow()){
            parameters.add("field_category_no["+i+"]", getValue("Long", row.getFieldCategoryNo()));
            parameters.add("field_category_name["+i+"]", getValue("String", row.getFieldCategoryName()));
            parameters.add("field_category_directive["+i+"]", getValue("Long", row.getFieldCategoryDirective()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.AssignFieldCategoriesArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.AssignFieldCategoriesRow row : arrayList.getAssignFieldCategoriesRow()){
            parameters.add(paramPrefix + "field_category_no["+i+"]", getValue("Long", row.getFieldCategoryNo()));
            parameters.add(paramPrefix + "field_category_name["+i+"]", getValue("String", row.getFieldCategoryName()));
            parameters.add(paramPrefix + "field_category_directive["+i+"]", getValue("Long", row.getFieldCategoryDirective()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ContractRolloverRateSchedArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ContractRolloverRateSchedRow row : arrayList.getContractRolloverRateSchedRow()){
            parameters.add("current_rate_sched_no["+i+"]", getValue("Long", row.getCurrentRateSchedNo()));
            parameters.add("current_client_rate_sched_id["+i+"]", getValue("String", row.getCurrentClientRateSchedId()));
            parameters.add("rollover_rate_sched_no["+i+"]", getValue("Long", row.getRolloverRateSchedNo()));
            parameters.add("rollover_client_rate_sched_id["+i+"]", getValue("String", row.getRolloverClientRateSchedId()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ContractRolloverRateSchedArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ContractRolloverRateSchedRow row : arrayList.getContractRolloverRateSchedRow()){
            parameters.add(paramPrefix + "current_rate_sched_no["+i+"]", getValue("Long", row.getCurrentRateSchedNo()));
            parameters.add(paramPrefix + "current_client_rate_sched_id["+i+"]", getValue("String", row.getCurrentClientRateSchedId()));
            parameters.add(paramPrefix + "rollover_rate_sched_no["+i+"]", getValue("Long", row.getRolloverRateSchedNo()));
            parameters.add(paramPrefix + "rollover_client_rate_sched_id["+i+"]", getValue("String", row.getRolloverClientRateSchedId()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PlanNosArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PlanNosRow row : arrayList.getPlanNosRow()){
            parameters.add("plan_nos["+i+"]", getValue("Long", row.getPlanNos()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PlanNosArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PlanNosRow row : arrayList.getPlanNosRow()){
            parameters.add(paramPrefix + "plan_nos["+i+"]", getValue("Long", row.getPlanNos()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ObjectTypeArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ObjectTypeRow row : arrayList.getObjectTypeRow()){
            parameters.add("object_type["+i+"]", getValue("String", row.getObjectType()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ObjectTypeArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ObjectTypeRow row : arrayList.getObjectTypeRow()){
            parameters.add(paramPrefix + "object_type["+i+"]", getValue("String", row.getObjectType()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.FieldSelectionArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.FieldSelectionRow row : arrayList.getFieldSelectionRow()){
            parameters.add("field_no["+i+"]", getValue("Long", row.getFieldNo()));
            parameters.add("field_name["+i+"]", getValue("String", row.getFieldName()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.FieldSelectionArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.FieldSelectionRow row : arrayList.getFieldSelectionRow()){
            parameters.add(paramPrefix + "field_no["+i+"]", getValue("Long", row.getFieldNo()));
            parameters.add(paramPrefix + "field_name["+i+"]", getValue("String", row.getFieldName()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.FieldCategoriesArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.FieldCategoriesRow row : arrayList.getFieldCategoriesRow()){
            parameters.add("field_category_no["+i+"]", getValue("Long", row.getFieldCategoryNo()));
            parameters.add("field_category_name["+i+"]", getValue("String", row.getFieldCategoryName()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.FieldCategoriesArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.FieldCategoriesRow row : arrayList.getFieldCategoriesRow()){
            parameters.add(paramPrefix + "field_category_no["+i+"]", getValue("Long", row.getFieldCategoryNo()));
            parameters.add(paramPrefix + "field_category_name["+i+"]", getValue("String", row.getFieldCategoryName()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.SurchargeTierArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.SurchargeTierRow row : arrayList.getSurchargeTierRow()){
            parameters.add("from["+i+"]", getValue("Long", row.getFrom()));
            parameters.add("to["+i+"]", getValue("Long", row.getTo()));
            parameters.add("rate["+i+"]", getValue("Double", row.getRate()));
            parameters.add("description["+i+"]", getValue("String", row.getDescription()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.SurchargeTierArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.SurchargeTierRow row : arrayList.getSurchargeTierRow()){
            parameters.add(paramPrefix + "from["+i+"]", getValue("Long", row.getFrom()));
            parameters.add(paramPrefix + "to["+i+"]", getValue("Long", row.getTo()));
            parameters.add(paramPrefix + "rate["+i+"]", getValue("Double", row.getRate()));
            parameters.add(paramPrefix + "description["+i+"]", getValue("String", row.getDescription()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.AssignCategoryPlansArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.AssignCategoryPlansRow row : arrayList.getAssignCategoryPlansRow()){
            parameters.add("plan_no["+i+"]", getValue("Long", row.getPlanNo()));
            parameters.add("client_plan_id["+i+"]", getValue("String", row.getClientPlanId()));
            parameters.add("plan_directive["+i+"]", getValue("Long", row.getPlanDirective()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.AssignCategoryPlansArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.AssignCategoryPlansRow row : arrayList.getAssignCategoryPlansRow()){
            parameters.add(paramPrefix + "plan_no["+i+"]", getValue("Long", row.getPlanNo()));
            parameters.add(paramPrefix + "client_plan_id["+i+"]", getValue("String", row.getClientPlanId()));
            parameters.add(paramPrefix + "plan_directive["+i+"]", getValue("Long", row.getPlanDirective()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.AssignCategoryFieldsArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.AssignCategoryFieldsRow row : arrayList.getAssignCategoryFieldsRow()){
            parameters.add("field_no["+i+"]", getValue("Long", row.getFieldNo()));
            parameters.add("field_name["+i+"]", getValue("String", row.getFieldName()));
            parameters.add("field_directive["+i+"]", getValue("Long", row.getFieldDirective()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.AssignCategoryFieldsArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.AssignCategoryFieldsRow row : arrayList.getAssignCategoryFieldsRow()){
            parameters.add(paramPrefix + "field_no["+i+"]", getValue("Long", row.getFieldNo()));
            parameters.add(paramPrefix + "field_name["+i+"]", getValue("String", row.getFieldName()));
            parameters.add(paramPrefix + "field_directive["+i+"]", getValue("Long", row.getFieldDirective()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.CouponsArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.CouponsRow row : arrayList.getCouponsRow()){
            parameters.add("coupon_cd["+i+"]", getValue("String", row.getCouponCd()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.CouponsArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.CouponsRow row : arrayList.getCouponsRow()){
            parameters.add(paramPrefix + "coupon_cd["+i+"]", getValue("String", row.getCouponCd()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.DunningProcessesArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.DunningProcessesRow row : arrayList.getDunningProcessesRow()){
            parameters.add("dunning_process_no["+i+"]", getValue("Long", row.getDunningProcessNo()));
            parameters.add("client_dunning_process_id["+i+"]", getValue("String", row.getClientDunningProcessId()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.DunningProcessesArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.DunningProcessesRow row : arrayList.getDunningProcessesRow()){
            parameters.add(paramPrefix + "dunning_process_no["+i+"]", getValue("Long", row.getDunningProcessNo()));
            parameters.add(paramPrefix + "client_dunning_process_id["+i+"]", getValue("String", row.getClientDunningProcessId()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PayMethodTypesArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PayMethodTypesRow row : arrayList.getPayMethodTypesRow()){
            parameters.add("pay_method_type_cd["+i+"]", getValue("Long", row.getPayMethodTypeCd()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PayMethodTypesArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PayMethodTypesRow row : arrayList.getPayMethodTypesRow()){
            parameters.add(paramPrefix + "pay_method_type_cd["+i+"]", getValue("Long", row.getPayMethodTypeCd()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.MasterPlansArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.MasterPlansRow row : arrayList.getMasterPlansRow()){
            parameters.add("plan_no["+i+"]", getValue("Long", row.getPlanNo()));
            parameters.add("client_plan_id["+i+"]", getValue("String", row.getClientPlanId()));
            i++;
        }
    }
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.MasterPlansArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.MasterPlansRow row : arrayList.getMasterPlansRow()){
            parameters.add(paramPrefix + "plan_no["+i+"]", getValue("Long", row.getPlanNo()));
            parameters.add(paramPrefix + "client_plan_id["+i+"]", getValue("String", row.getClientPlanId()));
            i++;
        }
    }

    /* ****************** END - ARRAY TO PARAM METHODS FOR EACH ARRAY ELEMENT **************************************** */

}
