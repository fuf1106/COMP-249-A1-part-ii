package Train_And_Tram;
import WheeledTransportation.WheeledTransportation;

public class Train extends WheeledTransportation {
    private int numberOfVehicles;
    private String startingStationName;
    private String destinationStationName;

    private static long serialNumberGenerator = 10000;

    //Constructors
    public Train() {
        this.numberOfVehicles = 0;
        this.startingStationName = "Starting Destination";
        this.destinationStationName = "Finish Destination";
    }
    public Train(int numberOfWheels, double maxSpeed, int numberOfVehicles, String startingStationName, String destinationStationName) {
        super(numberOfWheels, maxSpeed);
        this.numberOfVehicles = numberOfVehicles;
        this.startingStationName = startingStationName;
        this.destinationStationName = destinationStationName;
    }

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

    @Override
    public long getNextSerialNumber(){

        return Train.serialNumberGenerator++;
    }

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
    @Override
    public String toString(){
        return "This train" + super.toString().substring(27) + ". It has " + this.numberOfVehicles + " vehicles, starts at station " +
                this.startingStationName + " and ends at station " + this.destinationStationName + ". ";
    }

    public Train copy() {
        return new Train(this);
    }

}
