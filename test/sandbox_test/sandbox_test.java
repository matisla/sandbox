package sandbox_test;

import static org.junit.Assert.*;

import org.junit.Test;

import sandbox.sandbox;

public class sandbox_test {

	@Test
	public void testAddition() {
		sandbox sb = new sandbox();
		
		// Given
		int a, b, r;

		// When
		a = 1; b = 2; r = 3;
		
		// Then
		assertEquals(sb.addition(a, b), r);
	}

}
