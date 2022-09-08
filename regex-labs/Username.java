//Name - Andrew Sweeris
//Date - 2022/08/25
//Class - PB MAD COMP SCI K
//Lab  - Regex Lab 04

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username
{
	private static Pattern p = Pattern.compile("[[a-z][A-Z][0-9][-][_]]{4,16}");
	private static Matcher m;
	private int count;

	public Username()
	{
		count = 0;
	}

	public boolean isValid(String username) {
		m = p.matcher(username);
		if (m.matches()) {
			count++;
			return true;
		}
		return false;
	}

	public String toString()
	{
		return "The list has " + count + " valid user names.";
	}
}