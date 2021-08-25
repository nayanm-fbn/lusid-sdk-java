/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3429
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.MetricValue;
import com.finbourne.lusid.model.QuoteId;
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
 * The quote id, value and lineage of the quotes all keyed by a unique correlation id.
 */
@ApiModel(description = "The quote id, value and lineage of the quotes all keyed by a unique correlation id.")

public class Quote {
  public static final String SERIALIZED_NAME_QUOTE_ID = "quoteId";
  @SerializedName(SERIALIZED_NAME_QUOTE_ID)
  private QuoteId quoteId = null;

  public static final String SERIALIZED_NAME_METRIC_VALUE = "metricValue";
  @SerializedName(SERIALIZED_NAME_METRIC_VALUE)
  private MetricValue metricValue = null;

  public static final String SERIALIZED_NAME_LINEAGE = "lineage";
  @SerializedName(SERIALIZED_NAME_LINEAGE)
  private String lineage;

  public static final String SERIALIZED_NAME_CUT_LABEL = "cutLabel";
  @SerializedName(SERIALIZED_NAME_CUT_LABEL)
  private String cutLabel;

  public static final String SERIALIZED_NAME_UPLOADED_BY = "uploadedBy";
  @SerializedName(SERIALIZED_NAME_UPLOADED_BY)
  private String uploadedBy;

  public static final String SERIALIZED_NAME_AS_AT = "asAt";
  @SerializedName(SERIALIZED_NAME_AS_AT)
  private OffsetDateTime asAt;

  public static final String SERIALIZED_NAME_SCALE_FACTOR = "scaleFactor";
  @SerializedName(SERIALIZED_NAME_SCALE_FACTOR)
  private Double scaleFactor;

  public Quote quoteId(QuoteId quoteId) {
    this.quoteId = quoteId;
    return this;
  }

   /**
   * Get quoteId
   * @return quoteId
  **/
  @ApiModelProperty(required = true, value = "")
  public QuoteId getQuoteId() {
    return quoteId;
  }

  public void setQuoteId(QuoteId quoteId) {
    this.quoteId = quoteId;
  }

  public Quote metricValue(MetricValue metricValue) {
    this.metricValue = metricValue;
    return this;
  }

   /**
   * Get metricValue
   * @return metricValue
  **/
  @ApiModelProperty(value = "")
  public MetricValue getMetricValue() {
    return metricValue;
  }

  public void setMetricValue(MetricValue metricValue) {
    this.metricValue = metricValue;
  }

  public Quote lineage(String lineage) {
    this.lineage = lineage;
    return this;
  }

   /**
   * Description of the quote&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;.
   * @return lineage
  **/
  @ApiModelProperty(value = "Description of the quote's lineage e.g. 'FundAccountant_GreenQuality'.")
  public String getLineage() {
    return lineage;
  }

  public void setLineage(String lineage) {
    this.lineage = lineage;
  }

  public Quote cutLabel(String cutLabel) {
    this.cutLabel = cutLabel;
    return this;
  }

   /**
   * The cut label that this quote was updated or inserted with.
   * @return cutLabel
  **/
  @ApiModelProperty(value = "The cut label that this quote was updated or inserted with.")
  public String getCutLabel() {
    return cutLabel;
  }

  public void setCutLabel(String cutLabel) {
    this.cutLabel = cutLabel;
  }

  public Quote uploadedBy(String uploadedBy) {
    this.uploadedBy = uploadedBy;
    return this;
  }

   /**
   * The unique id of the user that updated or inserted the quote.
   * @return uploadedBy
  **/
  @ApiModelProperty(required = true, value = "The unique id of the user that updated or inserted the quote.")
  public String getUploadedBy() {
    return uploadedBy;
  }

  public void setUploadedBy(String uploadedBy) {
    this.uploadedBy = uploadedBy;
  }

  public Quote asAt(OffsetDateTime asAt) {
    this.asAt = asAt;
    return this;
  }

   /**
   * The asAt datetime at which the quote was committed to LUSID.
   * @return asAt
  **/
  @ApiModelProperty(required = true, value = "The asAt datetime at which the quote was committed to LUSID.")
  public OffsetDateTime getAsAt() {
    return asAt;
  }

  public void setAsAt(OffsetDateTime asAt) {
    this.asAt = asAt;
  }

  public Quote scaleFactor(Double scaleFactor) {
    this.scaleFactor = scaleFactor;
    return this;
  }

   /**
   * An optional scale factor for non-standard scaling of quotes against the instrument. If not supplied, the default ScaleFactor is 1.
   * @return scaleFactor
  **/
  @ApiModelProperty(value = "An optional scale factor for non-standard scaling of quotes against the instrument. If not supplied, the default ScaleFactor is 1.")
  public Double getScaleFactor() {
    return scaleFactor;
  }

  public void setScaleFactor(Double scaleFactor) {
    this.scaleFactor = scaleFactor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
    sb.append("class Quote {\n");
    sb.append("    quoteId: ").append(toIndentedString(quoteId)).append("\n");
    sb.append("    metricValue: ").append(toIndentedString(metricValue)).append("\n");
    sb.append("    lineage: ").append(toIndentedString(lineage)).append("\n");
    sb.append("    cutLabel: ").append(toIndentedString(cutLabel)).append("\n");
    sb.append("    uploadedBy: ").append(toIndentedString(uploadedBy)).append("\n");
    sb.append("    asAt: ").append(toIndentedString(asAt)).append("\n");
    sb.append("    scaleFactor: ").append(toIndentedString(scaleFactor)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
