//--------------------------------------------------
// Assignment # 1
// Part: 2
// Written by Diana Edvi (40198139) AND Fuad Awad (40195634)
//--------------------------------------------------

package Train_And_Tram;
import WheeledTransportation.WheeledTransportation;

/**
 * Represents a Train object.
 * This class defines the basic properties and behaviors of a Train, such as number of vehicles,
 * starting station name and destination station name
 */
public class Train extends WheeledTransportation {
    private int numberOfVehicles;
    private String startingStationName;
    private String destinationStationName;

    private static long serialNumberGenerator = 10000;

    /**
     * Default constructor constructs a new default Train object
     */
    public Train() {
        this.numberOfVehicles = 0;
        this.startingStationName = "Starting Destination";
        this.destinationStationName = "Finish Destination";
    }
    /**
     * Parameterized constructor constructs a new Train object
     * @param numberOfWheels number of wheels
     * @param maxSpeed maximum speed
     * @param numberOfVehicles number of vehicles
     * @param startingStationName starting station name
     * @param destinationStationName destination station name
     */
    public Train(int numberOfWheels, double maxSpeed, int numberOfVehicles, String startingStationName, String destinationStationName) {
        super(numberOfWheels, maxSpeed);
        this.numberOfVehicles = numberOfVehicles;
        this.startingStationName = startingStationName;
        this.destinationStationName = destinationStationName;
    }
    /**
     * Copy constructor constructs a copy of a Train object
     * @param oldTrain takes a Metro object
     */
    public Train(Train oldTrain) {
        super(oldTrain);
        this.numberOfVehicles = oldTrain.numberOfVehicles;
        this.startingStationName = oldTrain.startingStationName;
        this.destinationStationName = oldTrain.destinationStationName;
    }

     /**
     * Gets the number of vehicles associated with this Train.
     * @return The number of vehicles associated with this Train.
     */    
    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

     /**
     * Sets the number of vehicles associated with this Train.
     * @param numberOfVehicles The new number of vehicles to associate with this Train.
     */
    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }
	
     /**
     * Gets the name of the starting station for this Train.
     * @return The name of the starting station.
     */
    public String getStartingStationName() {
        return startingStationName;
    }
     
     /**
     * Sets the name of the starting station for this Train.
     * @param startingStationName The new name of the starting station to set for this Train.
     */
    public void setStartingStationName(String startingStationName) {
        this.startingStationName = startingStationName;
    }

     /**
     * Gets the name of the destination station for this Train.
     * @return The name of the destination station.
     */
    public String getDestinationStationName() {
        return destinationStationName;
    }

     /**
     * Sets the name of the destination station for this Train.
     * @param destinationStationName The new name of the destination station to set for this Train.
     */
    public void setDestinationStationName(String destinationStationName) {
        this.destinationStationName = destinationStationName;
    }
	
    /**
     * Gets the next serial number for a Train object and increments the serial number generator.
     * @return The next available serial number.
     */
    @Override
    public long getNextSerialNumber(){

        return Train.serialNumberGenerator++;
    }
     /**
     * This method checks if the object the method is called on is equal to the Object parameter
     * It first checks if the provided object is null, and if not, compares the equality of the two objects
     * If they are not equal, the method returns false
     * If they are equal, then the object is cast as a Train and returns true
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
            Train otherTrain = (Train) obj;
            return (this.numberOfVehicles == otherTrain.numberOfVehicles &&
                    this.startingStationName.equals(otherTrain.startingStationName)  && this.destinationStationName.equals(otherTrain.destinationStationName));
        }
    }
    /**
     * @return a String outputting the information of the current object
     */
    @Override
    public String toString(){
        return "This train" + super.toString().substring(27) + ". It has " + this.numberOfVehicles + " vehicles, starts at station " +
                this.startingStationName + " and ends at station " + this.destinationStationName + ". ";
    }
    /**
    * This method creates a copy of the current object
    */
    @Override
    public Train copy() {
        return new Train(this);
    }

}
