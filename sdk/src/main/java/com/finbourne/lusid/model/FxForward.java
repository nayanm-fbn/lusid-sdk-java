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
import com.finbourne.lusid.model.LusidInstrument;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * LUSID representation of an FX Forward.  Including FX Spot and Non-Deliverable Forwards.     This instrument has multiple legs, to see how legs are used in LUSID see https://support.lusid.com/knowledgebase/article/KA-02252.     | Leg Index | Leg Identifier | Description |  | --------- | -------------- | ----------- |  | 1 | DomesticLeg | Cash flows in the domestic currency of the forward. |  | 2 | ForeignLeg | Cash flows in the foreign currency of the forward (not present for non-deliverable forwards). |
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FxForward extends LusidInstrument {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_MATURITY_DATE = "maturityDate";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private OffsetDateTime maturityDate;

  public static final String SERIALIZED_NAME_DOM_AMOUNT = "domAmount";
  @SerializedName(SERIALIZED_NAME_DOM_AMOUNT)
  private java.math.BigDecimal domAmount;

  public static final String SERIALIZED_NAME_DOM_CCY = "domCcy";
  @SerializedName(SERIALIZED_NAME_DOM_CCY)
  private String domCcy;

  public static final String SERIALIZED_NAME_FGN_AMOUNT = "fgnAmount";
  @SerializedName(SERIALIZED_NAME_FGN_AMOUNT)
  private java.math.BigDecimal fgnAmount;

  public static final String SERIALIZED_NAME_FGN_CCY = "fgnCcy";
  @SerializedName(SERIALIZED_NAME_FGN_CCY)
  private String fgnCcy;

  public static final String SERIALIZED_NAME_REF_SPOT_RATE = "refSpotRate";
  @SerializedName(SERIALIZED_NAME_REF_SPOT_RATE)
  private java.math.BigDecimal refSpotRate;

  public static final String SERIALIZED_NAME_IS_NDF = "isNdf";
  @SerializedName(SERIALIZED_NAME_IS_NDF)
  private Boolean isNdf;

  public static final String SERIALIZED_NAME_FIXING_DATE = "fixingDate";
  @SerializedName(SERIALIZED_NAME_FIXING_DATE)
  private OffsetDateTime fixingDate;

  public static final String SERIALIZED_NAME_SETTLEMENT_CCY = "settlementCcy";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_CCY)
  private String settlementCcy;

  public FxForward() {
    // this.instrumentType = this.getClass().getSimpleName();
  }

  public FxForward startDate(OffsetDateTime startDate) {
    
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


  public FxForward maturityDate(OffsetDateTime maturityDate) {
    
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


  public FxForward domAmount(java.math.BigDecimal domAmount) {
    
    this.domAmount = domAmount;
    return this;
  }

   /**
   * The amount that is to be paid in the domestic currency on the maturity date.
   * @return domAmount
  **/
  @jakarta.annotation.Nonnull
  public java.math.BigDecimal getDomAmount() {
    return domAmount;
  }


  public void setDomAmount(java.math.BigDecimal domAmount) {
    this.domAmount = domAmount;
  }


  public FxForward domCcy(String domCcy) {
    
    this.domCcy = domCcy;
    return this;
  }

   /**
   * The domestic currency of the instrument.
   * @return domCcy
  **/
  @jakarta.annotation.Nonnull
  public String getDomCcy() {
    return domCcy;
  }


  public void setDomCcy(String domCcy) {
    this.domCcy = domCcy;
  }


  public FxForward fgnAmount(java.math.BigDecimal fgnAmount) {
    
    this.fgnAmount = fgnAmount;
    return this;
  }

   /**
   * The amount that is to be paid in the foreign currency on the maturity date.
   * @return fgnAmount
  **/
  @jakarta.annotation.Nonnull
  public java.math.BigDecimal getFgnAmount() {
    return fgnAmount;
  }


  public void setFgnAmount(java.math.BigDecimal fgnAmount) {
    this.fgnAmount = fgnAmount;
  }


  public FxForward fgnCcy(String fgnCcy) {
    
    this.fgnCcy = fgnCcy;
    return this;
  }

   /**
   * The foreign (other) currency of the instrument. In the NDF case, only payments are made in the domestic currency.  For the outright forward, currencies are exchanged. By domestic is then that of the portfolio.
   * @return fgnCcy
  **/
  @jakarta.annotation.Nonnull
  public String getFgnCcy() {
    return fgnCcy;
  }


  public void setFgnCcy(String fgnCcy) {
    this.fgnCcy = fgnCcy;
  }


  public FxForward refSpotRate(java.math.BigDecimal refSpotRate) {
    
    this.refSpotRate = refSpotRate;
    return this;
  }

   /**
   * The reference Fx Spot rate for currency pair Foreign-Domestic that was seen on the trade start date (time).
   * @return refSpotRate
  **/
  @jakarta.annotation.Nullable
  public java.math.BigDecimal getRefSpotRate() {
    return refSpotRate;
  }


  public void setRefSpotRate(java.math.BigDecimal refSpotRate) {
    this.refSpotRate = refSpotRate;
  }


  public FxForward isNdf(Boolean isNdf) {
    
    this.isNdf = isNdf;
    return this;
  }

   /**
   * Is the contract an Fx-Forward of \&quot;Non-Deliverable\&quot; type, meaning a single payment in the domestic currency based on the change in fx-rate vs  a reference rate is used.
   * @return isNdf
  **/
  @jakarta.annotation.Nullable
  public Boolean getIsNdf() {
    return isNdf;
  }


  public void setIsNdf(Boolean isNdf) {
    this.isNdf = isNdf;
  }


  public FxForward fixingDate(OffsetDateTime fixingDate) {
    
    this.fixingDate = fixingDate;
    return this;
  }

   /**
   * The fixing date.
   * @return fixingDate
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getFixingDate() {
    return fixingDate;
  }


  public void setFixingDate(OffsetDateTime fixingDate) {
    this.fixingDate = fixingDate;
  }


  public FxForward settlementCcy(String settlementCcy) {
    
    this.settlementCcy = settlementCcy;
    return this;
  }

   /**
   * The settlement currency.  If provided, present value will be calculated in settlement currency, otherwise the domestic currency. Applies only to non-deliverable FX Forwards.
   * @return settlementCcy
  **/
  @jakarta.annotation.Nullable
  public String getSettlementCcy() {
    return settlementCcy;
  }


  public void setSettlementCcy(String settlementCcy) {
    this.settlementCcy = settlementCcy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FxForward fxForward = (FxForward) o;
    return Objects.equals(this.startDate, fxForward.startDate) &&
        Objects.equals(this.maturityDate, fxForward.maturityDate) &&
        (this.domAmount.compareTo(fxForward.getDomAmount()) == 0) &&
        Objects.equals(this.domCcy, fxForward.domCcy) &&
        (this.fgnAmount.compareTo(fxForward.getFgnAmount()) == 0) &&
        Objects.equals(this.fgnCcy, fxForward.fgnCcy) &&
        (this.refSpotRate.compareTo(fxForward.getRefSpotRate()) == 0) &&
        Objects.equals(this.isNdf, fxForward.isNdf) &&
        Objects.equals(this.fixingDate, fxForward.fixingDate) &&
        Objects.equals(this.settlementCcy, fxForward.settlementCcy) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, maturityDate, domAmount, domCcy, fgnAmount, fgnCcy, refSpotRate, isNdf, fixingDate, settlementCcy, super.hashCode());
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
    sb.append("class FxForward {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    domAmount: ").append(toIndentedString(domAmount)).append("\n");
    sb.append("    domCcy: ").append(toIndentedString(domCcy)).append("\n");
    sb.append("    fgnAmount: ").append(toIndentedString(fgnAmount)).append("\n");
    sb.append("    fgnCcy: ").append(toIndentedString(fgnCcy)).append("\n");
    sb.append("    refSpotRate: ").append(toIndentedString(refSpotRate)).append("\n");
    sb.append("    isNdf: ").append(toIndentedString(isNdf)).append("\n");
    sb.append("    fixingDate: ").append(toIndentedString(fixingDate)).append("\n");
    sb.append("    settlementCcy: ").append(toIndentedString(settlementCcy)).append("\n");
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
    openapiFields.add("domAmount");
    openapiFields.add("domCcy");
    openapiFields.add("fgnAmount");
    openapiFields.add("fgnCcy");
    openapiFields.add("refSpotRate");
    openapiFields.add("isNdf");
    openapiFields.add("fixingDate");
    openapiFields.add("settlementCcy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("maturityDate");
    openapiRequiredFields.add("domAmount");
    openapiRequiredFields.add("domCcy");
    openapiRequiredFields.add("fgnAmount");
    openapiRequiredFields.add("fgnCcy");
    openapiRequiredFields.add("instrumentType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FxForward
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FxForward.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FxForward is not found in the empty JSON string", FxForward.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FxForward.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FxForward.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FxForward' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FxForward> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FxForward.class));

       return (TypeAdapter<T>) new TypeAdapter<FxForward>() {
           @Override
           public void write(JsonWriter out, FxForward value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FxForward read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FxForward given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FxForward
  * @throws IOException if the JSON string is invalid with respect to FxForward
  */
  public static FxForward fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FxForward.class);
  }

 /**
  * Convert an instance of FxForward to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
