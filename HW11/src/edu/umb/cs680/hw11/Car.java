package edu.umb.cs680.hw11;


import java.util.ArrayList;
import java.util.List;


public class Car {
	private String make;
    private String model;
    private int mileage;
    private float price;
    private int dominationcount;
    private int year;
    
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
    
    public void setDominationCount(List<Car> carList) {
        int c = 0;
        for (Car car : carList) {
            if (!car.equals(this)) {
                    if ((this.getYear() > car.getYear()) || (this.getMileage() < car.getMileage()) || (this.getPrice() < car.getPrice())) {
                        c++;
                    }
            }
        }
        this.dominationcount = c;
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
