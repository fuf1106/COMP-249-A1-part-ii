package Ferry;


import Aircrafts.Vehicle;

public class Ferry extends Vehicle {
	
	private double maxSpeed;
	private double maxLoad;
	private long serialNum;
	private static long serialNumGenerator = 70000; 
	
	public Ferry() {
		this.maxSpeed = 100;
		this.maxLoad = 70000;
		this.serialNum = getNextSerialNumber();
	}
	
	public Ferry(double maxSpeed, double maxLoad) {
		this.maxSpeed = maxSpeed;
		this.maxLoad = maxLoad;
		this.serialNum = getNextSerialNumber();
	}
	
	public Ferry(Ferry boat) {
		this.maxSpeed = boat.maxSpeed;
		this.maxLoad = boat.maxLoad;
		this.serialNum = getNextSerialNumber();
	}
	
	//this method ensures that each serial number is unique
	public long getNextSerialNumber() {
		return Ferry.serialNumGenerator++;
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}
	
	public double getMaxLoad() {
		return maxLoad;
	}
	
	public long getSerialNum() {
		return serialNum;
	}
	
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void setMaxLoad(double maxLoad) {
		this.maxLoad = maxLoad;
	}
	
	public void setSerialNum(long serialNum) {
		this.serialNum = serialNum;
	}
	
	public String toString() {
		return "This ferry - serial #" + this.serialNum + " - has a maximum speed of " + this.maxSpeed + " km/h and a maximum load of " + this.maxLoad + " kg.";
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		else if (this.getClass() != obj.getClass()) {
			return false;
		}
		else {
			Ferry boat = (Ferry) obj;
			return this.maxSpeed == boat.maxSpeed && this.maxLoad == boat.maxLoad;
		}
	}

	public Ferry copy() {
		return new Ferry(this);
	}
}