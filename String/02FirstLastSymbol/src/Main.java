import java.util.*;

public class Main
{
	private static String three = "123";
	private static String two = "12";
	private static String four = "1234";
	private static String one = "1";
	
	public static void main(String[] args)
	{
		getChars(three);
		System.out.println();
		getChars(two);
		System.out.println();
		getChars(one);
		System.out.println();
		getChars(four);
	}
	
	public static void getChars(String string)
	{
		int lenght = string.length();
		if(lenght == 3){
			System.out.println(string.substring(0,1));
			System.out.println(string.substring(2,3));
			System.out.println(string.substring(1,2));
		}else if(lenght == 2){
			System.out.println(string.substring(0,1));
			System.out.println(string.substring(1,2));
		}else{
			System.out.println(string);
		}
	}
}
