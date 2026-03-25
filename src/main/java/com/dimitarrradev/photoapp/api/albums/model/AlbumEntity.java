package com.dimitarrradev.photoapp.api.albums.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "users")
public class AlbumEntity implements Serializable {

    private static final long serialVersionUID = 245367434525657L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String userId;


    public AlbumEntity() {
    }

    public AlbumEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


}
