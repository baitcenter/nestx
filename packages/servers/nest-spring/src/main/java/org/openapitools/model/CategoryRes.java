package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-14T14:09:29.012Z[Etc/UTC]")

public class CategoryRes   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("slug")
  private String slug;

  @JsonProperty("order")
  private Double order;

  @JsonProperty("parent")
  private String parent;

  @JsonProperty("paths")
  @Valid
  private List<String> paths = new ArrayList<>();

  @JsonProperty("description")
  private String description;

  public CategoryRes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * 
   * @return id
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CategoryRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 
   * @return name
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CategoryRes slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * 
   * @return slug
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public CategoryRes order(Double order) {
    this.order = order;
    return this;
  }

  /**
   * 
   * @return order
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Double getOrder() {
    return order;
  }

  public void setOrder(Double order) {
    this.order = order;
  }

  public CategoryRes parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * 
   * @return parent
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public CategoryRes paths(List<String> paths) {
    this.paths = paths;
    return this;
  }

  public CategoryRes addPathsItem(String pathsItem) {
    this.paths.add(pathsItem);
    return this;
  }

  /**
   * 
   * @return paths
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getPaths() {
    return paths;
  }

  public void setPaths(List<String> paths) {
    this.paths = paths;
  }

  public CategoryRes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * 
   * @return description
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryRes categoryRes = (CategoryRes) o;
    return Objects.equals(this.id, categoryRes.id) &&
        Objects.equals(this.name, categoryRes.name) &&
        Objects.equals(this.slug, categoryRes.slug) &&
        Objects.equals(this.order, categoryRes.order) &&
        Objects.equals(this.parent, categoryRes.parent) &&
        Objects.equals(this.paths, categoryRes.paths) &&
        Objects.equals(this.description, categoryRes.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, slug, order, parent, paths, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryRes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

