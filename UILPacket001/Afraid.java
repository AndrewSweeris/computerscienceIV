import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Afraid {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner f = new Scanner(new File("afraid.dat"));
        int count = f.nextInt();
        int x, y;
        for (int i = 0; i < count; i++) {
            x = f.nextInt();
            y = f.nextInt();
            System.out.println(x + "spooky" + y + "me");
        }
    }
}
