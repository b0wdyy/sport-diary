package io.bowdy.SportDiary.entity;

import java.time.Instant;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Activity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID uuid;

  private String title;
  private String description;

  @CreatedDate
  private Instant createdAt;
  @LastModifiedDate
  private Instant updatedAt;

  public UUID getUuid() {
    return uuid;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return "Activity [uuid=" + uuid + ", title=" + title + "]";
  }
}
