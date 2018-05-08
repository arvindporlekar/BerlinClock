package com.ubs.opsit.model;

public enum Color {
	RED("R"), YELLOW("Y");

	private String colorCode;

	Color(String colorCode) {
		this.colorCode = colorCode;
	}

	@Override
	public String toString() {
		return colorCode;
	}
}
