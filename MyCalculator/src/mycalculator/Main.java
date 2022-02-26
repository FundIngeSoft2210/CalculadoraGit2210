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
        Calculadora_DMHP probarMultiplicacion = new Calculadora_DMHP();
        System.out.println("el resultado de la multiplicación de la calculadora_DMHP es: " + probarMultiplicacion.multiply(15,4));
    }
    
}
