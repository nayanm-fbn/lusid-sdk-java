/*
 * LUSID API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.lusid.model;

import java.util.Objects;
import com.finbourne.lusid.model.ComplianceRuleBreakdown;
import com.finbourne.lusid.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.finbourne.lusid.JSON;

/**
 * ComplianceSummaryRuleResult
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ComplianceSummaryRuleResult {
  public static final String SERIALIZED_NAME_RULE_ID = "ruleId";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private ResourceId ruleId;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private ResourceId templateId;

  public static final String SERIALIZED_NAME_VARIATION = "variation";
  @SerializedName(SERIALIZED_NAME_VARIATION)
  private String variation;

  public static final String SERIALIZED_NAME_RULE_STATUS = "ruleStatus";
  @SerializedName(SERIALIZED_NAME_RULE_STATUS)
  private String ruleStatus;

  public static final String SERIALIZED_NAME_AFFECTED_PORTFOLIOS = "affectedPortfolios";
  @SerializedName(SERIALIZED_NAME_AFFECTED_PORTFOLIOS)
  private List<ResourceId> affectedPortfolios = new ArrayList<>();

  public static final String SERIALIZED_NAME_AFFECTED_ORDERS = "affectedOrders";
  @SerializedName(SERIALIZED_NAME_AFFECTED_ORDERS)
  private List<ResourceId> affectedOrders = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARAMETERS_USED = "parametersUsed";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_USED)
  private Map<String, String> parametersUsed = new HashMap<>();

  public static final String SERIALIZED_NAME_RULE_BREAKDOWN = "ruleBreakdown";
  @SerializedName(SERIALIZED_NAME_RULE_BREAKDOWN)
  private Map<String, ComplianceRuleBreakdown> ruleBreakdown = new HashMap<>();

  public ComplianceSummaryRuleResult() {
  }

  public ComplianceSummaryRuleResult ruleId(ResourceId ruleId) {
    
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Get ruleId
   * @return ruleId
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getRuleId() {
    return ruleId;
  }


  public void setRuleId(ResourceId ruleId) {
    this.ruleId = ruleId;
  }


  public ComplianceSummaryRuleResult templateId(ResourceId templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getTemplateId() {
    return templateId;
  }


  public void setTemplateId(ResourceId templateId) {
    this.templateId = templateId;
  }


  public ComplianceSummaryRuleResult variation(String variation) {
    
    this.variation = variation;
    return this;
  }

   /**
   * Get variation
   * @return variation
  **/
  @jakarta.annotation.Nonnull
  public String getVariation() {
    return variation;
  }


  public void setVariation(String variation) {
    this.variation = variation;
  }


  public ComplianceSummaryRuleResult ruleStatus(String ruleStatus) {
    
    this.ruleStatus = ruleStatus;
    return this;
  }

   /**
   * Get ruleStatus
   * @return ruleStatus
  **/
  @jakarta.annotation.Nonnull
  public String getRuleStatus() {
    return ruleStatus;
  }


  public void setRuleStatus(String ruleStatus) {
    this.ruleStatus = ruleStatus;
  }


  public ComplianceSummaryRuleResult affectedPortfolios(List<ResourceId> affectedPortfolios) {
    
    this.affectedPortfolios = affectedPortfolios;
    return this;
  }

  public ComplianceSummaryRuleResult addAffectedPortfoliosItem(ResourceId affectedPortfoliosItem) {
    if (this.affectedPortfolios == null) {
      this.affectedPortfolios = new ArrayList<>();
    }
    this.affectedPortfolios.add(affectedPortfoliosItem);
    return this;
  }

   /**
   * Get affectedPortfolios
   * @return affectedPortfolios
  **/
  @jakarta.annotation.Nonnull
  public List<ResourceId> getAffectedPortfolios() {
    return affectedPortfolios;
  }


  public void setAffectedPortfolios(List<ResourceId> affectedPortfolios) {
    this.affectedPortfolios = affectedPortfolios;
  }


  public ComplianceSummaryRuleResult affectedOrders(List<ResourceId> affectedOrders) {
    
    this.affectedOrders = affectedOrders;
    return this;
  }

  public ComplianceSummaryRuleResult addAffectedOrdersItem(ResourceId affectedOrdersItem) {
    if (this.affectedOrders == null) {
      this.affectedOrders = new ArrayList<>();
    }
    this.affectedOrders.add(affectedOrdersItem);
    return this;
  }

   /**
   * Get affectedOrders
   * @return affectedOrders
  **/
  @jakarta.annotation.Nonnull
  public List<ResourceId> getAffectedOrders() {
    return affectedOrders;
  }


  public void setAffectedOrders(List<ResourceId> affectedOrders) {
    this.affectedOrders = affectedOrders;
  }


  public ComplianceSummaryRuleResult parametersUsed(Map<String, String> parametersUsed) {
    
    this.parametersUsed = parametersUsed;
    return this;
  }

  public ComplianceSummaryRuleResult putParametersUsedItem(String key, String parametersUsedItem) {
    if (this.parametersUsed == null) {
      this.parametersUsed = new HashMap<>();
    }
    this.parametersUsed.put(key, parametersUsedItem);
    return this;
  }

   /**
   * Get parametersUsed
   * @return parametersUsed
  **/
  @jakarta.annotation.Nonnull
  public Map<String, String> getParametersUsed() {
    return parametersUsed;
  }


  public void setParametersUsed(Map<String, String> parametersUsed) {
    this.parametersUsed = parametersUsed;
  }


  public ComplianceSummaryRuleResult ruleBreakdown(Map<String, ComplianceRuleBreakdown> ruleBreakdown) {
    
    this.ruleBreakdown = ruleBreakdown;
    return this;
  }

  public ComplianceSummaryRuleResult putRuleBreakdownItem(String key, ComplianceRuleBreakdown ruleBreakdownItem) {
    if (this.ruleBreakdown == null) {
      this.ruleBreakdown = new HashMap<>();
    }
    this.ruleBreakdown.put(key, ruleBreakdownItem);
    return this;
  }

   /**
   * Get ruleBreakdown
   * @return ruleBreakdown
  **/
  @jakarta.annotation.Nonnull
  public Map<String, ComplianceRuleBreakdown> getRuleBreakdown() {
    return ruleBreakdown;
  }


  public void setRuleBreakdown(Map<String, ComplianceRuleBreakdown> ruleBreakdown) {
    this.ruleBreakdown = ruleBreakdown;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplianceSummaryRuleResult complianceSummaryRuleResult = (ComplianceSummaryRuleResult) o;
    return Objects.equals(this.ruleId, complianceSummaryRuleResult.ruleId) &&
        Objects.equals(this.templateId, complianceSummaryRuleResult.templateId) &&
        Objects.equals(this.variation, complianceSummaryRuleResult.variation) &&
        Objects.equals(this.ruleStatus, complianceSummaryRuleResult.ruleStatus) &&
        Objects.equals(this.affectedPortfolios, complianceSummaryRuleResult.affectedPortfolios) &&
        Objects.equals(this.affectedOrders, complianceSummaryRuleResult.affectedOrders) &&
        Objects.equals(this.parametersUsed, complianceSummaryRuleResult.parametersUsed) &&
        Objects.equals(this.ruleBreakdown, complianceSummaryRuleResult.ruleBreakdown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, templateId, variation, ruleStatus, affectedPortfolios, affectedOrders, parametersUsed, ruleBreakdown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplianceSummaryRuleResult {\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    variation: ").append(toIndentedString(variation)).append("\n");
    sb.append("    ruleStatus: ").append(toIndentedString(ruleStatus)).append("\n");
    sb.append("    affectedPortfolios: ").append(toIndentedString(affectedPortfolios)).append("\n");
    sb.append("    affectedOrders: ").append(toIndentedString(affectedOrders)).append("\n");
    sb.append("    parametersUsed: ").append(toIndentedString(parametersUsed)).append("\n");
    sb.append("    ruleBreakdown: ").append(toIndentedString(ruleBreakdown)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ruleId");
    openapiFields.add("templateId");
    openapiFields.add("variation");
    openapiFields.add("ruleStatus");
    openapiFields.add("affectedPortfolios");
    openapiFields.add("affectedOrders");
    openapiFields.add("parametersUsed");
    openapiFields.add("ruleBreakdown");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ruleId");
    openapiRequiredFields.add("templateId");
    openapiRequiredFields.add("variation");
    openapiRequiredFields.add("ruleStatus");
    openapiRequiredFields.add("affectedPortfolios");
    openapiRequiredFields.add("affectedOrders");
    openapiRequiredFields.add("parametersUsed");
    openapiRequiredFields.add("ruleBreakdown");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ComplianceSummaryRuleResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ComplianceSummaryRuleResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ComplianceSummaryRuleResult is not found in the empty JSON string", ComplianceSummaryRuleResult.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ComplianceSummaryRuleResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ruleId`
      ResourceId.validateJsonElement(jsonObj.get("ruleId"));
      // validate the required field `templateId`
      ResourceId.validateJsonElement(jsonObj.get("templateId"));
      if (!jsonObj.get("variation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variation").toString()));
      }
      if (!jsonObj.get("ruleStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleStatus").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("affectedPortfolios").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `affectedPortfolios` to be an array in the JSON string but got `%s`", jsonObj.get("affectedPortfolios").toString()));
      }

      JsonArray jsonArrayaffectedPortfolios = jsonObj.getAsJsonArray("affectedPortfolios");
      // validate the required field `affectedPortfolios` (array)
      for (int i = 0; i < jsonArrayaffectedPortfolios.size(); i++) {
        ResourceId.validateJsonElement(jsonArrayaffectedPortfolios.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("affectedOrders").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `affectedOrders` to be an array in the JSON string but got `%s`", jsonObj.get("affectedOrders").toString()));
      }

      JsonArray jsonArrayaffectedOrders = jsonObj.getAsJsonArray("affectedOrders");
      // validate the required field `affectedOrders` (array)
      for (int i = 0; i < jsonArrayaffectedOrders.size(); i++) {
        ResourceId.validateJsonElement(jsonArrayaffectedOrders.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ComplianceSummaryRuleResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ComplianceSummaryRuleResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ComplianceSummaryRuleResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ComplianceSummaryRuleResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ComplianceSummaryRuleResult>() {
           @Override
           public void write(JsonWriter out, ComplianceSummaryRuleResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ComplianceSummaryRuleResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ComplianceSummaryRuleResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ComplianceSummaryRuleResult
  * @throws IOException if the JSON string is invalid with respect to ComplianceSummaryRuleResult
  */
  public static ComplianceSummaryRuleResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ComplianceSummaryRuleResult.class);
  }

 /**
  * Convert an instance of ComplianceSummaryRuleResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
