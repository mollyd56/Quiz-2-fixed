import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarPaymentTest {

	@Test
	void test() {
		
		CarPayment car1 = new CarPayment(35000, 0, 60, 10);
		
		assertEquals(car1.CarPaymentMonthly(), 743.65);
		assertEquals(car1.TotalInterest(), 9618.79);
	}

}
