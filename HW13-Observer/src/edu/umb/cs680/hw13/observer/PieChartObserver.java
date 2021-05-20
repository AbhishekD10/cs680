package edu.umb.cs680.hw13.observer;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class PieChartObserver implements Observer {
	
	
    public void update(Observable observable, Object object) {
        if (object instanceof StockEvent) {
        	
        	StockEvent event = (StockEvent) object;
    		System.out.print("PieChart of StockEvent" + event.getTicker() + " " + event.getQuote());
    		
        } else if (object instanceof DJIAEvent) {
        	
        	DJIAEvent event = (DJIAEvent) object;
    		System.out.print("PieChart of DJIAEvent" + event.getDjia());
        }
    }
}