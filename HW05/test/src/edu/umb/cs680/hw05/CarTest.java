package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	private String[] carToStringArray(Car car) {
		String[] carInfo = {car.getMake(),car.getModel(),Integer.toString(car.getYear())};
		return carInfo;
	}
	
	@Test
	void verifyCarEqualityWithMakeModelYear() throws Exception{
		Car actual = new Car("Bugatti","Veyron",12,2011,62000);
		String[] expected = {"Bugatti","Veyron","2011"};
		assertArrayEquals(expected,carToStringArray(actual));
	}

}
