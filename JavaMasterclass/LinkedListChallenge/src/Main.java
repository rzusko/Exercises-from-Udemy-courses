

public class Main {


    public static void main(String[] args) {
        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist
        // and will appear in the list in the order they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.
        // Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist
        // (so you can only play songs that you own).
        // Hint:  To replay a song, consider what happened when we went back
        // and forth from a city before we started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()


        Album metallica = new Album("Metallica");
        metallica.addSong("Nothing Else Matters", 658);
        metallica.addSong("Master of Puppets", 435);
        metallica.addSong("Fade to Black", 352);
        metallica.addSong("Saint Anger", 327);
        metallica.addSong("Kill em all", 238);
        metallica.addSong("Unforgiven", 372);

        Album nightwish = new Album("Nightwish");
        nightwish.addSong("Nemo", 312);
        nightwish.addSong("Sleeping sun", 195);
        nightwish.addSong("Elan", 221);
        nightwish.addSong("ElvenPath", 284);
        nightwish.addSong("StoryTime", 267);
        nightwish.addSong("Amaranth", 212);
        nightwish.addSong("EverDream", 241);

        Playlist myPlaylist = new Playlist("My Favourite songs");
        myPlaylist.addAlbum(metallica);
        myPlaylist.addAlbum(nightwish);

        myPlaylist.addSong("Metallica", "Master of Puppets");
        myPlaylist.addSong("Metallica", "Unforgiven");
        myPlaylist.addSong("Dream Theater", "Another Day");
        myPlaylist.addSong("Nightwish", "Amaranth");
        myPlaylist.addSong("Nightwish", "Black Diamond");

        myPlaylist.play();
    }
}
