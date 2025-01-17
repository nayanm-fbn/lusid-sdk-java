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
import com.finbourne.lusid.model.ExDividendConfiguration;
import com.finbourne.lusid.model.FlowConventionName;
import com.finbourne.lusid.model.FlowConventions;
import com.finbourne.lusid.model.Schedule;
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
 * Schedule for fixed coupon payments
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FixedSchedule extends Schedule {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_MATURITY_DATE = "maturityDate";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private OffsetDateTime maturityDate;

  public static final String SERIALIZED_NAME_FLOW_CONVENTIONS = "flowConventions";
  @SerializedName(SERIALIZED_NAME_FLOW_CONVENTIONS)
  private FlowConventions flowConventions;

  public static final String SERIALIZED_NAME_COUPON_RATE = "couponRate";
  @SerializedName(SERIALIZED_NAME_COUPON_RATE)
  private java.math.BigDecimal couponRate;

  public static final String SERIALIZED_NAME_CONVENTION_NAME = "conventionName";
  @SerializedName(SERIALIZED_NAME_CONVENTION_NAME)
  private FlowConventionName conventionName;

  public static final String SERIALIZED_NAME_EX_DIVIDEND_DAYS = "exDividendDays";
  @SerializedName(SERIALIZED_NAME_EX_DIVIDEND_DAYS)
  private Integer exDividendDays;

  public static final String SERIALIZED_NAME_NOTIONAL = "notional";
  @SerializedName(SERIALIZED_NAME_NOTIONAL)
  private java.math.BigDecimal notional;

  public static final String SERIALIZED_NAME_PAYMENT_CURRENCY = "paymentCurrency";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CURRENCY)
  private String paymentCurrency;

  public static final String SERIALIZED_NAME_STUB_TYPE = "stubType";
  @SerializedName(SERIALIZED_NAME_STUB_TYPE)
  private String stubType;

  public static final String SERIALIZED_NAME_EX_DIVIDEND_CONFIGURATION = "exDividendConfiguration";
  @SerializedName(SERIALIZED_NAME_EX_DIVIDEND_CONFIGURATION)
  private ExDividendConfiguration exDividendConfiguration;

  public FixedSchedule() {
    // this.scheduleType = this.getClass().getSimpleName();
  }

  public FixedSchedule startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Date to start generate from
   * @return startDate
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public FixedSchedule maturityDate(OffsetDateTime maturityDate) {
    
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * Date to generate to
   * @return maturityDate
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getMaturityDate() {
    return maturityDate;
  }


  public void setMaturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
  }


  public FixedSchedule flowConventions(FlowConventions flowConventions) {
    
    this.flowConventions = flowConventions;
    return this;
  }

   /**
   * Get flowConventions
   * @return flowConventions
  **/
  @jakarta.annotation.Nullable
  public FlowConventions getFlowConventions() {
    return flowConventions;
  }


  public void setFlowConventions(FlowConventions flowConventions) {
    this.flowConventions = flowConventions;
  }


  public FixedSchedule couponRate(java.math.BigDecimal couponRate) {
    
    this.couponRate = couponRate;
    return this;
  }

   /**
   * Coupon rate given as a fraction.
   * @return couponRate
  **/
  @jakarta.annotation.Nullable
  public java.math.BigDecimal getCouponRate() {
    return couponRate;
  }


  public void setCouponRate(java.math.BigDecimal couponRate) {
    this.couponRate = couponRate;
  }


  public FixedSchedule conventionName(FlowConventionName conventionName) {
    
    this.conventionName = conventionName;
    return this;
  }

   /**
   * Get conventionName
   * @return conventionName
  **/
  @jakarta.annotation.Nullable
  public FlowConventionName getConventionName() {
    return conventionName;
  }


  public void setConventionName(FlowConventionName conventionName) {
    this.conventionName = conventionName;
  }


  public FixedSchedule exDividendDays(Integer exDividendDays) {
    
    this.exDividendDays = exDividendDays;
    return this;
  }

   /**
   * Optional. Number of calendar days in the ex-dividend period.  If the settlement date falls in the ex-dividend period then the coupon paid is zero and the accrued interest is negative.  If set, this must be a non-negative number.  If not set, or set to 0, then there is no ex-dividend period.     NOTE: This field is deprecated. If you wish to set the ExDividendDays on a bond, please use the ExDividendConfiguration.
   * @return exDividendDays
  **/
  @jakarta.annotation.Nullable
  public Integer getExDividendDays() {
    return exDividendDays;
  }


  public void setExDividendDays(Integer exDividendDays) {
    this.exDividendDays = exDividendDays;
  }


  public FixedSchedule notional(java.math.BigDecimal notional) {
    
    this.notional = notional;
    return this;
  }

   /**
   * Scaling factor, the quantity outstanding on which the rate will be paid.
   * @return notional
  **/
  @jakarta.annotation.Nullable
  public java.math.BigDecimal getNotional() {
    return notional;
  }


  public void setNotional(java.math.BigDecimal notional) {
    this.notional = notional;
  }


  public FixedSchedule paymentCurrency(String paymentCurrency) {
    
    this.paymentCurrency = paymentCurrency;
    return this;
  }

   /**
   * Payment currency. This does not have to be the same as the nominal bond or observation/reset currency.
   * @return paymentCurrency
  **/
  @jakarta.annotation.Nullable
  public String getPaymentCurrency() {
    return paymentCurrency;
  }


  public void setPaymentCurrency(String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
  }


  public FixedSchedule stubType(String stubType) {
    
    this.stubType = stubType;
    return this;
  }

   /**
   * StubType required of the schedule    Supported string (enumeration) values are: [ShortFront, ShortBack, LongBack, LongFront, Both].
   * @return stubType
  **/
  @jakarta.annotation.Nullable
  public String getStubType() {
    return stubType;
  }


  public void setStubType(String stubType) {
    this.stubType = stubType;
  }


  public FixedSchedule exDividendConfiguration(ExDividendConfiguration exDividendConfiguration) {
    
    this.exDividendConfiguration = exDividendConfiguration;
    return this;
  }

   /**
   * Get exDividendConfiguration
   * @return exDividendConfiguration
  **/
  @jakarta.annotation.Nullable
  public ExDividendConfiguration getExDividendConfiguration() {
    return exDividendConfiguration;
  }


  public void setExDividendConfiguration(ExDividendConfiguration exDividendConfiguration) {
    this.exDividendConfiguration = exDividendConfiguration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FixedSchedule fixedSchedule = (FixedSchedule) o;
    return Objects.equals(this.startDate, fixedSchedule.startDate) &&
        Objects.equals(this.maturityDate, fixedSchedule.maturityDate) &&
        Objects.equals(this.flowConventions, fixedSchedule.flowConventions) &&
        (this.couponRate.compareTo(fixedSchedule.getCouponRate()) == 0) &&
        Objects.equals(this.conventionName, fixedSchedule.conventionName) &&
        Objects.equals(this.exDividendDays, fixedSchedule.exDividendDays) &&
        (this.notional.compareTo(fixedSchedule.getNotional()) == 0) &&
        Objects.equals(this.paymentCurrency, fixedSchedule.paymentCurrency) &&
        Objects.equals(this.stubType, fixedSchedule.stubType) &&
        Objects.equals(this.exDividendConfiguration, fixedSchedule.exDividendConfiguration) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, maturityDate, flowConventions, couponRate, conventionName, exDividendDays, notional, paymentCurrency, stubType, exDividendConfiguration, super.hashCode());
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
    sb.append("class FixedSchedule {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    flowConventions: ").append(toIndentedString(flowConventions)).append("\n");
    sb.append("    couponRate: ").append(toIndentedString(couponRate)).append("\n");
    sb.append("    conventionName: ").append(toIndentedString(conventionName)).append("\n");
    sb.append("    exDividendDays: ").append(toIndentedString(exDividendDays)).append("\n");
    sb.append("    notional: ").append(toIndentedString(notional)).append("\n");
    sb.append("    paymentCurrency: ").append(toIndentedString(paymentCurrency)).append("\n");
    sb.append("    stubType: ").append(toIndentedString(stubType)).append("\n");
    sb.append("    exDividendConfiguration: ").append(toIndentedString(exDividendConfiguration)).append("\n");
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
    openapiFields.add("scheduleType");
    openapiFields.add("startDate");
    openapiFields.add("maturityDate");
    openapiFields.add("flowConventions");
    openapiFields.add("couponRate");
    openapiFields.add("conventionName");
    openapiFields.add("exDividendDays");
    openapiFields.add("notional");
    openapiFields.add("paymentCurrency");
    openapiFields.add("stubType");
    openapiFields.add("exDividendConfiguration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("maturityDate");
    openapiRequiredFields.add("scheduleType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FixedSchedule
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FixedSchedule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FixedSchedule is not found in the empty JSON string", FixedSchedule.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FixedSchedule.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FixedSchedule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FixedSchedule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FixedSchedule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FixedSchedule.class));

       return (TypeAdapter<T>) new TypeAdapter<FixedSchedule>() {
           @Override
           public void write(JsonWriter out, FixedSchedule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FixedSchedule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FixedSchedule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FixedSchedule
  * @throws IOException if the JSON string is invalid with respect to FixedSchedule
  */
  public static FixedSchedule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FixedSchedule.class);
  }

 /**
  * Convert an instance of FixedSchedule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
