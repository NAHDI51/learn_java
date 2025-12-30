/*
    SYNTAX: Grammar/Structure of the language

    0. First e class er declaration, 2nd e methods
    1. File name and class name SHOULD ALWAYS be the same
    2. class name != method name

    3. PRACTICE: i, j egula loop chalanor jonne use kora hoy
 */
public class practiceMethod {
    // Constructor: jodi class name = method name
    public static boolean practicemethod() {

    }
    public void asdfbasd() {

    }

    /*
        @brief: returns a+b
     */
    public int sum(int a, int b) {
        /*
            Loop: i, j
         */
        return a + b;
    }
    public static void main(String[] args) {
    /*
        Data type

        int => integer
        boolean => [0,1]
        double => decimal value: 3.14159
        String =>
     */
        // SYNTAX: type VARIABLE_NAME = VALUE

        // NOT POSSIBLE
        int integer = 1;
        boolean c = integer;

        // NOT POSSIBLE
        boolean b = true;
        int integer2 = b;

        // NOT POSSIBLE
        double pi = 3.14159;
        int integer3 = pi;

        // POSSIBLE
        double pi2 = 3.14159;
        int integer4 = (int) pi2;

    }
}
