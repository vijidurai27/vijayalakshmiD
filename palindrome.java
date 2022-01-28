package string;
import java.util.*;
public class palindrome{
	public static void main(String[] args){
		String b ="";
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the String : ");
		String str = obj.nextLine();
		int n = str.length();
		for(int i=n-1; i>=0; i--){
			b=b+str.charAt(i);
		}
		if(str.equalsIgnoreCase(b)){
			System.out.println("The string is Plindrome.");
		}
		else {
			System.out.println("The string is Not Plindrome.");
		}
	}
}
