package edu.umb.cs680.hw13.multicast;


public class PieChartObserver implements DJIAQuoteObserver, StockQuoteObserver{

	
	@Override
	public void updateDJIA(DJIAEvent Djiaevent) {
		// TODO Auto-generated method stub
		DJIAEvent event = (DJIAEvent) Djiaevent;
		System.out.print("PieChart of DJIAEvent" + event.getDjia());
	}
	
	@Override
	public void updateStock(StockEvent Stockevent) {
		// TODO Auto-generated method stub
		StockEvent event = (StockEvent) Stockevent;
		System.out.print("PieChart of StockEvent:Shown here " + event.getTicker() + " " + event.getQuote());
		
	}
	
	

}
