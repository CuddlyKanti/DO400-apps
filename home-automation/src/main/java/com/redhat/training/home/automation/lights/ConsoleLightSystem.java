package com.redhat.training.home.automation.lights;
public class ConsoleLightSystem implements LightSystem {
	public boolean on = false;
	
	public void switchOn() {
		System.out.println("Lights On");
		on = true;
	}
	
	public void switchOff() {
		System.out.println("Lights Off");
		on = false;
	}

	public boolean isOn() {
		return on;
	}
}
