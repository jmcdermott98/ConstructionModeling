/**
 * this class inherits from Residential
 * 
 * @author JAcob McDermott
 *@version building
 * CS 131
 */
public class SingleFamilyHome extends Residential{
	
	private boolean garage;
	
	/*
	 * empty argument constructor should set instance variables to 0 or ""
	 */
	public SingleFamilyHome(){
		// TODO Auto-generated constructor stub
		garage = false;
	}//end empty argument constructor
	
	/*
	 * preferred constructor sets instance variables to their values
	 * @param instance variables
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super();
		garage = false;
	}//end preferred constructor
	
	/**
	* This demonstrates a void method.
	*print outs a message
	*
	*/
	public void Draw() {
		System.out.println("Drawing code for <<SingleFamilyHome>>");
	}//end Draw
	
	/*
	 * prints out the list of instance variables and there values for display
	 */
	public String displayData() {
		System.out.println("Single Family Home");
		System.out.println("Garage: No");
	}

	/**
	* @return the current value of numRentableUnits
	*/
	public boolean isGarage() {
		return garage;
	}

	/**
	* @param numRentableUnits
	*/
	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + "]";
	}

	
}
