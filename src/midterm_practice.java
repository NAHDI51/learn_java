public class midterm_practice {

    public boolean compareThree(int x, int y, int z) {
        char c = 'B';
        // in-between
        if(('A' <= c) && (c <= 'Z')) {
            System.out.println("The character is an alphaber.");
        }
        /*
            4, 5, 6 => true == true => true
            6, 5, 4 => false == false => true
         */
        return (x < y) == (y < z);
    }

    /*
        Tips: no return type = constructor
     */
    public midterm_practice() {

    }

//    public String return_smth() {
//        return "abd";
//    }
    public double return_smth() {
        return 5.67;
    }

    void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        //      Index:   012345
        String oldstr = "ABCDEF";
        oldstr.substring(start, end); // [start, end-1]
        // [end] dewa na thakle sheta end index porjonto jabe.
        String newstr = oldstr.substring(1, 3) + oldstr.substring(4, );
        System.out.println(newstr);

        double d = 20; // 20.00000
        System.out.println(d);

        boolean a = true;
        boolean b = false;

        /*
            b: x > y implies !b  x <= y;
            b: x >= y implies !b => x < y;
         */

        if(a && !(b || a)) {

        }


        // RULE OF THUMB: generating randomn number between [min,max]
        int min = 1;
        int max = 3;
        int choice = min + (int) (Math.random() * (max - min + 1));
    }
}
