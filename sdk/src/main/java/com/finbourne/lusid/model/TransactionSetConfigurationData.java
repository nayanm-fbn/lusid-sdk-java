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
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.SideConfigurationData;
import com.finbourne.lusid.model.TransactionConfigurationData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A collection of the data required to configure transaction types..
 */
@ApiModel(description = "A collection of the data required to configure transaction types..")

public class TransactionSetConfigurationData {
  public static final String SERIALIZED_NAME_TRANSACTION_CONFIGS = "transactionConfigs";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_CONFIGS)
  private List<TransactionConfigurationData> transactionConfigs = new ArrayList<>();

  public static final String SERIALIZED_NAME_SIDE_DEFINITIONS = "sideDefinitions";
  @SerializedName(SERIALIZED_NAME_SIDE_DEFINITIONS)
  private List<SideConfigurationData> sideDefinitions = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = new ArrayList<>();

  public TransactionSetConfigurationData transactionConfigs(List<TransactionConfigurationData> transactionConfigs) {
    this.transactionConfigs = transactionConfigs;
    return this;
  }

  public TransactionSetConfigurationData addTransactionConfigsItem(TransactionConfigurationData transactionConfigsItem) {
    this.transactionConfigs.add(transactionConfigsItem);
    return this;
  }

   /**
   * Collection of transaction type models
   * @return transactionConfigs
  **/
  @ApiModelProperty(required = true, value = "Collection of transaction type models")
  public List<TransactionConfigurationData> getTransactionConfigs() {
    return transactionConfigs;
  }

  public void setTransactionConfigs(List<TransactionConfigurationData> transactionConfigs) {
    this.transactionConfigs = transactionConfigs;
  }

  public TransactionSetConfigurationData sideDefinitions(List<SideConfigurationData> sideDefinitions) {
    this.sideDefinitions = sideDefinitions;
    return this;
  }

  public TransactionSetConfigurationData addSideDefinitionsItem(SideConfigurationData sideDefinitionsItem) {
    if (this.sideDefinitions == null) {
      this.sideDefinitions = new ArrayList<>();
    }
    this.sideDefinitions.add(sideDefinitionsItem);
    return this;
  }

   /**
   * Collection of side definitions
   * @return sideDefinitions
  **/
  @ApiModelProperty(value = "Collection of side definitions")
  public List<SideConfigurationData> getSideDefinitions() {
    return sideDefinitions;
  }

  public void setSideDefinitions(List<SideConfigurationData> sideDefinitions) {
    this.sideDefinitions = sideDefinitions;
  }

  public TransactionSetConfigurationData links(List<Link> links) {
    this.links = links;
    return this;
  }

  public TransactionSetConfigurationData addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Collection of links.
   * @return links
  **/
  @ApiModelProperty(value = "Collection of links.")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
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
    sb.append("class TransactionSetConfigurationData {\n");
    sb.append("    transactionConfigs: ").append(toIndentedString(transactionConfigs)).append("\n");
    sb.append("    sideDefinitions: ").append(toIndentedString(sideDefinitions)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
