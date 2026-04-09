import java.util.Scanner;

public class loopsum {
    public static void main(String[]args){

//System.out.print(Sum());
//        Sum();
        makeFactorial();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // OddEvenSum(int n, Scanner sc) // wrong
        OddEvenSum(n, sc); // PASS, NOT DECLARATION
    }


    public static void  Sum() {
        int sum = 0;
        //int e;
        for (int i = 1; i < 10; i++) {
            // Indentation
            int e = sc.nextInt();
            sum += e;
        }
        System.out.println(sum);
    }

//    public static void Sub() {
//        int e = 5;
//        int a = 10;
//        // Forward 4 space -> tab
//        // backward 4 space -> shift + tab
//        for(int i = 0; i < 10; i++) {
//            e += 5;
//            e = i%2; // valid -> e te i%2 er value assigned hocche
//            i%2 = e; // invalid -> i%2 te e er value assigned hocche
//
//            /*
//                You eat rice // valid
//                Rice eats you // invalid
//             */
//            i != e%2; // condition -> if
//            // Normally i = something -> expression
//
//            i = e%2; // Expression
//            i == e%2 // Condition
//
//            /*
//                Condition can ONLY be used in if, or for loop, or while loop
//                if(i == e%2) {  // valid
//                }
//                if(i = e%2) {  // Invalid
//                }
//
//                for(EXPRESSION ; i == e%2; i++) {  // CONDITION USED IN THE MIDDLE
//                }
//                while(i == e%2) {   // while loop condition
//                }
//
//
//             */
//        }
//    }
    // oneTwoThree -> camel casing
    // one_two_three ->
    public static void makeFactorial(){
        int factor=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n! = 13 = 1*2*3*4...*13 // too big of a number.
        if(n>12){
            System.out.println(" The factorial is too big: " +n);
            return;
        }

        /*
            i = 1, .. 11
            n * 1 * 2 * 3 * 4 * 5 ... * 11

            n = 5 => 5 * 1 * 2 * 3 * 4 * ... * 11
            factor = 1
            1 * 1 * 2 * 3 * 4 .. * 11
         */
        for(int i=1; i<=n; i++){
            factor *= i;
        }
        // print time: print outside the loop
        System.out.println("Factorial of a number: " + factor);
    }

    public static void OddEvenSum(int n, Scanner sc) {
        int oddsum = 0;
        int evensum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of e:");
            int e = sc.nextInt();
            if (e % 2 == 0) {
                evensum += e;
            } else {
                oddsum += e;
            }
        }
        System.out.println("EVENSUM:" + evensum);
    }




    }