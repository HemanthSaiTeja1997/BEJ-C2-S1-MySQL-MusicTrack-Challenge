package com.wave34.repository;

import com.wave34.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track, Integer> {
    List<Track> findBytrackName(String trackName);

    List<Track> findBytrackRating(int trackRating);

    //List<Track> findBytrackRatingBetween(int start, int end);
    List<Track> findBytrackArtist(String trackArtist);

//List<Track> findBytrackNameOrderByNameDesc(String trackName);


}
