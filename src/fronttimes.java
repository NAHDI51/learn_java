import java.util.Scanner;

public class fronttimes {
    public static String frontTimes(String str, int n) {
        String substr = str.substring(0, Math.min(str.length(), 3));
        String answer = "";

        // str = "abc", "de", concatnate -> str = "abcde" ->
        // "Abc" "AbcAbc" "AbcAbcAbc"

        for(int i = 0; i < n; i++) {
            answer = answer.concat(substr);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        int n;
        n = sc.nextInt();
        frontTimes(s, n);
    }
}