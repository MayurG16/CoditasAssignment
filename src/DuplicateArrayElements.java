import java.util.Scanner;

public class DuplicateArrayElements {

	public static void main(String[] args) {
		
		duplicateElements();
		
	}
	
	public static void duplicateElements() {
		
		int i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size for array elements ");
		int n = sc.nextInt();
		
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		
		
		 System.out.println("enter array1 elements ");
		 for(i=0 ;i<n;i++)
		 {
			 arr1[i] = sc.nextInt();
			 
		 }
		 
		 System.out.println("enter array2 elements ");
		 for(i=0 ;i<n;i++)
		 {
			 arr2[i] = sc.nextInt();
			 
		 }
		 
		 
		 System.out.print("Duplicates elements from both arrrays are ");
		 
		 for(i=0;i<arr1.length;i++)
		 {
			 for(j=0;j<arr2.length;j++)
			 {
				 if(arr1[i] == arr2[j])
				 {
					 System.out.print(arr1[i]+ " ");
					 break;
				 }
			 }
		 }
		 
		 

	}

}
