import static org.junit.Assert.assertTrue;

import static org.junit.Assert.fail;

import org.junit.Test;

public class SieveTests {

	/* Unit test for calculateMax()
	 * to verify it is returning the 
	 * correct value when passed a legal arg
	 */
	@Test
	public void calculateMaxLegalArgsTest() {
		
		//arbitrarily chose the legal value 4
		String[] args = {"4"};
		
		int returned = Sieve.calculateMax(args);
		
		assertTrue(returned == 4);
	}
	
	@Test
	public void calculateMaxIllegalArgsTest() {
		
		//chose an illegal arg(0)
		String[] args = {"foo"};
		
		try {
		
			Sieve.calculateMax(args);
			fail("The method did not throw an IllegalArgumentException!");
		} catch (IllegalArgumentException ex) {
			assertTrue(true);
		}
		
	}
		

}
