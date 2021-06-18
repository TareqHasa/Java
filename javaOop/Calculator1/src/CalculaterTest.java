
public class CalculaterTest {

	public static void main(String[] args) {
		Calculator firsCalculation=new Calculator();
		firsCalculation.setOperandOne(10.5);
		firsCalculation.setOperandTwo(5.2);
		firsCalculation.setOperation("+");
		firsCalculation.getResults();
		
		Calculator secCalculation=new Calculator();
		secCalculation.setOperandOne(10.5);
		secCalculation.setOperandTwo(5.2);
		secCalculation.setOperation("-");
		secCalculation.getResults();

	}

}
