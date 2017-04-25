package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/25/17.
 */
public class Song {
    private String title;
    private int duration;

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (getDuration() != song.getDuration()) return false;
        return getTitle().equals(song.getTitle());
    }

    @Override
    public int hashCode() {
        int result = getTitle().hashCode();
        result = 31 * result + getDuration();
        return result;
    }
}
