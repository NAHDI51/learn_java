import java.util.Scanner;

public class unit3 {
    /*
        internal variable -> attributes
     */
    int a, b;

    public static void main() {

        // Object initialize => object.method();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // class.method();
        double rand = Math.random();

        // difference -> static

        Calculation u1 = new Calculation(5,6);
        /*
            DIRECT ACCESS: MORE RISKY

            So we don't give them direct access.
            WE MAKE THEM PRIVATE

            NO ACCESS
         */
//        u1.a = 50;
//        u1.b = 25;
    }
}