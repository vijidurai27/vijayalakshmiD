package hello.java;

public class StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sb =new String("Object Programming Language");
		System.out.println("Total number of character are "+sb.length());
		
		//String charAt
		for(int i=0;i<sb.length();i++) {
			System.out.println("Character is present at "+i+" ="+sb.charAt(i));
		}
		//String UpperCase
		System.out.println("String UpperCase: "+sb.toUpperCase());
		
		//String LowerCase
		System.out.println("String LowerCase: "+sb.toLowerCase());
		
		
		
   
	}
}

