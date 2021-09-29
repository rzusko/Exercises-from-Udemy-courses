public class MegaBytesConverter {

    /* Write a method called printMegaBytesAndKiloBytes
     * that has 1 parameter if type int with the name kiloBytes.
     *
     * The method should not return anything (void)
     * and it needs to calculate the megabytes
     * and remaining kilobytes from the kilobytes parameter.
     *
     * Then it needs to print a message in the format
     * "XX KB = YY MB and ZZ KB".
     *
     * XX represents the original value kiloBytes.
     * yy represents the calculated megaBytes.
     * zz represents the calculate remaining kilobytes.
     *
     * If the parameter kiloBytes is less than 0
     * then print the text "Invalid Value".
     *
     * 1MB = 1024 KB
     */

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes +
                    " MB and " + remainingKiloBytes + " KB");
        }
    }
}
