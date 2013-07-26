package pattern.builder;

import pattern.product.House;

/**
 * This class creates a simple house and it is the base of any type of concrete house builders.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public abstract class HouseBuilder {

	/**
	 * Constructed house.
	 */
	protected House house = null;

	/**
	 * Create a simple house.
	 */
	public void createHouse() {
		this.house = new House();
	}

	/**
	 * Get the house.
	 * 
	 * @return House.
	 */
	public House getHouse() {
		return this.house;
	}

	/**
	 * Build the house's rooms.
	 */
	public abstract void buildRooms();

	/**
	 * Build the house's doors.
	 */
	public abstract void buildDoors();

	/**
	 * Build the house's windows.
	 */
	public abstract void buildWindows();
}
