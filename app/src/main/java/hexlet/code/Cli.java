package hexlet.code;

import java.util.Scanner;
public class Cli {
    public static void greetUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}

