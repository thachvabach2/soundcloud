package vn.devtaycode.trackservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import vn.devtaycode.trackservice.domain.Track;

@Repository
public interface TrackRepository extends MongoRepository<Track, String> {

}
