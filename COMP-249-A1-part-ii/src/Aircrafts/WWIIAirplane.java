//--------------------------------------------------
// Assignment # 1
// Part: 2
// Written by Diana Edvi (40198139) AND Fuad Awad (40195634)
//--------------------------------------------------

package Aircrafts;

/**
 * Represents a WWIIAirplane object.
 * This class defines the basic properties and behaviors of a WWIIAirplane, such as serial number
 * and whether it has a twin engine.
 */
public class WWIIAirplane extends Aircraft {
	private static long serialNumGenerator = 80000;
	private boolean twinEngine;

	/**
	 * Default constructor constructs a new default WWIIAirplane object
	 */
	public WWIIAirplane() {
		this.serialNum = this.getNextSerialNumber();
		this.twinEngine = false;
	}
	/**
	 * Parameterized constructor constructs a new Aircraft object
	 * @param price price of object
	 * @param maxElevation maximum elevation
	 * @param twinEngine twin engine or not
	 */
	public WWIIAirplane(double price, double maxElevation, boolean twinEngine) {
		super(price, maxElevation);
		this.serialNum = this.getNextSerialNumber();
		this.twinEngine = twinEngine;
	}
	/**
	 * Copy constructor constructs a copy of a WWIIAirplane object
	 * @param craft takes a WWIIAirplane object
	 */
	public WWIIAirplane(WWIIAirplane craft) {
		super(craft);
		this.serialNum = this.getNextSerialNumber();
		this.twinEngine = craft.twinEngine;
	}
	/**
	 * Gets the next serial number for an WWIIAirplane object and increments the serial number generator.
	 * @return The next available serial number.
	 */
	private long getNextSerialNumber() {
		return WWIIAirplane.serialNumGenerator++;
	}
	
	/**
	 * Gets the status of the twin engine for this aircraft.
	 * @return true if the aircraft has a twin engine; false otherwise.
	 */	
	public boolean getTwinEngine() {
		return false;
	}

	/**
	 * Sets the twin engine status for this aircraft.
	 * @param twinEngine true if the aircraft has a twin engine; false otherwise.
	 */
	public void setTwinEngine(boolean twinEngine) {
		this.twinEngine = twinEngine;
	}
	/**
	 * @return a String outputting the information of the current object
	 */
	@Override
	public String toString() {
		String temp = super.toString();
		if (twinEngine) {
			return "This twin engine World War II airplane" + temp.substring(13);
		}
		else {
			return "This single engine World War II airplane" + temp.substring(13);
		}
	}
	
	/**
	 * This method checks if the object the method is called on is equal to the Object parameter
	 * It first checks if the provided object is null, and if not, compares the equality of the two objects
	 * If they are not equal, the method returns false
	 * If they are equal, then the object is cast as a WWIIAirplane and returns true
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
			WWIIAirplane plane = (WWIIAirplane) obj;
			return  this.twinEngine == plane.twinEngine;
		}
	}
	/**
 	* This method creates a copy of the current object
	*/
	@Override
	public WWIIAirplane copy() {
		return new WWIIAirplane(this);
	}
	
}
