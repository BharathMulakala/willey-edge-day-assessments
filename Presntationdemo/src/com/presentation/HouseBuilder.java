package com.presentation;


public class HouseBuilder {

	private int doors;
	private int floors;
	private int windows;
	private double width;
	private double length;
	private boolean duplex;

	public HouseBuilder setDoors(int doors) {
		this.doors = doors;
		return this;
	}

	public HouseBuilder setFloors(int floors) {
		this.floors = floors;
		return this;
	}

	public HouseBuilder setWindows(int windows) {
		this.windows = windows;
		return this;
	}

	public HouseBuilder setWidth(double width) {
		this.width = width;
		return this;
	}

	public HouseBuilder setLength(double length) {
		this.length = length;
		return this;
	}

	public HouseBuilder setDuplex(boolean duplex) {
		this.duplex = duplex;
		return this;
	}

	public House getHouse() {
		return new House(doors, floors, windows, width, length, duplex);
	}

}
