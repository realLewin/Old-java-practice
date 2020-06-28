/**************************************************still not solved problem*********************************************
 *
 *
 *
 *                            why throw ConcurrentModificationException
 *                            when using the iterator next() method
 *                            there is a link to reference :
 *                            https://www.journaldev.com/378/java-util-concurrentmodificationexception
 *
 *
 *
 * ********************************************************************************************************************/
package com.lewin.practice;

import com.lewin.practice.Album;
import com.lewin.practice.Playlist;
import com.lewin.practice.Song;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in) ;
    private static boolean quit = false ;
    private static boolean isNext = true ;

    //--------------------------------------------------song--------------------------------------------------------
    private static LinkedList<Song> taylorSong = new LinkedList<Song> () ;
    private static Album taylorAlbum = new Album(taylorSong) ;
    private static LinkedList<Song> arianaSong = new LinkedList<Song> () ;
    private static Album arianaAlbum = new Album(arianaSong) ;
    private static LinkedList<Song> lizzoSong = new LinkedList<Song> () ;
    private static Album lizzoAlbum = new Album(lizzoSong) ;

    //----------------------------------------------------Album-----------------------------------------------------
    private static ArrayList<Album> myAlbum = new ArrayList<Album> () ;

    //---------------------------------------------------playlist---------------------------------------------------
    private static Playlist myPlaylist = new Playlist() ;


    public static void main(String[] args) {
        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listIterator.remove()
        taylorSong.add(new Song("cruel summer" , "03 : 14")) ;
        taylorSong.add(new Song("Lover" , "03 : 25")) ;
        taylorSong.add(new Song("The man" , "02 : 52")) ;
        taylorSong.add(new Song("the archer" , "03 : 05"));

        arianaSong.add(new Song("thank u , next" , "03 : 24")) ;
        arianaSong.add(new Song("7 rings" , "03 : 12")) ;
        arianaSong.add(new Song("bad idea" , "02 : 54")) ;

        lizzoSong.add(new Song("Truth Hurts" , "03 : 34"));
        lizzoSong.add(new Song("Boys" , "03 : 24"));

        myAlbum.add(taylorAlbum) ;
        myAlbum.add(lizzoAlbum) ;
        myAlbum.add(arianaAlbum) ;

        ListIterator<Song> songI = myPlaylist.getPlaylist().listIterator() ;

        printOption() ;
//        printAlbum();
        while(!quit){
            int userOption = scanner.nextInt() ;
            scanner.nextLine() ;
            switch(userOption){
                case 0 :
                    printOption() ;
                    break ;
                case 1 :
                    printPlaylist();
                    break ;
                case 2 :
                    System.out.println(addSong());
                    break ;
                case 3 :
                    nextSong(songI) ;
                    break ;
                case 4 :
                    previousSong(songI) ;
                    break ;
                case 5 :
                    replaySong() ;
                    break ;
                case 6 :
                    removeSong() ;
                case 7 :
                    quitApp() ;
                    break ;
                default:
                    System.out.println("please try again ...");
                    break ;
            }
        }



    }
//--------------------------------------------------------method--------------------------------------------------------
    private static void printOption(){
        System.out.println("\tplease select the option :\n\t" +
                "0 . show available option .\n\t" +
                "1 . show songs in the playlist .\n\t" +
                "2 . add song to playlist .\n\t" +
                "3 . play next song .\n\t" +
                "4 . play previous song .\n\t" +
                "5 . replay current song .\n\t" +
                "6 . remove current song .\n\t" +
                "7 . quit the app .\n");
    }

    private static void printPlaylist(){
        myPlaylist.printList();
    }

    private static boolean addSong() {
        System.out.println("which song do you want to add ?");
        String song = scanner.nextLine() ;
        ListIterator<Album> iA = myAlbum.listIterator();
        while(iA.hasNext()){
            ListIterator<Song> iS = iA.next().getAlbum().listIterator() ;
            while(iS.hasNext()){
                Song addSong = iS.next() ;
                if(addSong.getTitle().equals(song)){
                    return (myPlaylist.addSong(addSong)) ;
                }
            }
        }
        return false ;
    }
    private static void nextSong(ListIterator<Song> songI){
        if(isNext){
            if(songI.hasNext()){
                Song song = songI.next();
                myPlaylist.playSong(song);
            }
        }
        else{
            if(songI.hasNext()){
                songI.next();
            }
            if(songI.hasNext()){
                myPlaylist.playSong(songI.next());
                isNext = true;
            }
        }
    }
    private static void previousSong(ListIterator<Song> songI){
        if(!isNext){
            if(songI.hasPrevious()){
                myPlaylist.playSong(songI.previous());
            }
        }
        else{
            if(songI.hasPrevious()){
                songI.previous();
            }
            if(songI.hasPrevious()){
                myPlaylist.playSong(songI.previous());
                isNext = false;
            }
        }
    }
    private static void replaySong(){

    }
    private static void removeSong(){

    }
    private static void quitApp(){
        quit = true ;
        System.out.println("thanks for using our app ! ");
    }
































    private static void printAlbum() {
        ListIterator<Album> iA = myAlbum.listIterator() ;
        while(iA.hasNext()){
            ListIterator<Song> iS = iA.next().getAlbum().listIterator() ;
            while(iS.hasNext()){
                System.out.println(iS.next().getTitle()) ;
            }
        }
    }








//    private static void printList(LinkedList<Song> songList) {
//        ListIterator<Song> songIter = songList.listIterator() ;
//        while(songIter.hasNext()){
//            Song nextSong = songIter.next() ;
//            System.out.println(nextSong.getTitle() + " --> " + nextSong.getDuration()) ;
//        }
//            System.out.println("no more song ...");
//    }

}
