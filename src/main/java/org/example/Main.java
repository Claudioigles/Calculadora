package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

       JOptionPane.showMessageDialog(null,"Calculadora");

        float numero1,numero2, resultado;

        int operacion;







        do{
            numero1= Float.parseFloat(JOptionPane.showInputDialog("Ingrese numero1:")) ;
            numero2= Float.parseFloat(JOptionPane.showInputDialog("Ingrese numero2:")) ;
            operacion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una operación:\n1_Suma\n2_Resta\n3_Multiplicacion\n4_Division\n5_Exit"));



            if (operacion==1 ){
                resultado=suma(numero1,numero2);
                JOptionPane.showMessageDialog(null, "Resultado de la suma: " + resultado);
            } else if (operacion == 2 ) {
                resultado = resta(numero1, numero2);
                JOptionPane.showMessageDialog(null, "Resultado de la resta: " + resultado);
            } else if (operacion == 3) {
                resultado = multiplicacion(numero1, numero2);
                JOptionPane.showMessageDialog(null, "Resultado de la multiplicación: " + resultado);
            } else if (operacion ==4 ) {
                if (numero2 != 0 ) {

                    resultado = division(numero1, numero2);
                    JOptionPane.showMessageDialog(null, "Resultado de la división: " + resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se puede dividir por cero.");
                }
            } else if (operacion == 5 ) {
                // Salir del bucle
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
            }






        }while(operacion!=5);



    }
    private static float suma(float numero1, float numero2){
        float resultado;

        resultado=numero1+numero2;


        return resultado;
    }
    private static float resta(float numero1, float numero2){
        float resultado;

        resultado=numero1-numero2;


        return resultado;
    }
    private static float multiplicacion(float numero1, float numero2){
        float resultado;

        resultado=numero1*numero2;


        return resultado;
    }
    private static float division(float numero1, float numero2){
        float resultado;

        resultado=numero1/numero2;


        return resultado;
    }


}