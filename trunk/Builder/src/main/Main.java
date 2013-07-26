package main;

import pattern.Constructor;
import pattern.builder.concretebuilders.BigHouseBuilder;
import pattern.builder.concretebuilders.SmallHouseBuilder;

/**
 * This is the main class of the project.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class Main {

	/**
	 * Main function.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Construct a new house.
		Constructor constructor = new Constructor(new SmallHouseBuilder());
		constructor.constructHouse();

		// Get the new house.
		System.out.println(constructor.getConstructedHouse());

		// Construct another house, but in this case the constructed house is a `big` one.
		constructor.setHouseBuilder(new BigHouseBuilder());
		constructor.constructHouse();

		// Get the newly constructed big house.
		System.out.println(constructor.getConstructedHouse());
	}

}
