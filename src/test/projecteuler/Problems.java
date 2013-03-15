package projecteuler;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Tarcisio
 * 
 *         Project Euler - Problem set
 * 
 */
public class Problems {

	@Test
	public void testProblem1() {
		Problem p = new Problem1();
		assertEquals(233168, p.solve());
	}

	@Test
	public void testProblem2() {
		Problem p = new Problem2();
		assertEquals(4613732, p.solve());
	}

}
