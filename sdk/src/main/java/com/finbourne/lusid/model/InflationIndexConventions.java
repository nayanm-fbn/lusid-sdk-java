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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
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
 * A set of conventions that describe the conventions for an inflation index.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InflationIndexConventions {
  public static final String SERIALIZED_NAME_INFLATION_INDEX_NAME = "inflationIndexName";
  @SerializedName(SERIALIZED_NAME_INFLATION_INDEX_NAME)
  private String inflationIndexName;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_OBSERVATION_LAG = "observationLag";
  @SerializedName(SERIALIZED_NAME_OBSERVATION_LAG)
  private String observationLag;

  public static final String SERIALIZED_NAME_INFLATION_INTERPOLATION = "inflationInterpolation";
  @SerializedName(SERIALIZED_NAME_INFLATION_INTERPOLATION)
  private String inflationInterpolation;

  public static final String SERIALIZED_NAME_INFLATION_FREQUENCY = "inflationFrequency";
  @SerializedName(SERIALIZED_NAME_INFLATION_FREQUENCY)
  private String inflationFrequency;

  public static final String SERIALIZED_NAME_INFLATION_ROLL_DAY = "inflationRollDay";
  @SerializedName(SERIALIZED_NAME_INFLATION_ROLL_DAY)
  private Integer inflationRollDay;

  public InflationIndexConventions() {
  }

  public InflationIndexConventions inflationIndexName(String inflationIndexName) {
    
    this.inflationIndexName = inflationIndexName;
    return this;
  }

   /**
   * Name of the index, e.g. UKRPI.
   * @return inflationIndexName
  **/
  @jakarta.annotation.Nonnull
  public String getInflationIndexName() {
    return inflationIndexName;
  }


  public void setInflationIndexName(String inflationIndexName) {
    this.inflationIndexName = inflationIndexName;
  }


  public InflationIndexConventions currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Currency of the inflation index convention.
   * @return currency
  **/
  @jakarta.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public InflationIndexConventions observationLag(String observationLag) {
    
    this.observationLag = observationLag;
    return this;
  }

   /**
   * Observation lag. This is a string that must have units of Month.  This field is typically 3 or 4 months, but can vary, older bonds and swaps have 8 months lag.  For Bonds with a calculation type of Ratio, this property, if set, must be 0Invalid.
   * @return observationLag
  **/
  @jakarta.annotation.Nonnull
  public String getObservationLag() {
    return observationLag;
  }


  public void setObservationLag(String observationLag) {
    this.observationLag = observationLag;
  }


  public InflationIndexConventions inflationInterpolation(String inflationInterpolation) {
    
    this.inflationInterpolation = inflationInterpolation;
    return this;
  }

   /**
   * Inflation Interpolation. This is optional and defaults to Linear if not set.    Supported string (enumeration) values are: [Linear, Flat].
   * @return inflationInterpolation
  **/
  @jakarta.annotation.Nullable
  public String getInflationInterpolation() {
    return inflationInterpolation;
  }


  public void setInflationInterpolation(String inflationInterpolation) {
    this.inflationInterpolation = inflationInterpolation;
  }


  public InflationIndexConventions inflationFrequency(String inflationFrequency) {
    
    this.inflationFrequency = inflationFrequency;
    return this;
  }

   /**
   * Frequency of inflation updated. Optional and defaults to Monthly which is the most common.  However both Australian and New Zealand inflation is published Quarterly. Only tenors of 1M or 3M are supported.
   * @return inflationFrequency
  **/
  @jakarta.annotation.Nullable
  public String getInflationFrequency() {
    return inflationFrequency;
  }


  public void setInflationFrequency(String inflationFrequency) {
    this.inflationFrequency = inflationFrequency;
  }


  public InflationIndexConventions inflationRollDay(Integer inflationRollDay) {
    
    this.inflationRollDay = inflationRollDay;
    return this;
  }

   /**
   * Day of the month that inflation rolls from one month to the next. This is optional and defaults to 1, which is  the typically value for the majority of inflation bonds (exceptions include Japan which rolls on the 10th  and some LatAm bonds which roll on the 15th).
   * @return inflationRollDay
  **/
  @jakarta.annotation.Nullable
  public Integer getInflationRollDay() {
    return inflationRollDay;
  }


  public void setInflationRollDay(Integer inflationRollDay) {
    this.inflationRollDay = inflationRollDay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InflationIndexConventions inflationIndexConventions = (InflationIndexConventions) o;
    return Objects.equals(this.inflationIndexName, inflationIndexConventions.inflationIndexName) &&
        Objects.equals(this.currency, inflationIndexConventions.currency) &&
        Objects.equals(this.observationLag, inflationIndexConventions.observationLag) &&
        Objects.equals(this.inflationInterpolation, inflationIndexConventions.inflationInterpolation) &&
        Objects.equals(this.inflationFrequency, inflationIndexConventions.inflationFrequency) &&
        Objects.equals(this.inflationRollDay, inflationIndexConventions.inflationRollDay);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(inflationIndexName, currency, observationLag, inflationInterpolation, inflationFrequency, inflationRollDay);
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
    sb.append("class InflationIndexConventions {\n");
    sb.append("    inflationIndexName: ").append(toIndentedString(inflationIndexName)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    observationLag: ").append(toIndentedString(observationLag)).append("\n");
    sb.append("    inflationInterpolation: ").append(toIndentedString(inflationInterpolation)).append("\n");
    sb.append("    inflationFrequency: ").append(toIndentedString(inflationFrequency)).append("\n");
    sb.append("    inflationRollDay: ").append(toIndentedString(inflationRollDay)).append("\n");
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
    openapiFields.add("inflationIndexName");
    openapiFields.add("currency");
    openapiFields.add("observationLag");
    openapiFields.add("inflationInterpolation");
    openapiFields.add("inflationFrequency");
    openapiFields.add("inflationRollDay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("inflationIndexName");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("observationLag");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InflationIndexConventions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InflationIndexConventions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InflationIndexConventions is not found in the empty JSON string", InflationIndexConventions.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InflationIndexConventions.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("inflationIndexName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inflationIndexName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inflationIndexName").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("observationLag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `observationLag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("observationLag").toString()));
      }
      if ((jsonObj.get("inflationInterpolation") != null && !jsonObj.get("inflationInterpolation").isJsonNull()) && !jsonObj.get("inflationInterpolation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inflationInterpolation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inflationInterpolation").toString()));
      }
      if ((jsonObj.get("inflationFrequency") != null && !jsonObj.get("inflationFrequency").isJsonNull()) && !jsonObj.get("inflationFrequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inflationFrequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inflationFrequency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InflationIndexConventions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InflationIndexConventions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InflationIndexConventions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InflationIndexConventions.class));

       return (TypeAdapter<T>) new TypeAdapter<InflationIndexConventions>() {
           @Override
           public void write(JsonWriter out, InflationIndexConventions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InflationIndexConventions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InflationIndexConventions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InflationIndexConventions
  * @throws IOException if the JSON string is invalid with respect to InflationIndexConventions
  */
  public static InflationIndexConventions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InflationIndexConventions.class);
  }

 /**
  * Convert an instance of InflationIndexConventions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
