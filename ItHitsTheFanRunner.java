//Name - Andrew Sweeris
//Date - 2022/08/23
//Class - PB COMP SCI MAD K
//Lab  - Regex Lab 02

import static java.lang.System.*;
import java.util.Scanner;
import java.io.*;

public class ItHitsTheFanRunner
{
	public static void main ( String[] args ) throws FileNotFoundException {
		Scanner reader = new Scanner(new File("ItHitsTheFan.txt"));
		String line;
		ItHitsTheFan obj = new ItHitsTheFan();
		while (reader.hasNextLine()) {
			line = reader.nextLine();
			obj.countLine(line);
		}
		out.println(obj.toString());
	}
}