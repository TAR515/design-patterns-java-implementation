package pattern.builder.concretebuilders;

import pattern.builder.HouseBuilder;

/**
 * Concrete house builder for building a big house.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class BigHouseBuilder extends HouseBuilder {

	/**
	 * @see #buildRooms()
	 */
	@Override
	public void buildRooms() {
		house.setNumberOfRooms(10);
	}

	/**
	 * @see #buildDoors()
	 */
	@Override
	public void buildDoors() {
		house.setNumberOfDoors(13);
	}

	/**
	 * @see #buildWindows()
	 */
	@Override
	public void buildWindows() {
		house.setNumberOfWindows(35);
	}

}
