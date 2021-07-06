import java.util.Scanner;

public class BinaryToDecimalConversion {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Enter a Binary Number ");
		long binaryNumber = scanner.nextLong();
		binaryToDecimalConversion(binaryNumber);
		
		scanner.close();

	}
	
	public static void binaryToDecimalConversion(long binaryNumber) {

		int decimalNumber = 0, i = 0;
		long reminder;

		while (binaryNumber != 0) {
			reminder = binaryNumber % 10;
			decimalNumber = (int) (decimalNumber + reminder * Math.pow(2, i));
			binaryNumber = binaryNumber / 10;
			i++;

		}

		System.out.println("Conversion of bianry number to decimal is " + decimalNumber);
	}

}
