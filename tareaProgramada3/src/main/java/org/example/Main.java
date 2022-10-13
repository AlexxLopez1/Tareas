package org.example;
import javax.swing.*;
public class Main {
    public static void main(String[] args){
        Estudiantes.registrarEstudiante();
        Estudiantes.actualizarIdentificacionEstudiante();
        Estudiantes.actualizarEdadEstudiante();
        Estudiantes.actualizarSeguroSocialEstudiante();
        Estudiantes.actualizarDireccionEstudiante();
        Estudiantes.actualizarEncargadoLegal1();
        Estudiantes.actualizarEncargadoLegal2();
        Estudiantes.actualizarEncargadoLegal3();
        Estudiantes.cambiarSeccion();

        int sel = Integer.parseInt(JOptionPane.showInputDialog("Escriba 1 si desea ver los datos ingresados: "));
        if(sel==1){
            Estudiantes.datosEstudiantes();
        }
    }
}
