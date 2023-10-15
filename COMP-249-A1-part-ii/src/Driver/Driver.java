
/**
 * Names(s) and ID's: Diana Edvi (40198139) AND Fuad Awad (40195634)
 * COMP249
 * Assignment # 1
 * Due Date: October 15, 2023
 * Written by:
*/

//--------------------------------------------------
// Assignment # 1
// Part: 2
// Written by Diana Edvi (40198139) AND Fuad Awad (40195634)
//--------------------------------------------------

package Driver;

import Aircrafts.*;
import Ferry.Ferry;
import Metro.*;
import Monowheel.*;
import Train_And_Tram.*;
import WheeledTransportation.*;
import java.lang.Object;

public class Driver {
	/**
	 * This method creates a new array of objects that is the same length as the parameter's array
  	 * The method loops through each element in the old array, creates a cope of this element cast as a Vehicle and stores it in the new array
    	 * @param obj Takes an array of objects 
	 */
	public static Object[] copyTheObjects(Object[] obj) {
		Object[] temp = new Object[obj.length];
		System.out.println("Making copy of Objects...");

		for (int i = 0; i < obj.length; i++) {
			temp[i] = ((Vehicle) obj[i]).copy(); //cast the element to a Vehicle object and call its copy method to create a copy
		}
		return temp;
	}

	public static void main(String[] args) {

		//Declare original array of objects and initialize them:
		Object[] originalArr = new Object[20];

		originalArr[0] = new WheeledTransportation();
		originalArr[1] = new Train();
		originalArr[2] = new Ferry();
		originalArr[3] = new Monowheel();
		originalArr[4] = new Tram();
		originalArr[5] = new Aircraft();
		originalArr[6] = new WWIIAirplane();
		originalArr[7] = new Train();
		originalArr[8] = new Ferry();
		originalArr[9] = new Tram();
		originalArr[10] = new WWIIAirplane(12473.56, 53624.57, true);
		originalArr[11] = new Aircraft();
		originalArr[12] = new WheeledTransportation();
		originalArr[13] = new Monowheel();
		originalArr[14] = new Metro();
		originalArr[15] = new Ferry();
		originalArr[16] = new Train();
		originalArr[17] = new Tram();
		originalArr[18] = new WWIIAirplane();
		originalArr[19] = new Metro();

		System.out.println("Printing the original array...");
		for (int i = 0; i < originalArr.length; i++) {
			System.out.println(originalArr[i].toString());
		}

		System.out.println();

		Object[] copiedArr = copyTheObjects(originalArr); //Calls the method above main to copy the array onto a new one

		System.out.println();

		System.out.println("Printing the copied array...");
		for (int i = 0; i < originalArr.length; i++) {
			System.out.println(copiedArr[i].toString());
		}
	}
}
