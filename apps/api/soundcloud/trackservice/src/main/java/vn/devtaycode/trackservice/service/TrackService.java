package vn.devtaycode.trackservice.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vn.devtaycode.trackservice.domain.Track;
import vn.devtaycode.trackservice.dto.track.TrackPostDTO;
import vn.devtaycode.trackservice.repository.TrackRepository;

@Service
@RequiredArgsConstructor
public class TrackService {

    public final TrackRepository trackRepository;

    public Track createTrack(TrackPostDTO trackPostDTO) {
        Track track = Track.builder()
                .title(trackPostDTO.title())
                .artist(trackPostDTO.artist())
                .description(trackPostDTO.description())
                .category(trackPostDTO.category())
                .imgUrl(trackPostDTO.imgUrl())
                .trackUrl(trackPostDTO.trackUrl())
                .build();

        return this.trackRepository.save(track);
    }
}
