package com.dimitarrradev.photoapp.api.albums.model;

public class AlbumRequest {

    private String userId;
    private String name;
    private String description;

    public AlbumRequest(String userId, String name, String description) {
        this.userId = userId;
        this.name = name;
        this.description = description;
    }

    public AlbumRequest() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
}
