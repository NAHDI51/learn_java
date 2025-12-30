public class makebricks {
    public static boolean makeBricks(int small, int big, int goal) {
        // Define
        boolean result;
        /*
            Enter your logic here
         */
        return result;
    }
    /*
        f(x) = y
        f(x,y,z) = w
        makeBricks(small, big, goal) = result

        f(x,y,z) = w = x+y+z
        f(3,1,8) = w = 3+1+8 = 12

        makeBricks(3,1,8) = true
     */

    public static void main(String[] args) {
        boolean result = makeBricks(3,1,8);
        System.out.println(result);

        result = makeBricks(3,1,9);
        System.out.println(result);

        result = makeBricks(3,2,10);
        System.out.println(result);
    }
}
