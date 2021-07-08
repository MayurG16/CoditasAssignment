import java.util.Arrays;
import java.util.Scanner;

public class RemoveArrayDuplicateElement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scanner.nextInt();
		int[] elements = new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
			elements[i] = scanner.nextInt();
		
		int count = removeDuplicateElement(elements,size);
		System.out.println("After removing duplicates elements from array ");
		for(int i=0; i<count;i++)
			System.out.println(elements[i]+ " ");

		scanner.close();

	}
	
	public static int removeDuplicateElement(int[] elements,int size) {
		
		int[] temp = new int[size];
		Arrays.sort(elements);
		int j=0;
		
		if(size == 0 || size == 1)
			return size;
		
		for(int i=0;i<size-1;i++) {
			if(elements[i] != elements[i+1]) {
				temp[j++] = elements[i];
			}
		}
		temp[j++] = elements[size-1];
		
		for(int i=0;i<j;i++)
			elements[i] = temp[i];

		return j;
		
	}

}
