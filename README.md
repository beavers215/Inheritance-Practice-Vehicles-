# Inheritance-Practice-Vehicles-
JAVA inheritance practice using vehicles

Vehicle Hierarchy
This text-based documentation provides an overview of a simple vehicle hierarchy implemented in Java. The hierarchy includes a base class Vehicle and two subclasses Bike and Car.

Vehicle Class
The Vehicle class serves as the base class for both bikes and cars. It includes the following methods:

Getters
public int getNumberOfWheels(): Returns the number of wheels of the vehicle.
public int getNumberOfPassengers(): Returns the number of occupants in the vehicle.
Setters
public void setNumberOfWheels(int numberOfWheels): Sets the number of wheels for the vehicle.
public void setNumberOfPassengers(int numberOfOccupants): Sets the number of occupants in the vehicle.
Bike Class
The Bike class is a subclass of Vehicle and includes the following:

Additional Attribute
private int numberOfGears: Represents the number of gears in the bike.
Constructor
public Bike(int numberOfWheels, int numberOfOccupants, int numberOfGears): Initializes a bike with the specified number of wheels, occupants, and gears.
Methods
public void sound(): Prints a message representing the sound of a bike.
public int getNumberOfGears(): Returns the number of gears in the bike.
public void setNumberOfGears(int numberOfGears): Sets the number of gears for the bike.
Special Check Method
public boolean canDoWheelie(int numberOfOccupants): Checks if a bike can perform a wheelie based on the number of occupants.
Car Class
The Car class is another subclass of Vehicle with the following features:

Additional Attribute
private boolean storage: Indicates whether the car has storage space.
Constructor
public Car(int numberOfWheels, int numberOfOccupants, boolean storage): Initializes a car with the specified number of wheels, occupants, and storage.
Methods
public boolean getStorage(): Returns the storage status of the car.
public void setStorage(boolean storage): Sets the storage status for the car.
Main Method
The provided main method is currently incomplete and needs further implementation. It serves as a starting point for creating instances of the Vehicle, Bike, and Car classes.

Feel free to explore and modify the code according to your needs. For more details, refer to the comments within the code.
