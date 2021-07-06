import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImplementArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int element;
		
		System.out.println("Enter elements size");
		int size = scanner.nextInt();
		
		System.out.println("Enter elements in arraylist");
		for(int i=0;i<size;i++) {
			element = scanner.nextInt();
			list.add(element);
		}
		
		System.out.println("Remove element at position ");
		int index = scanner.nextInt();
		list.remove(index);
		System.out.println(list);
		
		
				
		
		
		scanner.close();
	}
	
}
