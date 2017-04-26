package com.raj;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by rajkumarpurushothaman on 4/25/17.
 */
public class PlayList {

    private String name;
    private LinkedList<Song> list;

    public PlayList(String name) {
        this.name = name;
        this.list = new LinkedList<Song>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getList() {
        return this.list;
    }

    public void addSongs(LinkedList<Song> list) {
        ListIterator<Song> iterator = list.listIterator();
        for (Song song: list) {
            addSong(song);
        }
    }

    public void addSong(Song song) {
        this.list.add(song);
    }

    public void removeSong(Song song) {
        this.list.remove(song);
    }

}
