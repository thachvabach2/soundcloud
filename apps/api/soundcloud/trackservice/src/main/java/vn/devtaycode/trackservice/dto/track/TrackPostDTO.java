package vn.devtaycode.trackservice.dto.track;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record TrackPostDTO(
        String title,
        String artist,
        String description,

        @NotBlank(message = "TrackUrl không được để trống") String trackUrl,

        @NotBlank(message = "Image không được để trống") String imgUrl,
        String category) {
}
