package vn.devtaycode.trackservice.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "tracks")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Track {

    @MongoId(value = FieldType.OBJECT_ID)
    @JsonProperty(value = "_id", index = 0)
    private String id;

    @NotBlank(message = "Title không được để trống")
    private String title;

    private String artist;
    private String description;
    private String category;
    private String imgUrl;

    @NotBlank(message = "TrackUrl không được để trống")
    private String trackUrl;

    // private Integer countLike;
    // private Integer countPlay;
    // private ObjectId uploader;
    // private Boolean isDeleted;

    // @CreatedDate
    // private Instant createdAt;

    // @LastModifiedDate
    // private Instant updatedAt;
}