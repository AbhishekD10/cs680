package edu.umb.cs680.hw14;

import java.util.ArrayList;

public class Car {
	
	 	private String make;
	    private String model;
	    private int mileage;
	    private int year;
	    private int dominationcount;
	    private float price;
	    
	    public Car(String make, String model, int mileage, int year,  float price) {
	    	this.make = make;
	    	this.model = model;
	    	this.mileage = mileage;
	    	this.year = year;
	    	this.price = price;
	    }

	    public String getModel() {
	    	return this.model;
	    }
	    public String getMake() {
	    	return this.make;
	    }
	    public int getMileage() {
	    	return this.mileage;
	    }
	    public float getPrice() {
	    	return this.price;
	    }
	    public int getYear() {
	    	return this.year;
	    }
		
		 public void setDominationCount(ArrayList<Car> cars) {
		        int count = 0;
		        for (Car car : cars) {
		            if (!car.equals(this)) {
	                if ((this.getYear() >= car.getYear()) && (this.getMileage() <= car.getMileage()) && (this.getPrice() <= car.getPrice())) {
		                    if ((this.getYear() > car.getYear()) || (this.getMileage() < car.getMileage()) || (this.getPrice() < car.getPrice())) {
		                        count++;
		                    }
		                }
		            }
		        }
		        this.dominationcount = count;
		    }
		 
		 public int getDominationCount() {
				return this.dominationcount;
			}
		
		 public static void main(String[] args) {
			 Car car = new Car("BMW", "M4", 18, 2018, 95000);
				System.out.println("Make: " + car.getMake());
				System.out.println("Model: " + car.getModel());
				System.out.println("Mileage: " + car.getMileage());
				System.out.println("Year: " + car.getYear());
				System.out.println("Price: " + car.getPrice());

			}

}
