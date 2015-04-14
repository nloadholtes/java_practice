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
		assertTrue(sorter.isPrime(4));
	}

}
