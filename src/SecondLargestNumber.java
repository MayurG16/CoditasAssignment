import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter arraylsit size");
		int size = scanner.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>(size);
		
		System.out.println("Enter array elements ");
		
		for(int i=0;i<size;i++) {
			int element = scanner.nextInt();
			arr.add(element);
		}
		
		
		System.out.println("Second largest array of array is : "+ secondLargestNumber(arr,size) );
		
		scanner.close();

	}
	
	public static int secondLargestNumber(ArrayList<Integer> list, int size) {
		
	
		Collections.sort(list);
		
		int secondNumber = list.get(size-2);
		
		return secondNumber;
		
	}

}
