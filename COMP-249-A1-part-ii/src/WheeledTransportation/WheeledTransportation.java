//--------------------------------------------------
// Assignment # 1
// Part: 2
// Written by Diana Edvi (40198139) AND Fuad Awad (40195634)
//--------------------------------------------------

package WheeledTransportation;
import Aircrafts.*;

/**
 * Represents a WheeledTransportation object.
 * This class defines the basic properties and behaviors of a WheeledTransportation object, such as number of wheels,
 * maximum speed, and serial number
 */
public class WheeledTransportation extends Vehicle {
    private int numberOfWheels;
    private double maxSpeed;
    private long serialNumber;
    private static long serialNumberGenerator = 1000;

    /**
     * Default constructor constructs a new default WheeledTransportation object
     */    
    public WheeledTransportation(){
        this.numberOfWheels = 0;
        this.maxSpeed = 0;
        this.serialNumber = getNextSerialNumber();
    }

    /**
     * Parameterized constructor constructs a new WheeledTransportation object
     * @param numberOfWheels number of wheels
     * @param maxSpeed maximum speed
     */    
    public WheeledTransportation(int numberOfWheels, double maxSpeed){
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
        this.serialNumber = getNextSerialNumber();
    }
    /**
     * Copy constructor constructs a copy of a WheeledTransportation object
     * @param oldWheeledTransportation takes a Metro object
     */
    public WheeledTransportation(WheeledTransportation oldWheeledTransportation){
        this.numberOfWheels = oldWheeledTransportation.numberOfWheels;
        this.serialNumber = getNextSerialNumber();
        this.maxSpeed = oldWheeledTransportation.maxSpeed;
    }

    /**
     * Gets the number of wheels of this WheeledTransportation object.
     * @return The number of wheels on this WheeledTransportation.
     */
    public int getNumberOfWheels() {return numberOfWheels;}

    /**
     * Sets the number of wheels for this WheeledTransportation object.
     * @param numberOfWheels The new number of wheels to assign to this WheeledTransportation object.
     */
    public void setNumberOfWheels(int numberOfWheels) {this.numberOfWheels = numberOfWheels;}

    /**
     * Gets the maximum speed of this WheeledTransportation object.
     * @return The maximum speed of this WheeledTransportation object.
     */
    public double getMaxSpeed() {return maxSpeed;}

    /**
     * Sets the maximum speed for this WheeledTransportation object.
     * @param maxSpeed The new maximum speed to set for this WheeledTransportation object.
     */
    public void setMaxSpeed(double maxSpeed) {this.maxSpeed = maxSpeed;}

    /**
     * Gets the serial number for this WheeledTransportation object.
     * @return The unique serial number assigned to this WheeledTransportation.
     */
    public long getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the serial number for this WheeledTransportation object.
     * @param serialNumber The new serial number to assign to this WheeledTransportation object.
     */
    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Gets the next serial number for a WheeledTransportation object and increments the serial number generator.
     * @return The next available serial number.
     */
    public long getNextSerialNumber(){
        return serialNumberGenerator++;
    }
	
    /**
     * This method checks if the object the method is called on is equal to the Object parameter
     * It first checks if the provided object is null, and if not, compares the equality of the two objects
     * If they are not equal, the method returns false
     * If they are equal, then the object is cast as an WheeledTransportation and returns true
     * @param obj Takes an Object
     * @return boolean
     */
    @Override
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }
        else if(this.getClass() != obj.getClass()){
                return false;
            }
        else {
            WheeledTransportation otherWheeledTransportation = (WheeledTransportation) obj;
            return (this.maxSpeed == otherWheeledTransportation.maxSpeed && this.numberOfWheels == otherWheeledTransportation.numberOfWheels);
            }
    }
    /**
     * @return a String outputting the information of the current object
     */
    @Override
    public String toString(){ //matching formats?
     return "This Wheeled Transportation - serial # " + this.serialNumber + " has " + this.numberOfWheels + " wheel(s) and can reach a maximum speed of " + this.maxSpeed + "km/h";
    }
    /**
    * This method creates a copy of the current object
    */
    @Override
    public WheeledTransportation copy() {
        return new WheeledTransportation(this);
    }
}
