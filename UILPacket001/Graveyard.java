import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Graveyard {
    private static void parser(String line) {

    }

    private static int[] alphabet = new int[26];
    public static void main(String[] args) throws FileNotFoundException {
        for (int i = 0; i < alphabet.length;i++) alphabet[i]=0;

        Scanner sc = new Scanner(new File("greaveyard.dat"));
        while (sc.hasNextLine()) parser(sc.nextLine());
    }
}
