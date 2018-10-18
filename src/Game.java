import java.util.*;

public class Game {
    public static void main (String[] args) {

        boolean runGame = true;

        Scanner scan = new Scanner(System.in);

        String input = "";
        String[] commandos = {"hoger", "lager", "exit"};

        double getalStart = 0;
        double getalEind = 0;

        while (runGame) {
            getalStart = Math.ceil(Math.random() * 10); // getal van 1 tot 10
            System.out.println("GETAL IS: " + getalStart);

            // input controleren
            boolean geldigeInput = false;

            while (geldigeInput == false) {
                input = scan.nextLine();
                input = input.toLowerCase();

                for (int i = 0; i < commandos.length; i++) {
                    if (input.equals(commandos[i])) {
                        // input is geldig
                        geldigeInput = true;
                        break; // break de loop af omdat wij al geldige input hebben.
                    }
                }

            }
            // input evalueren
            getalEind = Math.ceil(Math.random() * 10); // getal van 1 tot 10

            boolean win = false;

            if (input.equals(commandos[0])) // hoger
            {
                if (getalEind > getalStart) {
                    // gewonnen
                    win = true;
                }
            } else if (input.equals(commandos[1])) // lager
            {
                if (getalEind < getalStart) {
                    win = true;
                }
            } else // exit
            {
                runGame = false;
                continue;
            }

            // eindresultaat tonen
            System.out.println("GETAL START IS: " + getalStart);
            System.out.println("GETAL EIND IS: " + getalEind);

            if (getalEind != getalStart) {
                if (win) {
                    // de gewonnen tekst
                    System.out.print("Je hebt gewonnen!");
                }
            } else {
                // je hebt verloren
                System.out.print("Je hebt verloren!");
            }

        }
    }
}