
public class Publisher {
	
	private String name;
	private String type;
	private float defaultValue;
	private String operation;
	private String operand1;
	private String operand2;
	private int max;
	private int min;
	

	public Publisher(String name, String type, float defaultValue,  String operation, String operand1, String operand2, int max, int min ) {
		      this.name = name;
		      this.type = type;
		      this.defaultValue = defaultValue;
		      this.operation = operation;
		      this.operand1 = operand1;
		      this.operand2 = operand2;
		      this.max = max;
		      this.min = min;
	
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
	 * @return the defaultValue
	 */
	public float getDefaultValue() {
		return defaultValue;
	}



	/**
	 * @param defaultValue the defaultValue to set
	 */
	public void setDefaultValue(int defaultValue) {
		this.defaultValue = defaultValue;
	}



	/**
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}



	/**
	 * @param operation the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}



	/**
	 * @return the operand1
	 */
	public String getOperand1() {
		return operand1;
	}



	/**
	 * @param operand1 the operand1 to set
	 */
	public void setOperand1(String operand1) {
		this.operand1 = operand1;
	}



	/**
	 * @return the operand2
	 */
	public String getOperand2() {
		return operand2;
	}



	/**
	 * @param operand2 the operand2 to set
	 */
	public void setOperand2(String operand2) {
		this.operand2 = operand2;
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

	   @Override
		public String toString() {
			return "Publisher [name=" + name + ", type=" + type + ", defaultValue=" + defaultValue + ", operation="
					+ operation + ", operand1=" + operand1 + ", operand2=" + operand2 + ", max=" + max + ", min=" + min
					+ "]";
		}
}
