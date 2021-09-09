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
 * TargetTaxLotRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TargetTaxLotRequest {
  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private Double units;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private CurrencyAndAmount cost;

  public static final String SERIALIZED_NAME_PORTFOLIO_COST = "portfolioCost";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_COST)
  private Double portfolioCost;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_PURCHASE_DATE = "purchaseDate";
  @SerializedName(SERIALIZED_NAME_PURCHASE_DATE)
  private OffsetDateTime purchaseDate;

  public static final String SERIALIZED_NAME_SETTLEMENT_DATE = "settlementDate";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_DATE)
  private OffsetDateTime settlementDate;


  public TargetTaxLotRequest units(Double units) {
    this.units = units; 
    return this;
  }

   /**
   * The number of units of the instrument in this tax-lot.
   * @return units
  **/
  @ApiModelProperty(required = true, value = "The number of units of the instrument in this tax-lot.")
  public Double getUnits() {
    return units;
  }

  public void setUnits(Double units) {
    this.units = units;
  }


  public TargetTaxLotRequest cost(CurrencyAndAmount cost) {
    this.cost = cost; 
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(value = "")
  public CurrencyAndAmount getCost() {
    return cost;
  }

  public void setCost(CurrencyAndAmount cost) {
    this.cost = cost;
  }


  public TargetTaxLotRequest portfolioCost(Double portfolioCost) {
    this.portfolioCost = portfolioCost; 
    return this;
  }

   /**
   * The total cost of the tax-lot in the transaction portfolio&#39;s base currency.
   * @return portfolioCost
  **/
  @ApiModelProperty(value = "The total cost of the tax-lot in the transaction portfolio's base currency.")
  public Double getPortfolioCost() {
    return portfolioCost;
  }

  public void setPortfolioCost(Double portfolioCost) {
    this.portfolioCost = portfolioCost;
  }


  public TargetTaxLotRequest price(Double price) {
    this.price = price; 
    return this;
  }

   /**
   * The purchase price of each unit of the instrument held in this tax-lot. This forms part of the unique key required for multiple tax-lots.
   * @return price
  **/
  @ApiModelProperty(value = "The purchase price of each unit of the instrument held in this tax-lot. This forms part of the unique key required for multiple tax-lots.")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  public TargetTaxLotRequest purchaseDate(OffsetDateTime purchaseDate) {
    this.purchaseDate = purchaseDate; 
    return this;
  }

   /**
   * The purchase date of this tax-lot. This forms part of the unique key required for multiple tax-lots.
   * @return purchaseDate
  **/
  @ApiModelProperty(value = "The purchase date of this tax-lot. This forms part of the unique key required for multiple tax-lots.")
  public OffsetDateTime getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(OffsetDateTime purchaseDate) {
    this.purchaseDate = purchaseDate;
  }


  public TargetTaxLotRequest settlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate; 
    return this;
  }

   /**
   * The settlement date of the tax-lot&#39;s opening transaction.
   * @return settlementDate
  **/
  @ApiModelProperty(value = "The settlement date of the tax-lot's opening transaction.")
  public OffsetDateTime getSettlementDate() {
    return settlementDate;
  }

  public void setSettlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
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
    sb.append("class TargetTaxLotRequest {\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    portfolioCost: ").append(toIndentedString(portfolioCost)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    purchaseDate: ").append(toIndentedString(purchaseDate)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
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
