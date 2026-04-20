import java.util.Scanner;

public class recursion {
    public static void go1(int n) {
        System.out.println("Hello from go1! Your integer is: " + n);
    }
    public static void go(int n) {
        if(n == 0) {
            System.out.println("Termination point reached.");
            return;
        }
        System.out.println("your integer is: " + n);
        go(n-1);
    }
    public static int f(int n) {
        if(n == 1) return 1;
        else if(n%2 == 0) {
            return (n/2) + f(n-1);
        }
        else {
            return (n - 1) + f(n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Value of f for 5 is : " + f(5));
    }
    public static void isSorted(Scanner sc) {
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag = true; // INitially, everything is okay
        /*
            1. Check if any index goes out of bound
            i = 0 diye start korle i-1 = -1 hoy (outofbound)

            2. Ekta jinish barbar print korle loop er moddhe,
            ekbar print korle loop er baire thake

            3. Jokhon "Check" or condition, generally flag diye
            korte hoy
         */
        for(int i=0;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                flag = false;
            }
        }
        if(flag) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is unsorted.");
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}