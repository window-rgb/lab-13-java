package junittesting1;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		
		junittesting1 obj = new junittesting1();
		int output =obj.square(5);
		assertEquals(25, output);
	}

}
