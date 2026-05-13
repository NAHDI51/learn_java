public class compareTo {
    public static void insertion_sort(String[] str) {
        // For each element i
        // (we start from the second element, because an array
        // with only one element is always sorted.


        // (Worst case) time complexity: O(N^2)
        // n times loop
        for(int i = 1; i < str.length; i++) {
            String key = str[i];
            int j = i-1;
            // For each element greater than arr[i];
            // almost n times
            // best case: while loop will run 0 time
            while(j >= 0 && str[j].compareTo(key) > 0) {
                // Shift 1 block
                str[j+1] = str[j];
                j--;
            }
            // [j+1] no ghor khali hoise
            // Insert that element into the vacant position
            str[j+1] = key;

//            for(int x : arr) {
//                System.out.print(x + " ");
//            }
//            for(int k = 0; k < arr.length; k++) {
//                System.out.print(arr[k] + " ");
//            }
//            System.out.println();
        }
    }


    public static void merge(String[] a, int low, int mid, int high) {
        // Arrays are so far empty, we need to fill them with the
        // value of a
        String[] left = new String[mid-low+1];
        String[] right = new String[high-mid];

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
                // left[li] < right[ri]
            } else if(left[li].compareTo(right[ri]) < 0) {
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

    public static void mergeSort(String[] a, int low, int high) {
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
        String a = "abcd";
        String b = "abcc";
        // a.compareTo(b)
        /*
        -1 -> When a < b
        0 -> When a == b
        1 -> When a > b
         */
        if(a.compareTo(b) < 0) {
            System.out.println("A is smaller than B.");
        } else if(a.compareTo(b) == 0) {
            System.out.println("A is equal to B.");
        } else if(a.compareTo(b) > 0) {
            System.out.println("A is greater than B");
        }
        String[] strs = {"d", "a", "b", "c"};
        mergeSort(strs, 0, strs.length-1);
        for(String s : strs) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}