import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PartsFactory{

		public String name = "";
	
	   //use getShape method to get object of type shape 
	   public Configuration getShape(String nameType, String productID, String filePath) throws ParserConfigurationException, SAXException, IOException, XMLStreamException{
		    setName(nameType);
			//Get Document Builder
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			 
			//Build Document
			Document document = builder.parse(new File(filePath));
			//Normalize the XML Structure; It's just too important !!
			document.getDocumentElement().normalize();
	
			
	      if(nameType == null){
	         return null;
	      }		
	      if(nameType.equalsIgnoreCase("GPS") && productID.equalsIgnoreCase("2")){
	    	  
	  		ParserXML parserFMS = new ParserXML(productID);
			NodeList nListFMS = document.getElementsByTagName(nameType);
			parserFMS.visitChildNodes(nListFMS);
	        return parserFMS;
	         
	      }else if(nameType.equalsIgnoreCase("GPS") && productID.equalsIgnoreCase("3")) {
		  		ParserXML parserFMS = new ParserXML(productID);
				NodeList nListFMS = document.getElementsByTagName(nameType);
				parserFMS.visitChildNodes(nListFMS);
		        return parserFMS;
	    	  
	      }else if(nameType.equalsIgnoreCase("IRS")) {
		  		ParserXML parserFMS = new ParserXML(productID);
				NodeList nListFMS = document.getElementsByTagName(nameType);
				parserFMS.visitChildNodes(nListFMS);
		        return parserFMS;
	    	  
	      }else if(nameType.equalsIgnoreCase("FMS")) {
		  		ParserXML parserFMS = new ParserXML(productID);
				NodeList nListFMS = document.getElementsByTagName(nameType);
				parserFMS.visitChildNodes(nListFMS);
		        return parserFMS;
	    	  
	      }else if(nameType.equalsIgnoreCase("Engine")) {
		  		ParserXML parserFMS = new ParserXML(productID);
				NodeList nListFMS = document.getElementsByTagName(nameType);
				parserFMS.visitChildNodes(nListFMS);
		        return parserFMS;
	    	  
	      }
	      
	      
	      return null;
	   }
	   
	   public String getName() {
		   
		   return name;
	   }
	   public void setName(String _name) {
		   
		    name = _name;
	   }

}
