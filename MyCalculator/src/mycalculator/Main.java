/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculator;

/**
 *
 * @author anmontero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create calculator implementation
        System.out.println("Git Calculator!");
        System.out.println("Calculadora Natalia Gaona: ");
        Calculadora_NGS calculadoraNGS= new Calculadora_NGS();
        System.out.println("Suma: " + calculadoraNGS.add(6,3));
        System.out.println("Mutiplicación: " +calculadoraNGS.multiply(6,3));
        System.out.println("División: " +calculadoraNGS.divide(6,3));
        System.out.println("Resta: " +calculadoraNGS.substract(6,3));
        Calculadora_SV probarSuma = new Calculadora_SV();
        System.out.println("el resultado de la suma de la calculadora_SV es: " + probarSuma.add(5,7));
        Calculadora_JSVT probarResta = new Calculadora_JSVT();
        System.out.println("el resultado de la resta de la calculadora_JSVT es: " + probarResta.substract(10,6));
        Calculadora_LSJB probarDivision = new Calculadora_LSJB();
        System.out.println("el resultado de la division de la calculadora_LSJB es: " + probarDivision.divide(10,5));

        //Pruebas DMHP números (15,4)
        Calculadora_DMHP Multiplicacion = new Calculadora_DMHP();
        System.out.println("el resultado de la multiplicación de la calculadora_DMHP es: " + Multiplicacion.multiply(15,4));
        Calculadora_DMHP Division = new Calculadora_DMHP();
        System.out.println("el resultado de la Division de la calculadora_DMHP es: " + Divsion.divide(15,4));
        Calculadora_DMHP Resta = new Calculadora_DMHP();
        System.out.println("el resultado de la Resta de la calculadora_DMHP es: " + Resta.substract(15,4));
        Calculadora_DMHP Suma = new Calculadora_DMHP();
        System.out.println("el resultado de la Suma de la calculadora_DMHP es: " + Suma.add(15,4));

        System.out.println("\nPrueba DSCG con 6 y 3.");
        Calculadora_DSCG calculadora= new Calculadora_DSCG();
        System.out.println("Suma: " + calculadora.add(6,3));
        System.out.println("Mutiplicacion: " +calculadora.multiply(6,3));
        System.out.println("Division: " +calculadora.divide(6,3));
        System.out.println("Resta: " +calculadora.substract(6,3));

    }

}
