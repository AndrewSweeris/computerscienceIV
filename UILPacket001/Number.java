import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Number {
    /**
     * Helper method for perfect, deficient, and abundant tests. Returns the sum of int x's proper
     * divisors excluding the number itself.
     * @param x
     * @return
     */
    private static int numDivisors(int x) {
        double num = (double) x;
        int sum = 0;
        for (int i = 1; i < x; i++) {
            if (Math.ceil(num/((double)i))==(x/i)) {
                sum += i;
            }
            if (sum>x) break;
        }
        return sum;
    }
    /**
     * Helper method for evil and odious. Returns whether the number of '1's in the binary string is odd
     * or even.
     * @param x
     * @return
     */
    private static int binaryHelper(int x) {
        String binary = Integer.toBinaryString(x);
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i)=='1')count++;
        }
        return count%2;
    }
    /**
     * Helper method to determine if number is equidigital.
     * @param x
     * @return
     */
    private static boolean isEquidigital(int x) {
        return false;
    }
    /**
     * Helper method to determine if number is frugal.
     * @param x
     * @return
     */
    private static boolean isFrugal(int x) {
        return false;
    }
    /**
     * Helper method to determine if number is wasteful.
     * @param x
     * @return
     */
    private static boolean isWasteful(int x) {
        return false;
    }
    /**
     * Helper method to determine if number is ugly.
     * @param x
     * @return
     */
    private static boolean isUgly(int x) {
        return false;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("number.dat"));
        int x = 0;
        while (sc.hasNextInt()) {
            x = sc.nextInt();
            if (numDivisors(x)==x) System.out.println("Perfect");
            else if (numDivisors(x)<x) System.out.println("Deficient");
            else System.out.println("Abundant");
            if (binaryHelper(x)==0) System.out.println("Evil");
            else System.out.println("Odious");
            if (isEquidigital(x)) System.out.println("Equidigital");
            if (isFrugal(x)) System.out.println("Frugal");
            if (isWasteful(x)) System.out.println("Wasteful");
            if (isUgly(x)) System.out.println("Ugly");
            System.out.println();
        }
    }
}
