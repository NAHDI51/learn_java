import java.util.Scanner;

public class d17_02_2026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        digitSum(n, sc);
    }
//    public static void digitSum(int n,Scanner sc){
//        int number = n;
//        int digitsum = 0;
//        //System.out.print("Enter the value of e");
//        int e = 0;
//        while(number!=0){
//            e = number % 10;
//            digitsum=digitsum+e;
//            //System.out.println("Number"+number);
//            System.out.println(number);
//            number = number / 10;
//            /*
//                12345
//                1234
//                123
//                12
//                1
//                0 => loop exit
//             */
//        }
//        System.out.println("DIGITSUM:"+digitsum);
//    }
    public static void digitSum(int n, Scanner sc){
        // parameter ke variable e assign
        int digitsum = 0;
        int e = 0;
        while(n!=0){
            e = n%10;
            digitsum=digitsum+e;
            n/=10;
        }
        System.out.println("DIGITSUM:"+digitsum);
    }
    public static void abcd(int small, int big, int goal){
        // parameter ke variable e assign

    }
}