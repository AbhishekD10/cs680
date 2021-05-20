package edu.umb.cs680.hw13.multicast;

import java.util.ArrayList;
import java.util.List;

public class StockQuoteObservable {
	private boolean change;
	public List<StockQuoteObserver> obs = new ArrayList<StockQuoteObserver>();
	
	public void setChanged() {
		this.change = true;
	}

	public boolean hasChanged() {
		return this.change;
	}

	public void addObserver(StockQuoteObserver observer) {
		this.obs.add(observer);	
	}
	
	public void clearChanged() {
		this.change = false;
	}
	
	public void changeQuote(String T, float Q) {
		setChanged();
		notifyObservers(new StockEvent(T, Q));
	}

	public void notifyObservers(StockEvent stockevent) {
		if (hasChanged()) {
			for (StockQuoteObserver observerQuote : this.obs) {
				observerQuote.updateStock(stockevent);
			}
			clearChanged();
		}
	}
}
