package practice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SorterTest {
	protected Sorter sorter;
	
	@Before
	public void setUp() {
		sorter = new Sorter();
	}

	@Test
	public void testIsPrime() {
		assertTrue(sorter.isPrime(7));
	}
	
	@Test
	public void testIsPrime_false() {
		assertFalse(sorter.isPrime(8));
	}
	
	@Test
	public void testIsPrime_false_for_real() {
		assertFalse(sorter.isPrime(9));
	}
	
	@Test
	public void testIsPrime_big() throws Exception {
		assertTrue(sorter.isPrime(1373));		
	}

}
