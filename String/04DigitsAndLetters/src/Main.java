import java.util.*;

public class Main
{
	private static final String[] digits = {"0", "2", "4", "6", "8"};
	private static final String[] letters = {"A", "B", "C", "D", "E" };
	private static Character[] evenOdd = new Character[10];
	
	public static void main(String[] args)
	{
		int countDigits = 0;
		int countLetters = 0;
		StringBuffer string = new StringBuffer();
		
		for(int i = 0; i < evenOdd.length; i++){
			
			if(i % 2 == 0){
				evenOdd[i] =  letters[countLetters].charAt(0);
				countLetters++;
			}else{
				evenOdd[i] = digits[countDigits].charAt(0);
				countDigits++;
			}
			
			string.append(evenOdd[i]);
		}
		 
		System.out.println(string);
	}
}
