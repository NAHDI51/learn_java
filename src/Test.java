import java.util.Scanner;

public class Test {
    public static void main(String[]args){

        // instantiation
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the type of operation you want to do:");
        int c = sc.nextInt();

        /*
            a = -3 => 3


         */

        /*
            Why use static?

            1. Object diye method call : sc.nextInt();
            2. Class diye method call : Math.random(); ** static keyword use korte hobe
         */
        if( c== 1){
            System.out.println("Addition Answer"+" ");
            System.out.println(Calculation.add(a,b));
        }
        else if( c== 2){

            System.out.println("Multiplication Answer"+" ");
            System.out.println(Calculation.mult());
        }
        else if( c== 3){

            System.out.println("Division Answer"+" ");
            System.out.println(Calculation.div(a,b));
        }
        else if( c== 4){

            System.out.println("Subtraction Answer"+" ");
            System.out.println(Calculation.sub(a,b));
        }
        else{
            System.out.println(" Invalid Operation");
        }


    }
}