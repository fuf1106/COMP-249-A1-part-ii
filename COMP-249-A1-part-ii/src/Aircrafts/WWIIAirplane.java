//--------------------------------------------------
// Assignment # 1
// Part: 2
// Written by Diana Edvi (40198139) AND Fuad Awad (40195634)
//--------------------------------------------------

package Aircrafts;

public class WWIIAirplane extends Aircraft {
	// Instance variables
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
	 * @return the next serial number
	 */
	private long getNextSerialNumber() {
		return WWIIAirplane.serialNumGenerator++;
	}
	
	//getters and setters for twinengine
	public boolean getTwinEngine() {
		return false;
	}	
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
	 * @return true or false
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
