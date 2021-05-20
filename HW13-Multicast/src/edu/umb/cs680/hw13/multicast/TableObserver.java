package edu.umb.cs680.hw13.multicast;

public class TableObserver implements DJIAQuoteObserver, StockQuoteObserver{

	@Override
	public void updateDJIA(DJIAEvent djiaEvent) {
		// TODO Auto-generated method stub
		DJIAEvent event = (DJIAEvent) djiaEvent;
		System.out.print("TableObserver of DJIAEvent" + event.getDjia());
	}
	
	@Override
	public void updateStock(StockEvent stockEvent) {
		// TODO Auto-generated method stub
		StockEvent event = (StockEvent) stockEvent;
		System.out.print("TableObservert of StockEvent " + event.getTicker() + " " + event.getQuote());
		
	}
	
	

}