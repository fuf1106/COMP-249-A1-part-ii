package WheeledTransportation;
import Aircrafts.*;

public class WheeledTransportation extends Vehicle {
    private int numberOfWheels;
    private double maxSpeed;
    private long serialNumber;

    private static long serialNumberGenerator = 1000;

    //Default Constructor
    public WheeledTransportation(){
        this.numberOfWheels = 0;
        this.maxSpeed = 0;
        this.serialNumber = getNextSerialNumber();
    }

    //Paramaterized constructor
    public WheeledTransportation(int numberOfWheels, double maxSpeed){
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
        this.serialNumber = getNextSerialNumber();
    }

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

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }
    public long getNextSerialNumber(){

        return serialNumberGenerator++;
    }

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

    public String toString(){ //matching formats?
     return "This Wheeled Transportation - serial # " + this.serialNumber + " has " + this.numberOfWheels + " wheel(s) and can reach a maximum speed of " + this.maxSpeed + "km/h";
    }

    public WheeledTransportation copy() {
        return new WheeledTransportation(this);
    }
}
