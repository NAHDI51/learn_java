import java.util.Scanner;

public class loopsum {
    public static void main(String[]args){

//System.out.print(Sum());
        Sum();


    }

    public static void  Sum() {
        int sum = 0;
        //int e;
        for (int i = 1; i < 10; i++) {
            // Indentation
            Scanner sc = new Scanner(System.in);
            int e = sc.nextInt();
            sum += e;
        }
        System.out.println(sum);
    }

    public static void Sub() {
        int e = 5;
        int a = 10;
        // Forward 4 space -> tab
        // backward 4 space -> shift + tab
        for(int i = 0; i < 10; i++) {
            e += 5;
            e = i%2; // valid -> e te i%2 er value assigned hocche
            i%2 = e; // invalid -> i%2 te e er value assigned hocche

            /*
                You eat rice // valid
                Rice eats you // invalid
             */
            i != e%2; // condition -> if
            // Normally i = something -> expression

            i = e%2; // Expression
            i == e%2 // Condition

            /*
                Condition can ONLY be used in if, or for loop, or while loop
                if(i == e%2) {  // valid
                }
                if(i = e%2) {  // Invalid
                }

                for(EXPRESSION ; i == e%2; i++) {  // CONDITION USED IN THE MIDDLE
                }
                while(i == e%2) {   // while loop condition
                }


             */
        }
    }




}