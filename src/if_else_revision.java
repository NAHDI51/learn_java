public class if_else_revision {
    public static void main(String[] args) {

        boolean a;
        boolean b;

        /* DE MORGAN
            !(a && b) = !a || !b
            !(a || b) = !a && !b

            word: cond a, and cond b, simplify
         */

        // for loop

        int x = 5;
        while(x >= 0) {
            System.out.print(x + " ");
            x--;
        }
        System.out.println();
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

    }
}