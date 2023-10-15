//--------------------------------------------------
// Assignment # 1
// Part: 2
// Written by Diana Edvi (40198139) AND Fuad Awad (40195634)
//--------------------------------------------------

package Train_And_Tram;
import Metro.Metro;
public class Tram extends Metro {
    //Instance variables
    private int yearOfCreation;
    private static long serialNumberGenerator = 30000;
    /**
     * Default constructor constructs a new default Tram object
     */    
    public Tram() {
        this.yearOfCreation = 0;
    }
    /**
     * Parameterized constructor constructs a new Tram object
     * @param numberOfWheels number of wheels
     * @param maxSpeed maximum speed
     * @param numberOfVehicles number of vehicles
     * @param startingStationName starting station name
     * @param destinationStationName destination station name
     * @param totalStops total number of stops
     * @param yearOfCreation year of creation
     */
    public Tram(int numberOfWheels, double maxSpeed, int numberOfVehicles, String startingStationName, String destinationStationName, int totalStops, int yearOfCreation) {
        super(numberOfWheels, maxSpeed, numberOfVehicles, startingStationName, destinationStationName, totalStops);
        this.yearOfCreation = yearOfCreation;
    }
    /**
     * Copy constructor constructs a copy of a Tram object
     * @param oldTram takes a Metro object
     */
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
      /**
     * @return the next serial number
     */
    @Override
    public long getNextSerialNumber(){
        return Tram.serialNumberGenerator++;
    }
    /**
     * @return a String outputting the information of the current object
     */
    @Override
    public String toString(){
        return "This tram" + super.toString().substring(10, super.toString().length() -1) + " and was created in the year " + this.yearOfCreation + ".";
    }
    /**
     * This method checks if the object the method is called on is equal to the Object parameter
     * It first checks if the provided object is null, and if not, compares the equality of the two objects
     * If they are not equal, the method returns false
     * If they are equal, then the object is cast as a Tram and returns true
     * @param obj Takes an Object
     * @return true or false
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
            Tram otherTram = (Tram) obj;
            return (this.yearOfCreation == otherTram.yearOfCreation);
        }
    }
    /**
 	* This method creates a copy of the current object
	*/
    @Override
    public Tram copy() {
        return new Tram(this);
    }

}

