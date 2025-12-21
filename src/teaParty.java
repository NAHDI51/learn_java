public class teaParty {
    public int teaParty(int tea, int candy) {
        if(tea >= 5 && candy >= 5) {
            if((tea >= 2 * candy) || (candy >= 2 * tea)) {
                return 2;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }
    /* De morgan
    !(a && b) = !a || !b
    !(a || b) = !a && !b

    a = condition: num > 50
    !a = num <= 50

    isWeekday => weekend => !isWeekday

    b = condition: num2 == 5;
    !b = num2 != 5

    !a && !b = !(a || b)
     */
    public static void main(String[] args) {
        int a = 5;

        /*
        Tips: Chronologically condition dekhe jaba.
        jeta satisfy korbe sheta baade shob cut kore diba

        && => both are true
        || => either or both one is true
        ! => condition ke ultay dey

         */

        /*
        (true && false) || (true && true)
        false || true
        true
         */
        char ch = 'c';
        // [a,b]
        if('a' <= ch) {
            if(ch <= 'z') {
                System.out.println("Following is a letter.");
            }
        }
        if('a' <= ch && ch <= 'z') {
            System.out.println("Following is a letter.");
        }

//        if(a < 3) {
//            System.out.print("A");
//
//            if(a >= 5) {
//                System.out.print("H");
//            } else if(a < 6) {
//                System.out.print("I");
//            } else {
//
//            }
//        }
//        if(a > 7) {
//            System.out.print("B");
//        } else {
//            System.out.print("C");
//        }
//        if(a == 5) {
//            System.out.print("D");
//            if(a > 3) {
//               System.out.print("E");
//            } else if(a > 4) {
//                System.out.print("F");
//            } else {
//                System.out.print("G");
//            }
//        }

        // [start, end]
//        for(int i = start; i <= end; i++) {
//
//        }
//

        /*
            5 3
            5 2
            5 1
            3 3
            3 2
            3 1
            1 3
            1 2
            1 1
         */
//        System.out.println();
//        for(int i = 5; i >= 1; i--) {
//            for(int j = 3; j >= 1; j--) {
//                //
//                if(i % 2 == 1) {
//                    System.out.println(i*j + " ");
//                }
//            }
//        }

//        int count = 0;
//        for(int i = 14; i > 0; i -= 3) {
//            if(i % 2 == 1) {
//                // i = 11, i = 5
//                count++;
//            }
//        }
//        System.out.println(count);

        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        *
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
         */

        /*
        HW: Play with the invariants
         */
//        for(int i = 1; i <= 5; i++) {
//            for(int j = 1; j <= 5-i+1; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        int num = 12345;
        while(num != 0) {
            /*
            12345 % 10 = 5
            12345 / 10 = 1234
            1234 % 10 = 4
            1234 / 10 = 123
            123 % 10 = 3
            123 / 10 = 12
            12 % 10 = 2
            12 / 10 = 1
            1 % 10 = 1
            1 / 10 = 0
             */
            System.out.print(num % 10 + " ");
            num /= 10;
        }

        String s = "Abcdef";
        // s.substring(start, end+1) => [start, end)
//        s.substring(2, 5);

        /*
        1. s.substring(i, i+2) => prints 2 character starting from i
        2. i = 0, i < s.length() - 1, => goes from A to e.
        3.
         */
//        for(int i = 0; i < s.length()-2; i++) {
//            /*
//            i = 2
//            i + 1 = 3
//             */
//            System.out.print(s.substring(i, i+3));
//        }
        // [start, end) => [1, 4]
        System.out.println(s.substring(1, 5));
    }
}