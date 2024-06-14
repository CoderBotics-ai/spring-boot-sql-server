
package com.bezkoder.spring.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "tutorials")
public class Tutorial {

  @Id
  private String id;
  
  private String title;
  private String description;
  private boolean published;
  private Date createdAt;
  private Date updatedAt;

  public Tutorial() {
    this.createdAt = new Date();
    this.updatedAt = new Date();
  }

  public Tutorial(String title, String description, boolean published) {
    this.title = title;
    this.description = description;
    this.published = published;
    this.createdAt = new Date();
    this.updatedAt = new Date();
  }

  public String getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
    this.updatedAt = new Date();
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
    this.updatedAt = new Date();
  }

  public boolean isPublished() {
    return published;
  }

  public void setPublished(boolean isPublished) {
    this.published = isPublished;
    this.updatedAt = new Date();
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", published=" + published + 
           ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
  }
}
