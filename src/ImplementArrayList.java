import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ImplementArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int element;
		
		System.out.println("Enter 10 elements in arraylist");
		for(int i=0;i<10;i++) {
			element = scanner.nextInt();
			list.add(element);
		}
		
		list.remove(3);
		System.out.println("Removing element at index 3 "+list);
		
		list.add(4,250);
		System.out.println("Adding new element at index 4 "+ list);
		
		list.set(7, 77);
		System.out.println("Changing the element at index 7 "+ list);
		
		list.get(9);
		System.out.println("Fetching the element at index 9 "+ list);
		
		System.out.println("It will return true if list is empty else return false : "+ list.isEmpty());
		
		System.out.println("It will return true if  element:33 is present in list else  return false: "+ list.contains(33));
		
		Collections.sort(list);
		System.out.println("After sorting the list "+ list);
		
		System.out.println("Displaying the sizr of list "+ list.size());
		
		
		scanner.close();
	}
	
}
