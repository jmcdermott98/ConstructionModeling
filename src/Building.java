/**
 * this class is the parent class to all other classes in this project
 * 
 * @author JAcob McDermott
 *@version building
 *
 */
public class Building {
	
	protected String projectedName;
	protected String completeAddress;
	protected Double totalSquareFeet;
	protected String occupancyGroup;
	protected String subGroup;
	
	public Building() {
		// TODO Auto-generated constructor stub
		projectedName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subGroup = "";
		
	}//end empty argument constructor
	
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		projectedName = Gaines House;
		completeAddress = 123 Main Street, Louisville, Kentucky 40201;
		totalSquareFeet = 2,450;
		occupancyGroup = Business;
		subGroup = Group B;
		
	}//end preffered constructor
	
	public void Draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}//end draw
	
	public String displayData() {
		System.out.println("Building");
		System.out.println("Project Name: " + projectedName);
		System.out.println("Address: " + completeAddress);
		System.out.println("Total Square Feet: " + totalSquareFeet);
		System.out.println("Occupancy Group: " + occupancyGroup);
		System.out.println("Occupancy Subgroup: " + subGroup);
	}
	
	
	//begin getters and setters
	public String getProjectedName() {
		return projectedName;
		 
	}

	public void setProjectedName(String projectedName) {
		this.projectedName = projectedName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public Double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(Double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubGroup() {
		return subGroup;
	}

	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	} 
	
	//end getters and setters
	
	@Override
	public String toString() {
		return "Building [projectedName=" + projectedName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + "]";
		
	}
	
	
	
}//end class
