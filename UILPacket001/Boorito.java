import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Boorito {
    /**
     * Helper method that determines whether someone recieves the discount based on line-data.
     * @param line
     * @return
     */
    private static boolean boorito(String line) {
        int time = Integer.parseInt(line.substring(line.length()-5,line.length()-3) + line.substring(line.length()-2));
        String costume = line.substring(0, line.length()-6);
        return ((!costume.equals("Self"))&&(1700 <= time && time <= 2200));
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("boorito.dat"));
        int x = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < x; i++) {
            System.out.println(boorito(sc.nextLine()) ? "BOORITO" : "BURRITNO");
        }
    }
}
