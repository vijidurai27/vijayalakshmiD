package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareUnit {

	@Test
	public void test() {
		   test obj1 = new test();
		   
		   int output=obj1.square(4);
		   //test the output
		   assertEquals(16,output);
		   
		   System.out.println("Hello World");
		}

	

	}


