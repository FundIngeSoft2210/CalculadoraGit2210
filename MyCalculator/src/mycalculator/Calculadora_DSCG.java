package mycalculator;

//Calculadora Diana Sof?a Carrillo
public class Calculadora_DSCG implements ICalculator {

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double multiply(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double divide(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public double substract(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public String about() {
		// TODO Auto-generated method stub
		return "Calculator implemented by "+Authors.DSCG;
	}

}
