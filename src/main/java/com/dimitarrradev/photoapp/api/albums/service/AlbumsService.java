package com.dimitarrradev.photoapp.api.albums.service;

import com.dimitarrradev.photoapp.api.albums.dao.AlbumsRepository;
import com.dimitarrradev.photoapp.api.albums.model.AlbumEntity;
import com.dimitarrradev.photoapp.api.albums.model.AlbumRequest;
import com.dimitarrradev.photoapp.api.albums.model.AlbumResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AlbumsService {

    private final AlbumsRepository albumsRepository;

    public AlbumsService(AlbumsRepository albumsRepository) {
        this.albumsRepository = albumsRepository;
    }

    public AlbumResponse getAlbums(String userId) {
        return albumsRepository
                .findByUserId(userId)
                .map(entity -> new AlbumResponse(
                        entity.getAlbumId(),
                        entity.getUserId(),
                        entity.getName(),
                        entity.getDescription()
                ))
                .orElse(null);
    }

    public void createAlbum(AlbumRequest albumRequest) {
        albumsRepository.save(new AlbumEntity(
                        null,
                        UUID.randomUUID().toString(),
                        albumRequest.getName(),
                        albumRequest.getDescription(),
                        albumRequest.getUserId()
                )
        );
    }


}
