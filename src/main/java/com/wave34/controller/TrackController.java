/*
 *Author Name :P.Hemanth Sai Teja
 *Date:22-11-2022
 *Created With: IntelliJ IDEA Community Edition
 */

package com.wave34.controller;

import com.wave34.domain.Track;
import com.wave34.service.ITrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")

public class TrackController {
    private ITrackService itrackService;

    @Autowired
    public TrackController(ITrackService itrackService) {
        this.itrackService = itrackService;
    }

    @PostMapping("/insertTrack")
    public ResponseEntity<?> saveFunction(@RequestBody Track track) {
        return new ResponseEntity<>(itrackService.saveTrack(track), HttpStatus.CREATED);
    }

    @GetMapping("/fetchAllTrack")
    public ResponseEntity<?> fetchFunction() {
        return new ResponseEntity<>(itrackService.fetchAllTrack(), HttpStatus.OK);
    }

    @DeleteMapping("/deleteTrack/{tid}")
    public ResponseEntity<?> deleteFunction(@PathVariable int tid) {
        itrackService.deleteTrack(tid);
        return new ResponseEntity<>("Track Record Deleted", HttpStatus.OK);
    }

    @GetMapping("/getTrackById/{tid}")
    public ResponseEntity<?> getProductByIdFunction(@PathVariable int tid) {
        return new ResponseEntity<>(itrackService.getTrackById(tid), HttpStatus.OK);
    }

    @PutMapping("/updateById/{tid}")
    public ResponseEntity<?> updateFunction(@PathVariable int tid, @RequestBody Track track) {
        itrackService.updateTrack(tid, track);
        return new ResponseEntity<>("Product Record Updated", HttpStatus.OK);
    }

    @GetMapping("/fetchTrackByName/{trackName}")
    public ResponseEntity<?> fetchByName(@PathVariable String trackName) {
        return new ResponseEntity<>(itrackService.fetchTrackByName(trackName), HttpStatus.OK);
    }

    @GetMapping("/fetchTrackByRating/{trackRating}")
    public ResponseEntity<?> fetchByRating(@PathVariable double trackRating) {
        return new ResponseEntity<>(itrackService.fetchTrackByRating(trackRating), HttpStatus.OK);
    }

    @GetMapping("/fetchTrackByArtist/{trackArtist}")
    public ResponseEntity<?> fetchByRating(@PathVariable String trackArtist) {
        return new ResponseEntity<>(itrackService.fetchTrackArtist(trackArtist), HttpStatus.OK);
    }

//    @GetMapping("/fetchSortedTrackByName/{name}")
//    public ResponseEntity<?> fetchSortedName(@PathVariable String trackName) {
//        return new ResponseEntity<>(itrackService.fetchSortedTrack(trackName), HttpStatus.OK);
//    }
}
