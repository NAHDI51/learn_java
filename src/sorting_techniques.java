import java.util.Scanner;

public class sorting_techniques {
    public static void arrMinimum(Scanner sc, int[]a){
        int min = a[0];
        int minIndex=0; // i ... a.length-1
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("MINIMUM "+min);
        for(int i=0;i<a.length;i++){
            if(a[i]<a[minIndex]){
                minIndex=i;
            }
        }
        System.out.println("MININDEX "+minIndex);
    }

    public static void Swap(int a,int b){
        a=10;
        b=20;
        int c=a;
        a=b;
        b=c;
        System.out.println(a+" "+b+" ");
    }

    public static void selection_sort(int[] arr) {
        // For each position i
        // assume arr.length = n
        // runtime n*n = n^2
        // (Worst case) time complexity: O(N^2)
        for(int i = 0; i < arr.length; i++) {  // n times
            // Find the minimum index between i to a.length-1
            int minIndex=i;
            for(int j = i; j < arr.length; j++){  // nearly n times
                if(arr[j] < arr[minIndex]){
                    minIndex=j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int c = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = c;
        }
    }

    public static void insertion_sort(int[] arr) {
        // For each element i
        // (we start from the second element, because an array
        // with only one element is always sorted)

        // (Worst case) time complexity: O(N^2)
        // n times loop
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            // For each element greater than arr[i];
            // almost n times
            // best case: while loop will run 0 times
            while(j >= 0 && arr[j] > key) {
                // Shift 1 block
                arr[j+1] = arr[j];
                j--;
            }
            // [j+1] no ghor khali hoise
            // Insert that element into the vacant position
            arr[j+1] = key;

//            for(int x : arr) {
//                System.out.print(x + " ");
//            }
            for(int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The array before sorting: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

//        selection_sort(arr);
        insertion_sort(arr);
        System.out.print("The array after sorting: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}