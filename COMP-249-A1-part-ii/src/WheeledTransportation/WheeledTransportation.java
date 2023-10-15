//--------------------------------------------------
// Assignment # 1
// Part: 2
// Written by Diana Edvi (40198139) AND Fuad Awad (40195634)
//--------------------------------------------------

package WheeledTransportation;
import Aircrafts.*;

public class WheeledTransportation extends Vehicle {
    //Instance variables
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

    //Getter and Setters
    public int getNumberOfWheels() {return numberOfWheels;}
    public void setNumberOfWheels(int numberOfWheels) {this.numberOfWheels = numberOfWheels;}
    public double getMaxSpeed() {return maxSpeed;}
    public void setMaxSpeed(double maxSpeed) {this.maxSpeed = maxSpeed;}
    public long getSerialNumber() { return serialNumber;}
    public void setSerialNumber(long serialNumber) {this.serialNumber = serialNumber;}
    /**
     * @return the next serial number
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
    public String toString(){ //matching formats?
     return "This Wheeled Transportation - serial # " + this.serialNumber + " has " + this.numberOfWheels + " wheel(s) and can reach a maximum speed of " + this.maxSpeed + "km/h";
    }
    /**
 	* This method creates a copy of the current object
	*/
    public WheeledTransportation copy() {
        return new WheeledTransportation(this);
    }
}
