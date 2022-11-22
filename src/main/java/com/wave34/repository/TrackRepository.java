package com.wave34.repository;

import com.wave34.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track, Integer> {
    List<Track> findByTrackName(String trackName);

    List<Track> findByTrackRating(double trackRating);

    //List<Track> findByTrackRatingBetween(int start, int end);
    List<Track> findByTrackArtist(String trackArtist);

//List<Track> findByTrackNameOrderByNameDesc(String trackName);


}
