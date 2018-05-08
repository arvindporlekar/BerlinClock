package com.ubs.opsit.model;

public class BerlinClock {
	private Lamp secondsLamp;
	private Row fiveHoursRow;
	private Row oneHourRow;
	private Row fiveMinutesRow;
	private Row oneMinuteRow;

	public BerlinClock() {
		initializeFirstSecondsLamps();
		initializefiveHoursRowLamps();
		initializeOneHoursRowLamps();
		initializeFiveMinuteRowLamps();
		initializeOneMinuteRowLamps();
	}

	private void initializeOneHoursRowLamps() {
		// TODO Auto-generated method stub

	}

	private void initializeOneMinuteRowLamps() {
		// TODO Auto-generated method stub

	}

	private void initializeFiveMinuteRowLamps() {
		// TODO Auto-generated method stub

	}

	private void initializefiveHoursRowLamps() {
		// TODO Auto-generated method stub

	}

	private void initializeFirstSecondsLamps() {
		secondsLamp = new Lamp();
	}

	
	/**
	 * @return the secondsLamp
	 */
	public Lamp getSecondsLamp() {
		return secondsLamp;
	}

	/**
	 * @param secondsLamp the secondsLamp to set
	 */
	public void setSecondsLamp(Lamp secondsLamp) {
		this.secondsLamp = secondsLamp;
	}

	/**
	 * @return the fiveHoursRow
	 */
	public Row getFiveHoursRow() {
		return fiveHoursRow;
	}

	/**
	 * @param fiveHoursRow the fiveHoursRow to set
	 */
	public void setFiveHoursRow(Row fiveHoursRow) {
		this.fiveHoursRow = fiveHoursRow;
	}

	/**
	 * @return the oneHourRow
	 */
	public Row getOneHourRow() {
		return oneHourRow;
	}

	/**
	 * @param oneHourRow the oneHourRow to set
	 */
	public void setOneHourRow(Row oneHourRow) {
		this.oneHourRow = oneHourRow;
	}

	/**
	 * @return the fiveMinutesRow
	 */
	public Row getFiveMinutesRow() {
		return fiveMinutesRow;
	}

	/**
	 * @param fiveMinutesRow the fiveMinutesRow to set
	 */
	public void setFiveMinutesRow(Row fiveMinutesRow) {
		this.fiveMinutesRow = fiveMinutesRow;
	}

	/**
	 * @return the oneMinuteRow
	 */
	public Row getOneMinuteRow() {
		return oneMinuteRow;
	}

	/**
	 * @param oneMinuteRow the oneMinuteRow to set
	 */
	public void setOneMinuteRow(Row oneMinuteRow) {
		this.oneMinuteRow = oneMinuteRow;
	}

	@Override
	public String toString() {
		return getSecondsLamp().toString() + "\n" + getFiveHoursRow().toString() + "\n" + getOneHourRow().toString()
				+ "\n" + getFiveMinutesRow().toString() + "\n" + getOneMinuteRow().toString();
	}

}
