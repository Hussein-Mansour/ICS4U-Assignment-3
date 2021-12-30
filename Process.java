/*
* This is the Process class.
*
* @author  Hussein Mansour
* @version 1.0
* @since   2021-12-30
*/

/**
* Process class.
*/
public class Process {

    /**
    * Method row.
    *
    * @param number Variable.
    */
    public static void row(int number) {
        // Condition.
        if (number < 1) {
            return;
        }

        // print Stars.
        System.out.print("* ");
        row(number - 1);
    }

    /**
    * Method pattern.
    *
    * @param number Variable.
    */
    public static void pattern(int number) {
        // Condition.
        if (number < 1) {
            return;
        }

        // Using row Method.
        row(number);
        // move to next line
        System.out.println("\n");
        // print stars of the
        // remaining rows recursively
        pattern(number - 1);
    }
}
