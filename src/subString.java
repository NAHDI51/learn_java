import java.util.Scanner;

public class substring {

    /*
    s = "abcdabcd"
    t = "abc"
    t => substring of s

    t = "def"
    t => not a substring of s
    checkSubstring => check whether t is a substring of s
     */
    public boolean checkSubstring(String s, String t) {
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < t.length(); j++) {

            }
        }
    }

    /*
    main = abcdefgh
    sub = def (size = 3)
    // substring of main => jodi pao
    // not substring => jodi na pao

    01234567
    abcdefgh
    def
     def
      def
       def
        def
         def
          def STOP
     */

    public static boolean containsSub(String main, String sub) {
        int mlen = main.length();
        int slen = sub.length();

        for(int i = 0; i < mlen-slen; i++) {
            if(main.substring(i, i+slen).equals(sub)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*          012345678910 */
        String s = "abcdefghij";

        for(int i = 0; i < s.length() - 3; i++) {
            /*
                s.substring(start_index, end_index);
                i i+3
                0 3
                1 4
                2 5
                3 6
                4 7
                5 8
                6 9
             */
            System.out.println(s.substring(i, i+3));
        }
        String a = "abc";
        String b = "abc";

        if(a.equals(b)) {
            System.out.println("A equals B.");
        }
    }
}