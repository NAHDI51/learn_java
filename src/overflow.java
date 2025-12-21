public class overflow {
    public static void main(String[] args) {
        /*
        Overflow
         */
        /*
            int => 4 byte
            num = 19
            double => 8 byte

            2147483647 = 2^31-1
            10000000 00000000 00000000 00010011

            2^31-1 + 1 = 01111111 11111111 11111111 11111111
            10000000 00000000 00000000 00000000
            => -2147483648
         */
        // Overflow
        System.out.println(Integer.MAX_VALUE + 1);
    }
}