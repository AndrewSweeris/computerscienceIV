//Name - Andrew Sweeris
//Date - 2022/08/25
//Class - PB MAD COMP SCI K
//Lab  - Regex Lab 04

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class UsernameRunner
{
	public static void main ( String[] args ) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("names.txt"));
		String line;
		List<String> usernameList = new ArrayList<String>();
		Username username = new Username();
		while (scan.hasNextLine()) {
			line = scan.nextLine();
			if (username.isValid(line)) {
				usernameList.add(line);
			}
		}
		out.println(username.toString());
	}
}