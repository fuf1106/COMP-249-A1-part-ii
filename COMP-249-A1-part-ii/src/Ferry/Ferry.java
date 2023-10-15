//--------------------------------------------------
// Assignment # 1
// Part: 2
// Written by Diana Edvi (40198139) AND Fuad Awad (40195634)
//--------------------------------------------------

package Ferry;
import Aircrafts.Vehicle;

public class Ferry extends Vehicle {
	//Instance variables
	private double maxSpeed;
	private double maxLoad;
	private long serialNum;
	private static long serialNumGenerator = 70000; 
	/**
	 * Default constructor constructs a new default Ferry object
	 */
	public Ferry() {
		this.maxSpeed = 100;
		this.maxLoad = 70000;
		this.serialNum = getNextSerialNumber();
	}
	/**
	 * Parameterized constructor constructs a new Ferry object
	 * @param maxSpeed maximum speed
	 * @param maxLoad maximum load
	 */
	public Ferry(double maxSpeed, double maxLoad) {
		this.maxSpeed = maxSpeed;
		this.maxLoad = maxLoad;
		this.serialNum = getNextSerialNumber();
	}
	/**
	 * Copy constructor constructs a copy of a Ferry object
	 * @param boat takes an Boat object
	 */
	public Ferry(Ferry boat) {
		this.maxSpeed = boat.maxSpeed;
		this.maxLoad = boat.maxLoad;
		this.serialNum = getNextSerialNumber();
	}
	
	/**
	 * @return the next serial number
	 */	
	public long getNextSerialNumber() {
		return Ferry.serialNumGenerator++;
	}
	//Getter and setters
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public double getMaxLoad() {
		return maxLoad;
	}
	public long getSerialNum() {
		return serialNum;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setMaxLoad(double maxLoad) {
		this.maxLoad = maxLoad;
	}
	public void setSerialNum(long serialNum) {
		this.serialNum = serialNum;
	}
	/**
	 * @return a String outputting the information of the current object
	 */
	@Override
	public String toString() {
		return "This ferry - serial #" + this.serialNum + " - has a maximum speed of " + this.maxSpeed + " km/h and a maximum load of " + this.maxLoad + " kg.";
	}
	/**
	 * This method checks if the object the method is called on is equal to the Object parameter
	 * It first checks if the provided object is null, and if not, compares the equality of the two objects
	 * If they are not equal, the method returns false
	 * If they are equal, then the object is cast as a Ferry and returns true
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
			Ferry boat = (Ferry) obj;
			return this.maxSpeed == boat.maxSpeed && this.maxLoad == boat.maxLoad;
		}
	}
	/**
 	* This method creates a copy of the current object
	*/
	@Override
	public Ferry copy() {
		return new Ferry(this);
	}
}
