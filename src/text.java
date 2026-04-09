import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class text {
    public static void main(String[] args) throws IOException {
//        File f = new File("hello.txt");
//        Scanner sc = new Scanner(f);
//
//        while(sc.hasNextLine()) {
//            String s = sc.nextLine();
//            System.out.println(s);
//        }
        pattern1();
    }
    public static void pattern1() {
        int n = 3;
        int k = 0;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("#");
            }
            System.out.println();
            k++;
        }
        for (int j = 0; j < k; j++) {
            System.out.print("#");
        }
    }
}