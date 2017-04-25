package com.raj;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by rajkumarpurushothaman on 4/25/17.
 */
public class PlayList {

    private String name;
    private LinkedList<Song> list;
    private ListIterator<Song> iterator;

    public PlayList(String name) {
        this.name = name;
        this.list = new LinkedList<Song>();
        this.iterator = this.list.listIterator();
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getList() {
        return list;
    }

    public void addSongs(LinkedList<Song> list, Album mudhalvan) {
        ListIterator<Song> iterator = list.listIterator();
        for (Song song: list) {
            addSong(song, mudhalvan);
        }
    }

    public boolean addSong(Song song, Album mudhalvan) {
        if(mudhalvan.contains(song)) {
            this.list.addLast(song);
            return true;
        }
        else {
            return false;
        }
    }

    public Song nextSong() {
        if(this.iterator.hasNext())
            return this.iterator.next();
        else
            return null;
    }

    public Song previousSong() {
        if(this.iterator.hasPrevious())
            return this.iterator.previous();
        else
            return null;
    }

    public Song replayCurrentSong() {
        return this.iterator.previous();
    }

    public void removeCurrentSong() {
        this.iterator.remove();
    }
}
