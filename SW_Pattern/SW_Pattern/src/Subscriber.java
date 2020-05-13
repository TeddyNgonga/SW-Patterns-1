
public class Subscriber {
	private String name;
	private String origin;
	private String type;
	private int max;
	private int min;
	private int defaultValue;

   public Subscriber(String name, String origin, String type, int max, int min, int defaultValue) {
	      this.name = name;
	      this.origin = origin;
	      this.type = type;
	      this.max = max;
	      this.min = min;
	      this.defaultValue = defaultValue;

	}


		/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	
	
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}
	
	
	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}
	
	
	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}
	
	
	/**
	 * @param min the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}
	
	
	/**
	 * @return the defaultValue
	 */
	public int getDefaultValue() {
		return defaultValue;
	}
	
	
	/**
	 * @param defaultValue the defaultValue to set
	 */
	public void setDefaultValue(int defaultValue) {
		this.defaultValue = defaultValue;
	}
	

	@Override
	public String toString() {
		return "Subscriber [name=" + name + ", origin=" + origin + ", type=" + type + ", max=" + max + ", min=" + min
				+ ", defaultValue=" + defaultValue + "]";
	}

}
