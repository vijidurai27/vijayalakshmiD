package hello.java;
import java.util.Scanner;
public class multiplication{
	public static void main (StringBuffer[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number:");
		
		int num1 = in.nextInt();
		
		for(int ctr=1; ctr <=20;ctr++) {
			System.out.println(num1+" "+"*"+" "+ctr+" "+"="+" "+ num1*ctr);
		}
	}
}