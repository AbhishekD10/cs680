package edu.umb.cs680.hw13.observer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class observerTest {

	DJIAQuoteObservable djiaQuoteObservable = new DJIAQuoteObservable();
	PieChartObserver pieChartObserver = new PieChartObserver();
	StockQuoteObservable stockQuoteObservable = new StockQuoteObservable();
	TableObserver tableObserver = new TableObserver();
	ThreeDObserver threeDObserver = new ThreeDObserver();
	
	@Test
	void dijaQuoteObservableVerification() {
		djiaQuoteObservable.addObserver(pieChartObserver);
		djiaQuoteObservable.addObserver(tableObserver);
		djiaQuoteObservable.addObserver(threeDObserver);
        djiaQuoteObservable.changeQuote(25);
		djiaQuoteObservable.changeQuote(56);
	}
	
	@Test
	void stockQuoteObservableVerification() {
		stockQuoteObservable.addObserver(pieChartObserver);
		stockQuoteObservable.addObserver(tableObserver);
		stockQuoteObservable.addObserver(threeDObserver);
		stockQuoteObservable.changeQuote("Hello", 151);
		stockQuoteObservable.changeQuote("World", 254);
	}

}
