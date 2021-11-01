package Puunurm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ipValidatorTests {

	private IpValidator validator;

	@BeforeEach
	void setUp() throws Exception {
		validator = new IpValidator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void shouldReturn_False_GivenEmptyStringParameter() {
		assertFalse(validator.ValidateIpv4Address(""));
	}

	@Test
	void shouldBe_True_GivenStringWithThreeDots() {
	assertTrue(validator.ValidateIpv4Address("1.2.3.1"));
	}
	
}
