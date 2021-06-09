package com.redhat.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

   @Test
   public void canCalculateTheCostForARegion() {
	   ShippingCalculator calculator = new ShippingCalculator();
	   assertEquals(0, calculator.costForRegion("A Region"));
   }

   @Test
   public void onNARegionTheCostIs100() {
	// Given a shipping calculator
	ShippingCalculator calculator = new ShippingCalculator();
	// When NA is the country region
	int calculatedCost = calculator.costForRegion("NA");
	assertEquals(100, (new ShippingCalculator()).costForRegion("NA"));

	// Then the shipping cost is 100
	assertEquals(100, calculatedCost);
   }

   @Test
   public void onLATAMRegionTheCostIs200() {
	   // Given a shipping calculator
	   ShippingCalculator calculator = new ShippingCalculator();
	   // When LATAM is the country region
	   int calculatedCost = calculator.costForRegion("LATAM");
	   // Then the shipping cost is 200
	   assertEquals(200, calculatedCost);
	   }
}
