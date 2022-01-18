package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class PetTest {

	@Test
	public void testPet() {
		
	}
	@Test
	public void testMeaow() {
		pet testPet = new pet();
		assertTrue("Meaow".equals(testPet.meaow()));
	}
   
}
