
public class PrimeNumbersAddition {

	public static void main(String[] args) {
		
		long sum = primeNumberAddition();
		System.out.println("Addition of first 1000 prime numbers is "+ sum);

	}
	
	public static long primeNumberAddition() {
		
		long sum = 0;
		int number = 2;
		int count = 0;
		
		while(count<1000) {
			if(checkPrime(number)) {
				sum = sum + number;
				count++;
			}
			number++;
		}
		
		return sum;
		
	}

	public static boolean checkPrime(int number) {

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		
		return true;

	}
	
}
