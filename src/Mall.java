/**
 * this class is the parent class to all other classes in this project
 * 
 * @author JAcob McDermott
 *@version building
 * CS 131
 */
public class Mall extends Business{
	
	private numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;

	/*
	 * empty argument constructor should set instance variables to 0 or ""
	 */
	public Mall() {
		// TODO Auto-generated constructor stub
		medianUnitSize = 0.0;
		numParkingSpaces = 0;
	}//end empty argument constructor
	
	/*
	 * preferred constructor sets instance variables to their values
	 * @param instance variables
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super();
		medianUnitSize = 455.5;
		numParkingSpaces = 2000;
	}//end preferred constructor
	
	/**
	* This demonstrates a void method.
	*print outs a message
	*
	*/
	public void Draw() {
		System.out.println("Drawing code for <<Mall>>");
	}//end Draw
	
	/*
	 * prints out the list of instance variables and there values for display
	 */
	public String displayData() {
		System.out.println("Mall");
		System.out.println("Median Size of Unit: " + medianUnitSize);
		System.out.println("Number of Parking Spaces: " + numParkingSpaces);
	}

	/**
	* @return the current value of medianUnitSize
	*/
	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	/**
	* @param medianUnitSize
	*/
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	/**
	* @return the current value of numParkingSpaces
	*/
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	/**
	* @param numParkingSpaces
	*/
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}

	@Override
	public String toString() {
		return "Mall [medianUnitSize=" + medianUnitSize + ", numParkingSpaces=" + numParkingSpaces + "]";
	}//end displayData
	
	
	

}//end class
