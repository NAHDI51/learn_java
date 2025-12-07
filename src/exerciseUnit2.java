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

        boolean answer = (3+4 == 5) != (3+4 >= 5);
        System.out.println(answer);
    }
}