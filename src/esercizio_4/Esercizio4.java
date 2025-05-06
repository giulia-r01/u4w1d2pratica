package esercizio_4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero");
        int num = scanner.nextInt();

        for (int i = num-1; i >=0; i--) {
            System.out.println(i);

        }
    }
}
