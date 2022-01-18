package assessment;
interface inter1{
	int a = 100;
	public void fun1();	
}
interface inter2 extends inter1{
	int b = 200;
	public void fun2();
}
interface inter3 extends inter1{
	int c = 300;
	public void fun3();
}
class Derived implements inter2,inter3{
	public void fun1(){
	System.out.println("Inter1 = "+a);
	}
	public void fun2(){
	System.out.println("Inter2 = "+b);
	}
	public void fun3(){
	System.out.println("Inter3 = "+c);
	}
}
public class Hybrid {

	public static void main(String[] args) {
		Derived obj = new Derived();
		obj.fun1();
		obj.fun2();
		obj.fun3();

	}

}
