# Builder #

## Description ##

The Builder design pattern allows to create a complex object step by step and also enforces a process to create an object as a finished product. The construction of the object should be such that the same construction process can create different representations. Director controls the construction of the object and only the director knows what type of object to create.

For example, you can consider printing of a book. Printing of a book involves various steps such as printing the table of contents, preface, introduction, chapters, and conclusion. Finally you will get a complete book object. With the help of the same process, you can print books with different properties.

As described by Gof:

"Separate the construction of a complex object from its representation so that the same construction process can create different representations"


## Structure Diagram ##

![![](https://design-patterns-java-implementation.googlecode.com/svn/img/builder/builder.png)](https://design-patterns-java-implementation.googlecode.com/svn/img/builder/builder.png)

## Code ##

Concrete product, house:

```

/**
 * This class contains all informations about a house.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class House {

	/**
	 * Number of rooms.
	 */
	private int numberOfRooms = 0;

	/**
	 * Number of doors.
	 */
	private int numberOfDoors = 0;

	/**
	 * Number of windows.
	 */
	private int numberOfWindows = 0;

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfWindows() {
		return numberOfWindows;
	}

	public void setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
	}

	@Override
	public String toString() {
		return "House [numberOfRooms=" + numberOfRooms + ", numberOfDoors=" + numberOfDoors + ", numberOfWindows="
				+ numberOfWindows + "]";
	}

}
```

The base house builder:

```
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
```

One of the concrete house builders:

```
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
```

Constructor, with this class we can create new arbitrary houses:

```
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
```

Main function:

```

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
```

Output:

```
House [numberOfRooms=3, numberOfDoors=4, numberOfWindows=5]
House [numberOfRooms=10, numberOfDoors=13, numberOfWindows=35]
```