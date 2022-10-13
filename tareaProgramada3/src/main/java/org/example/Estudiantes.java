package org.example;
import javax.swing.*;
public class Estudiantes {
    static String nombreEstudiante;
    static String seccion;
    static String identificacionEstudiante;
    static String numeroSeguroSocialEstudiante;
    static int edadEstudiante;
    static String fechaDeNacimientoEstudiante;
    static String direccionEstudiante;
    static boolean suspendido;
    static boolean adecuacion;
    static boolean necesidadesEspeciales;
    static String necesidadesE[] = {};
    static String encargadoLegal1;
    static String encargadoLegal2;
    static String encargadoLegal3;

    public static void registrarEstudiante() {

        nombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
        fechaDeNacimientoEstudiante = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del estudiante: ");

    }
    public static void datosEstudiantes() {
        JOptionPane.showMessageDialog(null, "Datos del estudiante: "+
                "\nNombre: "+nombreEstudiante+
                "\nseccion: "+seccion+
                "\nidentificacion: "+identificacionEstudiante+
                "\nnumero de seguro: "+numeroSeguroSocialEstudiante+
                "\nedad: "+edadEstudiante+
                "\nfecha de nacimiento: "+ fechaDeNacimientoEstudiante+
                "\ndireccion: "+direccionEstudiante+
                "\nencargados legales: "+encargadoLegal1+", "+encargadoLegal2+", "+encargadoLegal3);
    }
    public static void cambiarSeccion() {
        seccion = JOptionPane.showInputDialog("Ingrese la seccion asignada al estudiante: ");
    }

    public static void actualizarDireccionEstudiante() {
        direccionEstudiante = JOptionPane.showInputDialog("Ingrese la direccion del estudiante: ");
    }

    public static void eliminarEstudiante() {

    }

    public static void cambiarNombreEstudiante() {
        nombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
    }

    public static void actualizarIdentificacionEstudiante() {
        identificacionEstudiante = JOptionPane.showInputDialog("Ingrese el numero de identificacion del estudiante: ");
    }

    public static void actualizarSeguroSocialEstudiante () {
        numeroSeguroSocialEstudiante = JOptionPane.showInputDialog("Ingrese el numero de seguro del estudiante: ");
    }

    public static void actualizarEdadEstudiante() {
        edadEstudiante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante: "));
    }

    public static void actualizarEncargadoLegal1() {
        encargadoLegal1 = JOptionPane.showInputDialog("Ingrese el nombre de un encargado legal: ");
    }

    public static void actualizarEncargadoLegal2() {
        encargadoLegal2 = JOptionPane.showInputDialog("Ingrese el nombre de un segundo encargado legal: ");
    }

    public static void actualizarEncargadoLegal3() {
        encargadoLegal3 = JOptionPane.showInputDialog("Ingrese el nombre de un tercer encargado legal: ");
    }

    public static void cambiarEstadoSuspension() {

    }

    public static void cambiarEstadoAdecuacion() {

    }

    public static void actualizarNecesidadesEspeciales() {

    }


}
