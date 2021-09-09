/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3462
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.CurrencyAndAmount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * RealisedGainLoss
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RealisedGainLoss {
  public static final String SERIALIZED_NAME_INSTRUMENT_UID = "instrumentUid";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_UID)
  private String instrumentUid;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private Double units;

  public static final String SERIALIZED_NAME_PURCHASE_TRADE_DATE = "purchaseTradeDate";
  @SerializedName(SERIALIZED_NAME_PURCHASE_TRADE_DATE)
  private OffsetDateTime purchaseTradeDate;

  public static final String SERIALIZED_NAME_PURCHASE_SETTLEMENT_DATE = "purchaseSettlementDate";
  @SerializedName(SERIALIZED_NAME_PURCHASE_SETTLEMENT_DATE)
  private OffsetDateTime purchaseSettlementDate;

  public static final String SERIALIZED_NAME_PURCHASE_PRICE = "purchasePrice";
  @SerializedName(SERIALIZED_NAME_PURCHASE_PRICE)
  private Double purchasePrice;

  public static final String SERIALIZED_NAME_COST_TRADE_CCY = "costTradeCcy";
  @SerializedName(SERIALIZED_NAME_COST_TRADE_CCY)
  private CurrencyAndAmount costTradeCcy;

  public static final String SERIALIZED_NAME_COST_PORTFOLIO_CCY = "costPortfolioCcy";
  @SerializedName(SERIALIZED_NAME_COST_PORTFOLIO_CCY)
  private CurrencyAndAmount costPortfolioCcy;

  public static final String SERIALIZED_NAME_REALISED_TRADE_CCY = "realisedTradeCcy";
  @SerializedName(SERIALIZED_NAME_REALISED_TRADE_CCY)
  private CurrencyAndAmount realisedTradeCcy;

  public static final String SERIALIZED_NAME_REALISED_TOTAL = "realisedTotal";
  @SerializedName(SERIALIZED_NAME_REALISED_TOTAL)
  private CurrencyAndAmount realisedTotal;

  public static final String SERIALIZED_NAME_REALISED_MARKET = "realisedMarket";
  @SerializedName(SERIALIZED_NAME_REALISED_MARKET)
  private CurrencyAndAmount realisedMarket;

  public static final String SERIALIZED_NAME_REALISED_CURRENCY = "realisedCurrency";
  @SerializedName(SERIALIZED_NAME_REALISED_CURRENCY)
  private CurrencyAndAmount realisedCurrency;


  public RealisedGainLoss instrumentUid(String instrumentUid) {
    this.instrumentUid = instrumentUid; 
    return this;
  }

   /**
   * The unqiue Lusid Instrument Id (LUID) of the instrument that this gain or loss is associated with.
   * @return instrumentUid
  **/
  @ApiModelProperty(required = true, value = "The unqiue Lusid Instrument Id (LUID) of the instrument that this gain or loss is associated with.")
  public String getInstrumentUid() {
    return instrumentUid;
  }

  public void setInstrumentUid(String instrumentUid) {
    this.instrumentUid = instrumentUid;
  }


  public RealisedGainLoss units(Double units) {
    this.units = units; 
    return this;
  }

   /**
   * The number of units of the associated instrument against which the gain or loss has been realised.
   * @return units
  **/
  @ApiModelProperty(required = true, value = "The number of units of the associated instrument against which the gain or loss has been realised.")
  public Double getUnits() {
    return units;
  }

  public void setUnits(Double units) {
    this.units = units;
  }


   /**
   * The effective datetime that the units associated with this gain or loss where originally purchased.
   * @return purchaseTradeDate
  **/
  @ApiModelProperty(value = "The effective datetime that the units associated with this gain or loss where originally purchased.")
  public OffsetDateTime getPurchaseTradeDate() {
    return purchaseTradeDate;
  }



   /**
   * The effective datetime that the units associated with this gain or loss where originally settled.
   * @return purchaseSettlementDate
  **/
  @ApiModelProperty(value = "The effective datetime that the units associated with this gain or loss where originally settled.")
  public OffsetDateTime getPurchaseSettlementDate() {
    return purchaseSettlementDate;
  }



  public RealisedGainLoss purchasePrice(Double purchasePrice) {
    this.purchasePrice = purchasePrice; 
    return this;
  }

   /**
   * The purchase price of each unit associated with this gain or loss.
   * @return purchasePrice
  **/
  @ApiModelProperty(value = "The purchase price of each unit associated with this gain or loss.")
  public Double getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(Double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }


  public RealisedGainLoss costTradeCcy(CurrencyAndAmount costTradeCcy) {
    this.costTradeCcy = costTradeCcy; 
    return this;
  }

   /**
   * Get costTradeCcy
   * @return costTradeCcy
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAndAmount getCostTradeCcy() {
    return costTradeCcy;
  }

  public void setCostTradeCcy(CurrencyAndAmount costTradeCcy) {
    this.costTradeCcy = costTradeCcy;
  }


  public RealisedGainLoss costPortfolioCcy(CurrencyAndAmount costPortfolioCcy) {
    this.costPortfolioCcy = costPortfolioCcy; 
    return this;
  }

   /**
   * Get costPortfolioCcy
   * @return costPortfolioCcy
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAndAmount getCostPortfolioCcy() {
    return costPortfolioCcy;
  }

  public void setCostPortfolioCcy(CurrencyAndAmount costPortfolioCcy) {
    this.costPortfolioCcy = costPortfolioCcy;
  }


  public RealisedGainLoss realisedTradeCcy(CurrencyAndAmount realisedTradeCcy) {
    this.realisedTradeCcy = realisedTradeCcy; 
    return this;
  }

   /**
   * Get realisedTradeCcy
   * @return realisedTradeCcy
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAndAmount getRealisedTradeCcy() {
    return realisedTradeCcy;
  }

  public void setRealisedTradeCcy(CurrencyAndAmount realisedTradeCcy) {
    this.realisedTradeCcy = realisedTradeCcy;
  }


  public RealisedGainLoss realisedTotal(CurrencyAndAmount realisedTotal) {
    this.realisedTotal = realisedTotal; 
    return this;
  }

   /**
   * Get realisedTotal
   * @return realisedTotal
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAndAmount getRealisedTotal() {
    return realisedTotal;
  }

  public void setRealisedTotal(CurrencyAndAmount realisedTotal) {
    this.realisedTotal = realisedTotal;
  }


  public RealisedGainLoss realisedMarket(CurrencyAndAmount realisedMarket) {
    this.realisedMarket = realisedMarket; 
    return this;
  }

   /**
   * Get realisedMarket
   * @return realisedMarket
  **/
  @ApiModelProperty(value = "")
  public CurrencyAndAmount getRealisedMarket() {
    return realisedMarket;
  }

  public void setRealisedMarket(CurrencyAndAmount realisedMarket) {
    this.realisedMarket = realisedMarket;
  }


  public RealisedGainLoss realisedCurrency(CurrencyAndAmount realisedCurrency) {
    this.realisedCurrency = realisedCurrency; 
    return this;
  }

   /**
   * Get realisedCurrency
   * @return realisedCurrency
  **/
  @ApiModelProperty(value = "")
  public CurrencyAndAmount getRealisedCurrency() {
    return realisedCurrency;
  }

  public void setRealisedCurrency(CurrencyAndAmount realisedCurrency) {
    this.realisedCurrency = realisedCurrency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealisedGainLoss {\n");
    sb.append("    instrumentUid: ").append(toIndentedString(instrumentUid)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    purchaseTradeDate: ").append(toIndentedString(purchaseTradeDate)).append("\n");
    sb.append("    purchaseSettlementDate: ").append(toIndentedString(purchaseSettlementDate)).append("\n");
    sb.append("    purchasePrice: ").append(toIndentedString(purchasePrice)).append("\n");
    sb.append("    costTradeCcy: ").append(toIndentedString(costTradeCcy)).append("\n");
    sb.append("    costPortfolioCcy: ").append(toIndentedString(costPortfolioCcy)).append("\n");
    sb.append("    realisedTradeCcy: ").append(toIndentedString(realisedTradeCcy)).append("\n");
    sb.append("    realisedTotal: ").append(toIndentedString(realisedTotal)).append("\n");
    sb.append("    realisedMarket: ").append(toIndentedString(realisedMarket)).append("\n");
    sb.append("    realisedCurrency: ").append(toIndentedString(realisedCurrency)).append("\n");
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

}
