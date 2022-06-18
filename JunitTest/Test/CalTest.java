package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {

	@Test
	public void test() {
		assertEquals("error in add()", 5, Calculator.add(3, 2));
		assertEquals("error in sub()", 2, Calculator.add(2, 0));
		assertEquals("error in mul()", 2, Calculator.add(1, 1));
		assertEquals("error in divi()", 3, Calculator.add(2, 1));

	}
	public void  calTestAddFail() {
		assertEquals("error in add()", 0, Calculator.add(1, 2));

	}
	public void calTestSubPass() {
		assertEquals("error in add()", -6, Calculator.add(3, 9));
		assertEquals("error in add()", 3, Calculator.add(3, 6));
		assertEquals("error in add()", 1, Calculator.add(10, 9));

	}

}
