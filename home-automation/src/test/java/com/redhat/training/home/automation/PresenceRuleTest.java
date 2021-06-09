package com.redhat.training.home.automation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.redhat.training.home.automation.rules.PresenceRule;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class PresenceRuleTest {
	@Test
	public void isMetWhenPresenceDetected() {
		PresenceRule rule = new PresenceRule();
		RoomConditions conditions = new RoomConditions(0, false);
		assertFalse(rule.meets(conditions));
	}
}
