package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 10;
        short shortVaue = 20;
        int intValue = 50;
        long longValue = 50000 + (10 * (byteValue + shortVaue + intValue));

        System.out.println(longValue);
    }
}
