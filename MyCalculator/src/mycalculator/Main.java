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
    }
    
}
