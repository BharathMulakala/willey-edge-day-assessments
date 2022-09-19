package com.presentation;

public class HouseDemo {

	public static void main(String[] args) {
		HouseBuilder houseBuilder = new HouseBuilder();
		House house = houseBuilder.setDoors(6).setDuplex(true).setWindows(10).getHouse();
		System.out.println(house);
	}

}