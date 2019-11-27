package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment4.ComputeMass;

public class ComputeMassTest {
	@Test
	public void checkForCorrectInputs() {
		String formula = "C(OH)2";
		Integer expected = 29;
		assertEquals(expected, new ComputeMass().caluclateMass(formula));
		
	}

	@Test
	public void checkForEmptyInputTest() {
		String formula = "";
		String expected = "String is empty";
		try {
			new ComputeMass().caluclateMass(formula);
		} catch (Throwable ex) {
			assertEquals(expected, ex.getMessage());
		}
	}

}