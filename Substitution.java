//Name - Andrew Sweeris
//Date - 2022/08/2022
//Class - PB MAD COMP SCI K
//Lab  - Regex Lab 03

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Substitution
{
	public Substitution()
	{
		String orig = "This is a list of students: studentID=1234, studentID=4865, studentID=7894, studentID=7744, studentID=231233.";
		orig+="\nIt's not comprehensive.";
		System.out.println(orig);
		StringBuffer sb = new StringBuffer();

		Pattern p = Pattern.compile("(?<=studentID=)[0-9]*");
		Matcher m = p.matcher(orig);

		boolean b = true;
		String s = "";
		while (m.find()) {
			s = s + "\"masked\": " + m.group() + "\n";
			m.appendReplacement(sb, "\"masked\"");
		}
		m.appendTail(sb);
		System.out.println(s + sb.toString());
	}
	public static void main(String[] args){
		new Substitution();
	}
}