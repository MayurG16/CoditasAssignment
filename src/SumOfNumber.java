import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = scanner.nextInt();
		System.out.println("Sum of given Number is "+sumOfNumber(input));
		scanner.close();

	}
	
	public static int sumOfNumber(int input) {
		
		if(input == 0)
			return 0;
		
		return (input%10 + sumOfNumber(input/10));
			
	}

}
