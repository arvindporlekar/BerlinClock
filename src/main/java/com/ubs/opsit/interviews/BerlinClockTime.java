/**
 * 
 */
package com.ubs.opsit.interviews;

import com.ubs.opsit.model.BerlinClock;
import com.ubs.opsit.model.Time;
import com.ubs.opsit.utils.BerlinClockUtils;

/**
 * @author OWNER
 *
 */
public class BerlinClockTime implements TimeConverter {

	/* (non-Javadoc)
	 * @see com.ubs.opsit.interviews.TimeConverter#convertTime(java.lang.String)
	 */
	@Override
	public String convertTime(String aTime) {
		
		BerlinClock berlinClock = BurlinClockBuilder.buildBerlinClock(time); 
		return berlinClock.toString();
	}

}
