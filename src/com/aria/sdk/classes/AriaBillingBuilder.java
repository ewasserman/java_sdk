package com.aria.sdk.classes;

public class AriaBillingBuilder {

  private static AriaBillingCompleteRest ariaBillingCompleteRest = null;

  private static AriaBillingCompleteSoap ariaBillingCompleteSoap = null;
  
  private static AriaBillingAdministrationRest ariaBillingAdministrationRest = null;

  private static AriaBillingIntegrationRest ariaBillingIntegrationRest = null;

  private static AriaBillingIntegrationSoap ariaBillingIntegrationSoap = null;
  
  private AriaBillingBuilder(){}

  synchronized public static AriaBillingComplete getAriaSDK(BaseAriaBillingDTO baseAriaBillingDTO) throws Exception{
    if(baseAriaBillingDTO.getCallType().equals(CallType.REST)) {
      if(ariaBillingCompleteRest == null) {
        ariaBillingCompleteRest = new AriaBillingCompleteRest(baseAriaBillingDTO);
      }
      return ariaBillingCompleteRest;
    } else {
      if(ariaBillingCompleteSoap == null) {
        ariaBillingCompleteSoap = new AriaBillingCompleteSoap(baseAriaBillingDTO);
      }
      return ariaBillingCompleteSoap;
    }
  }

  synchronized public static AriaBillingAdministration getAriaAdminSDK(BaseAriaBillingDTO baseAriaBillingDTO) throws Exception{
    if(ariaBillingAdministrationRest == null) {
      ariaBillingAdministrationRest = new AriaBillingAdministrationRest(baseAriaBillingDTO);
    }
    return ariaBillingAdministrationRest;
  }

  synchronized public static AriaBillingIntegration getAriaObjectSDK(BaseAriaBillingDTO baseAriaBillingDTO) throws Exception{
    if(baseAriaBillingDTO.getCallType().equals(CallType.REST)) {
      if(ariaBillingIntegrationRest == null) {
        ariaBillingIntegrationRest = new AriaBillingIntegrationRest(baseAriaBillingDTO);
      }
      return ariaBillingIntegrationRest;
    } else {
      if(ariaBillingIntegrationSoap == null) {
        ariaBillingIntegrationSoap = new AriaBillingIntegrationSoap(baseAriaBillingDTO);
      }
      return ariaBillingIntegrationSoap;
    }
  }

}
