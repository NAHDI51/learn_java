//public class revision2 {
//    public static boolean isEven(int n) {
//        boolean result = true; // Declare -> result naame kichu ase
//
//        // Expression/statement -> n%2 = 0
//        // 1. condition -> n%2 == 0
//        if(n%2==0) {
//            result = true;  // expression/assignment
//        } else {
//            result = false;
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        // main theke n input nite
//        /*
//            1. First, declare n, and take input from the user using proper methods.
//            2. Call isEven(n), and based on conditions print the specific stuffs
//         */
//        // isEven(n) -> true -> print("The number is even")
//        // isEven(n) -> false -> print("The number is false")
//
//        /*
//
//            TWO PITFALLS ON WRITING METHOD
//            1. Forgetting return type and returning
//            2. Missing some brackets
//         */
//    }
//}

import java.util.Scanner;

public class array {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
//        System.out.println(isEven(a));
        boolean result = isEven(a);
        if(result==true){
            System.out.println("The boolean result is true");
        }
        else{
            System.out.println("The boolean result is False");
        }
    }

    public void fun() {
        int r = 5;
        for(int i = 0; i < 10; i++) { // Block er moddhe i declare
            int j = 5;
            if(i%2 == 1) {
                // block inside block
                int p = 10;
                System.out.println(j);
            }
            // outside if block
            System.out.println(j);
            System.out.println();
        }
//        System.out.println(i):

        // outside of the block
        /*
            {
                int p;
                {
                    int q;
                    print(p) // valid
                }
                print(q) // invalid
            }

         */
    }

    public static int sum(int a, int b) {
//        System.out.println(r);
        return a + b;
    }

    public static boolean isEven(int a) {
        boolean result = false;
        if(a%2==0){
            result =true;
        }
        else{
            result = false;
        }
        return  result;
    }

}