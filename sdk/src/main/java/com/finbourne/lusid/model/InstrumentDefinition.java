/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3490
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.InstrumentIdValue;
import com.finbourne.lusid.model.LusidInstrument;
import com.finbourne.lusid.model.Property;
import com.finbourne.lusid.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * InstrumentDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InstrumentDefinition {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private Map<String, InstrumentIdValue> identifiers = new HashMap<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<Property> properties = null;

  public static final String SERIALIZED_NAME_LOOK_THROUGH_PORTFOLIO_ID = "lookThroughPortfolioId";
  @SerializedName(SERIALIZED_NAME_LOOK_THROUGH_PORTFOLIO_ID)
  private ResourceId lookThroughPortfolioId;

  public static final String SERIALIZED_NAME_DEFINITION = "definition";
  @SerializedName(SERIALIZED_NAME_DEFINITION)
  private LusidInstrument definition;


  public InstrumentDefinition name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * The name of the instrument.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the instrument.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public InstrumentDefinition identifiers(Map<String, InstrumentIdValue> identifiers) {
    this.identifiers = identifiers; 
    return this;
  }

  public InstrumentDefinition putIdentifiersItem(String key, InstrumentIdValue identifiersItem) {
    this.identifiers.put(key, identifiersItem);
    return this;
  }

   /**
   * A set of identifiers that can be used to identify the instrument. At least one of these must be configured to be a unique identifier.
   * @return identifiers
  **/
  @ApiModelProperty(required = true, value = "A set of identifiers that can be used to identify the instrument. At least one of these must be configured to be a unique identifier.")
  public Map<String, InstrumentIdValue> getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(Map<String, InstrumentIdValue> identifiers) {
    this.identifiers = identifiers;
  }


  public InstrumentDefinition properties(List<Property> properties) {
    this.properties = properties; 
    return this;
  }

  public InstrumentDefinition addPropertiesItem(Property propertiesItem) {
   
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Set of unique instrument properties and associated values to store with the instrument. Each property must be from the &#39;Instrument&#39; domain.
   * @return properties
  **/
  @ApiModelProperty(value = "Set of unique instrument properties and associated values to store with the instrument. Each property must be from the 'Instrument' domain.")
  public List<Property> getProperties() {
    return properties;
  }

  public void setProperties(List<Property> properties) {
    this.properties = properties;
  }


  public InstrumentDefinition lookThroughPortfolioId(ResourceId lookThroughPortfolioId) {
    this.lookThroughPortfolioId = lookThroughPortfolioId; 
    return this;
  }

   /**
   * Get lookThroughPortfolioId
   * @return lookThroughPortfolioId
  **/
  @ApiModelProperty(value = "")
  public ResourceId getLookThroughPortfolioId() {
    return lookThroughPortfolioId;
  }

  public void setLookThroughPortfolioId(ResourceId lookThroughPortfolioId) {
    this.lookThroughPortfolioId = lookThroughPortfolioId;
  }


  public InstrumentDefinition definition(LusidInstrument definition) {
    this.definition = definition; 
    return this;
  }

   /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(value = "")
  public LusidInstrument getDefinition() {
    return definition;
  }

  public void setDefinition(LusidInstrument definition) {
    this.definition = definition;
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
    sb.append("class InstrumentDefinition {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    lookThroughPortfolioId: ").append(toIndentedString(lookThroughPortfolioId)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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
