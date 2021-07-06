import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size to enter elements ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter Array elements ");
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Duplicates elements from array are ");
		duplicateNumber(arr);
		
		sc.close();

	}
	
	public static void duplicateNumber(int[] arr) {
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[i]+ " ");
				}
			}
		}
		
		
	}

}
