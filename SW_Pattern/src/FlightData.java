
public class FlightData {

	private int Speed; 			
	private int Elevation_Change;
	private double Latitude;	
	private double Longitude;	
	private int WindSpeed;		
	private int Duration;	
	private int FlightSpeed;
	private int VerticalSpeed; 	
	private double GPS_Latitude; 	
	private double GPS_Longitude; 	
	private double Longitude_Change;
	private double GPS_Latitude2; 	
	private double GPS_Longitude2; 	
	private double IRS_Latitude; 	
	private double IRS_Longitude; 	
	private double Latitude_Change; 
	
	
	public FlightData() {
		
	}


	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return Speed;
	}
	
	
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		Speed = speed;
	}
	
	
	/**
	 * @return the elevation_Change
	 */
	public int getElevation_Change() {
		return Elevation_Change;
	}
	
	
	/**
	 * @param elevation_Change the elevation_Change to set
	 */
	public void setElevation_Change(int elevation_Change) {
		Elevation_Change = elevation_Change;
	}
	
	
	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return Latitude;
	}
	
	
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		Latitude = latitude;
	}
	
	
	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return Longitude;
	}
	
	
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		Longitude = longitude;
	}
	
	
	/**
	 * @return the windSpeed
	 */
	public int getWindSpeed() {
		return WindSpeed;
	}
	
	
	/**
	 * @param windSpeed the windSpeed to set
	 */
	public void setWindSpeed(int windSpeed) {
		WindSpeed = windSpeed;
	}
	
	
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return Duration;
	}
	
	
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		Duration = duration;
	}
	
	
	/**
	 * @return the flightSpeed
	 */
	public int getFlightSpeed() {
		return FlightSpeed;
	}
	
	
	/**
	 * @param flightSpeed the flightSpeed to set
	 */
	public void setFlightSpeed(int flightSpeed) {
		FlightSpeed = flightSpeed;
	}
	
	
	/**
	 * @return the verticalSpeed
	 */
	public int getVerticalSpeed() {
		return VerticalSpeed;
	}
	
	
	/**
	 * @param verticalSpeed the verticalSpeed to set
	 */
	public void setVerticalSpeed(int verticalSpeed) {
		VerticalSpeed = verticalSpeed;
	}
	
	
	/**
	 * @return the gPS_Latitude
	 */
	public double getGPS_Latitude() {
		return GPS_Latitude;
	}
	
	
	/**
	 * @param gPS_Latitude the gPS_Latitude to set
	 */
	public void setGPS_Latitude(double gPS_Latitude) {
		GPS_Latitude = gPS_Latitude;
	}
	
	
	/**
	 * @return the gPS_Longitude
	 */
	public double getGPS_Longitude() {
		return GPS_Longitude;
	}
	
	
	/**
	 * @param gPS_Longitude the gPS_Longitude to set
	 */
	public void setGPS_Longitude(double gPS_Longitude) {
		GPS_Longitude = gPS_Longitude;
	}
	
	
	/**
	 * @return the longitude_Change
	 */
	public double getLongitude_Change() {
		return Longitude_Change;
	}
	
	
	/**
	 * @param longitude_Change the longitude_Change to set
	 */
	public void setLongitude_Change(double longitude_Change) {
		Longitude_Change = longitude_Change;
	}
	
	
	/**
	 * @return the gPS_Latitude2
	 */
	public double getGPS_Latitude2() {
		return GPS_Latitude2;
	}
	
	
	/**
	 * @param gPS_Latitude2 the gPS_Latitude2 to set
	 */
	public void setGPS_Latitude2(double gPS_Latitude2) {
		GPS_Latitude2 = gPS_Latitude2;
	}
	
	
	/**
	 * @return the gPS_Longitude2
	 */
	public double getGPS_Longitude2() {
		return GPS_Longitude2;
	}
	
	
	/**
	 * @param gPS_Longitude2 the gPS_Longitude2 to set
	 */
	public void setGPS_Longitude2(double gPS_Longitude2) {
		GPS_Longitude2 = gPS_Longitude2;
	}
	
	
	/**
	 * @return the iRS_Latitude
	 */
	public double getIRS_Latitude() {
		return IRS_Latitude;
	}
	
	
	/**
	 * @param iRS_Latitude the iRS_Latitude to set
	 */
	public void setIRS_Latitude(double iRS_Latitude) {
		IRS_Latitude = iRS_Latitude;
	}
	
	
	/**
	 * @return the iRS_Longitude
	 */
	public double getIRS_Longitude() {
		return IRS_Longitude;
	}
	
	
	/**
	 * @param iRS_Longitude the iRS_Longitude to set
	 */
	public void setIRS_Longitude(double iRS_Longitude) {
		IRS_Longitude = iRS_Longitude;
	}
	
	
	/**
	 * @return the latitude_Change
	 */
	public double getLatitude_Change() {
		return Latitude_Change;
	}
	
	
	/**
	 * @param latitude_Change the latitude_Change to set
	 */
	public void setLatitude_Change(double latitude_Change) {
		Latitude_Change = latitude_Change;
	}
	
	
	@Override
	public String toString() {
		return "FlightData [Speed=" + Speed + ", Elevation_Change=" + Elevation_Change + ", Latitude=" + Latitude
				+ ", Longitude=" + Longitude + ", WindSpeed=" + WindSpeed + ", Duration=" + Duration + ", FlightSpeed="
				+ FlightSpeed + ", VerticalSpeed=" + VerticalSpeed + ", GPS_Latitude=" + GPS_Latitude + ", GPS_Longitude="
				+ GPS_Longitude + ", Longitude_Change=" + Longitude_Change + ", GPS_Latitude2=" + GPS_Latitude2
				+ ", GPS_Longitude2=" + GPS_Longitude2 + ", IRS_Latitude=" + IRS_Latitude + ", IRS_Longitude="
				+ IRS_Longitude + ", Latitude_Change=" + Latitude_Change + "]";
	}


}
