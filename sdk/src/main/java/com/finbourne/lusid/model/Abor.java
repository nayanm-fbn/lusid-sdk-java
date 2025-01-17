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
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.PortfolioEntityId;
import com.finbourne.lusid.model.Property;
import com.finbourne.lusid.model.ResourceId;
import com.finbourne.lusid.model.Version;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * An Abor entity.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Abor {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PORTFOLIO_IDS = "portfolioIds";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_IDS)
  private List<PortfolioEntityId> portfolioIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_ABOR_CONFIGURATION_ID = "aborConfigurationId";
  @SerializedName(SERIALIZED_NAME_ABOR_CONFIGURATION_ID)
  private ResourceId aborConfigurationId;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Property> properties;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public Abor() {
  }

  public Abor href(URI href) {
    
    this.href = href;
    return this;
  }

   /**
   * The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime.
   * @return href
  **/
  @jakarta.annotation.Nullable
  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }


  public Abor id(ResourceId id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getId() {
    return id;
  }


  public void setId(ResourceId id) {
    this.id = id;
  }


  public Abor displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the Abor.
   * @return displayName
  **/
  @jakarta.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Abor description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description for the Abor.
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Abor portfolioIds(List<PortfolioEntityId> portfolioIds) {
    
    this.portfolioIds = portfolioIds;
    return this;
  }

  public Abor addPortfolioIdsItem(PortfolioEntityId portfolioIdsItem) {
    if (this.portfolioIds == null) {
      this.portfolioIds = new ArrayList<>();
    }
    this.portfolioIds.add(portfolioIdsItem);
    return this;
  }

   /**
   * The list with the portfolio ids which are part of the Abor.
   * @return portfolioIds
  **/
  @jakarta.annotation.Nonnull
  public List<PortfolioEntityId> getPortfolioIds() {
    return portfolioIds;
  }


  public void setPortfolioIds(List<PortfolioEntityId> portfolioIds) {
    this.portfolioIds = portfolioIds;
  }


  public Abor aborConfigurationId(ResourceId aborConfigurationId) {
    
    this.aborConfigurationId = aborConfigurationId;
    return this;
  }

   /**
   * Get aborConfigurationId
   * @return aborConfigurationId
  **/
  @jakarta.annotation.Nullable
  public ResourceId getAborConfigurationId() {
    return aborConfigurationId;
  }


  public void setAborConfigurationId(ResourceId aborConfigurationId) {
    this.aborConfigurationId = aborConfigurationId;
  }


  public Abor properties(Map<String, Property> properties) {
    
    this.properties = properties;
    return this;
  }

  public Abor putPropertiesItem(String key, Property propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * A set of properties for the Abor.
   * @return properties
  **/
  @jakarta.annotation.Nullable
  public Map<String, Property> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, Property> properties) {
    this.properties = properties;
  }


  public Abor version(Version version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nullable
  public Version getVersion() {
    return version;
  }


  public void setVersion(Version version) {
    this.version = version;
  }


  public Abor links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public Abor addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
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
    Abor abor = (Abor) o;
    return Objects.equals(this.href, abor.href) &&
        Objects.equals(this.id, abor.id) &&
        Objects.equals(this.displayName, abor.displayName) &&
        Objects.equals(this.description, abor.description) &&
        Objects.equals(this.portfolioIds, abor.portfolioIds) &&
        Objects.equals(this.aborConfigurationId, abor.aborConfigurationId) &&
        Objects.equals(this.properties, abor.properties) &&
        Objects.equals(this.version, abor.version) &&
        Objects.equals(this.links, abor.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, id, displayName, description, portfolioIds, aborConfigurationId, properties, version, links);
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
    sb.append("class Abor {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    portfolioIds: ").append(toIndentedString(portfolioIds)).append("\n");
    sb.append("    aborConfigurationId: ").append(toIndentedString(aborConfigurationId)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("href");
    openapiFields.add("id");
    openapiFields.add("displayName");
    openapiFields.add("description");
    openapiFields.add("portfolioIds");
    openapiFields.add("aborConfigurationId");
    openapiFields.add("properties");
    openapiFields.add("version");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("portfolioIds");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Abor
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Abor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Abor is not found in the empty JSON string", Abor.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Abor.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      // validate the required field `id`
      ResourceId.validateJsonElement(jsonObj.get("id"));
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("portfolioIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `portfolioIds` to be an array in the JSON string but got `%s`", jsonObj.get("portfolioIds").toString()));
      }

      JsonArray jsonArrayportfolioIds = jsonObj.getAsJsonArray("portfolioIds");
      // validate the required field `portfolioIds` (array)
      for (int i = 0; i < jsonArrayportfolioIds.size(); i++) {
        PortfolioEntityId.validateJsonElement(jsonArrayportfolioIds.get(i));
      };
      // validate the optional field `aborConfigurationId`
      if (jsonObj.get("aborConfigurationId") != null && !jsonObj.get("aborConfigurationId").isJsonNull()) {
        ResourceId.validateJsonElement(jsonObj.get("aborConfigurationId"));
      }
      // validate the optional field `version`
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) {
        Version.validateJsonElement(jsonObj.get("version"));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            Link.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Abor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Abor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Abor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Abor.class));

       return (TypeAdapter<T>) new TypeAdapter<Abor>() {
           @Override
           public void write(JsonWriter out, Abor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Abor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Abor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Abor
  * @throws IOException if the JSON string is invalid with respect to Abor
  */
  public static Abor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Abor.class);
  }

 /**
  * Convert an instance of Abor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
