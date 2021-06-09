package com.redhat.training.home.automation;

public class RoomConditions {
	
	public boolean presenceDetected;
	public double daylightFactor;
	
	RoomConditions(double daylightFactor, boolean presenceDetected) {
		this.daylightFactor = daylightFactor;
		this.presenceDetected = presenceDetected;
	}
}
