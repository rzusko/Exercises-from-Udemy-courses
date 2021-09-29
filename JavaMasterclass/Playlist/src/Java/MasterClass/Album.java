package Java.MasterClass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        Song song = findSong(title);

        if (song == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }

        return false;
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }

        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if ((trackNumber > 0) && (trackNumber <= this.songs.size())) {
            Song song = this.songs.get(trackNumber - 1);
            playlist.add(song);
            return true;
        }

        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);

        if (song != null) {
            playlist.add(song);
            return true;
        }

        return false;
    }
}
