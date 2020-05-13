
public class Logger {

	   //create an object of SingleObject
	   private static Logger instance = new Logger();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private Logger(){}

	   //Get the only object available
	   public static Logger getInstance(){
	      return instance;
	   }

	   public void error(String message){
	      System.out.println("[ ERROR ] "+ message);
	   }
	   public void info(String message){
		      System.out.println("[ INFO ] "+ message);
	}

}
