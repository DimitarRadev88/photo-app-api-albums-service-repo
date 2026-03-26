package com.dimitarrradev.photoapp.api.albums.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "albums")
public class AlbumEntity implements Serializable {

    private static final long serialVersionUID = 245367434525657L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String albumId;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;
    @Column(nullable = false, unique = true)
    private String userId;

    public AlbumEntity(Long id, String albumId, String name, String description, String userId) {
        this.id = id;
        this.albumId = albumId;
        this.name = name;
        this.description = description;
        this.userId = userId;
    }

    public AlbumEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
