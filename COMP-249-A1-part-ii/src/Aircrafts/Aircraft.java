package Aircrafts;

public class Aircraft extends Vehicle {

	private static long serialNumGenerator = 100000;
	
	protected double price;
	protected double maxElevation;
	protected long serialNum;
	
	public Aircraft() {
		this.serialNum = getNextSerialNumber();
		this.price = 10000;
		this.maxElevation = 50000;
	}

	public Aircraft(double price, double maxElevation) {
		this.serialNum = getNextSerialNumber();
		this.price = price;
		this.maxElevation = maxElevation;
	}
	
	public Aircraft(Aircraft craft) {
		this.serialNum = getNextSerialNumber();
		this.price = craft.price;
		this.maxElevation = craft.maxElevation;
	}
	
	private long getNextSerialNumber() {
		return serialNumGenerator++;
	}
	
	public double getPrice() {
		return price;
	}

	public double getMaxElevation() {
		return maxElevation;
	}

	public long getSerialNum() {
		return serialNum;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setMaxElevation(double maxElevation) {
		this.maxElevation = maxElevation;
	}

	public void setSerialNum(long serialNum) {
		this.serialNum = serialNum;
	}	

	public String toString() {
		return "This aircraft - serial #" + this.serialNum + " - has a price of $" + this.price + " and can reach a maximum elevation of " + this.maxElevation + " feet.";
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		else if (this.getClass() != obj.getClass()) {
			return false;
		}
		else {
			Aircraft craft = (Aircraft) obj;
			return this.price == craft.price && this.maxElevation == craft.maxElevation;
		}
	}

	public Aircraft copy() {
		return new Aircraft(this);
	}
}
