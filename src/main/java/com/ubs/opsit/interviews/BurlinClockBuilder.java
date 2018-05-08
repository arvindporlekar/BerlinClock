package com.ubs.opsit.interviews;

import com.ubs.opsit.model.BerlinClock;
import com.ubs.opsit.model.Time;
import com.ubs.opsit.utils.BerlinClockUtils;

public abstract class BurlinClockBuilder {

	public static BerlinClock buildBerlinClock(String timeString) {
		Time time = BerlinClockUtils.getTime(timeString);
		BerlinClock berlinClock = new BerlinClock();
		BerlinClockUtils.activateSeconds(berlinClock.getSecondsLamp());
		return null;
	}
}
