package org.example;

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        int month = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número que desea usar: "));

        if (month == 1){
            JOptionPane.showMessageDialog(null, "Este número pertenece al mes de enero y al primer cuatrimestre del año.");
        }
        if (month == 2){
            JOptionPane.showMessageDialog(null, "Este número pertenece al mes de febrero y al primer cuatrimestre del año.");
        }
        if (month == 3){
            JOptionPane.showMessageDialog(null, "Este número pertenece al mes de marzo y al primer cuatrimestre del año.");
        }
        if (month == 4){
            JOptionPane.showMessageDialog(null, "Este número pertenece al mes de abril y al primer cuatrimestre del año.");
        }
        if (month == 5){
            JOptionPane.showMessageDialog(null, "Este número pertenece al mes de mayo y al segundo cuatrimestre del año.");
        }
        if (month == 6){
            JOptionPane.showMessageDialog(null, "Este número pertenece al mes de junio y al segundo cuatrimestre del año.");
        }
        if (month == 7){
            JOptionPane.showMessageDialog(null, "Este número pertenece al mes de julio y al segundo cuatrimestre del año.");
        }
        if (month == 8){
            JOptionPane.showMessageDialog(null, "Este número pertenece al mes de agosto y al segundo cuatrimestre del año.");
        }
        if (month == 9){
            JOptionPane.showMessageDialog(null, "Este número pertenece al mes de septiembre y al tercer cuatrimestre del año.");
        }
        if (month == 10){
            JOptionPane.showMessageDialog(null, "Este número pertenece al mes de octubre y al tercer cuatrimestre del año.");
        }
        if (month == 11){
            JOptionPane.showMessageDialog(null, "Este número pertenece al mes de noviembre y al tercer cuatrimestre del año.");
        }
        if (month == 12){
            JOptionPane.showMessageDialog(null, "Este número pertenece al mes de diciembre y al tercer cuatrimestre del año.");
        }
        else if ((month >= 13) || (month <= 0)) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido e inicie el programa nuevamente.");}
    }
}