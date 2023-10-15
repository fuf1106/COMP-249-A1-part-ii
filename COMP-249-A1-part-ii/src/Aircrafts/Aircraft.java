//--------------------------------------------------
// Assignment # 1
// Part: 2
// Written by Diana Edvi (40198139) AND Fuad Awad (40195634)
//--------------------------------------------------

package Aircrafts;
/**
 * Represents an Aircraft object.
 * This class defines the basic properties and behaviors of an aircraft, such as price, maximum elevation,
 * and serial number.
 */
public class Aircraft extends Vehicle {
	//Instance variables
	private static long serialNumGenerator = 100000;
	protected double price;
	protected double maxElevation;
	protected long serialNum;
	
	/**
	 * Default constructor constructs a new default Aircraft object
	 */
	public Aircraft() {
		this.serialNum = getNextSerialNumber();
		this.price = 10000;
		this.maxElevation = 50000;
	}
	
	/**
	 * Parameterized constructor constructs a new Aircraft object
	 * @param price price of object
	 * @param maxElevation maximum elevation
	 */
	public Aircraft(double price, double maxElevation) {
		this.serialNum = getNextSerialNumber();
		this.price = price;
		this.maxElevation = maxElevation;
	}
	/**
	 * Copy constructor constructs a copy of an Aircraft object
	 * @param craft takes an Aircraft object
	 */
	public Aircraft(Aircraft craft) {
		this.serialNum = getNextSerialNumber();
		this.price = craft.price;
		this.maxElevation = craft.maxElevation;
	}
	/**
	 * Gets the next serial number for an Aircraft object and increments the serial number generator.
	 * @return The next available serial number.
	 */	
	private long getNextSerialNumber() {
		return serialNumGenerator++;
	}

	/**
	 * Gets the price of the aircraft.
	 * @return The price of the aircraft.
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Gets the maximum elevation the aircraft can reach.
	 * @return The maximum elevation of the aircraft
	 */
	public double getMaxElevation() {
		return maxElevation;
	}

	/**
	 * Gets the serial number of the aircraft.
	 * @return The serial number of the aircraft.
	 */
	public long getSerialNum() {
		return serialNum;
	}

	/**
	 * Sets the price of the aircraft to the specified value.
	 * @param price The new price of the aircraft.
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Sets the maximum elevation the aircraft can reach to the specified value.
	 * @param maxElevation The new maximum elevation of the aircraft.
	 */
	public void setMaxElevation(double maxElevation) {
		this.maxElevation = maxElevation;
	}

	/**
	 * Sets the serial number of the aircraft to the specified value.
	 * @param serialNum The new serial number for the aircraft.
	 */
	public void setSerialNum(long serialNum) {
		this.serialNum = serialNum;
	}	
	/**
	 * @return a String outputting the information of the current object
	 */
	@Override
	public String toString() {
		return "This aircraft - serial #" + this.serialNum + " - has a price of $" + this.price + " and can reach a maximum elevation of " + this.maxElevation + " feet.";
	}
	/**
	 * This method checks if the object the method is called on is equal to the Object parameter
	 * It first checks if the provided object is null, and if not, compares the equality of the two objects
	 * If they are not equal, the method returns false
	 * If they are equal, then the object is cast as an Aircraft and returns true
	 * @param obj Takes an Object
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		else if (this.getClass() != obj.getClass()) {
			return false;
		}
		else {
			Aircraft craft = (Aircraft) obj;
			return this.price == craft.price && this.maxElevation == craft.maxElevation;
		}
	}
	/**
 	* This method creates a copy of the current object
	*/
	@Override
	public Aircraft copy() {
		return new Aircraft(this);
	}
}
