/**
 * 
 */

/**
 * @author 212610402
 *
 */
public class Aircraft extends Customer{

	private String aircraftName;
	/**
	 * 
	 */
	public Aircraft(String aircraftName) {
		super(aircraftName);
		this.aircraftName = aircraftName;
		// TODO Auto-generated constructor stub
		
	}

	
	 /**
	 * @return the aircraftName
	 */
	public String getAircraftName() {
		return aircraftName;
	}


	/**
	 * @param aircraftName the aircraftName to set
	 */
	public void setAircraftName(String aircraftName) {
		this.aircraftName = aircraftName;
	}


	// Abstract method (does not have a body)
	 public String aircraftName() {
		 return aircraftName;
		 
	 }
	 
	@Override
	public String toString() {
		return "Aircraft [aircraftName=" + aircraftName + "]";
	}

		
		
}
