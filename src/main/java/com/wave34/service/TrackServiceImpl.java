/*
 *Author Name :P.Hemanth Sai Teja
 *Date:22-11-2022
 *Created With: IntelliJ IDEA Community Edition
 */

package com.wave34.service;

import com.wave34.domain.Track;
import com.wave34.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackServiceImpl implements ITrackService {
    private TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track) {
        return trackRepository.save(track);
    }

    @Override
    public boolean deleteTrack(int tid) {
        trackRepository.deleteById(tid);
        return true;
    }

    @Override
    public List<Track> fetchAllTrack() {
        return (List<Track>) trackRepository.findAll();
    }

    @Override
    public Optional<Track> getTrackById(int tid) {
        return trackRepository.findById(tid);
    }

    @Override
    public void updateTrack(int tid, Track track) {
        trackRepository.save(track);

    }

    @Override
    public List<Track> fetchTrackByName(String trackName) {
        return (List<Track>) trackRepository.findByTrackName(trackName);
    }

    @Override
    public List<Track> fetchTrackByRating(double trackRating) {
        return (List<Track>) trackRepository.findByTrackRating(trackRating);
    }

//    @Override
//    public List<Track> fetchAllTrackByRatingBetween(int start, int end) {
//        return  (List<Track>) trackRepository.findByTrackRatingBetween(start, end);
//    }

    @Override
    public List<Track> fetchTrackArtist(String trackArtist) {
        return (List<Track>) trackRepository.findByTrackArtist(trackArtist);
    }

//    @Override
//    public List<Track> fetchSortedTrack(String trackName) {
//        return (List<Track>) trackRepository.findBytrackNameOrderByNameDesc(trackName);
//    }

}
