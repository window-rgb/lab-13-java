package junittesting1;

import static org.junit.Assert.*;

import org.junit.Test;

public class countA {

	@Test
	public void test() {
		
		junittesting1 obj = new junittesting1();
		int output = obj.countA("Sundas");
		assertEquals(1 ,output);
	}

}
