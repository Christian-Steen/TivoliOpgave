import java.util.Scanner;

public class TivoliRide {
    public static void main(String[] args) {
        System.out.println("How tall are you?(in cm)");

        // højde
        int tall;

        // Scanner
        Scanner st = new Scanner(System.in);
        tall = st.nextInt();
        if (tall >= 170) {
            System.out.println("You are tall enough for the ride");
        } else {
            System.out.println("You dont meet the height requirement");
        }
    }
}
