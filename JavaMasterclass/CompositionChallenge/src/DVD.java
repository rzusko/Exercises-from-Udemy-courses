public class DVD {
    private String manufacturer;
    private String model;
    private boolean dvd_r;
    private boolean dvd_rw;
    private boolean recorder;

    public DVD(String manufacturer, String model,
               boolean dvd_r, boolean dvd_rw, boolean recorder) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.dvd_r = dvd_r;
        this.dvd_rw = dvd_rw;
        this.recorder = recorder;
    }

    public void turnOn() {
        System.out.println("DVD turning on.");
    }

    public void watchMovie(DVDDisc disc) {
        turnOn();
        System.out.println("Watching movie " + disc.getTitle());
    }
}
