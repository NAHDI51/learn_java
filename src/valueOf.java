public class valueOf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int last = -1;
        for(int i = 0; i < arr.length; i++) {
            /*
                do something
             */
            last = arr[i-1]; // i = 0 -> i-1 = -1 //outofRangeException()

            if(last == arr[i] && last == 3) {
                return false;
            }
            last = arr[i];
        }
    }
}