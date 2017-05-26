package rbc;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCount {
		
	@Test
	public void testTotalValue() {
		Basket b = new Basket();
		b.fillBasket();
		assertEquals(105, b.CountValue());
	}

}
