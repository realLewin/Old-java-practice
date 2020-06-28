package com.lewin.practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    private LinkedList<Song> playlist = new LinkedList<Song> () ;

    public Playlist(){
        this(new LinkedList<Song>()) ;
    }
    public Playlist(LinkedList<Song> playlist) {
        this.playlist = playlist;
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }
    public void setPlaylist(LinkedList<Song> playlist) {
        this.playlist = playlist;
    }

    public void printList(){
        ListIterator<Song> i = playlist.listIterator();
        while(i.hasNext()){
            Song s = i.next() ;
            System.out.println(s.getTitle() + " --> " + s.getDuration());
        }
    }

    public boolean addSong(Song song){
        return (playlist.add(song)) ;
    }

    public void playSong (Song song){
        System.out.println("you now playing : " + song.getTitle() + " with time : " + song.getDuration());
    }


}
