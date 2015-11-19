import static org.junit.Assert.*;

import org.junit.Test;

public class smallest {

	@Test
	public void test() {
		
		bootcamp02 test = new bootcamp02();
		int [] numbers ={4,1, 0, 5, 7 , 10, 34, -1};
		int minium =test.smallest(numbers);
		assertEquals(-1,minium);
		assertEquals(4,minium);
		
	}

}
