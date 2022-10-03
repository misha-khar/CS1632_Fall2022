package edu.pitt.cs;

import static org.junit.Assert.*;
import org.mockito.*;

import org.junit.Test;

public class SquareTest {

	/**
	 * Write an integration test for setSquared.
	 * 
	 * <pre>
	 * Preconditions: A new Square square is created
	 *                A new Number number is created
	 * Execution Steps: Call square.setSquared(number, 3)
	 * PostConditions: The value of number is set to 9
	 * </pre>
	 */
	@Test
	public void testSetSquaredIntegration() {
		Square square = new Square();
		Number number = new Number();
		
		// TODO: Fill in!
		square.setSquared(number, 3);
		assertEquals(9, number.getVal());

		// fail();
	}

	/**
	 * Write a unit test for setSquared.
	 * 
	 * <pre>
	 * Preconditions: A new Square square is created
	 *                A new Number number is created
	 * Execution Steps: Call square.setSquared(number, 3)
	 * PostConditions: The value of number is set to 9
	 * </pre>
	 */
	@Test
	public void testSetSquaredUnit() {
		// TODO: Fill in!
		// trying to isolate square, so thats a real object
		Square square = new Square();
		// number is not what we're trying to test so we mock it
		Number number = Mockito.mock(Number.class);
		//call setSquared on square
		square.setSquared(number, 3);
		// tautological test, passes, but incorrect
		// Mockito.when(number.getVal()).thenReturn(9);
		// use mockito.verify to check if number is 9
		Mockito.verify(number).setVal(9);

		// fail();
	}
}
