package es1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero: ");
        String evenOrOdd = (scanner.nextLine());
        if (stringaPariDispari(evenOrOdd))
            System.out.println("Il numero di caratteri della stringa " + evenOrOdd + " è dispari");
        else
            System.out.println("Il numero di caratteri della stringa " + evenOrOdd + " è pari");
        System.out.println("Inserisci un anno: ");
        int yearToCheck = Integer.parseInt((scanner.nextLine()));
        if (annoBisestile(yearToCheck))
            System.out.println(yearToCheck + " è bisestile");
        else
            System.out.println(yearToCheck + " non è bisestile");
    }

    public static boolean stringaPariDispari(String s) {
        return s.length() % 2 == 1;
    }

    public static boolean annoBisestile(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0)
                return year % 400 == 0;
            return true;
        }
        return false;
    }
}