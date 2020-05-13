import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ParserTXT {

	
	private String flightType;
	private String productConfiguration;
	private double preFlightLatitude;
	private double preFlightLongitude;
    public ArrayList<FlightPhase> flightPhase = new ArrayList<FlightPhase>(); // Create an ArrayList object
	

	public ParserTXT(String flightType, String productConfiguration , double preFlightLatitude, double preFlightLongitude) {
		this.flightType = flightType;
		this.productConfiguration = productConfiguration;
		this.preFlightLatitude = preFlightLatitude;
		this.preFlightLongitude = preFlightLongitude;
	}

//"./resources/Boeing777Configuration.xml"
	public void parseTXTFile(String path) {
		String tempFlightPhase = "";
		int tempDuration = 0;
		int tempVerticalSpeed= 0;
		int tempWindSpeed = 0;
		double tempLatitudeChange = 0;
		double tempLongitudeChange = 0;
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(path));
			String line = reader.readLine();
			while (line != null) {
//				System.out.println(line);
				
				
				if (line.contains("FLIGHT_TYPE")) {
					 flightType = line.substring(line.lastIndexOf("=") + 1);
					 
				}else if (line.contains("PRODUCT_CONFIGURATION")) {
					productConfiguration = line.substring(line.lastIndexOf("=") + 1);
					
				}else if (line.contains("[PRE_FLIGHT]=Latitude_Change:")) {
					preFlightLatitude = (double)Double.parseDouble(line.substring(line.lastIndexOf(":") + 1));

				}else if (line.contains("[PRE_FLIGHT]=Longitude_Change:")) {
					preFlightLongitude = (double)Double.parseDouble(line.substring(line.lastIndexOf(":") + 1));

				}else if (line.contains("FLIGHT_PHASE")) {
					tempFlightPhase = line.substring(line.lastIndexOf("=") + 1);
					
				}else if (line.contains("[FLIGHT_PARAMETER]=Duration:")) {
					tempDuration = Integer.parseInt(line.substring(line.lastIndexOf(":") + 1));
							
				}else if (line.contains("FLIGHT_PARAMETER]=VerticalSpeed:")) {
					tempVerticalSpeed = Integer.parseInt(line.substring(line.lastIndexOf(":") + 1));

				}else if (line.contains("[FLIGHT_PARAMETER]=WindSpeed:")) {
					tempWindSpeed = Integer.parseInt(line.substring(line.lastIndexOf(":") + 1));
//					System.out.println(line);

				}else if (line.contains("[FLIGHT_PARAMETER]=Latitude_Change:")) {
					tempLatitudeChange = (double)Double.parseDouble(line.substring(line.lastIndexOf(":") + 1));

				}else if (line.contains("[FLIGHT_PARAMETER]=Longitude_Change:")) {
					tempLongitudeChange = (double)Double.parseDouble(line.substring(line.lastIndexOf(":") + 1));
					flightPhase.add(new FlightPhase(tempFlightPhase, tempDuration, tempVerticalSpeed,  tempWindSpeed,tempLatitudeChange, tempLongitudeChange));
				}
				
				
				// read next line
				line = reader.readLine();
				
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * @return the Array list of flightPhase objects
	 */
	public ArrayList<FlightPhase> getArrayListOfFlightPhase() {
		return flightPhase;
	}
	
	
	/**
	 * clear Array list of flightPhase objects
	 */
	public void clearArrayListOfFlightPhase() {
		flightPhase.clear();
	}
	
	
	
	/**
	 * @return the flightType
	 */
	public String getFlightType() {
		return flightType;
	}



	/**
	 * @param flightType the flightType to set
	 */
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}



	/**
	 * @return the productConfiguration
	 */
	public String getProductConfiguration() {
		return productConfiguration;
	}



	/**
	 * @param productConfiguration the productConfiguration to set
	 */
	public void setProductConfiguration(String productConfiguration) {
		this.productConfiguration = productConfiguration;
	}



	/**
	 * @return the preFlightLatitude
	 */
	public double getPreFlightLatitude() {
		return preFlightLatitude;
	}



	/**
	 * @param preFlightLatitude the preFlightLatitude to set
	 */
	public void setPreFlightLatitude(double preFlightLatitude) {
		this.preFlightLatitude = preFlightLatitude;
	}



	/**
	 * @return the preFlightLongitude
	 */
	public double getPreFlightLongitude() {
		return preFlightLongitude;
	}



	/**
	 * @param preFlightLongitude the preFlightLongitude to set
	 */
	public void setPreFlightLongitude(double preFlightLongitude) {
		this.preFlightLongitude = preFlightLongitude;
	}


	@Override
	public String toString() {
		return "ParserTXT [flightType=" + flightType + ", productConfiguration=" + productConfiguration
				+ ", preFlightLatitude=" + preFlightLatitude + ", preFlightLongitude=" + preFlightLongitude + "]";
	}



}
