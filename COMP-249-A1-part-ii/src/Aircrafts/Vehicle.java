
//--------------------------------------------------
// Assignment # 1
// Part: 2
// Written by Diana Edvi (40198139) AND Fuad Awad (40195634)
//--------------------------------------------------

package Aircrafts;

/**
 * Represents a Vehicle object, which serves as the base class for various vehicle types.
 * This abstract class provides an abstract method for creating a copy of a vehicle, which must be defined or overridden
 * in every subclass. 
 */
public abstract class Vehicle {

     /**
     * Creates a copy of this vehicle.
     * This abstract method must be defined or overridden in every subclass
     */
    public abstract Vehicle copy();
}
