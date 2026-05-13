import java.util.ArrayList;
/*
    public -> available to all
    protected -> available for own class + inherited class
    private -> available to its own class only
 */
// Inhertience -> "Inherits" some other class
public class revision_final_2 {
    public static void main(String args[]) {
//        ///  CONSTRUCTOR IS CALLED UPON INSTANTIATED
//        revision_final_1 object = new revision_final_1(2, 3);
//        ///  CALL THE EMPTY CONSTRUCTOR
//        revision_final_1 defaultObject = new revision_final_2();
//        // PRIVATE CANNOT BE USED FROM DIFFERENT CLASS
//        revision_final_1.sum(2,3,4);
        ArrayList<String> oldList = new ArrayList<String>();
        // Insert values
        oldList.add("a");
        oldList.add("b");
        oldList.add("c");

//        for(int i = 0; i < oldList.size(); i++) {
//            System.out.print(oldList.get(i) + " ");
//        }
        for(String s : oldList) {
            System.out.print(s + " ");
        }
    }
}