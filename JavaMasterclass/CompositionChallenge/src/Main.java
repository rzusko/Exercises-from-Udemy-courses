// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.

public class Main {

    public static void main(String[] args) {
        Resolution resolution = new Resolution(1980, 1020);
        Television television = new Television("Samsung", "BL-120afg", 120, resolution);

        DVD dvd = new DVD("Sony", "DVD-125blk", true, false, false);

        Dimensions sofaDimensions = new Dimensions(3, 2, 1);
        Sofa sofa = new Sofa(6, sofaDimensions, "blue");

        Dimensions roomDimensions = new Dimensions(8, 6, 3);
        LivingRoom livingRoom = new LivingRoom(roomDimensions, television, dvd, sofa);

        DVDDisc disc = new DVDDisc("StarTrek");
        livingRoom.watchTV();
        livingRoom.watchDVD(disc);
    }
}
