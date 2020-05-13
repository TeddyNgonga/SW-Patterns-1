import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

public class Simulation {
    public ArrayList<Configuration> configurations737 = new ArrayList<Configuration>(); // Create an ArrayList object
    public ArrayList<Configuration> configurations777 = new ArrayList<Configuration>(); // Create an ArrayList object


	public Simulation() throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		// TODO Auto-generated constructor stub
		


	}
	
	
	public void setConfigfor737Boeing() {
	     try {
	    	 
			    PartsFactory partsFactory = new PartsFactory();
			    
			    Configuration fmsPart1 = partsFactory.getShape("FMS", "1");
			    Configuration gpsPart2 = partsFactory.getShape("GPS", "2");
			    Configuration gpsPart3 = partsFactory.getShape("GPS", "3");		
			    Configuration irsPart4 = partsFactory.getShape("IRS", "4");
			    Configuration enginePart5 = partsFactory.getShape("Engine", "5");
			    
			    System.out.println("Error: " + fmsPart1.getName() );
			    configurations737.add(fmsPart1);
			    configurations737.add(gpsPart2);
			    configurations737.add(gpsPart3);
			    configurations737.add(irsPart4);
			    configurations737.add(enginePart5);

			    
	    	 
	     }catch(ParserConfigurationException  error) {
	    	 
	    	 System.out.println("Error: " + error );
	     }catch(SAXException  error) {
	    	 
	    	 System.out.println("Error: " + error );
	     }catch(IOException error) {
	    	 
	    	 System.out.println("Error: " + error );
	     }catch(XMLStreamException error) {
	    	 
	    	 System.out.println("Error: " + error );
	     }
		
	}
	
	public void setConfigfor777Boeing() {
	     try {
	    	 
			    PartsFactory partsFactory = new PartsFactory();
			    
			    Configuration fmsPart1 = partsFactory.getShape("FMS", "1");
			    Configuration gpsPart2 = partsFactory.getShape("GPS", "2");	
			    Configuration irsPart4 = partsFactory.getShape("IRS", "3");
			    Configuration enginePart5 = partsFactory.getShape("Engine", "4");
			    configurations777.add(fmsPart1);
			    configurations777.add(gpsPart2);
			    configurations777.add(irsPart4);
			    configurations777.add(enginePart5);
	    	 
	     }catch(ParserConfigurationException  error) {
	    	 
	    	 System.out.println("Error: " + error );
	     }catch(SAXException  error) {
	    	 
	    	 System.out.println("Error: " + error );
	     }catch(IOException error) {
	    	 
	    	 System.out.println("Error: " + error );
	     }catch(XMLStreamException error) {
	    	 
	    	 System.out.println("Error: " + error );
	     }
		
	}
	public ArrayList<Configuration> getConfigurations737(){
		return configurations737;
	}
	public ArrayList<Configuration> getConfigurations777(){
		return configurations777;
	}
}
