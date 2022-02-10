package inheritance;       //method overloading

public class shape {
	void area(int side) {  // Calculate the area of Square
		int result = side*side;
		System.out.println("Area of Square is:  "+result);
	}
	void area(int length,int breath) {  // Calculate the area of Rectangle
		int result = length*breath;
		System.out.println("Area of Rectangle is:  "+result);
	}
	void area(double pi,int r) {   //  Calculate the area of Circle
		double result = pi*r*r;
		System.out.println("Area of Circle is:  "+result);
	}

	public static void main(String[] args) {
		shape obj = new shape();
		obj.area(5);
		obj.area(3,2);
		obj.area(3.14,10);
		
	}

}
