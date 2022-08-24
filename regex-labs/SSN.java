//Name - Andrew Sweeris
//Date - 2022/08/23
//Class - PB COMP SCI MAD K
//Lab  - Regex Lab 01

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSN
{
	private String social;
	private boolean b;
	private Pattern p;
	private Matcher m;

	public SSN()
	{
		social = "00-000-0000";
		b = false;
	}

	public SSN(String s)
	{
		social=s;
		b = false;
	}
	// use the Pattern and Matcher classes
	// valid SS Card has no characters other than numbers and "-", and has nine numbers
	public void validate()
	{
		p = Pattern.compile("(\\d-?){8}\\d");
		m = p.matcher(social);
		b = m.matches();
	}

	// use the String class and matches method. This method can be used for simple validations.
	public void matches()
	{
		String t = social.replaceAll("-","");
		b = t.matches("(\\d-?){8}\\d");
	}

	public String toString()
	{
		String output = "";
		if (b) output = "valid";
		else output = "invalid";
		return output;
	}
}