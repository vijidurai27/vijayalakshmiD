package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class code1 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(101, "Vijay", "123 street, India", 95000.0));
		list.add(new Employee(102, "Surya", "234 street, India", 35000.0));
		list.add(new Employee(103, "Jeeva", "345 street, India", 29000.0));
		list.add(new Employee(104, "Arya", "456 street, India", 45000.0));
		
		System.out.println(list);
		
		Iterator<Employee> it = list.iterator();
		int searchId = 101;
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
	}

}
