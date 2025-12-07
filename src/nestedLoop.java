import java.util.Scanner;

public class nestedLoop {
    /*
    -------------------
    ||
    ||
    ||
    ||
    ||
     */
    public static void main(String[] args) {
        /*
        Matrix
         */
        int n = 5;

        // Write multiplication table
        // [1,n] porjonto shobgular namta

        /*
        n = 3
        1 2 3 4 5 6 7 8 9 10
        2 4 6 8 10 12 14 16 18 20
        3 6 9 12 15 18 21 24 27 30
         */

        // Hint: you need to use nested loop
        /*
        2D structure/2 ta independent variable
         */
        for(int i = 1; i <= 5; i++) {
            // 1 2 3 .. 5
            // Hint 2: namta of 1 ghor
            for (int j = 1; j <= 10; j++) {
                // 1 2 3 4 5... 10
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}