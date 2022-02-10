package inheritance;
class animal{
	public void move() {
		System.out.println("Animal can move ");
	}
}
class Dog extends animal{
	public void move() {
		super.move();
		System.out.println("Dogs can walk run");
	}	
}
public class methodoverriding {

	public static void main(String[] args) {
//		System.out.println();
		Dog d =new Dog();
		d.move();
	}
}
