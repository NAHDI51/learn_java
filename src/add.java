import java.util.Scanner;

public class add {
    /*
    Method: INPUT => procedure => OUTPUT (optional)
     public (static) return_type method_name(type1 parameter1, type2 parameter2, type3 parameter3)

     !!! RETURN TYPE MUST MATCH return_type

     // DECLARATION: like rakha
     // parameter e value copy hocche => pass by value
     */
    public static int Add(int a, int b) {
        // declaration of a and b
//        System.out.println("Inside add: " + a + ' ' + b);
        return a + b;
    }

    public static void makeBricks(int small, int big, int goal) {
        /**
         * int => 5,10,20 erokom value
         * boolean => true/false
            void => return value nai
         **/
        return;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declare assign/cast
        int first = sc.nextInt();
        int second = sc.nextInt();

        /*
            call jeshob value diye korba, ogula parameter e copy hobe
            INPUT => PROCEDURE => OUTPUT
         */
        makeBricks(3, 1, 8);
        // Call, cast
        // !!!
        int sum = Add(first, second);
        System.out.println(sum);

        /*

         */
    }

}