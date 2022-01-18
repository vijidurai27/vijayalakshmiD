package assessment;
class Ride{                                  // parent class
	void Fuel() {
	System.out.println("Tank Full....");
	}
}
class Bike extends Ride{                      // child class no:1
	void Safety() {
		System.out.println("Wear Helmet");
	}
	void Start() {
		System.out.println("Have a Happy Ride");
		}
}
class Car extends Ride{                       // child class no:2
	void Safety() {
		System.out.println("Wear Seatbelt");
	}
	void Start() {
		System.out.println("Have a Wounderfull Ride");
	}
}
public class Hierarchical {

	public static void main(String[] args) {

		Car c = new Car();
		c.Fuel();
		c.Safety();
		c.Start();
		System.out.println("\n----------\n");
		Bike b = new Bike();
		b.Fuel();
		b.Safety();
		b.Start();

	}

}
