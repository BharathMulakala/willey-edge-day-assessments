package com.presentation;

public class House {

	private int doors;
	private int floors;
	private int windows;
	private double width;
	private double length;
	private boolean duplex;

	public House(int doors, int floors, int windows, double width, double length, boolean duplex) {
		super();
		this.doors = doors;
		this.floors = floors;
		this.windows = windows;
		this.width = width;
		this.length = length;
		this.duplex = duplex;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public boolean isDuplex() {
		return duplex;
	}

	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}

	@Override
	public String toString() {
		return "House [doors=" + doors + ", floors=" + floors + ", windows=" + windows + ", width=" + width
				+ ", length=" + length + ", duplex=" + duplex + "]";
	}

}
