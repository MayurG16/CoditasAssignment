import java.util.Scanner;

public class AnagramsString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first String ");
		String firstString = scanner.next();
		System.out.println("Enter second String ");
		String secondString = scanner.next();
		
		scanner.close();
		
		checkAnagramsString(firstString,secondString);

	}
	
	public static void checkAnagramsString(String firstString, String secondString) {
		
		boolean similar = false, notSimilar = false;
		
		int firstStringLength = firstString.length();
		int secondStringLength = secondString.length();
		
		if(firstStringLength == secondStringLength) {
			int length = firstStringLength;
			for(int i=0;i<length;i++) {
				similar = false;
				for(int j=0;j<length;j++) {
					if(firstString.charAt(i) == secondString.charAt(j)) {
						similar = true;
						break;
					}
				}
				if(!similar) {
					notSimilar = true;
					break;
				}
			}
			
			if(notSimilar)
				System.out.println("Strings are not Anagram");
			else
				System.out.println("Strings are Anagram");
			
		} else {
			System.out.println("Both String should be same number of character");
		}
			
		
	}

}
