package edu.umb.cs680.hw13.multicast;

import java.util.ArrayList;
import java.util.List;

public class DJIAQuoteObservable {
	
	private boolean change;
	public List<DJIAQuoteObserver> obs = new ArrayList<DJIAQuoteObserver>();
	
	public void setChanged() {
		this.change = true;
	}

	public boolean hasChanged() {
		return this.change;
	}

	public void clearChanged() {
		this.change = false;
	}
	
	public void addObserver(DJIAQuoteObserver quoteObserver) {
		this.obs.add(quoteObserver);
	}
	public void changeQuote(float cq) {
		setChanged();
		notifyObserver(new DJIAEvent(cq));
	}

	public void notifyObserver(DJIAEvent djiaEvent) {
		if (hasChanged()) {
			for (DJIAQuoteObserver event: this.obs) {
				event.updateDJIA(djiaEvent);
			}
			clearChanged();
		}
	}
	
	
}