import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    private String playlistTitle;
    private ArrayList<Album> listOfAlbums;
    private LinkedList<Song> playlist;

    public Playlist(String playlistTitle) {
        this.playlistTitle = playlistTitle;
        this.listOfAlbums = new ArrayList<Album>();
        this.playlist = new LinkedList<Song>();
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public void addAlbum(Album album) {
        this.listOfAlbums.add(album);
    }

    public boolean addSong(String albumTitle, String songTitle) {
        Album album = findAlbum(albumTitle);

        if (album != null) {
            Song song = album.findSong(songTitle);
            if (song != null) {
                playlist.add(song);
                return true;
            } else {
                System.out.println("You don't own song " + songTitle);
                return false;
            }
        } else {
            System.out.println("Album " + albumTitle + " doesn't exist.");
            return false;
        }
    }

    public Album findAlbum(String name) {
        for (Album album : listOfAlbums) {
            if (album.getAlbumTitle().equals(name)) {
                return album;
            }
        }

        return null;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward  = true;
        ListIterator<Song> playlistIterator = playlist.listIterator();

        if (playlist.isEmpty()) {
            System.out.println("There is no song to play");
        } else {
            System.out.println("Now playing: " + playlistIterator.next().toString());
            showMenu();
        }

        while (!quit) {
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    quit = true;
                    break;

                case 1:
                    if (!goingForward) {
                        if (playlistIterator.hasNext()) {
                            playlistIterator.next();
                        }
                        goingForward = true;
                    }
                    if (playlistIterator.hasNext()) {
                        System.out.println("Now playing: " + playlistIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of playlist!");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (playlistIterator.hasPrevious()) {
                            playlistIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (playlistIterator.hasPrevious()) {
                        System.out.println("Now playing: " + playlistIterator.previous().toString());
                    } else {
                        System.out.println("Reached the beginning of playlist!");
                        goingForward = true;
                    }
                    break;

                case 3:
                    if (goingForward) {
                        if (playlistIterator.hasPrevious()) {
                            System.out.println("Now playing: " + playlistIterator.previous().toString());
                            goingForward = false;
                        } else {
                            System.out.println("We are at the start of the list.");
                        }
                    } else {
                        if (playlistIterator.hasNext()) {
                            System.out.println("Now playing: " + playlistIterator.next().toString());
                            goingForward = true;
                        } else {
                            System.out.println("We are at the end of the list.");
                        }
                    }
                    break;

                case 4:
                    if (playlist.size() > 0 ) {
                        playlistIterator.remove();
                        System.out.println("Song successfully removed from playlist.");
                        if (playlistIterator.hasNext()) {
                            System.out.println("Now playing " + playlistIterator.next());
                        } else if (playlistIterator.hasPrevious()) {
                            System.out.println("Now playing " + playlistIterator.previous());
                        }
                    }
                    break;

                case 5:
                    for (int i = 0; i < playlist.size(); i++) {
                        System.out.println(i + " - " + playlist.get(i).toString());
                    }
                    break;
            }
        }
    }

    private static void showMenu() {
        System.out.println("Available options:\nPress:\n" +
                "0 to quit\n" +
                "1 to skip forward\n" +
                "2 to skip backward\n" +
                "3 to replay\n" +
                "4 to remove song from playlist\n" +
                "5 to list the songs in playlist\n");
    }
}
