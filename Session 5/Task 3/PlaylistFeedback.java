package com.jatin.userprofileservice;

import org.springframework.stereotype.Component;

@Component
public class PlaylistFallback implements PlaylistClient {

    @Override
    public Playlist getPlaylist(int id) {
        return new Playlist(
            id,
            "Default Playlist",
            "Unknown Creator"
        );
    }
}