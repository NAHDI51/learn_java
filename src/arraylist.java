import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collection;
import java.util.Scanner;

public class arraylist {
    public static void insertionSort(int[] arr) {

    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[1] = 3;
        // IndexOutOfBoundException -> index out of bound
//        arr[12] = 5;
        // Size of the array is fixed
        arr = new int[20];
//        sum(5, 10);
        /// array syntax
        int[] arr2 = new int[10];
        ///  ArrayList Syntax
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        // get() array index
        arr[2] = 5;
        // set() set some value
        arr[2] = 10;
        // add one element -> ARRAY SIZE IS FIXED
        // insert() -> inserts an element in array
        // Delete one element -> ARRAY SIZE IS FIXED
        // remove() -> removes an element in an array

        arrList.add(1);
        arrList.add(2);

//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " "); // print array
//        }

//        get() -> arr[]
        System.out.println("After adding 1 and 2: ");
        for(int i = 0; i < arrList.size(); i++) {
//            System.out.print(arrList[i] + " ");
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();
        System.out.println("Size : " + arrList.size());

        arrList.add(3);
        arrList.add(4);
        System.out.println("After adding 3 and 4: ");
        for(int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();
        System.out.println("Size : " + arrList.size() );

        // Insertion method 2
//        arrList.add(index, value); // insert value to index position
        arrList.add(0, 5);
        System.out.println("After adding 5 ");
        for(int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();
        arrList.add(2, 6);
        System.out.println("After adding 2 in 6: ");
        for(int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();

        // Set a value
//        arr[2] = 10;
        arrList.set(2, 10);
        System.out.println("After making 6 to 10: ");
        for(int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();

        arrList.remove(4);
        System.out.println("After removing 4th index element: ");
        for(int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();

        ArrayList<Boolean> ab = new ArrayList<Boolean>();
        ArrayList<Double> db = new ArrayList<Double>();
        ArrayList<String> sb = new ArrayList<String>();

        // get(), set(), add(), remove()
        Collections.sort(arrList);
        System.out.println("After sorting; ");
        for(int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();

        Collections.reverse(arrList);
        System.out.println("After reversing: ");
        for(int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();

        arrList.findFirst(5);
        arrList.findAny(5);
        Collections.binarySearch(arrList, 5);
    }
    public static void enhancedForloop() {
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        // Enahanced for loop
        for(int x : a) {
            System.out.println(x);
        }

        int[][] a2 = new int[10][10];
        for(int i = 0; i < a2.length; i++) {
            for(int j = 0; j < a2[0].length; j++) {
                System.out.print(a2[i][j] + " ");
            }
            System.out.println();
        }

        // Enhanced for loop
        for(int[] x : a2) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        int rows = a2.length;
        int cols = a2[0].length;

        // row major
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; i++) {
                System.out.print(a2[i][j] + " ");
            }
            System.out.println();
        }

        // column major
        for(int j = 0; j < cols; j++) {
            for(int i = 0; i < rows; i++) {
                System.out.print(a2[i][j] + " ");
            }
            System.out.println();
        }
    }
//    getFirstOccurance(int[] arr, int key) -> index of first occurance of key
    public static void shiftRight(int[] arr, int e) {
        ArrayList<Integer> new_arrList = new ArrayList<Integer>();
        for(int i = 0; i+e < arr.length; i++) {
            new_arrList.add(arr[i+e]);
        }
    }
}