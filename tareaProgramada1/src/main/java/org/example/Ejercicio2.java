package org.example;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        int age = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese su edad en años: "));

        if (age > 0 && age <= 5) {
            JOptionPane.showMessageDialog(null, "Usted pertenece a la población de primera infancia.");
        }
        if (age >= 6 && age <= 11) {
            JOptionPane.showMessageDialog(null, "Usted pertenece a la población de infancia.");
        }
        if (age >=12 && age <= 18){
            JOptionPane.showMessageDialog(null, "Usted pertenece a la población adolescente.");
        }
        if (age >=19 && age <= 30){
            JOptionPane.showMessageDialog(null, "Usted pertenece a la población de juventud.");
        }
        if (age >=31 && age <= 59){
            JOptionPane.showMessageDialog(null, "Usted pertenece a la población adulta.");
        }
        if (age >=60){
            JOptionPane.showMessageDialog(null, "Usted pertenece a la población adulta mayor.");
        }

        else if (age <= 0) {
            JOptionPane.showMessageDialog(null, "Ingrese una edad válida e inicie el programa nuevamente.");}
    }
}