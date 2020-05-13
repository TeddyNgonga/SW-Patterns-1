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
//	static Configuration fmsPart1;
//	static Configuration gpsPart2;
//	static Configuration gpsPart3;
//	static Configuration irsPart4;
//	static Configuration enginePart5;
    static Logger logger = Logger.getInstance();
    static Simulation simulation;
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		
		 
		
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        
        

		
//		ParserTXT parserTXT1 = new ParserTXT("","",0,0);
//		parserTXT1.parseTXTFile("./resources/TestCase1.txt");
//		System.out.println("Test case file 1 " + parserTXT1.toString());
//		for(int i =0; i < parserTXT1.getArrayListOfFlightPhase().size(); i++) 
//			System.out.println("flight phase obj: " + parserTXT1.getArrayListOfFlightPhase().get(i) );
//		
//		System.out.println("=====================" );
//		
//		ParserTXT parserTXT2 = new ParserTXT("","",0,0);
//		parserTXT2.parseTXTFile("./resources/TestCase2.txt");
//		System.out.println("Test case file 2 " + parserTXT2.toString());
//		for(int i =0; i < parserTXT2.getArrayListOfFlightPhase().size(); i++) 
//			System.out.println("flight phase obj: " + parserTXT2.getArrayListOfFlightPhase().get(i) );
//
//	
        
        
        
//		ParserXML parserFMS = new ParserXML("");
//		ParserXML parserGPS = new ParserXML("");
//		ParserXML parserIRS = new ParserXML("");
//		ParserXML parserEngine = new ParserXML("");
//
//		NodeList nListFMS = document.getElementsByTagName("FMS");
//		System.out.println("============================");
//		System.out.println("FMS ");
//		System.out.println("============================");
//		parserFMS.visitChildNodes(nListFMS);
		
		

//		System.out.println("============================");
//		System.out.println("FMS  AEFDasfdx");
//		System.out.println("============================");
	   // PartsFactory partsFactory = new PartsFactory();
	    
		//fmsPart1 = partsFactory.getShape("FMS", "1");
//	    for(Iterator iter =  fmsPart1.getIterator(); iter.pubHasNext();)
//		    System.out.println((((Publisher) iter.pubNext())));
//	    for(Iterator iter =  fmsPart1.getIterator(); iter.subHasNext();)
//		    System.out.println(iter.subNext());	    
//	    System.out.println("============================");
	    
	    
//		gpsPart2 = partsFactory.getShape("GPS", "2");
//	    for(Iterator iter =  gpsPart2.getIterator(); iter.pubHasNext();)
//		    System.out.println((((Publisher) iter.pubNext())));
//	    for(Iterator iter =  gpsPart2.getIterator(); iter.subHasNext();)
//		    System.out.println(iter.subNext());
//	    
//	    System.out.println("============================");
//	    
//		gpsPart3 = partsFactory.getShape("GPS", "3");
//	    for(Iterator iter =  gpsPart3.getIterator(); iter.pubHasNext();)
//		       System.out.println((((Publisher) iter.pubNext())));
//	    for(Iterator iter =  gpsPart3.getIterator(); iter.subHasNext();)
//		      System.out.println(iter.subNext());
//	    
//	    System.out.println("============================");
//		
//	    irsPart4 = partsFactory.getShape("IRS", "4");
//	    for(Iterator iter =  irsPart4.getIterator(); iter.pubHasNext();)
//		       System.out.println((((Publisher) iter.pubNext())));
//	    for(Iterator iter =  irsPart4.getIterator(); iter.subHasNext();)
//		      System.out.println(iter.subNext());	      
//	    
//	    System.out.println("============================"); 
//	    
//		enginePart5 = partsFactory.getShape("Engine", "5");
//	    for(Iterator iter =  enginePart5.getIterator(); iter.pubHasNext();)
//		       System.out.println((((Publisher) iter.pubNext())));
//	    for(Iterator iter =  enginePart5.getIterator(); iter.subHasNext();)
//		      System.out.println(iter.subNext());	
//	    
	    
	    
	    System.out.println("============================"); 
	    
		parserTXT1 = new ParserTXT("","",0,0);
		parserTXT1.parseTXTFile("./resources/TestCase1.txt");
		System.out.println("Test case file 1 " + parserTXT1.toString());
		for(int i =0; i < parserTXT1.getArrayListOfFlightPhase().size(); i++) 
			System.out.println("flight phase obj: " + parserTXT1.getArrayListOfFlightPhase().get(i) );
		
		
		
		System.out.println("My simulation"); 
	    System.out.println("============================"); 

		FlightData flightData = new FlightData();
		
		
		simulation = new Simulation();
		simulation.setConfigfor737Boeing();
		System.out.println("============================        " + simulation.getConfigurations737().get(0).getIterator().getProductID()); 
		
		System.out.println("============================        " + simulation.getConfigurations737().get(1).getIterator().getProductID()); 

		for(int i = 0 ; i < simulation.getConfigurations737().size(); i++) {
			
		    for(Iterator iter =  simulation.getConfigurations737().get(i).getIterator(); iter.subHasNext();) {

			    if(((Subscriber) iter.subCurrent()).getOrigin().equals("Simulation")) {
//		    		System.out.println(((Subscriber)iter.subCurrent()).getName());

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
		    			
				    	
		    			logger.info(" My product IDD "+doMycheck(Integer.parseInt(((Subscriber)iter.subCurrent()).getOrigin())));
		    			
		    			
				    	
//				    			if(((Subscriber)iter.subCurrent()).getOrigin().equals("1")) {
//				    				
//				    				
//				    			}else if(((Subscriber)iter.subCurrent()).getOrigin().equals("5")) {
//				    				enginePart5.getIterator().getProductID();
//				    			}
				    			
				    			
//				    			logger.info("product ID fms "+ fmsPart1.getIterator().getProductID());
//				    			logger.info("product ID gps1 "+ gpsPart2.getIterator().getProductID());
//				    			logger.info("product ID gps2 "+ gpsPart3.getIterator().getProductID());
//				    			logger.info("product ID iris4 "+ irsPart4.getIterator().getProductID());
//				    			logger.info("product ID engine "+ enginePart5.getIterator().getProductID());
		    			
		    			
		    		}
		    		
			    	
			    
			    	


			    	
			   
			    iter.subNext();
		    }
			
			
		}

	    System.out.println(flightData.toString());
	    System.out.println("Checkin op==================================");
	    

		
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
		
	    
	    
	    
	    
//		System.out.println("Product ID "+ parserFMS.getProductID());
//		for(int i =0; i < parserFMS.getArrayListOfPublisher().size(); i++) 
//			System.out.println("publisher obj: " + parserFMS.getArrayListOfPublisher().get(i) );
//
//		for(int i =0; i < parserFMS.getArrayListOfSubscriber().size(); i++) 
//			System.out.println("subscriber obj: " + parserFMS.getArrayListOfSubscriber().get(i) );

//		
//
//	
//		NodeList nListGPS = document.getElementsByTagName("GPS");
//		System.out.println("============================");
//		System.out.println("GPS");
//		System.out.println("============================");
//		parserGPS.visitChildNodes(nListGPS);
//		
//		System.out.println("Product ID "+ parserGPS.getProductID());
//		for(int i =0; i < parserGPS.getArrayListOfPublisher().size(); i++) 
//			System.out.println("publisher obj: " + parserGPS.getArrayListOfPublisher().get(i) );
//
//		for(int i =0; i < parserGPS.getArrayListOfSubscriber().size(); i++) 
//			System.out.println("subscriber obj: " + parserGPS.getArrayListOfSubscriber().get(i) );
//		
//
//				
//		NodeList nListIRS = document.getElementsByTagName("IRS");
//		System.out.println("============================");
//		System.out.println("IRS");
//		System.out.println("============================");
//		parserIRS.visitChildNodes(nListIRS);
//		
//		
//		System.out.println("Product ID "+ parserIRS.getProductID());
//		for(int i =0; i < parserIRS.getArrayListOfPublisher().size(); i++) 
//			System.out.println("publisher obj: " + parserIRS.getArrayListOfPublisher().get(i) );
//
//		for(int i =0; i < parserIRS.getArrayListOfSubscriber().size(); i++) 
//			System.out.println("subscriber obj: " + parserIRS.getArrayListOfSubscriber().get(i) );
//		
//		
//		
//		NodeList nListEngine = document.getElementsByTagName("Engine");
//		System.out.println("============================");
//		System.out.println("Engine");
//		System.out.println("============================");
//		parserEngine.visitChildNodes(nListEngine);
//		
//		System.out.println("Product ID "+ parserEngine.getProductID());
//		for(int i =0; i < parserEngine.getArrayListOfPublisher().size(); i++) 
//			System.out.println("publisher obj: " + parserEngine.getArrayListOfPublisher().get(i) );
//
//		for(int i =0; i < parserEngine.getArrayListOfSubscriber().size(); i++) 
//			System.out.println("subscriber obj: " + parserEngine.getArrayListOfSubscriber().get(i) );
//		
		
		

	}
	
	
	public static String  doMycheck(int origin) {
		
		for(int i = 0 ; i < simulation.getConfigurations737().size() ; i++) {
//	    	logger.info("doMycheck Product ID " + simulation.getConfigurations737().get(i).getIterator().getProductID());
//	    	logger.info("doMycheck Orifin " +  origin);
	    	
	    	if(origin == Integer.parseInt(simulation.getConfigurations737().get(i).getIterator().getProductID())) {
	    		
	    		logger.info("My product ID Name " +  simulation.getConfigurations737().get(i).getName());
	    		return simulation.getConfigurations737().get(i).getIterator().getProductID();
	    	}
	    		
	    	
		}
		return null;
    	
	}
//	public static String checkProdctID737(int origin) {
//		
//		for(int i = 0; i < simulation.getConfigurations737().size(); i ++) {
//			if(origin == Integer.parseInt(simulation.getConfigurations737().get(i).getIterator().getProductID())) {
//	    		
//	    		logger.info("My product ID Name " +  simulation.getConfigurations737().get(i).getName());
//	    		return simulation.getConfigurations737().get(i).getIterator().getProductID();
//		}
//		return null;
//	}
	public static int checkProdctID777(int origin , int productID) {
		
		
		for(int i = 0; i < simulation.getConfigurations777().size(); i ++) {
			if(origin == productID) 
				return productID;
		}

		return 0;
		
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
	public static void performLogic(Configuration config) {
		
	    for(Iterator iter =  config.getIterator(); iter.subHasNext();) {

		    if(((Subscriber) iter.subCurrent()).getOrigin().equals("Simulation")) {
		    	
		    	if(parserTXT1.getArrayListOfFlightPhase().get(0).toString().contains(((Subscriber)iter.subCurrent()).getName())) {
		    		//System.out.println(((Subscriber)iter.subCurrent()).getName());
		    			    		
		    		if(((Subscriber)iter.subCurrent()).getName() == "WindSpeed") {
		    			
		    			System.out.println(parserTXT1.getArrayListOfFlightPhase().get(0).getWindSpeed());
		    			
		    		}else if (((Subscriber)iter.subCurrent()).getName() == "Duration") {
		    			
		    			System.out.println(parserTXT1.getArrayListOfFlightPhase().get(0).getDuration());

		    		
		    		}else if (((Subscriber)iter.subCurrent()).getName() == "VerticalSpeed") {
		    			
		    			System.out.println(parserTXT1.getArrayListOfFlightPhase().get(0).getVerticalSpeed());
		    		}
		    		
		    	}
		    	
		    	
		    	
		    	
		    }
		    iter.subNext();
	    }
		
	}
	   

	
	
}
