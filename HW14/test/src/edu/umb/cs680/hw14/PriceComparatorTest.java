package edu.umb.cs680.hw14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;


class PriceComparatorTest {

	 ArrayList<Car> CarList = new ArrayList<Car>();
		@Test
		public void PriceComparatorVerification() {
			

			CarList.add(new Car("Santro", "Honda", 22, 2019, 37000));
			CarList.add(new Car("Ford", "MustangGT", 25, 2014, 45000));
			 
		
			Collections.sort(CarList,(Car car1, Car car2) -> (int) (car1.getPrice() - car2.getPrice()));
			 
			 
			 assertEquals(37000,CarList.get(0).getPrice());
			 assertEquals(45000, CarList.get(1).getPrice());
			
		}
		
		@Test
		public void PriceComparatorError() {
			

			CarList.add(new Car("Santro", "Honda", 22, 2019, 37000));
			CarList.add(new Car("Ford", "MustangGT", 25, 2014, 45000));
			 
			Collections.sort(CarList,(Car car1, Car car2) -> (int) (car1.getPrice() - car2.getPrice()));
			 
			 
			 assertNotEquals(27,CarList.get(0).getMileage());
			 assertNotEquals(24, CarList.get(1).getMileage());
			
		}

}
