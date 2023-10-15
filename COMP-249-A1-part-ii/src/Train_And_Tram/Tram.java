//--------------------------------------------------
// Assignment # 1
// Part: 2
// Written by Diana Edvi (40198139) AND Fuad Awad (40195634)
//--------------------------------------------------

package Train_And_Tram;
import Metro.Metro;
public class Tram extends Metro {

    private int yearOfCreation;
    private static long serialNumberGenerator = 30000;
    //Constructors
    public Tram() {
        this.yearOfCreation = 0;
    }
    public Tram(int numberOfWheels, double maxSpeed, int numberOfVehicles, String startingStationName, String destinationStationName, int totalStops, int yearOfCreation) {
        super(numberOfWheels, maxSpeed, numberOfVehicles, startingStationName, destinationStationName, totalStops);
        this.yearOfCreation = yearOfCreation;
    }

    public Tram(Tram oldTram) {
        super(oldTram);
        this.yearOfCreation = oldTram.yearOfCreation;
    }

    //Getters and Setters
    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public long getNextSerialNumber(){

        return Tram.serialNumberGenerator++;
    }
    @Override
    public String toString(){
        return "This tram" + super.toString().substring(10, super.toString().length() -1) + " and was created in the year " + this.yearOfCreation + ".";
    }
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }
        else if(this.getClass() != obj.getClass()){
            return false;
        }
        else {
            Tram otherTram = (Tram) obj;
            return (this.yearOfCreation == otherTram.yearOfCreation);
        }
    }

    public Tram copy() {
        return new Tram(this);
    }

}

