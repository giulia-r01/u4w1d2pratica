package esercizio_3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = "";

        System.out.println("Inserisci una stringa (':q' per uscire):");

        while (!s.equals(":q")) {
            s = scanner.nextLine();

            if (!s.equals(":q")) {
                for (int i = 0; i < s.length(); i++) {
                    System.out.print(s.charAt(i));
                    if (i < s.length() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }


    }
}
