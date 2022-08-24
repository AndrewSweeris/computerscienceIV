//Name - Andrew Sweeris
//Date - 2022/08/23
//Class - PB COMP SCI MAD K
//Lab  - Regex Lab 02

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItHitsTheFan
{
	private int count;

	public ItHitsTheFan()
	{
		count = 0;
	}

	// use the Pattern and Matcher classes
	public void countLine(String s)
	{
		Pattern p = Pattern.compile(" it ");
		Matcher m = p.matcher(s);
		boolean b = true;
		while (m.find()) {
			count++;
		}
	}

	public String toString()
	{
		return "" + count + " times";
	}
}