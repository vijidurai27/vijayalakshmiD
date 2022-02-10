package hello.java;
import java.util.*;
/*public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int[] array1 = {12,67,32,78,43,11};
		
		String[] array2 = {"g","b","d","c","e","a","f"};
		
		System.out.println("Original numeric array: "+Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("Sorted numeric array: "+Arrays.toString(array1));
		System.out.println("______________\n\n");
		System.out.println("Original string array: "+Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.println("Sorted string array: "+Arrays.toString(array2));
	}
}*/


//find second largest number in array
public class array{
	public static int getSecondLargest(int[] a,int total) {
		Arrays.sort(a);
		return a[total-2];
		
	}
	public static void main(StringBuffer args[]) {
		int a[] = {4,8,7,5,3,6,1};
		int b[] = {88,54,64,22,76,12,33};
		System.out.println("SecondLargest: "+getSecondLargest(a,7));
	    System.out.println("SecondLargest: "+getSecondLargest(b,7));	
		
	}
}	
		
	