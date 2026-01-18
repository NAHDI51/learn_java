import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        /*
            operator => jegula diye express
         */
        // Starting of x: use int only once.
        int x = 5 + 10;
        x++;
        x = 25;

        if(x % 4 == 3) {
            System.out.println("X divided by 4 remainder is 3");
        }
        Scanner sc = new Scanner(System.in);
        sc.nextFloat();

        /*
            int => integer => 4 byte

            32 bit
            0 0000000 00000000 00000000 00000000
            +32
            -32

            2^31 ta different value
            [0, 2^31-1]

            x = 18
            binary representation of x: 10010

            RULE OF THUMB
            0 1111111 11111111 11111111 11111111 + 1
            = 1 0000000 00000000 00000000 00000000
         */
        x = Integer.MAX_VALUE;  // 2^31-1
//        x = Integer.MIN_VALUE;  // -2^31

        // Overflow: out of range
        System.out.println(x+1);

        // constant
//        final int y = 10;
//        y = 15;

        final double PI = 3.14159;


    }
}