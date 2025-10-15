package vn.devtaycode.trackservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import vn.devtaycode.trackservice.domain.Track;
import vn.devtaycode.trackservice.dto.track.TrackPostDTO;
import vn.devtaycode.trackservice.service.TrackService;

@RestController
@RequestMapping("/api/v1/tracks")
@RequiredArgsConstructor
public class TrackResource {

    private final TrackService trackService;

    @PostMapping
    public Track createTrack(@Valid @RequestBody TrackPostDTO trackPostDTO) {
        return this.trackService.createTrack(trackPostDTO);
    }
}