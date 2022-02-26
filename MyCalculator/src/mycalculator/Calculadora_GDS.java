package mycalculator;

//Calculadora Gabriel De Souza
public class Calculadora_DSCG implements ICalculator {

	@Override
	public double add(double a, double b) {
		return a+b; //returns the sum of a+b
	}

	@Override
	public double multiply(double a, double b) {
		return a*b; //returns the product of a+b
	}

	@Override
	public double divide(double a, double b) {
		return a/b; //returns the dividend of a+b
	}

	@Override
	public double substract(double a, double b) {
		return a-b; //returns the rest of a-b
	}

	@Override
	public String about() {
		return "Calculator implemented by the awesome "+Authors.GDS;
	}

}
