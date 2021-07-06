import java.util.Scanner;

public class CkeckArmstrongNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number to check whether it is Armstrong or not");
		int number = scanner.nextInt();
		checkArmstrong(number);

		scanner.close();

	}
	
	public static void checkArmstrong(int number) {
		
		int reminder=0, sum=0;
		int temp = number; 
		while(number>0)
		{
			reminder = number%10;
			sum = sum + (reminder * reminder * reminder);
			number = number/10;
		}
		if(sum == temp)
		{
			System.out.println("It is armstrong number");
		}
		else {
			System.out.println("It is not armstrong number");
		}
	}

}
