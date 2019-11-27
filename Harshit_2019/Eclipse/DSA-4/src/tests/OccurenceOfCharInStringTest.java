package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment4.OccurenceOfCharInString;

public class OccurenceOfCharInStringTest {

	@Test
	public void checkInputForCheckUniqueTest() {
		String strInput = "Hello ";
		Integer expected = 3;
		assertEquals(expected, OccurenceOfCharInString.checkUnique(strInput));
	}

	@Test
	public void checkInputForEmptyInputTest() {
		String strInput = "";
		String expected = "string can't be empty";
		try {
			OccurenceOfCharInString.checkUnique(strInput);
		} catch (Throwable ex) {
			assertEquals(expected, ex.getMessage());
		}
	}

	@Test
	public void checkInputForNullInputTest() {
		String strInput = null;
		String expected = "string can't be null";
		try {
			OccurenceOfCharInString.checkUnique(strInput);
		} catch (Throwable ex) {
			assertEquals(expected, ex.getMessage());
		}
	}
}