package lesson3.prog2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        HeartRates heartRates = new HeartRates("dann", "astillero", LocalDate.of(1997, 12, 30));
        System.out.println(heartRates.toString());
    }
}
