package operators;
import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File x = new File("file1.txt");
        File y = new File("file1.txt");
        File z = x;
        System.out.println(x == y);
        System.out.println(x == z);

    }
    
}