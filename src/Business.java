
public class Business extends Building{
	
	protected int numRentableUnits;

	public Business() {
		// TODO Auto-generated constructor stub
	}
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
	}

	/* @Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + "]";
	} */

	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

}
