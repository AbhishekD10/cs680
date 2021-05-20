package edu.umb.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class YearComparatorTest {

		List<Car> CarList = new ArrayList<Car>();
		
		@Test
		public void YearComparatorVerification() {
			CarList.add(new Car("Santro", "Honda", 22, 2010, 30000));
			CarList.add(new Car("Ritz", "SX-4", 21, 2012, 20000));
			CarList.add(new Car("Mustang", "GT", 20, 2018, 50000));
			CarList.add(new Car("Mercedes", "Benz", 16, 2020, 89000));
			 
			 
			 Collections.sort(CarList,new YearComparator());
			 
			 assertEquals(2010, CarList.get(0).getYear());
			 assertEquals(2012, CarList.get(1).getYear());
			 assertEquals(2018,CarList.get(2).getYear());
			 assertEquals(2020, CarList.get(3).getYear());
			
		}

	}
