package pattern.product;

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
