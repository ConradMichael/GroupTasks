package factorialsTest;

import static org.junit.Assert.*;

import org.junit.Test;

import factorials.Main;

public class FactorialsTest {
	
	@Test
	public void testFactorial() {
		assertEquals("Is not a Factorial", 5, Main.isFactorial(120));
	}

	@Test
	public void testNonFactorial() {
		assertEquals("Shouldn't be a Factorial", 999, Main.isFactorial(150));
	}
	
}
