import java.util.Scanner;

public class Calculation {
    int a,b;

    /*
    jei method ta instantitate er time e call kora hoy
    Special method -> Constructor -> define & declare

    * internal variables a, b cannot be used from outside
    of the class, or the main function.

    * this keyword cannot be used from outside outside of
    the class, or the main function.

    * We use the keyword "this" in order to avoid naming
    confusion.
     */
    public Calculation(int a, int b) {
        this.a = a;
        this.b = b;
    }
    /*
        You can add as many methods of the same name
        as you want if they do not have the same parameter
        patterns.

        OVERLOADING: DIFFERENT METHODS WITH SAME NAME
     */
    public Calculation() {
        a = 3;
        b = 4;
    }

    public int mult() {
        return this.a * this.b;
    }

    public  int div() {
        return a/b;
    }

    public int sub() {
        return this.a - this.b;
    }

    public  int add() {
        return a + b;
    }

    public  int abs() {
        if (a >= 0) {
            return a;
        } else if (a < 0) {
            return -a;
        }
        return a;
    }



    public  int exp() {
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans = ans * a;
        }
        return ans;
    }
    public static  void main() {
        Scanner sc = new Scanner(System.in);

        Calculation u1 = new Calculation(4, 5);

        // 4 + 5, 4 - 5;
        System.out.println(u1.add() + ' ' + u1.sub() + ' ' + u1.mult());

        /*
            You can create objects with different a, b values
         */
        Calculation u2 = new Calculation(3, 7);
        Calculation u3 = new Calculation(4, 6);

        /*
         WHAT YOU CANNOT DO
         */

        Calculation u4 = new Calculation();

        // 4*5, 3*7, 4*6
        System.out.println(u1.mult() + ' ' + u2.mult() + ' ' + u3.mult());

        System.out.println(u1.exp());
        System.out.println(u1.abs());

    }
}

