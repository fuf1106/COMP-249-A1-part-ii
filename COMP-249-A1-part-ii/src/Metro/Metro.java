//--------------------------------------------------
// Assignment # 1
// Part: 2
// Written by Diana Edvi (40198139) AND Fuad Awad (40195634)
//--------------------------------------------------

package Metro;
import Train_And_Tram.Train;

/**
 * Represents a Metro object.
 * This class defines the basic properties and behaviors of a Metro, such as total stops.
 */
public class Metro extends Train {
    //Instance variables
    private int totalStops;
    private static long serialNumberGenerator = 25000;
    /**
     * Default constructor constructs a new default Metro object
     */
    public Metro() {
        this.totalStops = 0;
    }
    /**
     * Parameterized constructor constructs a new Metro object
     * @param numberOfWheels number of wheels
     * @param maxSpeed maximum speed
     * @param numberOfVehicles number of vehicles
     * @param startingStationName starting station name
     * @param destinationStationName destination station name
     * @param totalStops total number of stops
     */
    public Metro(int numberOfWheels, double maxSpeed, int numberOfVehicles, String startingStationName, String destinationStationName, int totalStops) {
        super(numberOfWheels, maxSpeed, numberOfVehicles, startingStationName, destinationStationName);
        this.totalStops = totalStops;
    }
    /**
     * Copy constructor constructs a copy of a Metro object
     * @param oldMetro takes a Metro object
     */
    public Metro(Metro oldMetro) {
        super(oldMetro);
        this.totalStops = oldMetro.totalStops;
    }

     /**
     * Gets the total number of stops for this Metro.
     * @return The total number of stops made by this Metro.
     */  
    public int getTotalStops() {
        return totalStops;
    }

    /**
     * Sets the total number of stops for this Metro.
     * @param totalStops The new total number of stops to set for this Metro.
     */
    public void setTotalStops(int totalStops) {
        this.totalStops = totalStops;
    }
	
    /**
     * Gets the next serial number for a Metro object and increments the serial number generator.
     * @return The next available serial number.
     */
    @Override
    public long getNextSerialNumber(){
        return Metro.serialNumberGenerator++;
    }
    /**
     * @return a String outputting the information of the current object
     */
    @Override
    public String toString(){
        return "This metro" + super.toString().substring(10) + "It has " + this.totalStops + " total stops.";
    }
    /**
     * This method checks if the object the method is called on is equal to the Object parameter
     * It first checks if the provided object is null, and if not, compares the equality of the two objects
     * If they are not equal, the method returns false
     * If they are equal, then the object is cast as a Metro and returns true
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
            Metro otherMetro = (Metro) obj;
            return (this.totalStops == otherMetro.totalStops);
        }
    }
    /**
    * This method creates a copy of the current object
    */
    @Override
    public Metro copy() {
        return new Metro(this);
    }

}


