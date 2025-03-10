package org.campus02.nummernraten;

import java.util.Random;
import java.util.Scanner;

public class NummerRaten {

    public static void main(String[] args) throws NotANumberException {

        // Zahlen zwischen inkl. 0 und exkl. 10
        int randomNumber = new Random().nextInt(10);

        // initialer input = -1
        int input = -1;

        Scanner scanner = new Scanner(System.in);

        while (input != randomNumber) {
            System.out.println("Gib bitte eine Zahl ein: ");
            String userInput = scanner.next();

            input = parseInput(userInput);

            if (input != randomNumber) {
                System.out.println("Leider nein. Probiere es nochmal");
            }
        }
        System.out.println("Super. Zahl erraten");
    }

    private static int parseInput(String userInput) throws NotANumberException {
        try {
            return Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            throw new NotANumberException("Keine Nummer eingegeben", e);
        }
    }
}
