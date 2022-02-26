package mycalculator;

///Quiz 1 GIT Sebastian Vergara.

public class Calculadora_SV implements ICalculator{

    @Override
    public double add(double a, double b) {
        return a+b; //returns the addition of a + b
    }

    @Override
    public double multiply(double a, double b) {
        return a*b; //returns the multiplication of a * b
    }

    @Override
    public double divide(double a, double b) {
        return a/b; //returns the division of a / b
    }

    @Override
    public double substract(double a, double b) {
        return a-b; //returns the substraction of a - b
    }

    @Override
    public String about() {
        return "Calculator implemented by "+ Authors.GDS;
    }
}
