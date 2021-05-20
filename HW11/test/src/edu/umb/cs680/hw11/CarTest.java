package edu.umb.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {
	
	@Test
	public void MakeTestVerification() {
		Car car = new Car("Santro", "Honda", 20, 2015, 300000);
		String actual = car.getMake();
		String expected = "Santro";
		assertEquals(actual, expected);
	}
	
	@Test
	public void ModelTestVerification() {
		Car car = new Car("Santro", "Honda", 20, 2015, 300000);
		String actual = car.getModel();
		String expected = "Honda";
		assertEquals(actual, expected);
	}


	@Test
	public void MileageTestVerification() {
		Car car = new Car("Santro", "Honda", 20, 2015, 300000);
		int actual = car.getMileage();
		int expected = 20;
		assertEquals(actual, expected);
	}
	
	@Test
	public void YearTestVerification() {
		Car car = new Car("Santro", "Honda", 20, 2015, 300000);
		int actual = car.getYear();
		int expected = 2015;
		assertEquals(actual, expected);
	}

	@Test
	public void verify_PriceTest() {
		Car car = new Car("Santro", "Honda", 20, 2015, 300000);
		float actual = car.getPrice();
		float expected = 300000;
		assertEquals(actual, expected);
	}

}

