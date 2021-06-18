
public class Calculator {
	private double operandOne;
	private double operandTwo;
	private String operation;
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	private double performOperation() {
		if (getOperation().equals("+")) {
			return operandOne+operandTwo;
		}else if (getOperation().equals("-")) {
			return operandOne - operandTwo ;
		}  
		return 0;
	}
	
	public void getResults() {
		System.out.println(performOperation());
	}
	
}
