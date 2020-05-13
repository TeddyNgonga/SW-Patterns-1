/**
 * 
 */

/**
 * @author 212610402
 *
 */
public abstract class Customer {
	
   private String customerName;
	
   public Customer(String customerName) {
	      this.customerName = customerName;

	}

	 /**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + "]";
	}

	 // Abstract method (does not have a body)
	 public abstract String aircraftName();

}
