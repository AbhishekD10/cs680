package edu.umb.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class MileageComparatorTest {

	List<Car> CarList = new ArrayList<Car>();
	
	@Test
	public void MileageComparatorVerification() {
		CarList.add(new Car("Santro", "Honda", 22, 2010, 30000));
		CarList.add(new Car("Ritz", "SX-4", 21, 2012, 20000));
		CarList.add(new Car("Mustang", "GT", 20, 2018, 50000));
		CarList.add(new Car("Mercedes", "Benz", 16, 2020, 89000));
		 
		 
		 Collections.sort(CarList,new MileageComparator());
		 
		 System.out.println(CarList.get(1).getMileage());
		 
		 assertEquals(16, CarList.get(0).getMileage());
		 assertEquals(20, CarList.get(1).getMileage());
		 assertEquals(21,CarList.get(2).getMileage());
		 assertEquals(22, CarList.get(3).getMileage());
		
	}

}