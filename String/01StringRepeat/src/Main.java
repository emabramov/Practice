import java.util.*;

public class Main
{
	private static String string = "Буря мглою небо кроет";
	
	public static void main(String[] args)
	{
		 String threeString = string + ", " + string + ", " + string;
		 System.out.println(threeString);
		 
		 int countSym = threeString.length();
		 int onlyLetters =  threeString.replaceAll("\\s\\,", "").length();
		 int countOne = string.length();
		 int onlyLettersOne = string.replaceAll("\\s", "").length();
		 
		 System.out.println("Количество символов в начальной строке: " + countOne);
		 System.out.println("Количество символов в начальной строке без пробелов: " + onlyLettersOne);
		 System.out.println("Количество символов в тройной строке: " + countSym);
		 System.out.println("Количество символов в тройной строке без пробелов и запятых: " + onlyLetters);
		 }
}
