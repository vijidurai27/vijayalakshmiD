package assessment;
class A1{
	public void methodA1() {
		System.out.println("Super Parent Class");
	}
}
class B1 extends A1{
	public void methodB1() {
		System.out.println("Parent Class");
	}	
}
class C1 extends B1{
	public void methodC1() {
		System.out.println("Child Class");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		C1 obj = new C1();
		obj.methodA1();  //calling super parent class
		obj.methodB1();  //calling parent class
		obj.methodC1();  //calling child class
	}

}
