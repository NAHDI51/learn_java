import java.util.Scanner;

public class Calculation {
    /*
        Internal variable
     */
    int a, b;

    public int mult() {
        return a * b;
    }
    public int div(){
        return a/b;
    }
    public int sub(){
        return a-b;
    }
    public int add() {
        return a + b;
    }
    public int exp() {

        int ans = 1;
        for(int i = 1; i <= b; i++) {
            ans = ans * a;
        }
        return ans;
    }
}