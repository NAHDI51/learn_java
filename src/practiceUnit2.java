public class practiceUnit2 {
    public static void main(String[] args) {
        // i = 3, j = 2, 3*2 = 6
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 2; j++) {
                /*
                    (i, j) (i*j)
                    1, 1    1
                    1, 2    2
                    2, 1    2
                    2, 2    4
                    3, 1    3
                    3, 2    6
                 */
            }
        }

        // 24 times
        // 6 times
        for(int i = 5; i <= 15; i += 2) {
            // 4 times: 15 12 9 6
            for(int j = 15; j >= 5; j -= 3) {
                //doSomething()
                /*
                    (i, j)
                    5 * 15
                    5 * 12
                    5 * 9
                    5 * 6
                    7 * 15
                    7 * 12
                    7 * 9
                    7 * 6
                    9 * 15
                    9 * 12
                 */
            }
        }

        // Not nested
        if(cond1 && cond2) {

        }
        if(cond1)
            if(cond2)
                System.out.println("Hello");

        // NOT PROPER
        if(x > 0 && if(y < 0)) {

        }

        // Nested
        if(cond1) {
            if(cond2) {

            }
        }
        int sum = 0;
        // 1 2 3 4 5
        // Continue => skip the turn
        //
        for(int i = 1; i <= 5; i++) {
            // 2, 4 skips
            if(i % 2 == 0) continue;
            sum += i;
        }

        public static boolean isBedTime(int currentHour, boolean isWeekday, boolean isTired) {
            boolean withinBedtimeHours = (currentHour >= 22 || currentHour < 6);

            if((withinBedtimeHours && isWeekday) || (isTired && !isWeekday)) {
                return true;
            } else {
                return false;
            }
        }

        public static int iterativeFactorial(int n) {
            int result = 1;
            for(int i = 1; i <= n; i++) {
                // Missing code
                // n = 4: 1 * 2 * 3 * 4
                // n = 6: 1 * 2 * 3 * 4 * 5 * 6
                result = result * i;
            }
            return result;
        }
    }

    public boolean isValid(String password) {
        // 1. Check length requirement
        if(password.length() < 8) {
            return false;
        }

        boolean okay = false;
        // 2. Check for at least one digit
        for(int i = 0; i < password.length(); i++) {
            char current = password.charAt(i);
            // Check for digit
            if('0' <= current && current <= '9') {
                // We got one digit
                okay = true;
            }
        }
        if(!okay) {
            return false;
        }

        // 3. Check for password substring (Case insensitive)
        // PASSword, Password => equal
        if(password.equalsIgnoreCase("password")) {
            return false;
        }

        // If all checks pass:
        return true;
    }
}