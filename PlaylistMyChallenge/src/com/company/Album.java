package com.company;

import java.util.ArrayList;

public class Album {

    private String albumName;
    private ArrayList<Song> album;

    public Album(String albumName) {
        this.albumName = albumName;
        this.album = new ArrayList<Song>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getAlbum() {
        return album;
    }

    public boolean newSong(String songName, String songDuration){
        Song newSong = findSong(songName);
        if(newSong == null){
            newSong = new Song(songName,songDuration);
            album.add(newSong);
            System.out.println("Successfully added " + songName + " to album.");
            return true;
        }
        else {
            System.out.println(songName + " already exists in this album.");
            return false;
        }
    }

    private Song findSong(String songName){
        for(int i=0;i<album.size();i++){
            if(album.get(i).getSongTitle().equals(songName)){
                return album.get(i);
            }
        }
        return null;
    }

    public boolean removeSong(String songName){
        Song song = findSong(songName);
        if(song != null){
            album.remove(song);
            System.out.println("Successfully removed " + songName + " from album.");
            return true;
        }
        else{
            System.out.println("Could not find " + songName + " in album.");
            return false;
        }
    }
}
