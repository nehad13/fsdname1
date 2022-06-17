
public class CalculatorClass {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.multiply(10, 20);
	}

}

class Calculator{
	int sum(int n1,int n2){
		int n3= n1+n2;
		return n3;
	}
	int multiply(int n1,int n2){
		return n1*n2;
	}
}