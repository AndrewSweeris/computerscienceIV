import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lycanthropy {
    /**
     * Helper method to perform calculation
     * @param weight
     * @param moonlight
     * @return
     */
    private static double wolfsbaneEquation(double weight, double moonlight) {
        return Math.pow(weight*3.14, 0.333)/Math.pow(weight + 1234567890,0.2);
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner f = new Scanner(new File("lycanthropy.dat"));
        int count = f.nextInt();
        float weight, moonlight;
        for (int i = 0; i < count; i++) {
            weight = f.nextFloat();
            moonlight = f.nextFloat();
            System.out.printf("%.3f\n",wolfsbaneEquation(weight,moonlight));
        }
    }
}
