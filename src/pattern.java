public class pattern {
    public static void main(String[] args) {
        int n = 10;

        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        *
        * => THOUGHT 1: i er value joto kom, j er value toto beshi
        * => THOUGHT 2: i er value n theke minus korlei kaj hoye jay
        * => THOUGHT 3: n theke shuru kore ekta ekta kore komtese
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
         */
        // Hint: new variable use korte hobe
        /*
        q = 1
        print q
        q++
        1
        2 3
        4 5 6
        7 8 9 10
         */

//        int q = 1;
//        for(int i = 1; i <= n; i++) {
//            /*
//                Thought process: i = 1 2 3 4 5 ....
//                Shoja triangle er khetre i er value er sathe konovabe correspond korate hobe
//
//                It's all about how you see things
//             */
//            for(int j = 1; j <= i; j++) {
//                // i+1 i+2, ... n
//                // i, i+1, ... n
//                System.out.print("*");
//                q++;
//            }
//            System.out.println();
//        }

        /*
        1. Ki structure banaccho
        2. Ki print korteso
         */

//        for(int k = 1; k <= n; k++) {
//            for(int l = k+1; l <= n; l++) {
//                // i+1 i+2, ... n
//                // i, i+1, ... n
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for(int i = 1; i <= n; i++) {
//            for(int j = 1; j <= i; j++) {
//                // i+1 i+2, ... n
//                // i, i+1, ... n
//                System.out.print("* ");
//            }
//            // If n ta row print hoye jay
//            // then keep decrementing;
//            System.out.println();
//        }

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for(int j = i; j <= n; j++) {
                // i+1 i+2, ... n
                // i, i+1, ... n
                System.out.print("*");
            }
            // If n ta row print hoye jay
            // then keep decrementing;
            System.out.println();
        }

        /*
         * * * * * *
           * * * * *
             * * * *
               * * *
                 * *
                   *
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         */

        int sum = 0;
        // 1 2 3 4 5
        // Continue => skip the turn
        //
        for(int i = 1; i <= 5; i++) {
            // 2, 4 skips
            if(i % 2 == 0) continue;
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }
}