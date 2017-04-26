package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/25/17.
 */
public class Song {
    private String title;
    private int duration;
    private Album album;

    public Song(String title, Album album, int duration) {
        this.title = title;
        this.duration = duration;
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public Album getAlbum() {
        return album;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if(obj instanceof Song) {
            Song that = (Song) obj;
            result = (that.getTitle().equals(this.title)) && (that.getDuration() == (this.duration)
                    && that.getAlbum().getName().equals(this.getAlbum().getName()));
        }
        return result;
    }
}
