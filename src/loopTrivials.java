public class loopTrivials {
    public static void main(String[] args) {
        int a = 9, b = 10, c = 10;

//        // We can add as many things in the third bracket
//        for(int i = 0; i < 5; i++, a += 10, b *= 2, c -= 5) {
//            // ei 5 bar cholar time e ja iccha tai korte parbo
//            System.out.print(i + " " + a + " " + b + " " + c + "\n");
//            // Expression
//        }

        // Any of the fields in for loop is optional
//        int i = 5;
//        for( ;; i++) {
//            System.out.print(i + " ");
//            if(i > 10) {
//                break;
//            }
//        }
//        // i starts from 11
//        for(;;) {
//            System.out.print(i + " ");
//            i++;
//            if(i > 20) {
//                break;
//            }
//        }

        // for(initial; condition; expression) {

        // i < 5 AND a <= 20
        /*
            i a b c
            0 9
            1 10
            2 11
            3 12
            4 13
            5 14
            6 15
            7 16
            8 17
             */
        for(int i = 0; i < 5 || a <= 20; i++, a++, b++, c++) {
            // b er condition nai, o nijer moton kaj kore jacche
            System.out.println(i + " " + a + " " + b + " " + c);

        }

        // x = 10, y = 5 z = 3
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
    }
}