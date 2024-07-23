package es3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi una parola");
        String s = scanner.nextLine();
        char[] sArray = s.toCharArray();
        for (int i = 0; i < sArray.length; i++) {
            System.out.print(sArray[i]);
            if (i != sArray.length - 1)
                System.out.print(", ");
        }
    }
}
