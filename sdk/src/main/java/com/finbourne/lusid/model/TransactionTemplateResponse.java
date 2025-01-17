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
import com.finbourne.lusid.model.ComponentTransaction;
import com.finbourne.lusid.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * TransactionTemplateResponse
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionTemplateResponse {
  public static final String SERIALIZED_NAME_INSTRUMENT_EVENT_TYPE = "instrumentEventType";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_EVENT_TYPE)
  private String instrumentEventType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_COMPONENT_TRANSACTIONS = "componentTransactions";
  @SerializedName(SERIALIZED_NAME_COMPONENT_TRANSACTIONS)
  private List<ComponentTransaction> componentTransactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public TransactionTemplateResponse() {
  }

  public TransactionTemplateResponse instrumentEventType(String instrumentEventType) {
    
    this.instrumentEventType = instrumentEventType;
    return this;
  }

   /**
   * A value that represents the instrument event type.
   * @return instrumentEventType
  **/
  @jakarta.annotation.Nonnull
  public String getInstrumentEventType() {
    return instrumentEventType;
  }


  public void setInstrumentEventType(String instrumentEventType) {
    this.instrumentEventType = instrumentEventType;
  }


  public TransactionTemplateResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the transaction template.
   * @return description
  **/
  @jakarta.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TransactionTemplateResponse scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * The scope in which the transaction template resides.
   * @return scope
  **/
  @jakarta.annotation.Nonnull
  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public TransactionTemplateResponse componentTransactions(List<ComponentTransaction> componentTransactions) {
    
    this.componentTransactions = componentTransactions;
    return this;
  }

  public TransactionTemplateResponse addComponentTransactionsItem(ComponentTransaction componentTransactionsItem) {
    if (this.componentTransactions == null) {
      this.componentTransactions = new ArrayList<>();
    }
    this.componentTransactions.add(componentTransactionsItem);
    return this;
  }

   /**
   * A set of component transactions that relate to the template to be created.
   * @return componentTransactions
  **/
  @jakarta.annotation.Nonnull
  public List<ComponentTransaction> getComponentTransactions() {
    return componentTransactions;
  }


  public void setComponentTransactions(List<ComponentTransaction> componentTransactions) {
    this.componentTransactions = componentTransactions;
  }


  public TransactionTemplateResponse links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public TransactionTemplateResponse addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  public List<Link> getLinks() {
    return links;
  }


  public void setLinks(List<Link> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionTemplateResponse transactionTemplateResponse = (TransactionTemplateResponse) o;
    return Objects.equals(this.instrumentEventType, transactionTemplateResponse.instrumentEventType) &&
        Objects.equals(this.description, transactionTemplateResponse.description) &&
        Objects.equals(this.scope, transactionTemplateResponse.scope) &&
        Objects.equals(this.componentTransactions, transactionTemplateResponse.componentTransactions) &&
        Objects.equals(this.links, transactionTemplateResponse.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentEventType, description, scope, componentTransactions, links);
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
    sb.append("class TransactionTemplateResponse {\n");
    sb.append("    instrumentEventType: ").append(toIndentedString(instrumentEventType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    componentTransactions: ").append(toIndentedString(componentTransactions)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("instrumentEventType");
    openapiFields.add("description");
    openapiFields.add("scope");
    openapiFields.add("componentTransactions");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("instrumentEventType");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("scope");
    openapiRequiredFields.add("componentTransactions");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionTemplateResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionTemplateResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionTemplateResponse is not found in the empty JSON string", TransactionTemplateResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionTemplateResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("instrumentEventType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrumentEventType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrumentEventType").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("componentTransactions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentTransactions` to be an array in the JSON string but got `%s`", jsonObj.get("componentTransactions").toString()));
      }

      JsonArray jsonArraycomponentTransactions = jsonObj.getAsJsonArray("componentTransactions");
      // validate the required field `componentTransactions` (array)
      for (int i = 0; i < jsonArraycomponentTransactions.size(); i++) {
        ComponentTransaction.validateJsonElement(jsonArraycomponentTransactions.get(i));
      };
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            Link.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionTemplateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionTemplateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionTemplateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionTemplateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionTemplateResponse>() {
           @Override
           public void write(JsonWriter out, TransactionTemplateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionTemplateResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionTemplateResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionTemplateResponse
  * @throws IOException if the JSON string is invalid with respect to TransactionTemplateResponse
  */
  public static TransactionTemplateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionTemplateResponse.class);
  }

 /**
  * Convert an instance of TransactionTemplateResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
