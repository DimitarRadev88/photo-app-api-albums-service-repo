package com.dimitarrradev.photoapp.api.albums.service;

import com.dimitarrradev.photoapp.api.albums.dao.AlbumsRepository;
import org.springframework.stereotype.Service;

@Service
public class AlbumsService {

    private final AlbumsRepository albumsRepository;

    public AlbumsService(AlbumsRepository albumsRepository) {
        this.albumsRepository = albumsRepository;
    }

}
