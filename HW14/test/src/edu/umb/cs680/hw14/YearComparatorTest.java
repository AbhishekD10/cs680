package edu.umb.cs680.hw14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;


class YearComparatorTest {

	 ArrayList<Car> CarList = new ArrayList<Car>();
		@Test
		public void YearComparatorVerification() {
			

			CarList.add(new Car("Santro", "Honda", 22, 2019, 37000));
			CarList.add(new Car("Ford", "MustangGT", 25, 2014, 45000));
			 
		
			 Collections.sort(CarList,(Car car1, Car car2) -> car1.getYear()-car2.getYear());
			 
			 
			 assertEquals(2014,CarList.get(0).getYear());
			 assertEquals(2019, CarList.get(1).getYear());
			
		}
		
		@Test
		public void YearComparatorError() {
			

			CarList.add(new Car("Santro", "Honda", 22, 2019, 37000));
			CarList.add(new Car("Ford", "MustangGT", 25, 2014, 45000));
			 
			 Collections.sort(CarList,(Car car1, Car car2) -> car1.getYear()-car2.getYear());
			 
			 
			 assertNotEquals(2010,CarList.get(0).getMileage());
			 assertNotEquals(2020, CarList.get(1).getMileage());
			
		}

}
