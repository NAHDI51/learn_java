public class arrayInitial {
    public static void main(String[] args) {
        // fIrst method => using the word new
        int[] arr = new int[5]; // declare

        // 10 element array: {1,2,3,4,5,6,7,8,9,10}
        // second method => direct initialization
        int[] arr2 = {5,7,9,11,13,2,4,5,234,5,26,2,36,6,3453,34,6,3,63,4,63,46,3,46,36,3,6};

        int[] arr3 = {1,2,3,4,5,6,7,8,9,10};
        // arr[0], arr[1], arr[2], ... arr[9] -> declare
//        arr[4] = 15; // same as one variable, like value

        // Convert to {10,9,8,7,6,5,4,3,2,1}
        /*
        arr[0] = 10;
        arr[1] = 9;
        arr[2] = 8;
        arr[3] = 7;
        arr[4] = 6;

        // Create a loop and do this!
         */

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
//        arr[2]; okay
        // arr(2); not okay -> method

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

        int value = 5; // declare
        System.out.println("The value is: " + value);
        value = 4; // edit
        System.out.println("The value is: " + value);


    }
}