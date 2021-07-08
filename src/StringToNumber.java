public class StringToNumber {

	public static void main(String[] args) {
		
		System.out.println("Conversion of given String 658 to number is "+stringToNumberConversion("658"));
		
	}
	
	public static int stringToNumberConversion(String number) {
		int sum = 0;
		
		for(int i=0;i<number.length();i++) {
			sum = (sum*10) + ((int)number.charAt(i)-48);
		}
		
		return sum;
	}

}
