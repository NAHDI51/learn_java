import java.util.Scanner;

public class exerciseUnit2 {
    public static void main(String[] args) {
        // x = 10, y = 5 z = 3
        // 1: Casework
        /*
        1 2 3

        x y z
        1 2 3 => sorted
        1 3 2 => 2 3 1 => 2 1 3 => not correct
        2 1 3 => 1 2 3 => true for all
        2 3 1 => 2 1 3 => false for A, 1 2 3, false for D, correct for C
        3 1 2
        3 2 1

         */
        /*
        x  y  z
        5  10 6
        5  3  10

         */

        //2 => pseudocode
//        size = password length
//        if(size < 8) {
//            print "Weak"
//        } else {
//            // By default size >= 8
//            if(password has special character) {
//                print "Strong"
//            } else {
//                print "Medium"
//            }
//        }

        // 3
        // WRONG

//        boolean answer = (3+4 == 5) != (3+4 >= 5);
//        System.out.println(answer);
//
//
         /*
         1 => length > 5 and indexOf(A) < 0
         2 => length > 5 and indexOf(B) < 0
         3 => length <= 5 and indexOf(A) < 0

         1 => indexOf(A) < 0 and length > 5
         3 => indexOf(A) < 0 and length <= 5
         2 => indexOf(B) < 0 and length > 5


          */

        char c = 'a';

        /*
        a, b, c, ..., z
         */
        /*
        a,b,c,..,z
         */
//        int num = 2030;
//        if('a' <= c && c <= 'z') {
//
//        }
//        if(1000 <= num && num < 10000) {
//
//        }
        /*
        x
        boolean z = (y > 50000)
        !z = (y <= 50000)

        a = !x && z
         */

        boolean result = false;
        String str1 = "", str2 = "abs";

        if(str1.equals(null) && str2.equals(null)) {
            result = str1 == str2;
        }
        System.out.println(result);
    }
}