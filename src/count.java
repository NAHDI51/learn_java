import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        countOccurance(sc, arr);
    }
    public static void countOccurance(Scanner sc, int[] arr) {
        // Get the max element
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int l = sc.nextInt();
        int r = sc.nextInt();
        // INitialize count array with size max+1;
        int[] count = new int[r-l+1];

        // Count the number of occurance of each item
        for(int i = 0; i < arr.length; i++) {
            if(l <= arr[i] && arr[i] <= r) {   // l <= arr[i] <= r
                count[arr[i]-l]++;
            }
        }
        for(int i = 0; i < count.length; i++) {
            if(count[i] > 0) {
                System.out.println("Occurance of " + i+l + " is " + count[i]);
            }
        }
    }
    public static void countDuplicates(Scanner sc, int[] arr) {
        // Get the max element
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // INitialize count array with size max+1;
        int[] count = new int[max+1];

        // Count the number of occurance of each item
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for(int i = 0; i < count.length; i++) {
            // For count
//            if(count[i] > 0) {
//                System.out.println("Occurance of " + i + " is " + count[i]);
//            }
            // For duplicates
            if(count[i] > 1) {
                System.out.println("Value " + i + " has duplicates!. count: " + count[i]);
            }
        }
    }
}