package com.lewin.practice;

public class Song {
    private String title ;
    private String duration ;

    public Song(){
        this.title = "default" ;
        this.duration = "00 : 00" ;
    }
    public Song(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }




}
