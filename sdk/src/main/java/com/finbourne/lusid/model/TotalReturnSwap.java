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
import com.finbourne.lusid.model.AssetLeg;
import com.finbourne.lusid.model.InstrumentLeg;
import com.finbourne.lusid.model.LusidInstrument;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

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
 * A swap in which one party makes payments based on leg rates (fixed or floating) while the other party makes payments based on the return of an underlying instrument.  The underlying instrument can be provided as an inline economic definition or as a reference instrument pointing to an already upserted instrument.  A reference instrument in this case would consist of instrument scope, instrument id and instrument id type (ISIN, LUID etc.).     This instrument has multiple legs, to see how legs are used in LUSID see https://support.lusid.com/knowledgebase/article/KA-02252.     | Leg Index | Leg Identifier | Description |  | --------- | -------------- | ----------- |  | 1 | AssetLeg | Cash flows relating to the returns generated by an underlying bond. |  | 2 | FundingLeg | The funding leg of the swap. |
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TotalReturnSwap extends LusidInstrument {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_MATURITY_DATE = "maturityDate";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private OffsetDateTime maturityDate;

  public static final String SERIALIZED_NAME_ASSET_LEG = "assetLeg";
  @SerializedName(SERIALIZED_NAME_ASSET_LEG)
  private AssetLeg assetLeg;

  public static final String SERIALIZED_NAME_FUNDING_LEG = "fundingLeg";
  @SerializedName(SERIALIZED_NAME_FUNDING_LEG)
  private InstrumentLeg fundingLeg;

  public TotalReturnSwap() {
    // this.instrumentType = this.getClass().getSimpleName();
  }

  public TotalReturnSwap startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the instrument. This is normally synonymous with the trade-date.
   * @return startDate
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public TotalReturnSwap maturityDate(OffsetDateTime maturityDate) {
    
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it.
   * @return maturityDate
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getMaturityDate() {
    return maturityDate;
  }


  public void setMaturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
  }


  public TotalReturnSwap assetLeg(AssetLeg assetLeg) {
    
    this.assetLeg = assetLeg;
    return this;
  }

   /**
   * Get assetLeg
   * @return assetLeg
  **/
  @jakarta.annotation.Nonnull
  public AssetLeg getAssetLeg() {
    return assetLeg;
  }


  public void setAssetLeg(AssetLeg assetLeg) {
    this.assetLeg = assetLeg;
  }


  public TotalReturnSwap fundingLeg(InstrumentLeg fundingLeg) {
    
    this.fundingLeg = fundingLeg;
    return this;
  }

   /**
   * Get fundingLeg
   * @return fundingLeg
  **/
  @jakarta.annotation.Nonnull
  public InstrumentLeg getFundingLeg() {
    return fundingLeg;
  }


  public void setFundingLeg(InstrumentLeg fundingLeg) {
    this.fundingLeg = fundingLeg;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalReturnSwap totalReturnSwap = (TotalReturnSwap) o;
    return Objects.equals(this.startDate, totalReturnSwap.startDate) &&
        Objects.equals(this.maturityDate, totalReturnSwap.maturityDate) &&
        Objects.equals(this.assetLeg, totalReturnSwap.assetLeg) &&
        Objects.equals(this.fundingLeg, totalReturnSwap.fundingLeg) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, maturityDate, assetLeg, fundingLeg, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalReturnSwap {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    assetLeg: ").append(toIndentedString(assetLeg)).append("\n");
    sb.append("    fundingLeg: ").append(toIndentedString(fundingLeg)).append("\n");
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
    openapiFields.add("instrumentType");
    openapiFields.add("startDate");
    openapiFields.add("maturityDate");
    openapiFields.add("assetLeg");
    openapiFields.add("fundingLeg");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("maturityDate");
    openapiRequiredFields.add("assetLeg");
    openapiRequiredFields.add("fundingLeg");
    openapiRequiredFields.add("instrumentType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TotalReturnSwap
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TotalReturnSwap.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TotalReturnSwap is not found in the empty JSON string", TotalReturnSwap.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TotalReturnSwap.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TotalReturnSwap.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TotalReturnSwap' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TotalReturnSwap> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TotalReturnSwap.class));

       return (TypeAdapter<T>) new TypeAdapter<TotalReturnSwap>() {
           @Override
           public void write(JsonWriter out, TotalReturnSwap value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TotalReturnSwap read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TotalReturnSwap given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TotalReturnSwap
  * @throws IOException if the JSON string is invalid with respect to TotalReturnSwap
  */
  public static TotalReturnSwap fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TotalReturnSwap.class);
  }

 /**
  * Convert an instance of TotalReturnSwap to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
