package pattern.builder.concretebuilders;

import pattern.builder.HouseBuilder;

/**
 * Concrete house builder for building a small house.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class SmallHouseBuilder extends HouseBuilder {

	/**
	 * @see #buildRooms()
	 */
	@Override
	public void buildRooms() {
		house.setNumberOfRooms(3);
	}

	/**
	 * @see #buildDoors()
	 */
	@Override
	public void buildDoors() {
		house.setNumberOfDoors(4);
	}

	/**
	 * @see #buildWindows()
	 */
	@Override
	public void buildWindows() {
		house.setNumberOfWindows(5);
	}
}
