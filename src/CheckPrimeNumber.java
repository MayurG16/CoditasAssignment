import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {

		Scanner  scanner = new Scanner(System.in);
		System.out.println("Enter number to check whether it is prime or not");
		int number = scanner.nextInt();
		checkPrime(number);
		
		scanner.close();

	}
	
	public static void checkPrime(int number) {

		int temp = 0;
		for (int i = 2; i < number ; i++) {

			if (number % i == 0) {
				temp = temp + 1;
				break;
			}

		}
		if (temp < 1) {
			System.out.println("It is prime number");
		} else {
			System.out.println("It is not prime number");
		}
	}

}
