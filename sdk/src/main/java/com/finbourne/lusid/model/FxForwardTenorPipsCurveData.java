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
import com.finbourne.lusid.model.ComplexMarketData;
import com.finbourne.lusid.model.FxTenorConvention;
import com.finbourne.lusid.model.MarketDataOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Contains data (i.e. tenors and pips + metadata) for building fx forward curves (when combined with a spot rate and a date to build on)
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FxForwardTenorPipsCurveData extends ComplexMarketData {
  public static final String SERIALIZED_NAME_BASE_DATE = "baseDate";
  @SerializedName(SERIALIZED_NAME_BASE_DATE)
  private OffsetDateTime baseDate;

  public static final String SERIALIZED_NAME_DOM_CCY = "domCcy";
  @SerializedName(SERIALIZED_NAME_DOM_CCY)
  private String domCcy;

  public static final String SERIALIZED_NAME_FGN_CCY = "fgnCcy";
  @SerializedName(SERIALIZED_NAME_FGN_CCY)
  private String fgnCcy;

  public static final String SERIALIZED_NAME_TENORS = "tenors";
  @SerializedName(SERIALIZED_NAME_TENORS)
  private List<String> tenors = new ArrayList<>();

  public static final String SERIALIZED_NAME_PIP_RATES = "pipRates";
  @SerializedName(SERIALIZED_NAME_PIP_RATES)
  private List<java.math.BigDecimal> pipRates = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINEAGE = "lineage";
  @SerializedName(SERIALIZED_NAME_LINEAGE)
  private String lineage;

  public static final String SERIALIZED_NAME_MARKET_DATA_OPTIONS = "marketDataOptions";
  @SerializedName(SERIALIZED_NAME_MARKET_DATA_OPTIONS)
  private MarketDataOptions marketDataOptions;

  public static final String SERIALIZED_NAME_CALENDARS = "calendars";
  @SerializedName(SERIALIZED_NAME_CALENDARS)
  private List<FxTenorConvention> calendars;

  public static final String SERIALIZED_NAME_SPOT_DAYS_CALCULATION_TYPE = "spotDaysCalculationType";
  @SerializedName(SERIALIZED_NAME_SPOT_DAYS_CALCULATION_TYPE)
  private String spotDaysCalculationType;

  public FxForwardTenorPipsCurveData() {
    // this.marketDataType = this.getClass().getSimpleName();
  }

  public FxForwardTenorPipsCurveData baseDate(OffsetDateTime baseDate) {
    
    this.baseDate = baseDate;
    return this;
  }

   /**
   * EffectiveAt date of the quoted pip rates
   * @return baseDate
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getBaseDate() {
    return baseDate;
  }


  public void setBaseDate(OffsetDateTime baseDate) {
    this.baseDate = baseDate;
  }


  public FxForwardTenorPipsCurveData domCcy(String domCcy) {
    
    this.domCcy = domCcy;
    return this;
  }

   /**
   * Domestic currency of the fx forward
   * @return domCcy
  **/
  @jakarta.annotation.Nonnull
  public String getDomCcy() {
    return domCcy;
  }


  public void setDomCcy(String domCcy) {
    this.domCcy = domCcy;
  }


  public FxForwardTenorPipsCurveData fgnCcy(String fgnCcy) {
    
    this.fgnCcy = fgnCcy;
    return this;
  }

   /**
   * Foreign currency of the fx forward
   * @return fgnCcy
  **/
  @jakarta.annotation.Nonnull
  public String getFgnCcy() {
    return fgnCcy;
  }


  public void setFgnCcy(String fgnCcy) {
    this.fgnCcy = fgnCcy;
  }


  public FxForwardTenorPipsCurveData tenors(List<String> tenors) {
    
    this.tenors = tenors;
    return this;
  }

  public FxForwardTenorPipsCurveData addTenorsItem(String tenorsItem) {
    if (this.tenors == null) {
      this.tenors = new ArrayList<>();
    }
    this.tenors.add(tenorsItem);
    return this;
  }

   /**
   * Tenors for which the forward rates apply
   * @return tenors
  **/
  @jakarta.annotation.Nonnull
  public List<String> getTenors() {
    return tenors;
  }


  public void setTenors(List<String> tenors) {
    this.tenors = tenors;
  }


  public FxForwardTenorPipsCurveData pipRates(List<java.math.BigDecimal> pipRates) {
    
    this.pipRates = pipRates;
    return this;
  }

  public FxForwardTenorPipsCurveData addPipRatesItem(java.math.BigDecimal pipRatesItem) {
    if (this.pipRates == null) {
      this.pipRates = new ArrayList<>();
    }
    this.pipRates.add(pipRatesItem);
    return this;
  }

   /**
   * Rates provided for the fx forward (price in FgnCcy per unit of DomCcy), expressed in pips
   * @return pipRates
  **/
  @jakarta.annotation.Nonnull
  public List<java.math.BigDecimal> getPipRates() {
    return pipRates;
  }


  public void setPipRates(List<java.math.BigDecimal> pipRates) {
    this.pipRates = pipRates;
  }


  public FxForwardTenorPipsCurveData lineage(String lineage) {
    
    this.lineage = lineage;
    return this;
  }

   /**
   * Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;.
   * @return lineage
  **/
  @jakarta.annotation.Nullable
  public String getLineage() {
    return lineage;
  }


  public void setLineage(String lineage) {
    this.lineage = lineage;
  }


  public FxForwardTenorPipsCurveData marketDataOptions(MarketDataOptions marketDataOptions) {
    
    this.marketDataOptions = marketDataOptions;
    return this;
  }

   /**
   * Get marketDataOptions
   * @return marketDataOptions
  **/
  @jakarta.annotation.Nullable
  public MarketDataOptions getMarketDataOptions() {
    return marketDataOptions;
  }


  public void setMarketDataOptions(MarketDataOptions marketDataOptions) {
    this.marketDataOptions = marketDataOptions;
  }


  public FxForwardTenorPipsCurveData calendars(List<FxTenorConvention> calendars) {
    
    this.calendars = calendars;
    return this;
  }

  public FxForwardTenorPipsCurveData addCalendarsItem(FxTenorConvention calendarsItem) {
    if (this.calendars == null) {
      this.calendars = new ArrayList<>();
    }
    this.calendars.add(calendarsItem);
    return this;
  }

   /**
   * The list of conventions that should be used when interpreting tenors as dates.
   * @return calendars
  **/
  @jakarta.annotation.Nullable
  public List<FxTenorConvention> getCalendars() {
    return calendars;
  }


  public void setCalendars(List<FxTenorConvention> calendars) {
    this.calendars = calendars;
  }


  public FxForwardTenorPipsCurveData spotDaysCalculationType(String spotDaysCalculationType) {
    
    this.spotDaysCalculationType = spotDaysCalculationType;
    return this;
  }

   /**
   * Configures how to calculate the spot date from the build date using the Calendars provided.  Supported string (enumeration) values are: [ SingleCalendar, UnionCalendars ]
   * @return spotDaysCalculationType
  **/
  @jakarta.annotation.Nullable
  public String getSpotDaysCalculationType() {
    return spotDaysCalculationType;
  }


  public void setSpotDaysCalculationType(String spotDaysCalculationType) {
    this.spotDaysCalculationType = spotDaysCalculationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FxForwardTenorPipsCurveData fxForwardTenorPipsCurveData = (FxForwardTenorPipsCurveData) o;
    return Objects.equals(this.baseDate, fxForwardTenorPipsCurveData.baseDate) &&
        Objects.equals(this.domCcy, fxForwardTenorPipsCurveData.domCcy) &&
        Objects.equals(this.fgnCcy, fxForwardTenorPipsCurveData.fgnCcy) &&
        Objects.equals(this.tenors, fxForwardTenorPipsCurveData.tenors) &&
        Objects.equals(this.pipRates, fxForwardTenorPipsCurveData.pipRates) &&
        Objects.equals(this.lineage, fxForwardTenorPipsCurveData.lineage) &&
        Objects.equals(this.marketDataOptions, fxForwardTenorPipsCurveData.marketDataOptions) &&
        Objects.equals(this.calendars, fxForwardTenorPipsCurveData.calendars) &&
        Objects.equals(this.spotDaysCalculationType, fxForwardTenorPipsCurveData.spotDaysCalculationType) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseDate, domCcy, fgnCcy, tenors, pipRates, lineage, marketDataOptions, calendars, spotDaysCalculationType, super.hashCode());
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
    sb.append("class FxForwardTenorPipsCurveData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    baseDate: ").append(toIndentedString(baseDate)).append("\n");
    sb.append("    domCcy: ").append(toIndentedString(domCcy)).append("\n");
    sb.append("    fgnCcy: ").append(toIndentedString(fgnCcy)).append("\n");
    sb.append("    tenors: ").append(toIndentedString(tenors)).append("\n");
    sb.append("    pipRates: ").append(toIndentedString(pipRates)).append("\n");
    sb.append("    lineage: ").append(toIndentedString(lineage)).append("\n");
    sb.append("    marketDataOptions: ").append(toIndentedString(marketDataOptions)).append("\n");
    sb.append("    calendars: ").append(toIndentedString(calendars)).append("\n");
    sb.append("    spotDaysCalculationType: ").append(toIndentedString(spotDaysCalculationType)).append("\n");
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
    openapiFields.add("marketDataType");
    openapiFields.add("baseDate");
    openapiFields.add("domCcy");
    openapiFields.add("fgnCcy");
    openapiFields.add("tenors");
    openapiFields.add("pipRates");
    openapiFields.add("lineage");
    openapiFields.add("marketDataOptions");
    openapiFields.add("calendars");
    openapiFields.add("spotDaysCalculationType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("baseDate");
    openapiRequiredFields.add("domCcy");
    openapiRequiredFields.add("fgnCcy");
    openapiRequiredFields.add("tenors");
    openapiRequiredFields.add("pipRates");
    openapiRequiredFields.add("marketDataType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FxForwardTenorPipsCurveData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FxForwardTenorPipsCurveData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FxForwardTenorPipsCurveData is not found in the empty JSON string", FxForwardTenorPipsCurveData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FxForwardTenorPipsCurveData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FxForwardTenorPipsCurveData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FxForwardTenorPipsCurveData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FxForwardTenorPipsCurveData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FxForwardTenorPipsCurveData.class));

       return (TypeAdapter<T>) new TypeAdapter<FxForwardTenorPipsCurveData>() {
           @Override
           public void write(JsonWriter out, FxForwardTenorPipsCurveData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FxForwardTenorPipsCurveData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FxForwardTenorPipsCurveData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FxForwardTenorPipsCurveData
  * @throws IOException if the JSON string is invalid with respect to FxForwardTenorPipsCurveData
  */
  public static FxForwardTenorPipsCurveData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FxForwardTenorPipsCurveData.class);
  }

 /**
  * Convert an instance of FxForwardTenorPipsCurveData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
