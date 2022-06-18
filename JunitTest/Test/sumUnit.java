package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumUnit {

	@Test
	public void test() {
		UnitTest obj2 = new UnitTest();
		int output = obj2.sum(10, 11);
		//Test the sum output
		assertEquals(21 ,output);
	}

}
