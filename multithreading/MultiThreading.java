package multithreading;

class a extends Thread{
	public void run() {
		System.out.println("Thread A is Started");
		
		for(int i=1; i<=10; i++) {
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Value of i in A "+i);
		}
		   System.out.println("Thread A is Exited");
	}	
}
class b extends Thread{
	public void run() {
		System.out.println("Thread B is Started");
		
		for(int j=1; j<=10; j++) {
			
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Value of j in B "+j);
		}
		   System.out.println("Thread B is Exited");
	}	
}
class c extends Thread{
	public void run() {
		System.out.println("Thread C is Started");
		
		for(int k=1; k<=10; k++) {
			
//			try {
//				Thread.sleep(3000);
//			}
//			catch(InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println("Value of k in C "+k);
		}
		   System.out.println("Thread C is Exited");
	}	
}
public class MultiThreading {

	public static void main(String[] args) {
		
		a obj1 = new a();
		b obj2 = new b();
		c obj3 = new c();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
