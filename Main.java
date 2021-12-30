/*
* This program is the Main program.
*
* Prints a pattern of asterisks or stars (*).
*
* @author  Hussein Mansour
* @version 1.0
* @since   2021-12-27
*/

import java.util.Scanner;

/**
* This is the Main class program.
*/
final class Main {

    /**
    * Space.
    */
    public static final String SPACE = "\n";

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting... the main method
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        final Process process = new Process();
        final ProCess proCess = new ProCess();

        try {
            // Scanner Object.
            final Scanner myObj = new Scanner(System.in);
            // User Input
            System.out.print("Enter an Integer Number: ");
            final int userInput = myObj.nextInt();
            // If statment & Process
            if (userInput > 1) {
                System.out.print(SPACE);
                process.pattern(userInput);
                proCess.pattern(userInput, 1);
            } else if (userInput < 1) {
                System.out.print(SPACE + "Not an Integer Number!" + SPACE);
            } else if (userInput == 1) {
                System.out.print(SPACE);
                System.out.println("*");
                System.out.println("* ");
            }
        } catch (java.util.InputMismatchException errorCode) {
            // Error.
            System.out.println(SPACE + "Invalid Input!");
        }
        // Done.
        System.out.println(SPACE + "Done.");
    }
}
