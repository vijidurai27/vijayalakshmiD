package code;

import java.util.HashSet;
import java.util.Iterator;

public class Code6 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Dhuruv");
		set.add("Sanjay");
		set.add("Mathuri");
		set.add("Saahana");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
			
		}
	}

}
