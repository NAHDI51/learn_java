

public class d09_03_2026 {

    public void changeNegative(int[] data) {
        for(int x : data) {
            if(x < 0) {
                x = 0;
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {-3, -2 , 5, 6, 7};

        /*
            Declare an array of 10 elements
            Scan the 10 elements
            print the 10 elements
         */


        // Enahnaced for loop in a nutshell
        for(int i = 0; i < a.length; i++) { //Traverse
            int x = a[i];
            System.out.print(x + " ");
        }
        System.out.println("Array then: ");
        for(int x : a) {    // Enhanced for loop
            System.out.print(x + " ");
        }
        System.out.println();
        for(int x : a) {
            if(x < 0) {
                x = 0;
            }
        }
//        int y = -5;
//        int t = y;  // CHange the value of t, not y
//        if(t < 0) {
//            t = 0;
//        }

        for(int i = 0; i < a.length; i++) {
            int x = a[i];   // Declare x to be equal to a[i]
            // a variable named x, then changed the value of x
            if(x < 0) {
                x = 0;  // not a[i]
            }
        }
        System.out.println("Array now: ");
        for(int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}