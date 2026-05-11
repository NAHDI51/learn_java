import java.util.Scanner;

public class revision_final_1 {
    // Internal variables -> ATTRIBUTES
    int c, d;

    // CONSTRUCTOR
    /*
        1. no public static return type
        2. Is called when object is instantiated
     */
    // PARAMETERIZED CONSTRUCTOR
    revision_final_1(int inputC, int inputD) {
        c = inputC;
        d = inputD;
    }
    // NO ARGUMENT CONSTRUCTOR
    revision_final_1() {
        // Default value
        c = 0;
        d = 0;
    }
    // ALWAYS NON STATIC
    /*
        ACCESSOR
     */
    public int getC() {
        return c;
    }
    public int getD() {
        return d;
    }
    /*
        MUTATOTRS
     */
    public void setC(int c) {
        // this keyword is used in order to avoid naming conflicts.
        // this.variable represents the attribute (internal variable)
        this.c = c;
    }
    public void setD(int d) {
        this.d = d;
    }

    // sum -> method
    // int a, int b -> parameter
    public static int sum(int a, int b) {
        return (a+b);
    }
    // OVERLOADING -> different set of parameter with same method name

    /*
        public -> available to all
        protected -> available for own class + inherited class
        private -> available to its own class only
     */
    // PRIVATE CAN BE CALLED FROM ITS OWN CLASS
    private static int sum(int a, int b, int c) {
        return (a + b + c);
    }
    public static void main(String[] args) {
        // class -> Scanner class
        // sc -> Scanner class er ekta OBJECT
        // new Scanner(System.in) -> INSTANTIATE
         Scanner sc = new Scanner(System.in);
         sc.nextInt();
         // Object banaye use kora lagtese na
         int mn = Math.abs(-5);
         sum(2,3,4);

         // Comments
        /*
        Multi
        Line
        Comment
         */
        // USER INPUT
        // a is a variable of type int
//        int a = sc.nextInt();
//        double d = sc.nextDouble();
//        char c = sc.next().charAt(0);
//        // s is a variable of type String
//        String s = sc.next();
////        long -> 64 bit -> 8 byte
////        int -> 32 bit -> 4 byte
//        long l = sc.nextLong();
//        boolean b = sc.nextBoolean();

        // OPERATORS
        // + - * / % USE -> EXPRESSION
        // == != <= < > >= USE -> CONDITION

        // ASSIGN some values to a -> ASSIGNMENT
//        a = 5+3;    // EXPRESSION
//        (b == true) // CONDITION
        // CONDITION -> if/else
        // EXPRESSION CAN NEVER GO TO IF/ELSE

//        if(a = 5 + 3) // EXPRESSION -> cannot be used in if/else
//        if(a == 5 + 3) // CONDITION -> checks if a is EQUAL TO 5+3=8

        // 2^31 - 1
        System.out.println("Max value: " + Integer.MAX_VALUE);
        // OVERFLOW: when an integer goes out of its specified range
        // IN THIS CASE: 2^31, which is not in the range of Integer
        int limit = Integer.MAX_VALUE;
        System.out.println("Value: " + (limit+1));
        System.out.println("Value: " + (Integer.MIN_VALUE-1));

        // final -> constant
        final int fin = 5;
//        fin = 8;    // Not possible, because final

        // Math class
//        int sixty_four = Math.pow(8, 2);  // 8 to the power 2
//        Math.abs(-5)    // Returns absolute value

        // Returns a random double between 0.0 to 1.0
        Math.random();

        // Take a random number between L and R
        int L = 1;
        int R = 3;
        // Range -> [L,R] -> R-L+1
        int choice = L + (int) (Math.random() * (R - L + 1));

//        Math.asin -> sin^-1(x)
//        Math.cos(), Math.acos() -> cos^-1(x)
        String s = "Abcdefg";
        // Accessing ith index
        for(int i = 0; i < s.length(); i++) {
            // s.substring(start, end) [start, end)
            String sub = s.substring(i, i+1);
            sub = s.substring(i, s.length());
            System.out.println(sub);
        }
        // s.compareTo(t)
        // 0 -> s = t
        // Otherwise, not 0
        int comp = s.compareTo("Abcdefg");
        if(comp == 0) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
//        s.equals("Abcdefg");

        int number = 5;
        if(number < 3) {
            System.out.println("Number is smaller than 3");
        } else if(number == 3) {
            System.out.println("Number is equal to 3");
        }else {
            System.out.println("Number is bigger than 3");
        }
        boolean cond = false;
        if(!cond) {
            // !cond -> false -> true, true -> false
            System.out.println("Not cond!");
        } else {
            System.out.println("Cond!");
        }

        int numb = 12;
        // BOTH this AND that
        if(numb%2 == 0 && numb%3 == 0) {
            System.out.println("The number is divisible by 2 AND 3");
        } else if(numb%2 == 0 || numb%3 == 0) {
            System.out.println("The number is divisible  by 2 OR 3");
        }

        if() {
            // Nested condition
            if(){

            }
        }

        while() {

        }
        for() {
            // Nested for loop
            for() {

            }
        }
        // check runtimeAnalysis.java

        // De morgan
        (!a && !b) -> (!(a || b));
        (!(a && b)) -> (!a || !b);
    }
//    int getMax(int max, int b) {
//        int[] arr = new int[10];
//        int max = arr[0];
//        for(int x : arr) {
////            if(max < x) {
////                max = x;
////            }
//            // Math.max(a, b) -> returns the maximum between a and b
//            max = Math.max(max, x);
//        }
    // ACCESSOR AND MUTATOR -> get() and set() -> check RockPaperScissor
    }
    // OBJECT REFERENCE
    int shiftLeft(Scanner sc) {

    }
}