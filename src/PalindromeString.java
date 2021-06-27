import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string to check whether it is palindrome or not : ");
		String element = scanner.next();
		
		checkPalindrome(element);
		
		scanner.close();

	}
	
	public static void checkPalindrome(String element) {

		String temp = "";
		
		for(int i = element.length()-1;i>=0;i--) {
			
			temp = temp + element.charAt(i);
			
		}
		
		if( element.equals(temp))
			System.out.println("Given string is Palindrome");
		else
			System.out.println("Given string is  NOt Palindrome");
		
	}

}
