import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wizard {
    private static final String QWERTY = "qQwWeErRtTyYuUiIoOpP[{aAsSdDfFgGhHjJkKlL;:\'\"zZxXcCvVbBnNmM,<.>/? ";
    private static final String DVORAK = "\'\",<.>pPyYfFgGcCrRlL/?aAoOeEuUiIdDhHtTnNsS.-;:qQjJkKxXbBmMwWvVzZ ";
    private static void translator(String line) {
        char[] ary = line.toCharArray();
        String x = "";
        int loc = 0;
        for (int i = 0; i < ary.length; i++) {
            loc = DVORAK.indexOf(ary[i]);
            ary[i] = QWERTY.charAt(loc);
            x += ary[i];
        }
        System.out.println(x);
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("wizard.dat"));
        String line;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            translator(line);
        }
    }
}
