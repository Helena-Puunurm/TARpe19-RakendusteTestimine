package Puunurm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void shouldReturnNumbersOneToHundred() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals(100, fb.getNumbers().length);
	}
	
	/*@Test
	void shouldReturn
	*/

}
