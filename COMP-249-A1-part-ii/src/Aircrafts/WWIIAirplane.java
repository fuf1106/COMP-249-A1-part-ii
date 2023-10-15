//--------------------------------------------------
// Assignment # 1
// Part: 2
// Written by Diana Edvi (40198139) AND Fuad Awad (40195634)
//--------------------------------------------------

package Aircrafts;

public class WWIIAirplane extends Aircraft {

	private static long serialNumGenerator = 80000;
	private boolean twinEngine;

	
	public WWIIAirplane() {
		this.serialNum = this.getNextSerialNumber();
		this.twinEngine = false;
	}

	public WWIIAirplane(double price, double maxElevation, boolean twinEngine) {
		super(price, maxElevation);
		this.serialNum = this.getNextSerialNumber();
		this.twinEngine = twinEngine;
	}

	public WWIIAirplane(WWIIAirplane craft) {
		super(craft);
		this.serialNum = this.getNextSerialNumber();
		this.twinEngine = craft.twinEngine;
	}

	private long getNextSerialNumber() {
		return WWIIAirplane.serialNumGenerator++;
	}
	
	//getters and setters for twinengine

	public boolean getTwinEngine() {
		return false;
	}	

	public void setTwinEngine(boolean twinEngine) {
		this.twinEngine = twinEngine;
	}

	public String toString() {
		String temp = super.toString();
		if (twinEngine) {
			return "This twin engine World War II airplane" + temp.substring(13);
		}
		else {
			return "This single engine World War II airplane" + temp.substring(13);
		}
	}
	
	public boolean equals(Object obj) {
//		boolean temp = super.equals(obj); //this is always gonna return false
		if (obj == null) {
			return false;
		}
		else if (this.getClass() != obj.getClass()) {
			return false;
		}
		else {
			WWIIAirplane plane = (WWIIAirplane) obj;
			return  this.twinEngine == plane.twinEngine;

		}
	}

	public WWIIAirplane copy() {
		return new WWIIAirplane(this);
	}
	
}
