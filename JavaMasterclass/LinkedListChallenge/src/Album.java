import java.util.ArrayList;

public class Album {

    private String albumTitle;
    private ArrayList<Song> listOfSongs;

    public String getAlbumTitle() {
        return albumTitle;
    }

    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
        this.listOfSongs = new ArrayList<Song>();
    }

    public ArrayList<Song> getListOfSongs() {
        return listOfSongs;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            Song song = new Song(title, duration);
            listOfSongs.add(song);
            return true;
        }

        System.out.println("Song with the same name has already been added to album.");
        return false;
    }

    public Song findSong(String name) {
        for (Song song : listOfSongs) {
            if (song.getTitle().equals(name)) {
                return song;
            }
        }
        return null;
    }

}
