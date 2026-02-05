package Tivoli;

import java.util.Scanner;

public class TivoliRide {
    public static void main(String[] args) {
        System.out.println("How tall are you?(in cm)");

        // højde
        int tall;

        // Scanner
        Scanner st = new Scanner(System.in);
        tall = st.nextInt();

        // Forlystelser
        String[] rides = new String[3]; // laver et array med 3 kasser der skal udfyldes
        // her har vi 3 kasser hvor vi fylder dem ud
        rides[0] = ("Forlystelse 1");
        rides[1] = ("Forlystelse 2");
        rides[2] = ("Forlystelse 3");
        // Højdekrav
        int F1 = 175; // Forlystelse 1 højde krav
        int F2 = 180; // Forlystelse 2 højde krav
        int F3 = 195; // Forlystelse 3 højde krav

        // Requirements
        if (tall >= F1 && tall < F2){
            System.out.println("You are tall enough for: " + rides[0]);
            System.out.println("You dont meet the height requirement for: " + rides[1] + " & " + rides[2]);
        } else if (tall >= F2 && tall < F3){
            System.out.println("You are tall enough for: " + rides[0] + " & " + rides[1]);
            System.out.println("You dont meet the height requirement for: " + rides[2]);
        } else if (tall >= F3){
            System.out.println("You are tall enough for all rides");
        }

    }
}
