import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class Parser {
    static final String NAME    = "Name";
    static final String ORIGIN  = "Origin";
    static final String TYPE = "Type";
    static final String MAX = "Max";
    static final String MIN = "Min";
    static final String DEFAULT = "Default";
    static final String SUBSCRIBE = "Subscribe";
    static final String PUBLISH = "Publish";
    static final String FMS = "FMS";

public List<ConfigurationXML> readConfig(String configFile) {
		
		List<ConfigurationXML> items = new ArrayList<ConfigurationXML>();
		try {
			
	        // First, create a new XMLInputFactory
	        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
	        // Setup a new eventReader
	        InputStream in = new FileInputStream(configFile);
	        XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
	        
	        
	        // read the XML document
	        ConfigurationXML item = null;
        	XMLEvent event2 = eventReader.nextEvent();
    		Iterator attributes = event2.asStartElement().getAttributes();

    		
    		int count = 0;
    		while (attributes.hasNext()) {
    			count++;
    			System.out.println("Counter: "+count);
    			
    		}
	        
	        while (eventReader.hasNext()) {
	        	
	        	XMLEvent event = eventReader.nextEvent();
	        	
	        	if (event.isStartElement()) {
	        		StartElement startElement = event.asStartElement();
	        		
	        		if(startElement.getName().getLocalPart().equals("Boeing")) {
	            		
	            		System.out.println("Customer Name: " + startElement.getName().getLocalPart().toString());
	            		
	        		}
	        		if(startElement.getName().getLocalPart().equals("B737")) {
	            		System.out.println("Aircraft Name: " + startElement.getName().getLocalPart().toString());

	        		}
	        		if(startElement.getName().getLocalPart().equals(FMS)) {
	            		System.out.println("Product Name: " + startElement.getName().getLocalPart().toString());
	            		System.out.println("Product Name: " + startElement.getAttributes().next().getValue());
	            		
	            		System.out.println("Product Name: " + startElement.getAttributes().next().getValue());



	            		
	            		
	            		
	            		
	            		
//	                    while (startElement.getAttributes().hasNext()) {
//	                    	
//	                    	
//		            		System.out.println("FMS children: " + startElement.getAttributes().next().getValue());
//
////	                        Attribute attribute = attributes.next();
////	                        
////	                        if (attribute.getName().toString().equals(DATE)) {
////	                            item.setDate(attribute.getValue());
////	                        }
//
//	                    }
	                    
	                    

	        		}	        		
	        		
	        		
	        		

                    
                    
                    
//		        		if(startElement.getName().getLocalPart().equals(SUBSCRIBE)) {
//		        		
//	            		System.out.println("Hello world " + startElement.getName().getLocalPart().toString());
//	            		
//	        		}
//	        		if(startElement.getName().getLocalPart().equals(FMS) ) {
//		        		
//	            		System.out.println("FMS: " + startElement.getName().getLocalPart().toString());
//	            		System.out.println("Aircraft 2 : " + eventReader.nextTag());
//
//	        		
//	        		}
//	        		if(startElement.getName().getLocalPart().equals(SUBSCRIBE)) {
//		        		
//	            		System.out.println("Hello world " + startElement.getName().getLocalPart().toString());
//	            		
//	        		}
//
//	        		
	        		


//	        		else if (startElement.getName().getLocalPart().equals(PUBLISH)) {
//	            		
//	            		System.out.println("Hello world " + startElement.getName().getLocalPart().toString());
//	        		
//	        		}
	        		
	        	}
	        	
	        }
	        

		}catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
		
		return items;
	}
}
