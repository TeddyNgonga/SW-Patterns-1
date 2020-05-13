import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class ParserXML implements Configuration{
    static final String NAME    = "Name";
    static final String ORIGIN  = "Origin";
    static final String TYPE = "Type";
    static final String MAX = "Max";
    static final String MIN = "Min";
    static final String DEFAULT = "Default";
    static final String SUBSCRIBE = "Subscribe";
    static final String PUBLISH = "Publish";
    static final String FMS = "FMS";

    
    
    public ArrayList<Subscriber> sub = new ArrayList<Subscriber>(); // Create an ArrayList object
    public ArrayList<Publisher> pub = new ArrayList<Publisher>(); // Create an ArrayList object
    public String productID;
    public String tempProductId = "";


	   public ParserXML(String productID) {
		      this.productID = productID;
	
		}
	   
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {

	      int pubIndex;
	      int subIndex;

	      public boolean pubHasNext() {
	      
	         if(pubIndex < pub.size()){
	            return true;
	         }
	         return false;
	      }

	      public Object pubNext() {
	      
	         if(this.pubHasNext()){
	            return pub.get(pubIndex++);
	         }
	         return null;
	      }
	      public boolean subHasNext() {
		      
		         if(subIndex < sub.size()){
		            return true;
		         }
		         return false;
		      }

		      public Object subNext() {
		      
		         if(this.subHasNext()){
		            return sub.get(subIndex++);
		         }
		         return null;
		      }
		      public Object subCurrent() {
		    	  if(this.subHasNext()){
		    		  return sub.get(subIndex);
		    	  }
		    	  return null;
			        
			         
			}
		      public Object pubCurrent() {
		    	  if(this.pubHasNext()){
		    		  return pub.get(pubIndex);
		    	  }
		    	  return null;
			         
			}
		      public String getProductID() {
		    	  
		    	  return productID;
		      }
		      
		      
		      
			/**
			 * @return the Array list of publisher objects
			 */
			public ArrayList<Subscriber> getArrayListOfSubscriber() {
				return sub;
			}
			/**
			 * @return the Array list of publisher objects
			 */
			public ArrayList<Publisher> getArrayListOfPublisher() {
				return pub;
			}
	 	}

		/**
		 * @return the Array list of publisher objects
		 */
		public ArrayList<Subscriber> getArrayListOfSubscriber() {
			return sub;
		}
		
		/**
		 * @return the Array list of publisher objects
		 */
		public ArrayList<Publisher> getArrayListOfPublisher() {
			return pub;
		}
		
		
		/**
		 * clear Array list of publisher objects
		 */
		public void clearArrayListOfPublisher() {
			pub.clear();
		}
		
		/**
		 * clear Array list of subscriber objects
		 */
		public void clearArrayListOfSubscriber() {
			sub.clear();
		}
		
		
		/**
		 * @return the productID
		 */
		public String getProductID() {
			return productID;
		}
		
		
		/**
		 * @param productID the productID to set
		 */
		public void setProductID(String productID) {
			this.productID = productID;
		}
	
	   //This function is called recursively
	   public void visitChildNodes(NodeList nList)
	   {
		   
		   /* Temporary variables for Sub*/
			String tempSubName = "";
			String tempSubOrigin = "";
			String tempSubType = "";
			int tempSubMax = 0;
			int tempSubMin = 0 ;
			int tempSubDefaultValue = 0;

		   /* Temporary variables for Pub*/
			String tempPubName = "";
			String tempPubType = "";
			float tempPubDefaultValue = 0;
			String tempPubOperation = "";
			String tempPubOperand1 = "";
			String tempPubOperand2 = "";
			int tempPubMax = 0;
			int tempPubMin = 0 ;

			
	      for (int temp = 0; temp < nList.getLength(); temp++)
	      {
	         Node node = nList.item(temp);
	         if (node.getNodeType() == Node.ELEMENT_NODE)
	         {
	        	 
	        	 
	        	 try {
	        		 
		        	 if(node.getAttributes().getNamedItem("ProductID").getNodeValue() != null) 
		        		 tempProductId = node.getAttributes().getNamedItem("ProductID").getNodeValue();
		        	 
		        	 
	        	 }
	             catch(NullPointerException e) 
	             { 
	                 //System.out.print("NullPointerException Caught"); 
	             } 

//	        	 if(node.getAttributes().getNamedItem("ProductID"))
	        	 
//	        	 if(node.getNodeName() == "Subscribe") {
////	        		 System.out.println("============================");
//	        		  
//	        	 }

	            //Check all attributes
	            if (node.hasAttributes() ) {
	               // get attributes names and values
	               NamedNodeMap nodeMap = node.getAttributes();
	               for (int i = 0; i < nodeMap.getLength(); i++)
	               {
	                   Node tempNode = nodeMap.item(i);
	                   
//	                   System.out.println("Attr name : " + tempNode.getNodeName()+ "; Value = " + tempNode.getNodeValue());
	                   if(node.getNodeName() == "Subscribe") {    
		                   

	                	   if(tempNode.getNodeName() == "Name") 
	                		   tempSubName = tempNode.getNodeValue();
	                	   else if(tempNode.getNodeName() == "Origin") 
	                		   tempSubOrigin = tempNode.getNodeValue();
	                	   else if(tempNode.getNodeName() == "Type") 
	                		   tempSubType = tempNode.getNodeValue();
	                	   else if(tempNode.getNodeName() == "Max") 
	                		   tempSubMax = Integer.parseInt(tempNode.getNodeValue());
	                	   else if(tempNode.getNodeName() == "Min") 
	                		   tempSubMin = Integer.parseInt(tempNode.getNodeValue());
	                	   else if(tempNode.getNodeName() == "Default") 
	                		   tempSubDefaultValue = Integer.parseInt(tempNode.getNodeValue());
	                	   
	                   }else if (node.getNodeName() == "Publish") {
	                	   if(tempNode.getNodeName() == "Name")
	                		   tempPubName = tempNode.getNodeValue();
	                	   else if(tempNode.getNodeName() == "Type")
	                		   tempPubType = tempNode.getNodeValue();
	                	   else if(tempNode.getNodeName() == "Default")
	                		   tempPubDefaultValue = (float) Float.parseFloat(tempNode.getNodeValue());
	                	   else if(tempNode.getNodeName() == "Operation")
	                		   tempPubOperation = tempNode.getNodeValue();
	                	   else if(tempNode.getNodeName() == "Operand1")
	                		   tempPubOperand1 = tempNode.getNodeValue();
	                	   else if(tempNode.getNodeName() == "Operand2")
	                		   tempPubOperand2 = tempNode.getNodeValue();
	                	   else if(tempNode.getNodeName() == "Max")
	                		   tempPubMax = Integer.parseInt(tempNode.getNodeValue());
	                	   else if(tempNode.getNodeName() == "Min")
	                		   tempPubMin = Integer.parseInt(tempNode.getNodeValue());
	                   }
	                	                      
	               }
	               if (node.hasChildNodes()) 
	            	   visitChildNodes(node.getChildNodes());
	               
	              
	           }
	            if(tempProductId.equals(productID)) {
	            // Finished recursive for pub or subscriber
	            if(node.getNodeName() == "Subscribe") 
	        		 sub.add(new Subscriber(tempSubName,tempSubOrigin, tempSubType, tempSubMax, tempSubMin, tempSubDefaultValue ));
	        		 
	        	 else if(node.getNodeName() == "Publish") 
	        		 pub.add(new Publisher(tempPubName, tempPubType, tempPubDefaultValue, tempPubOperation, tempPubOperand1, tempPubOperand2, tempPubMax, tempPubMin ));
	        	 
	            	
	            }

	            
	            
	         }
	      }
	   }

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		
	    PartsFactory partsFactory = new PartsFactory();
		return partsFactory.getName();
	}

	   
}
