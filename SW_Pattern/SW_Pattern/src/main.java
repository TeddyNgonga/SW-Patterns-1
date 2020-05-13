import javax.xml.parsers.*;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;  




public class main {

	

	static ParserTXT parserTXT1;
    static Logger logger = Logger.getInstance();
    static Simulation simulation;
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, XMLStreamException {

	    
		
		parserTXT1 = new ParserTXT("","",0,0);
		parserTXT1.parseTXTFile("./resources/TestCase1.txt");
		System.out.println("Test case file 1 " + parserTXT1.toString());
		for(int i =0; i < parserTXT1.getArrayListOfFlightPhase().size(); i++) 
			System.out.println("flight phase obj: " + parserTXT1.getArrayListOfFlightPhase().get(i) );
		
		
		
		logger.info("Starting simulation"); 
	   

		FlightData flightData = new FlightData();
		
		
		simulation = new Simulation();
		simulation.setConfigfor737Boeing();
				
		logger.info("Processing configuration file B737"); 
		
		for(int i = 0 ; i < simulation.getConfigurations737().size(); i++) {
			
		    for(Iterator iter =  simulation.getConfigurations737().get(i).getIterator(); iter.subHasNext();) {

			    if(((Subscriber) iter.subCurrent()).getOrigin().equals("Simulation")) {

		    		for(int j = 0; j < parserTXT1.getArrayListOfFlightPhase().size(); j++) {
		    			
		    			if(parserTXT1.getArrayListOfFlightPhase().get(j).toString().contains(((Subscriber)iter.subCurrent()).getName())) {
    			    		
				    		if(((Subscriber)iter.subCurrent()).getName().equals("WindSpeed")) {
				    			
				    		
				    			if (checkWithinRange(parserTXT1.getArrayListOfFlightPhase().get(j).getWindSpeed(),
				    					((Subscriber)iter.subCurrent()).getMin(),
				    					((Subscriber)iter.subCurrent()).getMax())) {
				    				
				    				flightData.setWindSpeed(parserTXT1.getArrayListOfFlightPhase().get(j).getWindSpeed());
				    			}else {
				    				flightData.setWindSpeed(((Subscriber)iter.subCurrent()).getDefaultValue());
				    				logger.error("Wind Speed not within range");
				    			}
				    			
				    		}else if (((Subscriber)iter.subCurrent()).getName().equals("Duration")) {
				    			
				    			if (checkWithinRange(parserTXT1.getArrayListOfFlightPhase().get(j).getDuration(),
				    					((Subscriber)iter.subCurrent()).getMin(),
				    					((Subscriber)iter.subCurrent()).getMax())) {
				    				
				    				flightData.setDuration(parserTXT1.getArrayListOfFlightPhase().get(j).getDuration());
				    			}else {
				    				flightData.setDuration(((Subscriber)iter.subCurrent()).getDefaultValue());
				    				logger.error("Duration not within range");
				    			}
				    		
				    		}else if (((Subscriber)iter.subCurrent()).getName().equals("VerticalSpeed")) {
				    			
				    			if (checkWithinRange(parserTXT1.getArrayListOfFlightPhase().get(j).getVerticalSpeed(),
				    					((Subscriber)iter.subCurrent()).getMin(),
				    					((Subscriber)iter.subCurrent()).getMax())) {
				    				
				    				flightData.setVerticalSpeed(parserTXT1.getArrayListOfFlightPhase().get(j).getVerticalSpeed());
				    			}else {
				    				flightData.setVerticalSpeed(((Subscriber)iter.subCurrent()).getDefaultValue());
				    				logger.error("VerticalSpeed  not within range");
				    			}
				    		}else if (((Subscriber)iter.subCurrent()).getName().equals("Latitude_Change")) {
				    			
				    			if (checkWithinRange(parserTXT1.getArrayListOfFlightPhase().get(j).getLatitude_Change(),
				    					((Subscriber)iter.subCurrent()).getMin(),
				    					((Subscriber)iter.subCurrent()).getMax())) {
				    				
				    				flightData.setLatitude_Change(parserTXT1.getArrayListOfFlightPhase().get(j).getLatitude_Change());
				    			}else {
				    				flightData.setLatitude_Change(((Subscriber)iter.subCurrent()).getDefaultValue());
				    				logger.error("Latitude_Change  not within range");
				    			}
				    		}else if (((Subscriber)iter.subCurrent()).getName().equals("Longitude_Change")) {
				    			
				    			if (checkWithinRange(parserTXT1.getArrayListOfFlightPhase().get(j).getLongitude_Change(),
				    					((Subscriber)iter.subCurrent()).getMin(),
				    					((Subscriber)iter.subCurrent()).getMax())) {
				    				
				    				flightData.setLongitude_Change(parserTXT1.getArrayListOfFlightPhase().get(j).getLongitude_Change());
				    			}else {
				    				flightData.setLongitude_Change(((Subscriber)iter.subCurrent()).getDefaultValue());
				    				logger.error("Longitude_Change  not within range");
				    			}
				    		}
				    	}

				    }
		    		
		    		}else {
		    			
		    			logger.info("Unable to process inputs that have an origin that isn't from the Simulation. Please read Pseudocode for logic");
		    			
				    	
		    			 			
		    			
		    		}
		    		
			    	
			    
			    	


			    	
			   
			    iter.subNext();
		    }
			
			
		}

	    System.out.println(flightData.toString());

	    

		
		/*
		 * Text file 1
		 * Create a signleton or object of FLIGHT DATA
		 * 
		 * Go to TXT file 1
		 * 		Make sure you have everything stopred into Arrays
		 * 
		 * Go to the XML file 737
		 * 		Make sure you have everything stored in arrays of objects
		 * 
		 * Go to FMS
		 * 		CHECK if ORIGIN comes from Simulation or a ProductID
		 * 			IF it come from Simulation 
		 * 				Go to current FLIGHT PHASE and GET the value that match the NAME of Subscriber
		 * 					Check that the value is with range of MAX and MIN of Subscriber
		 * 						IF NOT in range output an error using the LOGGER and set the parameter to default value
		 * 						IF YES and in range set the value within FLIGHT DATA that match the name
		 * 		ELSE IF ORIGIN comes from a PRODUCTID
		 * 			GO to the PRODUCT which matches the product ID
		 * 				Search for the name WITHIN the product (pub or sub) that match the NAME
		 * 					IF you have a match 
		 * 						IF is a publisher 
		 * 							IF Operand1 and Operand2 and Operation are not null
		 * 								Convert Operation and Operand1 and Operand2 into numbers and operation sign
		 * 								Perform calculation
		 * 								Update FLIGHT DATA obj  based on the result
		 * 						ELSE IF subscriber 
		 * 							GO TO Origin  and get the value of the variable which correspond to the name
		 * 							Get values form FLIGHT DATA obj that match Operand1 and Operand2
		 * 							Perform Calculation
		 * 							Update FLIGHT DATA obj  based on the result
		 *  		
		 */
		
	    
	    

	}
	

	public static String checkProdctID737(int origin) {
		
		for(int i = 0 ; i < simulation.getConfigurations737().size() ; i++) {
//	    	logger.info("doMycheck Product ID " + simulation.getConfigurations737().get(i).getIterator().getProductID());
//	    	logger.info("doMycheck Orifin " +  origin);
	    	
	    	if(origin == Integer.parseInt(simulation.getConfigurations737().get(i).getIterator().getProductID())) {
	    		
	    		//logger.info("My product ID Name " +  simulation.getConfigurations737().get(i).getName());
	    		if(simulation.getConfigurations737().get(i).getIterator().getProductID().contentEquals("1"))
	    		{
	    			return "FMS";
	    		}else if(simulation.getConfigurations737().get(i).getIterator().getProductID().contentEquals("2"))
	    		{
	    			return "GPS1";
	    		}else if(simulation.getConfigurations737().get(i).getIterator().getProductID().contentEquals("3"))
	    		{
	    			return "GPS2";
	    		}else if(simulation.getConfigurations737().get(i).getIterator().getProductID().contentEquals("4"))
	    		{
	    			return "IRS";
	    		}else if(simulation.getConfigurations737().get(i).getIterator().getProductID().contentEquals("5"))
	    		{
	    			return "Engine";
	    		}
	    	
	    	} 		
	    	
		}
		return null;
	}
	public static String checkProdctID777(int origin) {
		
		for(int i = 0 ; i < simulation.getConfigurations777().size() ; i++) {
//	    	logger.info("doMycheck Product ID " + simulation.getConfigurations737().get(i).getIterator().getProductID());
//	    	logger.info("doMycheck Orifin " +  origin);
	    	
	    	if(origin == Integer.parseInt(simulation.getConfigurations777().get(i).getIterator().getProductID())) {
	    		
	    		//logger.info("My product ID Name " +  simulation.getConfigurations737().get(i).getName());
	    		if(simulation.getConfigurations777().get(i).getIterator().getProductID().contentEquals("1"))
	    		{
	    			return "FMS";
	    		}else if(simulation.getConfigurations777().get(i).getIterator().getProductID().contentEquals("2"))
	    		{
	    			return "GPS";
	    		}else if(simulation.getConfigurations777().get(i).getIterator().getProductID().contentEquals("3"))
	    		
	    			return "IRS";
	    		}else if(simulation.getConfigurations777().get(i).getIterator().getProductID().contentEquals("4"))
	    		{
	    			return "Engine";
	    		} 	
	    			
	    	
		}
		return null;
	}
	
	public static boolean checkWithinRange(int value, int min, int max) {
						
		if(value >= min && value <= max) {
			return true;
		}
		return false;

	} 
	public static boolean checkWithinRange(double value, double min, double max) {
		
		if(value >= min && value <= max) {
			return true;
		}
		return false;

	} 
   

	
	
}
