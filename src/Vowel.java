import java.util.Scanner;

public class Vowel {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //System.out.print("enter n:");
        // char n = sc.next().charAt(0);
        // vowelChecker(n);
        vowelCount(sc);
    }
    public static void vowelChecker(char n){
        if((n =='a')|| (n=='e')|| (n=='i')||(n=='o')||(n=='u')){
            System.out.println("The Charecter is a vowel");
        }else{
            System.out.println("The Charecter is not a vowel");
        }
    }
    public static void vowelCount(Scanner sc){
        System.out.print("ENTER STRING:");
        String s = sc.next();
        int vowel=0;
        int consonent=0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i); // s[i]
            // Check if ch is vowel or consonent
            if((ch =='a')|| (ch=='e')|| (ch=='i')||(ch=='o')||(ch=='u')){
                vowel++;
            }else{
                consonent++;
            }
        }
        System.out.println("VOWELS: "+vowel);
        System.out.println("CONSONENTS: "+consonent);
    }

}