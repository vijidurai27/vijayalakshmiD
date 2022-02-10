package hello.java;
import java.util.*;
public class ArrayRemove {
	public static void main(StringBuffer[] args) {
		int test[] ={10,40,70,80,60,90};
		System.out.println("Constents: " +Arrays.toString(test));
		test = Array.remove(test,2);
		System.out.println("Content of Array after removing object: "+Arrays.toString(test));
	}
}

