import java.util.Scanner;

public class DecimalToBinaryConversion {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);		
		System.out.println("Enter a Decimal Number ");
		int decimalNumber = scanner.nextInt();
		decimalToBinaryConversion(decimalNumber);
		
		scanner.close();
		

	}
	
	public static void decimalToBinaryConversion(int decimalNumber) {

		long binaryNumber = 0;
		int reminder, temp = 1;

		while (decimalNumber != 0) {
			reminder = decimalNumber % 2;
			binaryNumber = binaryNumber + reminder * temp;
			decimalNumber = decimalNumber / 2;
			temp = temp * 10;

		}

		System.out.println("Conversion of Decimal number to Binary is " + binaryNumber);
	}

}
