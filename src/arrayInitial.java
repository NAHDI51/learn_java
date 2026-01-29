public class arrayInitial {
    public static void main(String[] args) {
        // fIrst method => using the word new
        int[] arr = new int[5];

        // second method => direct initialization
        int[] arr2 = {5,7,9,11,13,2,4,5,234,5,26,2,36,6,3453,34,6,3,63,4,63,46,3,46,36,3,6};

//        arr2[5] = 15; // INVALID, BECAUSE out of range index

        // 0 based-indexing
        ///  array[index] = value;
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 9;
        arr[3] = 11;
        arr[4] = 13;
        System.out.println("The 3rd element of the array is: " + arr[2]);

//        arr[-2] = 5;
        System.out.println("args: ");
        // arr.length => denotes the length of the array

        // array jekhane, loop shekhane
        for(int i = 0; i < args.length; i++) {
            // Subscript er moddhe jekono non-negative integer possible
//            System.out.print(arr2[i] + " ");
            System.out.println(args[i]);
        }
        /* DON'T DO THIS
        System.out.print(arr2[0] + " ");
        System.out.print(arr2[1] + " ");
        System.out.print(arr2[2] + " ");
        System.out.print(arr2[3] + " ");
        System.out.print(arr2[4] + " ");
        System.out.print(arr2[5] + " ");
        System.out.print(arr2[6] + " ");
        System.out.print(arr2[7] + " ");
        System.out.print(arr2[9] + " ");
        System.out.print(arr2[10] + " ");
        */
        System.out.println();
    }
}