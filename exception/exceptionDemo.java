package exception;

public class exceptionDemo {

	public static void main(int Age) {
		
		if(Age<35) {
			throw new ArithmeticException("Not eligible in Parliament");
		}
		else {
			System.out.println("Eligible in Parliament");
		}
	}
	public static void main(String[] args) {
		main(35);
		System.out.println("Rest os the Code");
	}

}
