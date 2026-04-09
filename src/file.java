import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class file {
    public static void main(String[] args) throws IOException {
        File fobj = new File("file.txt");
        Scanner sc = new Scanner(fobj);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}