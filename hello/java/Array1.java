package hello.java;
import java.util.*;
//import java.util.stream.IntStream;
class Array1 {
		//Java program to check whether an element is present in array or not
        private static void check(int[] array1,int toCheckValue){
			boolean test = false;
			for (int element :array1) {
				if (element == toCheckValue) {
					test = true;
					break;
			    }
		   }
			System.out.println("Is "+ toCheckValue+" present in the array1: "+test);
			
	    }  
        public static void main(StringBuffer[] args) {
        	int array1[] = {3,7,38,67,11,54,12,45};
        	int toCheckValue = 54;
        	System.out.println("Array: "+Arrays.toString(array1));
        	check(array1, toCheckValue);
        }
}
