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

    public static boolean linearSearch(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if(key == arr[i]) {
                return true;
            }
        }
        // x -> each element of arr
        // Enhanced loop
        for(int x : arr) {
            if(key == x) {
                return true;
            }
        }
        return false;
    }

    // Recursive implementation
    public static boolean binarySearchRecursive(int[] arr, int low, int high, int key) {
        if(low > high) {
            return false;
        }
        // Average of low and high
        int mid = (low + high) / 2;
        if(arr[mid] == key) {
            // we found the key
            return true;
        } else if(arr[mid] < key) {
            // Go right
            return binarySearchRecursive(arr, mid+1, high, key);
        } else {    // arr[mid] > key
            return binarySearchRecursive(arr, low, mid-1, key);
        }
    }

    // Iterative implementation
    public static boolean binarySearchIterative(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;

        // low > high -> false
        while(low <= high) {
//            int mid = (low + high) / 2;
            int mid = low + (high - low) / 2;

            // check the current lement
            if(arr[mid] == key) {
                return true;
            } else if(arr[mid] < key) {
                low = mid + 1;
            } else { // arr[mid] > key
                high = mid - 1;
            }
        }
        // low > high
        return false;
    }

    public static void merge(int[] a, int low, int mid, int high) {
        // Arrays are so far empty, we need to fill them with the
        // value of a
        int[] left = new int[mid-low+1];
        int[] right = new int[high-mid];

        // Assign corresponding values of a;
        for(int i = 0; i < left.length; i++) {
            left[i] = a[low+i];
        }
        for(int i = 0; i < right.length; i++) {
            right[i] = a[mid+i+1];
        }

        // Merging process
        int k = low;    // Index of the main array
        int li = 0;     // Left Index
        int ri = 0;     // Right Index

        // While we have elements to pick from either left or right
        // if left remains OR right remains
        while(li != left.length || ri != right.length) {
            // If we have picked all elements from left already
            if(li == left.length) {
                a[k] = right[ri];
                ri++;
            } else if(ri == right.length) {
            // If we have picked all elements from right already
                a[k] = left[li];
                li++;
            } else if(left[li] < right[ri]) {
            // At this point, none of the array has been taken fully.
            // So, compare, and take the smaller one
                a[k] = left[li];
                li++;
            } else {
                a[k] = right[ri];
                ri++;
            }
            k++;
        }
    }

    public static void mergeSort(int[] a, int low, int high) {
        // if(low == high) then the array is already sorted
        if(low < high) {
            int mid = (low + high) / 2;     // mid = average(low, high)
            // Sorts the array from low to mid
            mergeSort(a, low, mid);
            // Sorts the array from mid+1 to high
            mergeSort(a, mid+1, high);

            // Finally, merge the two partitions
            merge(a, low, mid, high);
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
//        insertion_sort(arr);
        mergeSort(arr, 0, arr.length-1);
        System.out.print("The array after sorting: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

//        boolean found = binarySearchRecursive(arr, 0, arr.length-1, 10);
        boolean found = binarySearchIterative(arr, 9);
        if(found) {
            System.out.println("The integer is found!");
        } else {
            System.out.println("The integer is not found!");
        }
    }
}