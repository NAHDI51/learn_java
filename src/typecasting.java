public class typecasting {
    public static void main(String[] args) {
        // POSSIBLE
        double pi2 = 3.7;
        // Typecasting
        int integer4 = (int) pi2;

        // INVALID TYPECASTING
        int c = 5;
        boolean b = (boolean) c;

        // CAN'T MIX ONE TYPE WITH ANOTHER

        /// Casting: casts one value to one variable
        double d = 3.14159;

        // Make d's value 5.423
        d = 5.423;  // Expression/Statement: true or false value thaka jabe na
        d == 5.423; // Condition: true or false value thaka lagbe

        boolean isTrue = (d == 6.423);
        if(isTrue) {

        }

        System.out.println(pi2);
        System.out.println(integer4);
    }
}
