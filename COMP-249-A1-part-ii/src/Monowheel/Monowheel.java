//--------------------------------------------------
// Assignment # 1
// Part: 2
// Written by Diana Edvi (40198139) AND Fuad Awad (40195634)
//--------------------------------------------------

package Monowheel;
import WheeledTransportation.WheeledTransportation;

/**
 * Represents a Monowheel object.
 * This class defines the basic properties and behaviors of a Monowheel, such as max weight
 */
public class Monowheel extends WheeledTransportation {
    private double maxWeight;
    private static long serialNumberGenerator = 55000;

    /**
     * Default constructor constructs a new default Monowheel object
     */    
    public Monowheel() {
        this.maxWeight = 0;
    }
	
     /**
     * Parameterized constructor constructs a new Monowheel object
     * @param numberOfWheels number of wheels
     * @param maxSpeed maximum speed
     * @param maxWeight maximum weight
     */
    public Monowheel(int numberOfWheels, double maxSpeed, double maxWeight) {
        super(numberOfWheels, maxSpeed);
        this.maxWeight = maxWeight;
    }
	
     /**
     * Copy constructor constructs a copy of a Monowheel object
     * @param oldMonowheel takes a Monowheel object
     */
    public Monowheel(Monowheel oldMonowheel){
        super(oldMonowheel);
        this.maxWeight = oldMonowheel.maxWeight;
    }

    /**
     * Gets the maximum weight capacity of this Monowheel.
     * @return The maximum weight capacity for this Monowheel.
     */	
    public double getMaxWeight() {
        return maxWeight;
    }

    /**
     * Sets the maximum weight capacity for this Monowheel.
     * @param maxWeight The new maximum weight capacity to set for this Monowheel.
     */	
    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
    /**
     * Gets the next serial number for a Monowheel object and increments the serial number generator.
     * @return The next available serial number.
     */
    @Override
    public long getNextSerialNumber(){
        return Monowheel.serialNumberGenerator++;
    }
    /**
     * @return a String outputting the information of the current object
     */
    @Override
    public String toString(){
        return "This monowheel" + super.toString().substring(27) + " and has a maximum weight of " + this.maxWeight + ".";
    }
    /**
     * This method checks if the object the method is called on is equal to the Object parameter
     * It first checks if the provided object is null, and if not, compares the equality of the two objects
     * If they are not equal, the method returns false
     * If they are equal, then the object is cast as a Monowheel and returns true
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
            Monowheel otherMonowheel = (Monowheel) obj;
            return (this.maxWeight == otherMonowheel.maxWeight);
        }
    }
    /**
    * This method creates a copy of the current object
    */
    public Monowheel copy() {
        return new Monowheel(this);
    }
}
