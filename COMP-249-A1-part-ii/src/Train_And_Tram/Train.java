//--------------------------------------------------
// Assignment # 1
// Part: 2
// Written by Diana Edvi (40198139) AND Fuad Awad (40195634)
//--------------------------------------------------

package Train_And_Tram;
import WheeledTransportation.WheeledTransportation;

public class Train extends WheeledTransportation {
    //Instance variables
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

    //Getters and Setters
    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }
    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }
    public String getStartingStationName() {
        return startingStationName;
    }
    public void setStartingStationName(String startingStationName) {
        this.startingStationName = startingStationName;
    }
    public String getDestinationStationName() {
        return destinationStationName;
    }
    public void setDestinationStationName(String destinationStationName) {
        this.destinationStationName = destinationStationName;
    }
    /**
     * @return the next serial number
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
     * @return true or false
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
