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
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPromoPlanSetNo(getLongValue(jsonObject,"promo_plan_set_no"));
            entity.setPromoPlanSetName(getStringValue(jsonObject,"promo_plan_set_name"));
            entity.setPromoPlanSetDesc(getStringValue(jsonObject,"promo_plan_set_desc"));
            entity.setClientPlanTypeId(getStringValue(jsonObject,"client_plan_type_id"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<PlanReturnElement> buildPlanReturnElement(JSONArray jsonArray) {
        ArrayList<PlanReturnElement> returnElement = new ArrayList<PlanReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PlanReturnElement entity = new PlanReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPlanNo(getLongValue(jsonObject,"plan_no"));
            entity.setPlanName(getStringValue(jsonObject,"plan_name"));
            entity.setPlanDesc(getStringValue(jsonObject,"plan_desc"));
            entity.setClientPlanId(getStringValue(jsonObject,"client_plan_id"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<PlanGroupsReturnElement> buildPlanGroupsReturnElement(JSONArray jsonArray) {
        ArrayList<PlanGroupsReturnElement> returnElement = new ArrayList<PlanGroupsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PlanGroupsReturnElement entity = new PlanGroupsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setGroupNo(getLongValue(jsonObject,"group_no"));
            entity.setGroupName(getStringValue(jsonObject,"group_name"));
            entity.setPlanSetNo(getLongValue(jsonObject,"plan_set_no"));
            entity.setSetName(getStringValue(jsonObject,"set_name"));
            entity.setSetDescription(getStringValue(jsonObject,"set_description"));
            entity.setClientPlanTypeId(getStringValue(jsonObject,"client_plan_type_id"));
            entity.setPlanGroup(getLongValue(jsonObject,"plan_group"));
            entity.setGroupDesc(getStringValue(jsonObject,"group_desc"));
            entity.setClientPlanChangeGroupId(getStringValue(jsonObject,"client_plan_change_group_id"));
            entity.setGroupUsage(getStringValue(jsonObject,"group_usage"));
            entity.setGroupPlansCount(getLongValue(jsonObject,"group_plans_count"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<InventoryItemsReturnElement> buildInventoryItemsReturnElement(JSONArray jsonArray) {
        ArrayList<InventoryItemsReturnElement> returnElement = new ArrayList<InventoryItemsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            InventoryItemsReturnElement entity = new InventoryItemsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setItemNo(getLongValue(jsonObject,"item_no"));
            entity.setItemName(getStringValue(jsonObject,"item_name"));
            entity.setItemType(getLongValue(jsonObject,"item_type"));
            entity.setClientSku(getStringValue(jsonObject,"client_sku"));
            entity.setActiveInd(getLongValue(jsonObject,"active_ind"));
            entity.setClientItemId(getStringValue(jsonObject,"client_item_id"));
            entity.setStockLevel(getDoubleValue(jsonObject,"stock_level"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<PricingReturnElement> buildPricingReturnElement(JSONArray jsonArray) {
        ArrayList<PricingReturnElement> returnElement = new ArrayList<PricingReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PricingReturnElement entity = new PricingReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setCurrencyCd(getStringValue(jsonObject,"currency_cd"));
            entity.setItemPrice(getDoubleValue(jsonObject,"item_price"));
            entity.setPricePerUnit(getDoubleValue(jsonObject,"price_per_unit"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<ResourcesReturnElement> buildResourcesReturnElement(JSONArray jsonArray) {
        ArrayList<ResourcesReturnElement> returnElement = new ArrayList<ResourcesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ResourcesReturnElement entity = new ResourcesReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setResources(getLongValue(jsonObject,"resources"));
            entity.setResourceTypeNo(getLongValue(jsonObject,"resource_type_no"));
            entity.setResourceUnits(getLongValue(jsonObject,"resource_units"));
            entity.setResourceName(getStringValue(jsonObject,"resource_name"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<ImageReturnElement> buildImageReturnElement(JSONArray jsonArray) {
        ArrayList<ImageReturnElement> returnElement = new ArrayList<ImageReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ImageReturnElement entity = new ImageReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setThumbnailImageUrl(getStringValue(jsonObject,"thumbnail_image_url"));
            entity.setMainImageUrl(getStringValue(jsonObject,"main_image_url"));
            entity.setImageText(getStringValue(jsonObject,"image_text"));
            entity.setDefaultInd(getLongValue(jsonObject,"default_ind"));
            entity.setImageClassSeqNo(getLongValue(jsonObject,"image_class_seq_no"));
            entity.setActive(getLongValue(jsonObject,"active"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<SupplementalObjFieldsReturnElement> buildSupplementalObjFieldsReturnElement(JSONArray jsonArray) {
        ArrayList<SupplementalObjFieldsReturnElement> returnElement = new ArrayList<SupplementalObjFieldsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            SupplementalObjFieldsReturnElement entity = new SupplementalObjFieldsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setSupplementalObjField(getStringValue(jsonObject,"supplemental_obj_field"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<ServiceTypesReturnElement> buildServiceTypesReturnElement(JSONArray jsonArray) {
        ArrayList<ServiceTypesReturnElement> returnElement = new ArrayList<ServiceTypesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ServiceTypesReturnElement entity = new ServiceTypesReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setServiceTypeName(getStringValue(jsonObject,"service_type_name"));
            entity.setServiceDesc(getStringValue(jsonObject,"service_desc"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<ServicesReturnElement> buildServicesReturnElement(JSONArray jsonArray) {
        ArrayList<ServicesReturnElement> returnElement = new ArrayList<ServicesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ServicesReturnElement entity = new ServicesReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setServiceNo(getLongValue(jsonObject,"service_no"));
            entity.setClientServiceId(getStringValue(jsonObject,"client_service_id"));
            entity.setServiceName(getStringValue(jsonObject,"service_name"));
            entity.setServiceType(getStringValue(jsonObject,"service_type"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<RateInfoReturnElement> buildRateInfoReturnElement(JSONArray jsonArray) {
        ArrayList<RateInfoReturnElement> returnElement = new ArrayList<RateInfoReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            RateInfoReturnElement entity = new RateInfoReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setScheduleNo(getLongValue(jsonObject,"schedule_no"));
            entity.setScheduleName(getStringValue(jsonObject,"schedule_name"));
            entity.setClientRateScheduleId(getStringValue(jsonObject,"client_rate_schedule_id"));
            entity.setFromUnit(getStringValue(jsonObject,"from_unit"));
            entity.setToUnit(getStringValue(jsonObject,"to_unit"));
            entity.setRatePerUnit(getDoubleValue(jsonObject,"rate_per_unit"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<RateSchedulesReturnElement> buildRateSchedulesReturnElement(JSONArray jsonArray) {
        ArrayList<RateSchedulesReturnElement> returnElement = new ArrayList<RateSchedulesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            RateSchedulesReturnElement entity = new RateSchedulesReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setCurrency(getStringValue(jsonObject,"currency"));
                        ArrayList<RateInfoReturnElement> arrayListRateInfoReturnElement = buildRateInfoReturnElement((JSONArray)jsonObject.get("rate_info"));
            for (RateInfoReturnElement element : arrayListRateInfoReturnElement){
                entity.getRateInfo().add(element);
            }
            entity.setIsDefault(getLongValue(jsonObject,"is_default"));
            entity.setFromUnit(getStringValue(jsonObject,"from_unit"));
            entity.setToUnit(getStringValue(jsonObject,"to_unit"));
            entity.setRatePerUnit(getDoubleValue(jsonObject,"rate_per_unit"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<ParentPlansReturnElement> buildParentPlansReturnElement(JSONArray jsonArray) {
        ArrayList<ParentPlansReturnElement> returnElement = new ArrayList<ParentPlansReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ParentPlansReturnElement entity = new ParentPlansReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setParentPlan(getLongValue(jsonObject,"parent_plan"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<ParentPlanIdsReturnElement> buildParentPlanIdsReturnElement(JSONArray jsonArray) {
        ArrayList<ParentPlanIdsReturnElement> returnElement = new ArrayList<ParentPlanIdsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ParentPlanIdsReturnElement entity = new ParentPlanIdsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setParentPlanId(getStringValue(jsonObject,"parent_plan_id"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<ExclusionPlansReturnElement> buildExclusionPlansReturnElement(JSONArray jsonArray) {
        ArrayList<ExclusionPlansReturnElement> returnElement = new ArrayList<ExclusionPlansReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ExclusionPlansReturnElement entity = new ExclusionPlansReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setExclusionPlan(getLongValue(jsonObject,"exclusion_plan"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<SuppFieldsReturnElement> buildSuppFieldsReturnElement(JSONArray jsonArray) {
        ArrayList<SuppFieldsReturnElement> returnElement = new ArrayList<SuppFieldsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            SuppFieldsReturnElement entity = new SuppFieldsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setFieldName(getStringValue(jsonObject,"field_name"));
            entity.setFieldDesc(getStringValue(jsonObject,"field_desc"));
            entity.setFieldOrder(getLongValue(jsonObject,"field_order"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<FieldOptionsReturnElement> buildFieldOptionsReturnElement(JSONArray jsonArray) {
        ArrayList<FieldOptionsReturnElement> returnElement = new ArrayList<FieldOptionsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            FieldOptionsReturnElement entity = new FieldOptionsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setDisplayText(getStringValue(jsonObject,"display_text"));
            entity.setOptionValue(getStringValue(jsonObject,"option_value"));
            entity.setFieldOrder(getLongValue(jsonObject,"field_order"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<CouponsReturnElement> buildCouponsReturnElement(JSONArray jsonArray) {
        ArrayList<CouponsReturnElement> returnElement = new ArrayList<CouponsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            CouponsReturnElement entity = new CouponsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setCouponCd(getStringValue(jsonObject,"coupon_cd"));
            entity.setCouponDesc(getStringValue(jsonObject,"coupon_desc"));
            entity.setCouponMsg(getStringValue(jsonObject,"coupon_msg"));
            entity.setStatusInd(getLongValue(jsonObject,"status_ind"));
            entity.setNoOfUses(getLongValue(jsonObject,"no_of_uses"));
            entity.setStartDate(getStringValue(jsonObject,"start_date"));
            entity.setEndDate(getStringValue(jsonObject,"end_date"));
            entity.setExpiresDesc(getStringValue(jsonObject,"expires_desc"));
            entity.setCouponNo(getLongValue(jsonObject,"coupon_no"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<RulesReturnElement> buildRulesReturnElement(JSONArray jsonArray) {
        ArrayList<RulesReturnElement> returnElement = new ArrayList<RulesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            RulesReturnElement entity = new RulesReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setRule(getLongValue(jsonObject,"rule"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<RuleIdsReturnElement> buildRuleIdsReturnElement(JSONArray jsonArray) {
        ArrayList<RuleIdsReturnElement> returnElement = new ArrayList<RuleIdsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            RuleIdsReturnElement entity = new RuleIdsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setRule(getStringValue(jsonObject,"rule"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<PlanNoReturnElement> buildPlanNoReturnElement(JSONArray jsonArray) {
        ArrayList<PlanNoReturnElement> returnElement = new ArrayList<PlanNoReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PlanNoReturnElement entity = new PlanNoReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPlanNos(getLongValue(jsonObject,"plan_nos"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<ClientPlanIdReturnElement> buildClientPlanIdReturnElement(JSONArray jsonArray) {
        ArrayList<ClientPlanIdReturnElement> returnElement = new ArrayList<ClientPlanIdReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ClientPlanIdReturnElement entity = new ClientPlanIdReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setClientPlanIds(getStringValue(jsonObject,"client_plan_ids"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<ServiceNoReturnElement> buildServiceNoReturnElement(JSONArray jsonArray) {
        ArrayList<ServiceNoReturnElement> returnElement = new ArrayList<ServiceNoReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ServiceNoReturnElement entity = new ServiceNoReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setServiceNos(getLongValue(jsonObject,"service_nos"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<ClientServiceIdReturnElement> buildClientServiceIdReturnElement(JSONArray jsonArray) {
        ArrayList<ClientServiceIdReturnElement> returnElement = new ArrayList<ClientServiceIdReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ClientServiceIdReturnElement entity = new ClientServiceIdReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setClientServiceIds(getStringValue(jsonObject,"client_service_ids"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<ItemNoReturnElement> buildItemNoReturnElement(JSONArray jsonArray) {
        ArrayList<ItemNoReturnElement> returnElement = new ArrayList<ItemNoReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ItemNoReturnElement entity = new ItemNoReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setItemNos(getLongValue(jsonObject,"item_nos"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<ClientItemIdReturnElement> buildClientItemIdReturnElement(JSONArray jsonArray) {
        ArrayList<ClientItemIdReturnElement> returnElement = new ArrayList<ClientItemIdReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ClientItemIdReturnElement entity = new ClientItemIdReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setClientItemIds(getStringValue(jsonObject,"client_item_ids"));
            entity.setItemIds(getStringValue(jsonObject,"item_ids"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<EligibleServiceTypesReturnElement> buildEligibleServiceTypesReturnElement(JSONArray jsonArray) {
        ArrayList<EligibleServiceTypesReturnElement> returnElement = new ArrayList<EligibleServiceTypesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            EligibleServiceTypesReturnElement entity = new EligibleServiceTypesReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setEligibleServiceType(getStringValue(jsonObject,"eligible_service_type"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<CreditTemplateReturnElement> buildCreditTemplateReturnElement(JSONArray jsonArray) {
        ArrayList<CreditTemplateReturnElement> returnElement = new ArrayList<CreditTemplateReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            CreditTemplateReturnElement entity = new CreditTemplateReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setCreditTemplateNo(getLongValue(jsonObject,"credit_template_no"));
            entity.setCreditTemplateName(getStringValue(jsonObject,"credit_template_name"));
            entity.setClientCreditTemplateId(getStringValue(jsonObject,"client_credit_template_id"));
            entity.setEligiblePlanNo(getLongValue(jsonObject,"eligible_plan_no"));
            entity.setEligibleClientPlanId(getStringValue(jsonObject,"eligible_client_plan_id"));
            entity.setEligibleServiceNo(getLongValue(jsonObject,"eligible_service_no"));
            entity.setEligibleClientServiceId(getStringValue(jsonObject,"eligible_client_service_id"));
                        ArrayList<EligibleServiceTypesReturnElement> arrayListEligibleServiceTypesReturnElement = buildEligibleServiceTypesReturnElement((JSONArray)jsonObject.get("eligible_service_types"));
            for (EligibleServiceTypesReturnElement element : arrayListEligibleServiceTypesReturnElement){
                entity.getEligibleServiceTypes().add(element);
            }
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
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<DiscountRuleReturnElement> buildDiscountRuleReturnElement(JSONArray jsonArray) {
        ArrayList<DiscountRuleReturnElement> returnElement = new ArrayList<DiscountRuleReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            DiscountRuleReturnElement entity = new DiscountRuleReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setRuleNo(getLongValue(jsonObject,"rule_no"));
            entity.setRuleId(getStringValue(jsonObject,"rule_id"));
            entity.setDescription(getStringValue(jsonObject,"description"));
            entity.setExtDescription(getStringValue(jsonObject,"ext_description"));
            entity.setFlatPercentInd(getLongValue(jsonObject,"flat_percent_ind"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setCurrency(getStringValue(jsonObject,"currency"));
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
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<DiscountBundleReturnElement> buildDiscountBundleReturnElement(JSONArray jsonArray) {
        ArrayList<DiscountBundleReturnElement> returnElement = new ArrayList<DiscountBundleReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            DiscountBundleReturnElement entity = new DiscountBundleReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
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
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<CreditTemplatesReturnElement> buildCreditTemplatesReturnElement(JSONArray jsonArray) {
        ArrayList<CreditTemplatesReturnElement> returnElement = new ArrayList<CreditTemplatesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            CreditTemplatesReturnElement entity = new CreditTemplatesReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setRecurringCreditTemplateNo(getLongValue(jsonObject,"recurring_credit_template_no"));
            entity.setCreditTemplateName(getStringValue(jsonObject,"credit_template_name"));
            entity.setClientCreditTemplateId(getStringValue(jsonObject,"client_credit_template_id"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<DiscountBundlesReturnElement> buildDiscountBundlesReturnElement(JSONArray jsonArray) {
        ArrayList<DiscountBundlesReturnElement> returnElement = new ArrayList<DiscountBundlesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            DiscountBundlesReturnElement entity = new DiscountBundlesReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
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
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<DiscountRulesReturnElement> buildDiscountRulesReturnElement(JSONArray jsonArray) {
        ArrayList<DiscountRulesReturnElement> returnElement = new ArrayList<DiscountRulesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            DiscountRulesReturnElement entity = new DiscountRulesReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setRuleNo(getLongValue(jsonObject,"rule_no"));
            entity.setRuleId(getStringValue(jsonObject,"rule_id"));
            entity.setDescription(getStringValue(jsonObject,"description"));
            entity.setExtDescription(getStringValue(jsonObject,"ext_description"));
            entity.setFlatPercentInd(getLongValue(jsonObject,"flat_percent_ind"));
            entity.setAmount(getDoubleValue(jsonObject,"amount"));
            entity.setCurrency(getStringValue(jsonObject,"currency"));
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
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<PlansReturnElement> buildPlansReturnElement(JSONArray jsonArray) {
        ArrayList<PlansReturnElement> returnElement = new ArrayList<PlansReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PlansReturnElement entity = new PlansReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPlanName(getStringValue(jsonObject,"plan_name"));
            entity.setPlanDesc(getStringValue(jsonObject,"plan_desc"));
            entity.setPlanNo(getLongValue(jsonObject,"plan_no"));
            entity.setPlanLevel(getLongValue(jsonObject,"plan_level"));
            entity.setClientPlanId(getStringValue(jsonObject,"client_plan_id"));
            entity.setBillingInterval(getLongValue(jsonObject,"billing_interval"));
            entity.setActiveInd(getLongValue(jsonObject,"active_ind"));
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
            entity.setSurchargeNos(getLongValue(jsonObject,"surcharge_nos"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<ClientSurchargeIdReturnElement> buildClientSurchargeIdReturnElement(JSONArray jsonArray) {
        ArrayList<ClientSurchargeIdReturnElement> returnElement = new ArrayList<ClientSurchargeIdReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            ClientSurchargeIdReturnElement entity = new ClientSurchargeIdReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setClientSurchargeIds(getStringValue(jsonObject,"client_surcharge_ids"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<PlanGroupIdsReturnElement> buildPlanGroupIdsReturnElement(JSONArray jsonArray) {
        ArrayList<PlanGroupIdsReturnElement> returnElement = new ArrayList<PlanGroupIdsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PlanGroupIdsReturnElement entity = new PlanGroupIdsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPlanGroupId(getStringValue(jsonObject,"plan_group_id"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<SurchargesReturnElement> buildSurchargesReturnElement(JSONArray jsonArray) {
        ArrayList<SurchargesReturnElement> returnElement = new ArrayList<SurchargesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            SurchargesReturnElement entity = new SurchargesReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setSurchargeNo(getLongValue(jsonObject,"surcharge_no"));
            entity.setClientSurchargeId(getStringValue(jsonObject,"client_surcharge_id"));
            entity.setSurchargeName(getStringValue(jsonObject,"surcharge_name"));
            entity.setSurchargeTypeCd(getStringValue(jsonObject,"surcharge_type_cd"));
            entity.setCurrencyCd(getStringValue(jsonObject,"currency_cd"));
            entity.setScopeLabel(getStringValue(jsonObject,"scope_label"));
            entity.setDeleteable(getStringValue(jsonObject,"deleteable"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<PromotionsReturnElement> buildPromotionsReturnElement(JSONArray jsonArray) {
        ArrayList<PromotionsReturnElement> returnElement = new ArrayList<PromotionsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PromotionsReturnElement entity = new PromotionsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setPromoCd(getStringValue(jsonObject,"promo_cd"));
            entity.setPromoDesc(getStringValue(jsonObject,"promo_desc"));
            entity.setExpiresAfter(getStringValue(jsonObject,"expires_after"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<UsageTypesReturnElement> buildUsageTypesReturnElement(JSONArray jsonArray) {
        ArrayList<UsageTypesReturnElement> returnElement = new ArrayList<UsageTypesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            UsageTypesReturnElement entity = new UsageTypesReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setUsageTypeNo(getLongValue(jsonObject,"usage_type_no"));
            entity.setUsageTypeName(getStringValue(jsonObject,"usage_type_name"));
            entity.setUsageTypeDesc(getStringValue(jsonObject,"usage_type_desc"));
            entity.setUnitType(getStringValue(jsonObject,"unit_type"));
            entity.setUsageTypeCd(getStringValue(jsonObject,"usage_type_cd"));
            entity.setIsEditable(getLongValue(jsonObject,"is_editable"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<UsageUnitTypesReturnElement> buildUsageUnitTypesReturnElement(JSONArray jsonArray) {
        ArrayList<UsageUnitTypesReturnElement> returnElement = new ArrayList<UsageUnitTypesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            UsageUnitTypesReturnElement entity = new UsageUnitTypesReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setUsageUnitTypeNo(getLongValue(jsonObject,"usage_unit_type_no"));
            entity.setUsageUnitTypeDesc(getStringValue(jsonObject,"usage_unit_type_desc"));
            entity.setClientUsageUnitTypeId(getStringValue(jsonObject,"client_usage_unit_type_id"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<AllowedValuesReturnElement> buildAllowedValuesReturnElement(JSONArray jsonArray) {
        ArrayList<AllowedValuesReturnElement> returnElement = new ArrayList<AllowedValuesReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AllowedValuesReturnElement entity = new AllowedValuesReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setValue(getStringValue(jsonObject,"value"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<AssociatedObjectsReturnElement> buildAssociatedObjectsReturnElement(JSONArray jsonArray) {
        ArrayList<AssociatedObjectsReturnElement> returnElement = new ArrayList<AssociatedObjectsReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            AssociatedObjectsReturnElement entity = new AssociatedObjectsReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setAssociatedObject(getStringValue(jsonObject,"associated_object"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<CoaListReturnElement> buildCoaListReturnElement(JSONArray jsonArray) {
        ArrayList<CoaListReturnElement> returnElement = new ArrayList<CoaListReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            CoaListReturnElement entity = new CoaListReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setCoaId(getLongValue(jsonObject,"coa_id"));
            entity.setCoaCode(getStringValue(jsonObject,"coa_code"));
            entity.setCoaDescription(getStringValue(jsonObject,"coa_description"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<CoaReturnElement> buildCoaReturnElement(JSONArray jsonArray) {
        ArrayList<CoaReturnElement> returnElement = new ArrayList<CoaReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            CoaReturnElement entity = new CoaReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setCoaId(getLongValue(jsonObject,"coa_id"));
            entity.setCoaCode(getStringValue(jsonObject,"coa_code"));
            entity.setCoaDescription(getStringValue(jsonObject,"coa_description"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<PlanServiceReturnElement> buildPlanServiceReturnElement(JSONArray jsonArray) {
        ArrayList<PlanServiceReturnElement> returnElement = new ArrayList<PlanServiceReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            PlanServiceReturnElement entity = new PlanServiceReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
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
            returnElement.add(entity);
        }
        return returnElement;
    }

    public static ArrayList<SurchargeTierReturnElement> buildSurchargeTierReturnElement(JSONArray jsonArray) {
        ArrayList<SurchargeTierReturnElement> returnElement = new ArrayList<SurchargeTierReturnElement>();
        if (jsonArray == null) return returnElement;
        for (int i = 0;i < jsonArray.size();i++) {
            SurchargeTierReturnElement entity = new SurchargeTierReturnElement();
            JSONObject jsonObject = (JSONObject)jsonArray.get(i);
            entity.setFrom(getLongValue(jsonObject,"from"));
            entity.setTo(getLongValue(jsonObject,"to"));
            entity.setRate(getDoubleValue(jsonObject,"rate"));
            returnElement.add(entity);
        }
        return returnElement;
    }

    /* ****************** END - SPECIFIC METHODS FOR EACH RETURN ELEMENT (build<#name#>) **************************************** */

    /* ****************** ARRAY TO PARAM METHODS FOR EACH ARRAY ELEMENT ********************************************** */
    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PriceArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PriceRow row : arrayList.getPriceRow()){
            parameters.add("amount["+i+"]", getValue("Double", row.getAmount()));
            i++;
        }
    }
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PriceArray arrayList, String paramPrefix) {
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
                        addParameterValuesFromArray(parameters, row.getPrice(), "price["+i+"]");
            i++;
        }
    }
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.TierArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.TierRow row : arrayList.getTierRow()){
            parameters.add(paramPrefix + "from["+i+"]", getValue("Long", row.getFrom()));
            parameters.add(paramPrefix + "to["+i+"]", getValue("Long", row.getTo()));
                        addParameterValuesFromArray(parameters, row.getPrice(), paramPrefix + "price["+i+"]");
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ServiceArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ServiceRow row : arrayList.getServiceRow()){
            parameters.add("service_no["+i+"]", getValue("Long", row.getServiceNo()));
            parameters.add("pricing_rule["+i+"]", getValue("String", row.getPricingRule()));
            parameters.add("high_water["+i+"]", getValue("String", row.getHighWater()));
            parameters.add("billing_option["+i+"]", getValue("Long", row.getBillingOption()));
            parameters.add("threshold["+i+"]", getValue("Long", row.getThreshold()));
            parameters.add("client_service_id["+i+"]", getValue("String", row.getClientServiceId()));
            parameters.add("name["+i+"]", getValue("String", row.getName()));
            parameters.add("gl_cd["+i+"]", getValue("String", row.getGlCd()));
            parameters.add("taxable["+i+"]", getValue("String", row.getTaxable()));
            parameters.add("taxable_ind["+i+"]", getValue("String", row.getTaxableInd()));
            parameters.add("tax_group["+i+"]", getValue("String", row.getTaxGroup()));
            parameters.add("service_type["+i+"]", getValue("String", row.getServiceType()));
            parameters.add("usage_type["+i+"]", getValue("Long", row.getUsageType()));
            parameters.add("rate_type["+i+"]", getValue("String", row.getRateType()));
            parameters.add("tax_inclusive_ind["+i+"]", getValue("Long", row.getTaxInclusiveInd()));
                        addParameterValuesFromArray(parameters, row.getTier(), "tier["+i+"]");
            i++;
        }
    }
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ServiceArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ServiceRow row : arrayList.getServiceRow()){
            parameters.add(paramPrefix + "service_no["+i+"]", getValue("Long", row.getServiceNo()));
            parameters.add(paramPrefix + "pricing_rule["+i+"]", getValue("String", row.getPricingRule()));
            parameters.add(paramPrefix + "high_water["+i+"]", getValue("String", row.getHighWater()));
            parameters.add(paramPrefix + "billing_option["+i+"]", getValue("Long", row.getBillingOption()));
            parameters.add(paramPrefix + "threshold["+i+"]", getValue("Long", row.getThreshold()));
            parameters.add(paramPrefix + "client_service_id["+i+"]", getValue("String", row.getClientServiceId()));
            parameters.add(paramPrefix + "name["+i+"]", getValue("String", row.getName()));
            parameters.add(paramPrefix + "gl_cd["+i+"]", getValue("String", row.getGlCd()));
            parameters.add(paramPrefix + "taxable["+i+"]", getValue("String", row.getTaxable()));
            parameters.add(paramPrefix + "taxable_ind["+i+"]", getValue("String", row.getTaxableInd()));
            parameters.add(paramPrefix + "tax_group["+i+"]", getValue("String", row.getTaxGroup()));
            parameters.add(paramPrefix + "service_type["+i+"]", getValue("String", row.getServiceType()));
            parameters.add(paramPrefix + "usage_type["+i+"]", getValue("Long", row.getUsageType()));
            parameters.add(paramPrefix + "rate_type["+i+"]", getValue("String", row.getRateType()));
            parameters.add(paramPrefix + "tax_inclusive_ind["+i+"]", getValue("Long", row.getTaxInclusiveInd()));
                        addParameterValuesFromArray(parameters, row.getTier(), paramPrefix + "tier["+i+"]");
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ImageArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ImageRow row : arrayList.getImageRow()){
            parameters.add("main_image_url["+i+"]", getValue("String", row.getMainImageUrl()));
            parameters.add("thumbnail_image_url["+i+"]", getValue("String", row.getThumbnailImageUrl()));
            parameters.add("image_text["+i+"]", getValue("String", row.getImageText()));
            parameters.add("default_ind["+i+"]", getValue("Long", row.getDefaultInd()));
            parameters.add("active["+i+"]", getValue("Long", row.getActive()));
            i++;
        }
    }
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ImageArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ImageRow row : arrayList.getImageRow()){
            parameters.add(paramPrefix + "main_image_url["+i+"]", getValue("String", row.getMainImageUrl()));
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ParentClassArray arrayList, String paramPrefix) {
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
            parameters.add("supplemental_obj_field["+i+"]", getValue("String", row.getSupplementalObjField()));
            i++;
        }
    }
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.SupplementalObjFieldArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.SupplementalObjFieldRow row : arrayList.getSupplementalObjFieldRow()){
            parameters.add(paramPrefix + "supplemental_obj_field["+i+"]", getValue("String", row.getSupplementalObjField()));
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.RulesArray arrayList, String paramPrefix) {
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
            parameters.add("rule["+i+"]", getValue("String", row.getRule()));
            i++;
        }
    }
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.RuleIdsArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.RuleIdsRow row : arrayList.getRuleIdsRow()){
            parameters.add(paramPrefix + "rule_id["+i+"]", getValue("String", row.getRuleId()));
            parameters.add(paramPrefix + "rule["+i+"]", getValue("String", row.getRule()));
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PlanNoArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ClientPlanIdArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ServiceNoArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ClientServiceIdArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ItemNoArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ClientItemIdArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.EligibleServiceTypesArray arrayList, String paramPrefix) {
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
            i++;
        }
    }
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.TemplateArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingTemplateArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingTemplateIdArray arrayList, String paramPrefix) {
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
            parameters.add("flat_percent_ind["+i+"]", getValue("Long", row.getFlatPercentInd()));
            parameters.add("amount["+i+"]", getValue("Double", row.getAmount()));
            parameters.add("currency["+i+"]", getValue("String", row.getCurrency()));
            parameters.add("duration_type_ind["+i+"]", getValue("String", row.getDurationTypeInd()));
            parameters.add("max_applicable_months["+i+"]", getValue("Long", row.getMaxApplicableMonths()));
            parameters.add("max_applications_per_acct["+i+"]", getValue("Long", row.getMaxApplicationsPerAcct()));
            parameters.add("inline_offset_ind["+i+"]", getValue("String", row.getInlineOffsetInd()));
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.DiscountRuleArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.DiscountRuleRow row : arrayList.getDiscountRuleRow()){
            parameters.add(paramPrefix + "label["+i+"]", getValue("String", row.getLabel()));
            parameters.add(paramPrefix + "rule_id["+i+"]", getValue("String", row.getRuleId()));
            parameters.add(paramPrefix + "description["+i+"]", getValue("String", row.getDescription()));
            parameters.add(paramPrefix + "ext_description["+i+"]", getValue("String", row.getExtDescription()));
            parameters.add(paramPrefix + "flat_percent_ind["+i+"]", getValue("Long", row.getFlatPercentInd()));
            parameters.add(paramPrefix + "amount["+i+"]", getValue("Double", row.getAmount()));
            parameters.add(paramPrefix + "currency["+i+"]", getValue("String", row.getCurrency()));
            parameters.add(paramPrefix + "duration_type_ind["+i+"]", getValue("String", row.getDurationTypeInd()));
            parameters.add(paramPrefix + "max_applicable_months["+i+"]", getValue("Long", row.getMaxApplicableMonths()));
            parameters.add(paramPrefix + "max_applications_per_acct["+i+"]", getValue("Long", row.getMaxApplicationsPerAcct()));
            parameters.add(paramPrefix + "inline_offset_ind["+i+"]", getValue("String", row.getInlineOffsetInd()));
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingDiscountRuleArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingDiscountRuleIdArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.DiscountBundleArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingDiscountBundleArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingDiscountBundleIdArray arrayList, String paramPrefix) {
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
            parameters.add("coupon_nos["+i+"]", getValue("Long", row.getCouponNos()));
            i++;
        }
    }
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.CouponNosArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.CouponNosRow row : arrayList.getCouponNosRow()){
            parameters.add(paramPrefix + "coupon_nos["+i+"]", getValue("Long", row.getCouponNos()));
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
            i++;
        }
    }
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.CouponArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExistingCouponArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.TemplateNosArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.RuleNosArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.BundleNosArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.BundleNosRow row : arrayList.getBundleNosRow()){
            parameters.add(paramPrefix + "bundle_nos["+i+"]", getValue("Long", row.getBundleNos()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PlanGroupArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PlanGroupRow row : arrayList.getPlanGroupRow()){
            parameters.add("plan_group["+i+"]", getValue("Long", row.getPlanGroup()));
            i++;
        }
    }
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PlanGroupArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PlanGroupRow row : arrayList.getPlanGroupRow()){
            parameters.add(paramPrefix + "plan_group["+i+"]", getValue("Long", row.getPlanGroup()));
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PlanGroupIdArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PlanGroupIdRow row : arrayList.getPlanGroupIdRow()){
            parameters.add(paramPrefix + "plan_group_id["+i+"]", getValue("String", row.getPlanGroupId()));
            i++;
        }
    }

    public static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ScheduleArray arrayList) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ScheduleRow row : arrayList.getScheduleRow()){
            parameters.add("schedule_no["+i+"]", getValue("Long", row.getScheduleNo()));
            parameters.add("schedule_name["+i+"]", getValue("String", row.getScheduleName()));
            parameters.add("client_rate_schedule_id["+i+"]", getValue("String", row.getClientRateScheduleId()));
            parameters.add("currency_cd["+i+"]", getValue("String", row.getCurrencyCd()));
            parameters.add("is_default["+i+"]", getValue("Long", row.getIsDefault()));
            i++;
        }
    }
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ScheduleArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ScheduleRow row : arrayList.getScheduleRow()){
            parameters.add(paramPrefix + "schedule_no["+i+"]", getValue("Long", row.getScheduleNo()));
            parameters.add(paramPrefix + "schedule_name["+i+"]", getValue("String", row.getScheduleName()));
            parameters.add(paramPrefix + "client_rate_schedule_id["+i+"]", getValue("String", row.getClientRateScheduleId()));
            parameters.add(paramPrefix + "currency_cd["+i+"]", getValue("String", row.getCurrencyCd()));
            parameters.add(paramPrefix + "is_default["+i+"]", getValue("Long", row.getIsDefault()));
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ResourceArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ParentPlansArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ParentClientPlanIdsArray arrayList, String paramPrefix) {
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
            parameters.add("exclusion_plans["+i+"]", getValue("Long", row.getExclusionPlans()));
            i++;
        }
    }
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ExclusionPlansArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ExclusionPlansRow row : arrayList.getExclusionPlansRow()){
            parameters.add(paramPrefix + "exclusion_plans["+i+"]", getValue("Long", row.getExclusionPlans()));
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ChildPlansArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.SurchargeNoArray arrayList, String paramPrefix) {
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.ClientSurchargeIdArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.ClientSurchargeIdRow row : arrayList.getClientSurchargeIdRow()){
            parameters.add(paramPrefix + "client_surcharge_ids["+i+"]", getValue("String", row.getClientSurchargeIds()));
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
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.PlanNosArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.PlanNosRow row : arrayList.getPlanNosRow()){
            parameters.add(paramPrefix + "plan_nos["+i+"]", getValue("Long", row.getPlanNos()));
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
            i++;
        }
    }
    private static void addParameterValuesFromArray(MultivaluedMap<String, String> parameters, com.aria.common.shared.admin.SurchargeTierArray arrayList, String paramPrefix) {
        if (arrayList == null) return;
        int i = 0;
        for (com.aria.common.shared.admin.SurchargeTierRow row : arrayList.getSurchargeTierRow()){
            parameters.add(paramPrefix + "from["+i+"]", getValue("Long", row.getFrom()));
            parameters.add(paramPrefix + "to["+i+"]", getValue("Long", row.getTo()));
            parameters.add(paramPrefix + "rate["+i+"]", getValue("Double", row.getRate()));
            i++;
        }
    }

    /* ****************** END - ARRAY TO PARAM METHODS FOR EACH ARRAY ELEMENT **************************************** */

}
