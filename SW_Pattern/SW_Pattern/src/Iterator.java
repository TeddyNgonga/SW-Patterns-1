import java.util.ArrayList;

public interface Iterator {
   public boolean pubHasNext();
   public Object pubNext();
   public boolean subHasNext();
   public Object subNext();
   public Object subCurrent();
   public Object pubCurrent();
   public String getProductID();
   public ArrayList<Subscriber> getArrayListOfSubscriber();
   public ArrayList<Publisher> getArrayListOfPublisher();
   
}