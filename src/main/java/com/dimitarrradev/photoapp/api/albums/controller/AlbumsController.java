package com.dimitarrradev.photoapp.api.albums.controller;

import com.dimitarrradev.photoapp.api.albums.service.AlbumsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/albums")
public class AlbumsController {

    private final AlbumsService albumsService;

    public AlbumsController(AlbumsService albumsService) {
        this.albumsService = albumsService;
    }

    @GetMapping("/status/check")
    public String statusCheck() {
        return "Working!";
    }

}
