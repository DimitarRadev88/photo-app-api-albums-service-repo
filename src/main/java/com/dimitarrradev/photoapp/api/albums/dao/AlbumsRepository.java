package com.dimitarrradev.photoapp.api.albums.dao;

import com.dimitarrradev.photoapp.api.albums.model.AlbumEntity;
import com.dimitarrradev.photoapp.api.albums.model.AlbumResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlbumsRepository extends JpaRepository<AlbumEntity, Long> {
    List<AlbumEntity> findAllByUserId(String userId);
}
