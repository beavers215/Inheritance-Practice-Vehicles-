/*ok this is an attempt to practice inheritance wit the classes and sub classes. 
* vehicle will break down into diffrent sub classes and then to others. 
*
*problems, i still don not understand how information is sent around or what this 
*program is really going to do. 
*
*/
package VehiclePKG;

public class Vehicle {
	
	//superclass attributes
	protected int numberOfWheels;
	protected int numberOfOccupants;
	
	//constructor
	public Vehicle(int numberOfWheels, int numberOfOccupants) {
		this.numberOfWheels=numberOfWheels;	
		this.numberOfOccupants=numberOfOccupants;
	}
	public void sound() {
		System.out.println("Your vehicle goes: put, put, put");
	}
	
	//getters
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public int getNnumberOfPassangers() {
        return numberOfOccupants;
    }
    
    //setters
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        }
    public void setNumberOfPassangers(int numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants;
        }
//---------------------------------------------------------------------   
public class Bike extends Vehicle {
	
	//subclass attributes
	private int numberOfGears;
	
	//constructor
	public Bike(int numberOfWheels, int numberOfOccupants, int numberOfGears) {
		super(numberOfWheels, numberOfOccupants);
		this.numberOfGears =numberOfGears;
	}
	
	public void sound() {
		System.out.println("The bike goes: WAAAAAAAAAHHHHH, WAHHHHHHHHHHH!");
	}
	public int getNumberOfGears() {
		return numberOfGears;
	}
	
	public void setNumberOfGears(int numberofGears) {
		this.numberOfGears = numberOfGears;
	}
	}
	//this is a check if there is only one occupant on the bike, later it will say you can or cant do a wheele if the bike has more than one occupant. 
	public boolean setWheele(int numberOfOccupants) {
	    return numberOfOccupants == 1;
	}

//---------------------------------------------------------------  

public class Car extends Vehicle{
	//attributes
	private boolean storage;
	
	//constructor
	public Car (int numberOfWheels, int numberOfOccupants,boolean storage) {
		super(numberOfWheels, numberOfOccupants);
		this.storage= storage;
	}

		public boolean getStorge() {
			return storage;
		}
		public void setStorage() {
			this.storage=storage;
		}

}

//---------------------------------------------------------------------  
public static void main (String[] args) {
	vehicle 
}

}//end vehicle class










