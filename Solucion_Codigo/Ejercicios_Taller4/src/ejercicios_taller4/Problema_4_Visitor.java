package ejercicios_taller4;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Problema_4_Visitor {

    public String nombre;
    public int edad;
    public double altura;
    public boolean accesoPermitido;

    public Problema_4_Visitor(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.accesoPermitido = false;
    }

    public void verificarAcceso() {
        if (edad >= 12 && altura >= 1.4) {
            accesoPermitido = true;
        }
    }

    public boolean tieneAcceso() {
        return accesoPermitido;
    }

    public String toString() {
        String estado = accesoPermitido ? "ACCESO PERMITIDO" : "ACCESO DENEGADO";
        return "Nombre: " + nombre
                + "\nEdad: " + edad
                + "\nAltura: " + altura + " m"
                + "\nEstado: " + estado;
    }
}
