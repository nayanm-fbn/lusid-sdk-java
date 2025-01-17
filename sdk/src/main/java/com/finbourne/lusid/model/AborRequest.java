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
import com.finbourne.lusid.model.PortfolioEntityId;
import com.finbourne.lusid.model.Property;
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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * The request used to create an Abor.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AborRequest {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PORTFOLIO_IDS = "portfolioIds";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_IDS)
  private List<PortfolioEntityId> portfolioIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_ABOR_CONFIGURATION_ID = "aborConfigurationId";
  @SerializedName(SERIALIZED_NAME_ABOR_CONFIGURATION_ID)
  private ResourceId aborConfigurationId;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Property> properties;

  public AborRequest() {
  }

  public AborRequest code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The code given for the Abor.
   * @return code
  **/
  @jakarta.annotation.Nonnull
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public AborRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the Abor.
   * @return displayName
  **/
  @jakarta.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public AborRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description for the Abor.
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AborRequest portfolioIds(List<PortfolioEntityId> portfolioIds) {
    
    this.portfolioIds = portfolioIds;
    return this;
  }

  public AborRequest addPortfolioIdsItem(PortfolioEntityId portfolioIdsItem) {
    if (this.portfolioIds == null) {
      this.portfolioIds = new ArrayList<>();
    }
    this.portfolioIds.add(portfolioIdsItem);
    return this;
  }

   /**
   * The list with the portfolio ids which are part of the Abor.
   * @return portfolioIds
  **/
  @jakarta.annotation.Nonnull
  public List<PortfolioEntityId> getPortfolioIds() {
    return portfolioIds;
  }


  public void setPortfolioIds(List<PortfolioEntityId> portfolioIds) {
    this.portfolioIds = portfolioIds;
  }


  public AborRequest aborConfigurationId(ResourceId aborConfigurationId) {
    
    this.aborConfigurationId = aborConfigurationId;
    return this;
  }

   /**
   * Get aborConfigurationId
   * @return aborConfigurationId
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getAborConfigurationId() {
    return aborConfigurationId;
  }


  public void setAborConfigurationId(ResourceId aborConfigurationId) {
    this.aborConfigurationId = aborConfigurationId;
  }


  public AborRequest properties(Map<String, Property> properties) {
    
    this.properties = properties;
    return this;
  }

  public AborRequest putPropertiesItem(String key, Property propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * A set of properties for the Abor.
   * @return properties
  **/
  @jakarta.annotation.Nullable
  public Map<String, Property> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, Property> properties) {
    this.properties = properties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AborRequest aborRequest = (AborRequest) o;
    return Objects.equals(this.code, aborRequest.code) &&
        Objects.equals(this.displayName, aborRequest.displayName) &&
        Objects.equals(this.description, aborRequest.description) &&
        Objects.equals(this.portfolioIds, aborRequest.portfolioIds) &&
        Objects.equals(this.aborConfigurationId, aborRequest.aborConfigurationId) &&
        Objects.equals(this.properties, aborRequest.properties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, displayName, description, portfolioIds, aborConfigurationId, properties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AborRequest {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    portfolioIds: ").append(toIndentedString(portfolioIds)).append("\n");
    sb.append("    aborConfigurationId: ").append(toIndentedString(aborConfigurationId)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("displayName");
    openapiFields.add("description");
    openapiFields.add("portfolioIds");
    openapiFields.add("aborConfigurationId");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("portfolioIds");
    openapiRequiredFields.add("aborConfigurationId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AborRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AborRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AborRequest is not found in the empty JSON string", AborRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AborRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("portfolioIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `portfolioIds` to be an array in the JSON string but got `%s`", jsonObj.get("portfolioIds").toString()));
      }

      JsonArray jsonArrayportfolioIds = jsonObj.getAsJsonArray("portfolioIds");
      // validate the required field `portfolioIds` (array)
      for (int i = 0; i < jsonArrayportfolioIds.size(); i++) {
        PortfolioEntityId.validateJsonElement(jsonArrayportfolioIds.get(i));
      };
      // validate the required field `aborConfigurationId`
      ResourceId.validateJsonElement(jsonObj.get("aborConfigurationId"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AborRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AborRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AborRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AborRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AborRequest>() {
           @Override
           public void write(JsonWriter out, AborRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AborRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AborRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AborRequest
  * @throws IOException if the JSON string is invalid with respect to AborRequest
  */
  public static AborRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AborRequest.class);
  }

 /**
  * Convert an instance of AborRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
