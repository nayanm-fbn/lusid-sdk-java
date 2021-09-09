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
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The time an entity was modified (amendment and/or historical correction).
 */
@ApiModel(description = "The time an entity was modified (amendment and/or historical correction).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Change {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private ResourceId entityId;

  public static final String SERIALIZED_NAME_CORRECTED = "corrected";
  @SerializedName(SERIALIZED_NAME_CORRECTED)
  private Boolean corrected;

  public static final String SERIALIZED_NAME_CORRECTION_EFFECTIVE_AT = "correctionEffectiveAt";
  @SerializedName(SERIALIZED_NAME_CORRECTION_EFFECTIVE_AT)
  private OffsetDateTime correctionEffectiveAt;

  public static final String SERIALIZED_NAME_CORRECTION_AS_AT = "correctionAsAt";
  @SerializedName(SERIALIZED_NAME_CORRECTION_AS_AT)
  private OffsetDateTime correctionAsAt;

  public static final String SERIALIZED_NAME_AMENDED = "amended";
  @SerializedName(SERIALIZED_NAME_AMENDED)
  private Boolean amended;

  public static final String SERIALIZED_NAME_AMENDMENT_EFFECTIVE_AT = "amendmentEffectiveAt";
  @SerializedName(SERIALIZED_NAME_AMENDMENT_EFFECTIVE_AT)
  private OffsetDateTime amendmentEffectiveAt;

  public static final String SERIALIZED_NAME_AMENDMENT_AS_AT = "amendmentAsAt";
  @SerializedName(SERIALIZED_NAME_AMENDMENT_AS_AT)
  private OffsetDateTime amendmentAsAt;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public Change href(URI href) {
    this.href = href; 
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(value = "")
  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }


  public Change entityId(ResourceId entityId) {
    this.entityId = entityId; 
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getEntityId() {
    return entityId;
  }

  public void setEntityId(ResourceId entityId) {
    this.entityId = entityId;
  }


  public Change corrected(Boolean corrected) {
    this.corrected = corrected; 
    return this;
  }

   /**
   * Get corrected
   * @return corrected
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getCorrected() {
    return corrected;
  }

  public void setCorrected(Boolean corrected) {
    this.corrected = corrected;
  }


  public Change correctionEffectiveAt(OffsetDateTime correctionEffectiveAt) {
    this.correctionEffectiveAt = correctionEffectiveAt; 
    return this;
  }

   /**
   * Get correctionEffectiveAt
   * @return correctionEffectiveAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCorrectionEffectiveAt() {
    return correctionEffectiveAt;
  }

  public void setCorrectionEffectiveAt(OffsetDateTime correctionEffectiveAt) {
    this.correctionEffectiveAt = correctionEffectiveAt;
  }


  public Change correctionAsAt(OffsetDateTime correctionAsAt) {
    this.correctionAsAt = correctionAsAt; 
    return this;
  }

   /**
   * Get correctionAsAt
   * @return correctionAsAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCorrectionAsAt() {
    return correctionAsAt;
  }

  public void setCorrectionAsAt(OffsetDateTime correctionAsAt) {
    this.correctionAsAt = correctionAsAt;
  }


  public Change amended(Boolean amended) {
    this.amended = amended; 
    return this;
  }

   /**
   * Get amended
   * @return amended
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getAmended() {
    return amended;
  }

  public void setAmended(Boolean amended) {
    this.amended = amended;
  }


  public Change amendmentEffectiveAt(OffsetDateTime amendmentEffectiveAt) {
    this.amendmentEffectiveAt = amendmentEffectiveAt; 
    return this;
  }

   /**
   * Get amendmentEffectiveAt
   * @return amendmentEffectiveAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAmendmentEffectiveAt() {
    return amendmentEffectiveAt;
  }

  public void setAmendmentEffectiveAt(OffsetDateTime amendmentEffectiveAt) {
    this.amendmentEffectiveAt = amendmentEffectiveAt;
  }


  public Change amendmentAsAt(OffsetDateTime amendmentAsAt) {
    this.amendmentAsAt = amendmentAsAt; 
    return this;
  }

   /**
   * Get amendmentAsAt
   * @return amendmentAsAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAmendmentAsAt() {
    return amendmentAsAt;
  }

  public void setAmendmentAsAt(OffsetDateTime amendmentAsAt) {
    this.amendmentAsAt = amendmentAsAt;
  }


  public Change links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public Change addLinksItem(Link linksItem) {
   
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
    sb.append("class Change {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    corrected: ").append(toIndentedString(corrected)).append("\n");
    sb.append("    correctionEffectiveAt: ").append(toIndentedString(correctionEffectiveAt)).append("\n");
    sb.append("    correctionAsAt: ").append(toIndentedString(correctionAsAt)).append("\n");
    sb.append("    amended: ").append(toIndentedString(amended)).append("\n");
    sb.append("    amendmentEffectiveAt: ").append(toIndentedString(amendmentEffectiveAt)).append("\n");
    sb.append("    amendmentAsAt: ").append(toIndentedString(amendmentAsAt)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
