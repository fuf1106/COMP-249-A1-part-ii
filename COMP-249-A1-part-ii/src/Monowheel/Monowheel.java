package Monowheel;
import WheeledTransportation.WheeledTransportation;

public class Monowheel extends WheeledTransportation {
    private double maxWeight;
    private static long serialNumberGenerator = 55000;

    //Constructors
    public Monowheel() {
        this.maxWeight = 0;
    }
    public Monowheel(int numberOfWheels, double maxSpeed, double maxWeight) {
        super(numberOfWheels, maxSpeed);
        this.maxWeight = maxWeight;
    }
    public Monowheel(Monowheel oldMonowheel){
        super(oldMonowheel);
        this.maxWeight = oldMonowheel.maxWeight;
    }
    //Getters and Setters

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public long getNextSerialNumber(){

        return Monowheel.serialNumberGenerator++;
    }
    @Override
    public String toString(){
        return "This monowheel" + super.toString().substring(27) + " and has a maximum weight of " + this.maxWeight + ".";
    }
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

    public Monowheel copy() {
        return new Monowheel(this);
    }

}
