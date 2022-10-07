package org.example;

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {

    float lapAvg= 0;
    float pitsAvg = 0;

    for (int i = 1; i <= 10;i++) {
        int lap = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo de la vuelta numero "+ i +": "));
        int pits = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en los pits de la vuelta numero "+ i +": "));
        lapAvg = lap+lapAvg;
        pitsAvg = pits+pitsAvg;
        }
    JOptionPane.showMessageDialog(null, "El tiempo promedio de vuelta fué de "+lapAvg/10);
    JOptionPane.showMessageDialog(null, "El tiempo promedio en los pits fué de "+pitsAvg/10);
    JOptionPane.showMessageDialog(null, "El porcentaje de tiempo de vuelta ocupado por pits fué de "+(pitsAvg/lapAvg)*100+"%");
    }
}