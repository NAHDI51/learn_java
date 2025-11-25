import java.util.Scanner;

public class takeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input;

        while(true) {
            System.out.print("Please enter between Rock, Paper, Scissor: ");
            /*
            Difference:
            sc.next => checks for a new word => ' ' //whitespace
            sc.nextLine => checks for a new line => '\n' //newline
             */
            input = sc.nextLine();


            boolean okay = false;
            if(input.equals("Rock") ||  input.equals("Paper") || input.equals("Scissor")){
                okay = true;
            } else {
                okay = false;
            }

            if(okay) {
                break;
            } else {
                System.out.print("[Incorrect input!] ");
            }
        }
        System.out.println("Your word is: " + input);
    }
}