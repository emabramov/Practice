import java.util.regex.*;

public class Methods
{
	public static void lastSame(String input)
	{
		int last = input.length() - 1;
		Character atLast = input.charAt(last);
		String regex = atLast.toString();
		if(regex.matches("^[\\W\\d]")){
			regex = "\\" + regex;
		}
		Pattern sym = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher match = sym.matcher(input);
		
		System.out.println(sym.toString());
		while(match.find()){
			System.out.println(match.start());
		}
	}
}
