public class runtimeAnalysis {
    public static void main(String[] args) {

        // 5 6 7 8 9 10 11 12 13 14 15
        for(int i = 5; i <= 15; i++) {
            // doSomething();
        }

        // (R - L + 1) =>
        // [L, R], L, R => inclusive => L, R, ei duita ke include korbe
        // (L, R), L, R => exclusive => L, R konotakei count korbena
        for(int i = L; i <= R; i++) {

        }

        //  i < R; => i <= (R-1)
        for(int i = L; i < R; i++) { => for(int i = L; i <= R-1; i++)

        }

        int count = 0;
        // 5 times: 0 1 2 3 4
        for(int i = 0; i < 5; i++) {
            // This block

            // 0 2 4
            if(i%2 == 0) {
                // Runtime: 3
                count++;
            }
        }
        // 3
        System.out.println(count);

        // 4 times 10 7 4 1
        int x = 10;
        while(x > 0) {
            System.out.println(x + " ");
            x -= 3;
        }

        // 15 13 11 9 7 5 => 6 times
        // 15 11 7 => 3 times
        for(int i = 15; i >= 5; i -= 4) {

        }

        // 16 14 12 10 8 6 4 2 => 8 times
        for(int i = 16; i >= 2; i -= 2) {

            // 16 10 4 => 3 times
            if(i%3 == 1) {
                System.out.println(i + " ");
            }
        }

        int i = 5;
        // 5 7 9 11 13 15 17 => 7 times
        while(true) {
            // (i-1) = 2*8 => i = 2*8+1 => i = 17
            /*
            ((i-1)/2) == 8
            (i-1) = 8*2 = 16
            i ==  17 hoye jacche

             */
            // equivalent condition
            if(i == 17) {
                break;
            }
            if(((i-1)/2) == 8) {
                break;
            }
            i += 2;
        }
        // 2 4 8 16 32 => 5 times
        for(int i = 2; i < 33; i *= 2) {

        }
}