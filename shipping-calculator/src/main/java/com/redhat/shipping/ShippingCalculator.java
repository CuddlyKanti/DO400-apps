package com.redhat.shipping;
public class ShippingCalculator {
	public int costForRegion(String name) {
		if (name.equals("NA")) {
			return 100;
		}

		if (name.equals("LATAM")) {
			return 200;
		}

		return 0;
	}
}
