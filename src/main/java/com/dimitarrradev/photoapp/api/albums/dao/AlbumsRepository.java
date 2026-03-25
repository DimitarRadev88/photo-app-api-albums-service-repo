package com.dimitarrradev.photoapp.api.albums.dao;

import com.dimitarrradev.photoapp.api.albums.model.AlbumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlbumsRepository extends JpaRepository<AlbumEntity, Long> {
    Optional<AlbumEntity> findByUserId(String userId);
}
