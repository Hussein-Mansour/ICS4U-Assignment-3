/*
* This is the ProCess Class.
*
* @author  Hussein Mansour
* @version 1.0
* @since   2021-12-30
*/

/**
* ProCess Class.
*/
public class ProCess {

    /**
    * Method printn.
    *
    * @param num Variable.
    */
    public static void printn(int num) {
        // Condetion.
        if (num == 0) {
            return;
        }

        // print (*).
        System.out.print("* ");
        // Recursively.
        printn(num - 1);
    }

    /**
    * Method pattern.
    *
    * @param num Parameter.
    * @param numbb Parameter.
    */
    public static void pattern(int num, int numbb) {
        // Condetion.
        if (num == 0) {
            return;
        }

        // Print.
        printn(numbb);
        System.out.println("\n");
        // Recursively.
        pattern(num - 1, numbb + 1);
    }
}
