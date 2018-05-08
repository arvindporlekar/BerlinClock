package com.ubs.opsit.interviews;

import com.ubs.opsit.model.BerlinClock;
import com.ubs.opsit.model.Time;
import com.ubs.opsit.utils.BerlinClockUtils;

public abstract class BurlinClockBuilder {

	public static BerlinClock buildBerlinClock(String timeString) {
		Time time = BerlinClockUtils.getTime(timeString);
		BerlinClock berlinClock = new BerlinClock();
		BerlinClockUtils.turnOnSecondsLamp(berlinClock,time.getSeconds());
		BerlinClockUtils.turnOnHoursLamp(berlinClock,time.getHours());
		BerlinClockUtils.turnOnMinutesLamp(berlinClock,time.getMinutes());
		return berlinClock;
	}
}
