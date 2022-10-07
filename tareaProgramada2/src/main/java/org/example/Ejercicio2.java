package org.example;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        float heightAvg = 0;
        int height1 = 0;
        int height2 = 0;
        int height3 = 0;
        int height4 = 0;
        int height5 = 0;
        int hgt1 = 0;
        int hgt2 = 0;
        int hgt3 = 0;
        int hgt4 = 0;
        int hgt5 = 0;
        for (int i = 1; i <= 10; i++) {

            int height = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la estatura del niño "+i+": "));
            if (height < 100) {
                hgt1 = height1+1;
                heightAvg = height+heightAvg;
            }
            if (height >= 100 && height <= 120) {
                hgt2 = height2+1;
                heightAvg = height+heightAvg;
            }
            if (height >= 121 && height <= 130) {
                hgt3 = height3+1;
                heightAvg = height+heightAvg;
            }
            if (height >= 131 && height <= 140) {
                hgt4 = height4+1;
                heightAvg = height+heightAvg;
            }
            if (height > 140) {
                hgt5 = height5+1;
                heightAvg = height+heightAvg;
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de niños con estatura menor a 100cm fué de: "+hgt1);
        JOptionPane.showMessageDialog(null, "La cantidad de niños con estatura entre 100cm y 120cm fué de: "+hgt2);
        JOptionPane.showMessageDialog(null, "La cantidad de niños con estatura entre 121cm y 130cm fué de: "+hgt3);
        JOptionPane.showMessageDialog(null, "La cantidad de niños con estatura entre 131cm y 140 fué de: "+hgt4);
        JOptionPane.showMessageDialog(null, "La cantidad de niños con estatura mayor a 140 fué de: "+hgt5);
        JOptionPane.showMessageDialog(null, "El promedio de estatura de los niños fué de: "+heightAvg/10);
    }
}