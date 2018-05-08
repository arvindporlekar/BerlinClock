package com.ubs.opsit.model;

import java.util.List;

public class Row {
	private final List<Lamp> lamps;

	public Row(List<Lamp> lamps) {
		this.lamps = lamps;
	}

	/**
	 * @return the lamps
	 */
	public List<Lamp> getLamps() {
		return lamps;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Lamp lamp : lamps) {
			sb.append(lamp.toString());
		}
		return sb.toString();
	}
}
