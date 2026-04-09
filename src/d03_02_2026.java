import java.util.Scanner;

public class d03_02_2026 {
    public static void main(String[] args) {
//        int n;
//        System.out.println("Enter value of n: ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        sum(n, sc);
        arrays();
    }
    //passing as parameter: passing
    public static void printArray(int[] arr) {

    }

    public static void arrays() {
        // Second way -> direct
        int[] arr = {0,1,3,4,10};   /// ONLY ONE TIME POSSIBLE, not otherwise
        printArray(arr);

//        System.out.println("First element: " + arr[0]);
//        System.out.println("second element: " + arr[1]);
//        System.out.println("third element: " + arr[2]);
//        System.out.println("fourth element: " + arr[3]);
//        System.out.println("Final element: " + arr[arr.length-1]);

        // Accessing and printing
//        for(int i = 1; i <= arr.length; i++) {
//            System.out.println(arr[i - 1]); // i-1: 0,1,2,3,4
//        }
        // Traversal -> traverse
        /*
            travel -> noun -> ভ্রমণ
            traverse -> verb -> ভ্রমণ করা
            traversal -> the action of travelling
         */
        System.out.print("Before modyfying: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Modifying element
        arr[2] = 13;
        arr[0] = -5;
        System.out.print("After modifying: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void sum(int n, Scanner sc) {
        int totalSum = 0;
        // n = 1000
        // Not feasible
        /*
            int e1, e2, e3, e4, e5, e6, e7... , e1000;
         */
        // SYNTAX: new int[n]: () {} Third bracket: []
        // Third bracket: array related
        // First way
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            int e = sc.nextInt();
            totalSum += e;
        }
        System.out.println("Total sum: " + totalSum);
    }
}