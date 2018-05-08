package com.ubs.opsit.utils;

import com.ubs.opsit.model.Time;

public abstract class BerlinClockUtils {

	public static Time getTime(String timeString) {
		Time24HoursValidator time24HoursValidator = new Time24HoursValidator();
		Boolean isValidtime = time24HoursValidator.validate(timeString);
		if (!isValidtime) {
			throw new IllegalArgumentException("invalid time string.");
		}
		String[] parts = timeString.split(":");
		int hour = Integer.valueOf(parts[0]);
		int minutes = Integer.valueOf(parts[1]);
		int seconds = Integer.valueOf(parts[2]);
		return new Time(hour, minutes, seconds);
	}
}
