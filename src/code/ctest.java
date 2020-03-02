package code;

import static org.junit.Assert.*;

import org.junit.Test;
public class ctest {

	@Test
	public void test() {
	//	fail("Not yet implemented");
		double a=10,b=20;
		double n=Cal.add(a, b);
		assertTrue(n==30);
	}

}
