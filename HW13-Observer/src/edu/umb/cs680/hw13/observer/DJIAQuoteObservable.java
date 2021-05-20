package edu.umb.cs680.hw13.observer;

import java.util.*;

@SuppressWarnings("deprecation")
public class DJIAQuoteObservable extends Observable{
    private float quoteObject;

    public void changeQuote(float q) {
        this.quoteObject = q;
        setChanged();
        notifyObservers(new DJIAEvent(quoteObject));
    }
}
