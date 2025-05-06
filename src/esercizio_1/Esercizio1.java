package esercizio_1;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String str = scanner.nextLine();

        boolean pariOdispari = stringaPariDispari(str);
        System.out.println(pariOdispari);

        System.out.println("Inserisci l'anno");
        int calcoloAnno = scanner.nextInt();
        boolean bisestileOno = annoBisestile(calcoloAnno);
        System.out.println("L'anno " + calcoloAnno + (bisestileOno ? " è bisestile." : " non è bisestile."));
    }

    public static boolean stringaPariDispari(String s){
        if (s.length()%2==0) {
            return true;
        }  else{
            return false;
        }

    }

    public static boolean annoBisestile(int anno){
        return (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0));
    }
}

