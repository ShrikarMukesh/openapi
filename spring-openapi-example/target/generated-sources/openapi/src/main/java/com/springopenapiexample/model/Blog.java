package com.springopenapiexample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Blog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-21T17:24:45.552438+05:30[Asia/Kolkata]")
public class Blog   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("blogtitle")
  private String blogtitle;

  @JsonProperty("content")
  private String content;

  @JsonProperty("createdate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate createdate;

  public Blog id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Blog blogtitle(String blogtitle) {
    this.blogtitle = blogtitle;
    return this;
  }

  /**
   * Get blogtitle
   * @return blogtitle
  */
  @ApiModelProperty(value = "")


  public String getBlogtitle() {
    return blogtitle;
  }

  public void setBlogtitle(String blogtitle) {
    this.blogtitle = blogtitle;
  }

  public Blog content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @ApiModelProperty(value = "")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Blog createdate(LocalDate createdate) {
    this.createdate = createdate;
    return this;
  }

  /**
   * Get createdate
   * @return createdate
  */
  @ApiModelProperty(example = "Fri Dec 12 05:30:00 IST 27", value = "")

  @Valid

  public LocalDate getCreatedate() {
    return createdate;
  }

  public void setCreatedate(LocalDate createdate) {
    this.createdate = createdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Blog blog = (Blog) o;
    return Objects.equals(this.id, blog.id) &&
        Objects.equals(this.blogtitle, blog.blogtitle) &&
        Objects.equals(this.content, blog.content) &&
        Objects.equals(this.createdate, blog.createdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, blogtitle, content, createdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Blog {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    blogtitle: ").append(toIndentedString(blogtitle)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdate: ").append(toIndentedString(createdate)).append("\n");
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

