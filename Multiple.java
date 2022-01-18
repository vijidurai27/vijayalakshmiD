package assessment;
interface PI1{                                  // interface 1
	default void show() {
		System.out.println("Default PI1");
	}
}
interface PI2{                                 // interface 2
	 default void show() {
		System.out.println("Default PI2");
	}
}
class PI{                                      // class
	 void show() {
		System.out.println("Default Class");
	}
}
class TestClass extends PI implements PI1,PI2{
	@Override
	public void show() {
		PI1.super.show();                       //it show interface
		PI2.super.show();                      //it show interface
		super.show();                         // it show class
	}	
}
public class Multiple {

	public static void main(String[] args) {
		TestClass d = new TestClass();
		d.show();
	}
       
}
