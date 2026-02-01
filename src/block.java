public class block {
    public void fun() {
        int r = 5;
        for(int i = 0; i < 10; i++) { // Block er moddhe i declare
            int j = 5;
            if(i%2 == 1) {
                // block inside block
                int p = 10;
                System.out.println(j);
            }
            // outside if block
            System.out.println(j);
            System.out.println();
        }
//        System.out.println(i):

        // outside of the block
        /*
            {
                int p;
                {
                    int q;
                    print(p) // valid
                }
                print(q) // invalid
            }

         */
    }
}