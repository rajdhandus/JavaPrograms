package com.raj;

import java.util.ArrayList;

/**
 * Created by rajkumarpurushothaman on 4/25/17.
 */
public class Album {

    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }


    public boolean contains(Song song) {
        return this.songs.contains(song);
    }
}
