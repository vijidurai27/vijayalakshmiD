package assessment;
class A{
	public void methodA() {
		System.out.println("Parent Class");
	}
}
class B extends A{
	public void methodB() {
		System.out.println("Child Class");
	}	
}
public class SingleInheritance {

	public static void main(String[] args) {
		B obj = new B();
		obj.methodA();  //calling super class or parent class
		obj.methodB();  //calling subclass or child class

	}

}
