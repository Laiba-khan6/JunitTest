package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareUnit {

	@Test
	public void test() {
		UnitTest obj1 = new UnitTest();
		int outPut = obj1.square(5);
		//test the ouput
		assertEquals(25, outPut);
	}

}
