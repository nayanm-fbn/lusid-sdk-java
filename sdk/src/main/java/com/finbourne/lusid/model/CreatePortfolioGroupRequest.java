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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CreatePortfolioGroupRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreatePortfolioGroupRequest {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<ResourceId> values = null;

  public static final String SERIALIZED_NAME_SUB_GROUPS = "subGroups";
  @SerializedName(SERIALIZED_NAME_SUB_GROUPS)
  private List<ResourceId> subGroups = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Property> properties = null;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public CreatePortfolioGroupRequest code(String code) {
    this.code = code; 
    return this;
  }

   /**
   * The code that the portfolio group will be created with. Together with the scope this uniquely identifies the portfolio group.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The code that the portfolio group will be created with. Together with the scope this uniquely identifies the portfolio group.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public CreatePortfolioGroupRequest created(OffsetDateTime created) {
    this.created = created; 
    return this;
  }

   /**
   * The effective datetime at which the portfolio group was created. Defaults to the current LUSID system datetime if not specified.
   * @return created
  **/
  @ApiModelProperty(value = "The effective datetime at which the portfolio group was created. Defaults to the current LUSID system datetime if not specified.")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public CreatePortfolioGroupRequest values(List<ResourceId> values) {
    this.values = values; 
    return this;
  }

  public CreatePortfolioGroupRequest addValuesItem(ResourceId valuesItem) {
   
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The resource identifiers of the portfolios to be contained within the portfolio group.
   * @return values
  **/
  @ApiModelProperty(value = "The resource identifiers of the portfolios to be contained within the portfolio group.")
  public List<ResourceId> getValues() {
    return values;
  }

  public void setValues(List<ResourceId> values) {
    this.values = values;
  }


  public CreatePortfolioGroupRequest subGroups(List<ResourceId> subGroups) {
    this.subGroups = subGroups; 
    return this;
  }

  public CreatePortfolioGroupRequest addSubGroupsItem(ResourceId subGroupsItem) {
   
    if (this.subGroups == null) {
      this.subGroups = new ArrayList<>();
    }
    this.subGroups.add(subGroupsItem);
    return this;
  }

   /**
   * The resource identifiers of the portfolio groups to be contained within the portfolio group as sub groups.
   * @return subGroups
  **/
  @ApiModelProperty(value = "The resource identifiers of the portfolio groups to be contained within the portfolio group as sub groups.")
  public List<ResourceId> getSubGroups() {
    return subGroups;
  }

  public void setSubGroups(List<ResourceId> subGroups) {
    this.subGroups = subGroups;
  }


  public CreatePortfolioGroupRequest properties(Map<String, Property> properties) {
    this.properties = properties; 
    return this;
  }

  public CreatePortfolioGroupRequest putPropertiesItem(String key, Property propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * A set of unique group properties to add to the portfolio group. Each property must be from the &#39;PortfolioGroup&#39; domain and should be identified by its key which has the format {domain}/{scope}/{code}, e.g. &#39;PortfolioGroup/Manager/Id&#39;. These properties must be pre-defined.
   * @return properties
  **/
  @ApiModelProperty(value = "A set of unique group properties to add to the portfolio group. Each property must be from the 'PortfolioGroup' domain and should be identified by its key which has the format {domain}/{scope}/{code}, e.g. 'PortfolioGroup/Manager/Id'. These properties must be pre-defined.")
  public Map<String, Property> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Property> properties) {
    this.properties = properties;
  }


  public CreatePortfolioGroupRequest displayName(String displayName) {
    this.displayName = displayName; 
    return this;
  }

   /**
   * The name of the portfolio group.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "The name of the portfolio group.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CreatePortfolioGroupRequest description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * A long form description of the portfolio group.
   * @return description
  **/
  @ApiModelProperty(value = "A long form description of the portfolio group.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
    sb.append("class CreatePortfolioGroupRequest {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    subGroups: ").append(toIndentedString(subGroups)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
