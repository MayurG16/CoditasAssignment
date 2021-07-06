import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scanner.nextInt();
		
		System.out.println("Given number is "+ number + " and it's reverse is "+reverseNumber(number) );

		scanner.close();

	}
	
	public static int reverseNumber(int number) {
		
		int reverse = 0;
		while(number > 0 ) {
			reverse = (reverse*10) + (number%10);
			number = number /10;
		}
		
		return reverse;
	}

}
