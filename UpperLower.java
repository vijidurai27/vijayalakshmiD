package string;
import java.util.*;
public class UpperLower {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		
		String sb = obj.nextLine();
		String sb2 = obj.nextLine();
		
		//String UpperCase
		System.out.println("String UpperCase: "+sb.toUpperCase());
		System.out.println("String UpperCase: "+sb2.toUpperCase());
				
		//String LowerCase
		System.out.println("String LowerCase: "+sb.toLowerCase());
		System.out.println("String LowerCase: "+sb2.toLowerCase());
		
	}

}
