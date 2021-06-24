import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Roman Number");
		String roman = scanner.next();
		
		int result = 0;
		
		Map<Character, Integer> keys = new HashMap<>();
		keys.put('I',1);
		keys.put('V',5);
		keys.put('X',10);
		keys.put('L',50);
		keys.put('C',100);
		keys.put('D',500);
		keys.put('M',1000);
		
		
		try {
			
			for(int i=0;i<roman.length();i++) {
				if(roman.length() == i+1 || keys.get(roman.charAt(i)) >= keys.get(roman.charAt(i+1))) {
					
					result = result + keys.get(roman.charAt(i));
					
				} else {
					
					result = result - keys.get(roman.charAt(i));
				}
			}

			System.out.println(result);
			
		} catch(Exception e) {
			System.out.println(e);
		}
	
		scanner.close();
		
		
	}
	
	

}
