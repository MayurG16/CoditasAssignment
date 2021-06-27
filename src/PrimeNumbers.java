import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range upto the prime numbers display");
		int range = scanner.nextInt();
		
		System.out.println("Prime numbers upto " + range + " are ");
		
		prime(range);
		
		scanner.close();

	}
	
	public static void prime(int range) {
		
		for(int i = 2; i <= range; i++) {
			boolean flag = true;
			
			for(int j = 2; j < i ; j++) {
				
				if(i%j == 0) {
					flag = false;
					break;
				}
					
			}
			
			if(flag)
				System.out.print(+ i +" ");
				
		}
	}

}
