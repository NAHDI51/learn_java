public class palindromeString {

    // s.Reverse == s
    // abcdedcba
    public static boolean palindromeChekcer(String s) {
        String reverse = new StringBuffer(s).reverse().toString();
        /*
        s = "abcde"
        length()-1 to 0
            e d c b a egulake plus with reverse
         */
        for(int i = s.length()-1; i >= 0; i--) {
            reverse = reverse + s.substring(i, i+1);

        }
        System.out.println("String: " + s);
        System.out.println("Reverse: " + reverse);

        return reverse.equals(s);
    }
    public static void main(String[] args) {
        /*
        s.substring(l,r) => l theke r-1 porjonto
         */
        String s = "abcde";
//        palindromeChekcer(s);
        System.out.println(s.substring(0, 4));
        // [l, r) => (l to r-1)
        // NOT [l,r]
    }
}