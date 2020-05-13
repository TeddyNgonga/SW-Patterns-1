
public class FlightPhase {

	private String flightPhase;
	private int duration;
	private int verticalSpeed;
	private int windSpeed;
	private double latitude_Change;
	private double longitude_Change;



	public FlightPhase(String flightPhase, int duration, int verticalSpeed, int windSpeed, double latitude_Change, double longitude_Change) {
		this.flightPhase = flightPhase;
		this.duration = duration;
		this.verticalSpeed = verticalSpeed;
		this.windSpeed = windSpeed;
		this.latitude_Change = latitude_Change;
		this.longitude_Change = longitude_Change;
	}


	
	/**
	 * @return the flightPhase
	 */
	public String getFlightPhase() {
		return flightPhase;
	}


	/**
	 * @param flightPhase the flightPhase to set
	 */
	public void setFlightPhase(String flightPhase) {
		this.flightPhase = flightPhase;
	}

	

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}


	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}



	/**
	 * @return the verticalSpeed
	 */
	public int getVerticalSpeed() {
		return verticalSpeed;
	}



	/**
	 * @param verticalSpeed the verticalSpeed to set
	 */
	public void setVerticalSpeed(int verticalSpeed) {
		this.verticalSpeed = verticalSpeed;
	}



	/**
	 * @return the windSpeed
	 */
	public int getWindSpeed() {
		return windSpeed;
	}



	/**
	 * @param windSpeed the windSpeed to set
	 */
	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}



	/**
	 * @return the latitude_Change
	 */
	public double getLatitude_Change() {
		return latitude_Change;
	}



	/**
	 * @param latitude_Change the latitude_Change to set
	 */
	public void setLatitude_Change(double latitude_Change) {
		this.latitude_Change = latitude_Change;
	}



	/**
	 * @return the longitude_Change
	 */
	public double getLongitude_Change() {
		return longitude_Change;
	}



	/**
	 * @param longitude_Change the longitude_Change to set
	 */
	public void setLongitude_Change(double longitude_Change) {
		this.longitude_Change = longitude_Change;
	}



	@Override
	public String toString() {
		return "FlightPhase [flightPhase=" + flightPhase + ", Duration=" + duration + ", VerticalSpeed=" + verticalSpeed
				+ ", WindSpeed=" + windSpeed + ", Latitude_Change=" + latitude_Change + ", Longitude_Change="
				+ longitude_Change + "]";
	}

	

	
	
}
