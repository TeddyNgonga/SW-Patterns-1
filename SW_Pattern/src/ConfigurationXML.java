


import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class ConfigurationXML {


		
	    private String Name;
	    private String Origin;
	    private String Type;
	    private int Max;
	    private int Min;
	    private int Default;

	    public String getName() {
	        return Name;
	    }
	    public void setName(String Name) {
	        this.Name = Name;
	    }
	    public String getOrigin() {
	        return Origin;
	    }
	    public void setOrigin(String Origin) {
	        this.Origin = Origin;
	    }
	    public String getType() {
	        return Type;
	    }
	    public void setType(String Type) {
	        this.Type = Type;
	    }
	    public int getMax() {
	        return Max;
	    }
	    public void setMax(int Max) {
	        this.Max = Max;
	    }
	    public int getMin() {
	        return Min;
	    }
	    public void setMin(int Min) {
	        this.Min = Min;
	    }

	    public int getDefault() {
	        return Default;
	    }
	    public void setDefault(int Default) {
	        this.Default = Default;
	    }

	    
	    @Override
	    public String toString() {
	        return "Configuration [name =" + Name + ", Origin=" + Origin + ", type="
	                + Type + ", max=" + Max + ", min=" + Min + ", default="+ Default +" ] ";
	    }
	

}

