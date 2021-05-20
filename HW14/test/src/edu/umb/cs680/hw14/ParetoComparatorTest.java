package edu.umb.cs680.hw14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;


class ParetoComparatorTest {

	 ArrayList<Car> CarList = new ArrayList<Car>();
		@Test
		public void ParetoComparatorVerification() {
			

			CarList.add(new Car("Santro", "Honda", 22, 2019, 37000));
			CarList.add(new Car("Ford", "MustangGT", 25, 2014, 45000));
			 
			for (Car car : CarList) {
				car.setDominationCount(CarList);
			}

			Collections.sort(CarList, (Car car1, Car car2) -> car1.getDominationCount() - car2.getDominationCount());

			assertEquals(45000, CarList.get(0).getPrice());
			assertEquals(37000, CarList.get(1).getPrice());
			
		}
		
		@Test
		public void ParetoComparatorError() {
			

			CarList.add(new Car("Santro", "Honda", 22, 2019, 37000));
			CarList.add(new Car("Ford", "MustangGT", 25, 2014, 45000));
			 
			for (Car car : CarList) {
				car.setDominationCount(CarList);
			}

			Collections.sort(CarList, (Car car1, Car car2) -> car1.getDominationCount() - car2.getDominationCount());

			assertNotEquals(34000, CarList.get(0).getPrice());
			assertNotEquals(10000, CarList.get(1).getPrice());
			
		}

}

