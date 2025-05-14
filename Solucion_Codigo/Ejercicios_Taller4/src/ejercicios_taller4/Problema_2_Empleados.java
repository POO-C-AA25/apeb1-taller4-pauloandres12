package ejercicios_taller4;

/**
 *
 * @author paulo
 */
public class Problema_2_Empleados {

    public String nombre;
    public double salario;
    public int edad;
    public double aumentoSalarial;
    public double promedio;
    public double sumaSalarios;
    public int porcentaje;

    public Problema_2_Empleados() {
    }

    public Problema_2_Empleados(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getSalario() {
        return this.salario;
    }

    public int getEdad() {
        return this.edad;
    }

    public double calcularSalario(Problema_2_Empleados[] empleados, int cn) {
        this.sumaSalarios += empleados[cn].getSalario();
        return this.sumaSalarios;
    }

    public double calcularPromedioSalarios(Problema_2_Empleados[] empleados, double suma) {
        this.promedio = suma / empleados.length;
        return this.promedio;
    }

    public double aumento(int porcentaje) {
        this.porcentaje = porcentaje;
        if (this.salario < this.promedio) {
            this.aumentoSalarial = (this.salario * (this.porcentaje / 100.0));
            return this.aumentoSalarial = this.salario + this.aumentoSalarial;
        }
        return this.aumentoSalarial = 0;

    }

    @Override
    public String toString() {
        return "\nNombre del Empleado: " + this.nombre
                + "\nSalario: " + this.salario
                + "\nEdad: " + this.edad
                + "\nSalario Promedio: " + this.promedio
                + "\nAumento del Salario: " + this.aumentoSalarial;
    }
}
