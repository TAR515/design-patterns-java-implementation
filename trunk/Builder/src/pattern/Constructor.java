package pattern;

import pattern.builder.HouseBuilder;
import pattern.product.House;

/**
 * This class is available for building a arbitrary house.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class Constructor {

	/**
	 * The houseBuilder specify the type of the built house.
	 */
	private HouseBuilder houseBuilder = null;

	public Constructor(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	/**
	 * Sets the type of the house builder.
	 * 
	 * @param houseBuilder
	 */
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	/**
	 * Returns the constructed house.
	 * 
	 * @return Constructed house.
	 */
	public House getConstructedHouse() {
		return this.houseBuilder.getHouse();
	}

	/**
	 * Construct the house.
	 */
	public void constructHouse() {
		this.houseBuilder.createHouse();
		this.houseBuilder.buildRooms();
		this.houseBuilder.buildDoors();
		this.houseBuilder.buildWindows();
	}

}
