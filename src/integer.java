public class integer {
    public static void main(String[] args) {
        int c = 5;
        c += 6*2;

        // INteger: decimal part will NOT be taken
        c -= (3/2);

        /*
            Rule of thumb: double > int in type preference

            all integer will act as double when it is interacting
            with double.
         */
        double d = 3;
        d /= 2;
        System.out.println(d);
    }
}
