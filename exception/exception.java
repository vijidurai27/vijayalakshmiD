package exception;

public class exception {

	public static void main(String[] args) {
		try {
		int b,a=30;
		b=a/0;              //arithmetic Exception
		System.out.println("b="+b);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally{
			System.out.println("Rest of the Code");
		}
	}

}
