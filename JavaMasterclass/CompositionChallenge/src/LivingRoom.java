public class LivingRoom {
    private Dimensions roomDimensions;
    private Television television;
    private DVD dvd;
    private Sofa sofa;

    public LivingRoom(Dimensions roomDimensions, Television television, DVD dvd, Sofa sofa) {
        this.roomDimensions = roomDimensions;
        this.television = television;
        this.dvd = dvd;
        this.sofa = sofa;
    }

    public Dimensions getRoomDimensions() {
        return roomDimensions;
    }

    public Television getTelevision() {
        return television;
    }

    public DVD getDvd() {
        return dvd;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public void watchTV() {
        sofa.sitOn();
        television.turnOn();
    }

    public void watchDVD(DVDDisc disc) {
        watchTV();
        dvd.watchMovie(disc);
    }
}
