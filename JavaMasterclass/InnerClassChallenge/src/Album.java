import java.util.ArrayList;

public class Album {

    private String albumTitle;
    private SongList songList;

    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
        this.songList = new SongList();
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

//    public ArrayList<Song> getListOfSongs() {
//        return listOfSongs;
//    }

    public boolean addSong(String title, double duration) {
        return this.songList.addSong((new Song(title, duration)));
    }

    public Song findSong(String name) {
        return this.songList.findSong(name);
    }

    private class SongList {
        private ArrayList<Song> listOfSongs;

        public SongList() {
            this.listOfSongs = new ArrayList<Song>();
        }

        private boolean addSong(Song song) {
            if (this.listOfSongs.contains(song)) {
                return false;
            }
            this.listOfSongs.add(song);
            return true;
        }

        private Song findSong(String name) {
            for (Song song : listOfSongs) {
                if (song.getTitle().equals(name)) {
                    return song;
                }
            }
            return null;
        }

    }

}
