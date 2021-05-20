package edu.umb.cs680.hw14;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;


class MileageComparatorTest {

	 ArrayList<Car> CarList = new ArrayList<Car>();
		@Test
		public void MileageComparatorVerification() {
			

			CarList.add(new Car("Santro", "Honda", 22, 2019, 37000));
			CarList.add(new Car("Ford", "MustangGT", 25, 2014, 45000));
			 
		
			 Collections.sort(CarList,(Car car1, Car car2) -> car1.getMileage()-car2.getMileage());
			 
			 
			 assertEquals(22,CarList.get(0).getMileage());
			 assertEquals(25, CarList.get(1).getMileage());
			
		}
		
		@Test
		public void MileageComparatorError() {
			

			CarList.add(new Car("Santro", "Honda", 22, 2019, 37000));
			CarList.add(new Car("Ford", "MustangGT", 25, 2014, 45000));
			 
			 Collections.sort(CarList,(Car car1, Car car2) -> car1.getMileage()-car2.getMileage());
			 
			 
			 assertNotEquals(27,CarList.get(0).getMileage());
			 assertNotEquals(24, CarList.get(1).getMileage());
			
		}

}

