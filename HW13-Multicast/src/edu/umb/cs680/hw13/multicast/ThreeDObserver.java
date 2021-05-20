package edu.umb.cs680.hw13.multicast;

public class ThreeDObserver implements DJIAQuoteObserver, StockQuoteObserver{

	@Override
	public void updateDJIA(DJIAEvent djiaEvent) {
		// TODO Auto-generated method stub
		DJIAEvent event = (DJIAEvent) djiaEvent;
		System.out.print("ThreeDObserver of DJIAEvent" + event.getDjia());
	}
	
	@Override
	public void updateStock(StockEvent stockEvent) {
		// TODO Auto-generated method stub
		StockEvent event = (StockEvent) stockEvent;
		System.out.print("ThreeDObserver of StockEvent" + event.getTicker() + " " + event.getQuote());
		
	}
	
}