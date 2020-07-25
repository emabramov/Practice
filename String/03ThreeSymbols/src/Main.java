import java.util.*;
import javax.net.ssl.*;

public class Main
{
	private static Scanner scanner = new Scanner(System.in);
	private static String input;
	
	public static void main(String[] args)
	{
		while(true){
			input = scanner.nextLine();
			if(input.equals("stop")){
				scanner.close();
				break;
			}
			getChars(input);
		}
	}
	
	private static void getChars(String input)
	{
		int length = input.length();
		
		if(length > 5){
			int endSymbol = input.length();
			System.out.println(input.substring(0, 3) + " " + input.substring(endSymbol - 3));
		}else if(length > 0){
			String first = input.substring(0,1);
			int lengthTwo = input.length();
			String[] array = new String[lengthTwo];
			for(int i=0; i < array.length; i++){
				array[i] = first;
				System.out.print(array[i]);
			}
			System.out.println();
		}else{
			System.out.println("Введите символы или текст");
		}
	}
}
