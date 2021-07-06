import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = scanner.next();
		System.out.println("Reverse string is "+reverseString(input));
		scanner.close();
		
	}
	
	public static String reverseString(String input) {
		
		if(input.isEmpty())
			return input;
		
		return reverseString(input.substring(1)) + input.charAt(0);
			
	}

}
