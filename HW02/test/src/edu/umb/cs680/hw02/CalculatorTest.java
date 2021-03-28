package edu.umb.cs680.hw02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CalculatorTest {
	
	@Test
	   public void Multiply_3And5() throws Exception{
			Calculator calculator = new Calculator();
			double number = calculator.multiply(3, 5);
			assertEquals(15, number);
		}
	
	
	@Test
	   public void Multiply_6And0() throws Exception{
			Calculator calculator = new Calculator();
			double number = calculator.multiply(6, 0);
			assertEquals(0, number);
		}
	

	@Test
	   public void Multiply_3AndNegative1() throws Exception{
			Calculator calculator = new Calculator();
			double number = calculator.multiply(3, -1);
			assertEquals(-3, number);
		}
	
	@Test
	   public void Division_20And4() throws Exception{
			Calculator calculator = new Calculator();
			double number = calculator.divide(20, 4);
			assertEquals(5, number);
			
		}
	
	
	@Test
	   public void Division_5By0() throws Exception{
		    Calculator calculator = new Calculator();
		    try {
		    	calculator.divide(5, 0);
			    fail("division by zero");
			    } catch (IllegalArgumentException ex) {
			    	assertEquals("division by zero", ex.getMessage());		
		}
	}

}
