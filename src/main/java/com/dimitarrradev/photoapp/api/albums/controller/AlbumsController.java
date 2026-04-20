package com.dimitarrradev.photoapp.api.albums.controller;

import com.dimitarrradev.photoapp.api.albums.model.AlbumRequest;
import com.dimitarrradev.photoapp.api.albums.model.AlbumResponse;
import com.dimitarrradev.photoapp.api.albums.service.AlbumsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users/{userId}/albums")
public class AlbumsController {

    private final AlbumsService albumsService;

    public AlbumsController(AlbumsService albumsService) {
        this.albumsService = albumsService;
    }

    @GetMapping("/status/check")
    public String statusCheck() {
        return "Working!";
    }

    @PostMapping
    public void createAlbum(AlbumRequest albumRequest) {
        albumsService.createAlbum(albumRequest);
    }

    @GetMapping
    public ResponseEntity<List<AlbumResponse>> getAlbums(@PathVariable String userId) {
        return ResponseEntity.ok(albumsService.getAlbums(userId));
    }

}
