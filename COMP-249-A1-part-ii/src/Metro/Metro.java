//--------------------------------------------------
// Assignment # 1
// Part: 2
// Written by Diana Edvi (40198139) AND Fuad Awad (40195634)
//--------------------------------------------------

package Metro;
import Train_And_Tram.Train;

public class Metro extends Train {

    private int totalStops;
    private static long serialNumberGenerator = 25000;
    //Constructors
    public Metro() {
        this.totalStops = 0;
    }
    public Metro(int numberOfWheels, double maxSpeed, int numberOfVehicles, String startingStationName, String destinationStationName, int totalStops) {
        super(numberOfWheels, maxSpeed, numberOfVehicles, startingStationName, destinationStationName);
        this.totalStops = totalStops;
    }

    public Metro(Metro oldMetro) {
        super(oldMetro);
        this.totalStops = oldMetro.totalStops;
    }

    //Getters and Setters
    public int getTotalStops() {
        return totalStops;
    }

    public void setTotalStops(int totalStops) {
        this.totalStops = totalStops;
    }
    @Override
    public long getNextSerialNumber(){
        return Metro.serialNumberGenerator++;
    }

    @Override
    public String toString(){
        return "This metro" + super.toString().substring(10) + "It has " + this.totalStops + " total stops.";
    }
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

    public Metro copy() {
        return new Metro(this);
    }

}


