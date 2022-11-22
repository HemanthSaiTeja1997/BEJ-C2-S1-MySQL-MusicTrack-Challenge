package com.wave34.service;

import com.wave34.domain.Track;

import java.util.List;
import java.util.Optional;

public interface ITrackService {

    Track saveTrack(Track track);

    boolean deleteTrack(int tid);

    List<Track> fetchAllTrack();

    Optional<Track> getTrackById(int tid);

    void updateTrack(int tid, Track track);

    List<Track> fetchTrackByName(String trackName);

    List<Track> fetchTrackByRating(double trackRating);

    //   List<Track> fetchAllTrackByRatingBetween(int start, int end);
    List<Track> fetchTrackArtist(String trackArtist);

//   List<Track> fetchSortedTrack(String trackName);


}
