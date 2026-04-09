import java.util.Scanner;
public class string2 {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the char:");
//        char c = sc.next().charAt(0);
//        vowelChecker(c);
        pattern();
    }
    public static void vowelChecker(char c) {
        // String[] arr = {"a","e","i","o","u"};
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        /*
            char => single ekta byte 'a', 'b' OK, 'abcde' 'fsf' NOT OK
            string => collection of char, "a", "abcdef", "avssf"
         */
        boolean result = false;
        for (char x : arr) {
            if (x == c) {  // Always false, NEVER COMPARE BETWEEN CHAR AND STRING
                result = true;
            }
        }
        if(result) {
            System.out.println("Character is vowel.");
        } else {
            System.out.println("Character is not vowel.");
        }
    }
    public static void vowel(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Character is vowel.");
        } else {
            System.out.println("Character is not vowel.");
        }
    }
    public static void pattern() {
        int n = 10;

        /*
        * * *
        * * #
        * # #
        # # #

        #
        # #
        # # #
         */

        int k = 0;
        for(int i = n; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for(int j = 0; j < k; j++) {
                System.out.print("# ");
            }
            System.out.println();
            k++;
        }
        for(int j = 0; j < k; j++) {
            System.out.print("# ");
        }
    }
    /*
    *
    * *
    * * *
    * * * *

     */

    /*


     */
}