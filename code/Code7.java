package code;

import java.util.Iterator;
import java.util.TreeSet;

public class Code7 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		//Collection<String> set = new TreeSet<>(Collections.reverseOrder());
		set.add("Viji");
		set.add("Lakshmi");
		set.add("Praveen");
		set.add("Pandi");
		
		System.out.println(set);
		
		Iterator<String> it = set.iterator();
		String query = "Lakshmi";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}

}