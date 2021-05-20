package edu.umb.cs680.hw13.observer;

public class DJIAEvent {
	private float djiaEventInstance;

	public DJIAEvent(float djiaEvent) {
		this.djiaEventInstance = djiaEvent;
	}

	public float getDjia() {
		return djiaEventInstance;
	}

	public void setDjia(float djiaEvent) {
		this.djiaEventInstance = djiaEvent;
	}
}
