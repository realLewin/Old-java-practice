package com.lewin.practice;
import java.util.LinkedList;

public class Album {
    private LinkedList<Song> album = new LinkedList<Song> () ;

    public Album(){
        this(new LinkedList<Song> ()) ;
    }
    public Album(LinkedList<Song> album) {
        this.album = album;
    }

    public LinkedList<Song> getAlbum() {
        return album;
    }
    public void setAlbum(LinkedList<Song> album) {
        this.album = album;
    }




}
