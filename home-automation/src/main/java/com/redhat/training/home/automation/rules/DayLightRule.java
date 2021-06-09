package com.redhat.training.home.automation.rules;
import com.redhat.training.home.automation.RoomConditions;
public class DayLightRule extends Rule {
	@Override
	public boolean meets(RoomConditions conditions) {
		return conditions.daylightFactor < 0.2;
	}
}
