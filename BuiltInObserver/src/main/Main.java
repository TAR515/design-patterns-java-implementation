package main;

import pattern.Data;
import pattern.Internet;
import pattern.LocalGUI;

public class Main {

	public String name;

	public Main(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// Creating the data object
		Data data = new Data("data1");

		// Adding the observers for the data object.
		data.addObserver(new Internet());
		data.addObserver(new LocalGUI());

		// Changing the data value
		data.setData("data2");
	}
}
