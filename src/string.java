import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String a = "abcdef";    // string = char[] -> single element -> char
        // 'a' -> char

        /*
            int[][][] -> single element -> int[][]
            int[] -> single element -> int
            int[][] -> single element -> int[]
         */

        // string -> char[]
        // 1. Use length() instead of length
        for(int i = 0; i < a.length(); i++) {
            // 2. instead of a[i], use a.charAt(i). -> using index
            // a b c d e f
            System.out.print(a.charAt(i) + " ");
        }
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        // sc.next().charAt(0);
        Scanner sc = new Scanner(System.in);
        // NO enhanced for loop for string
        // for(char x : s) // DOES NOT WORK
    }
}