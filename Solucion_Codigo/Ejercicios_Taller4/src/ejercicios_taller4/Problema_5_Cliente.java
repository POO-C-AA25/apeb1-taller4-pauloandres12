package ejercicios_taller4;

/**
 *
 * @author paulo
 */
public class Problema_5_Cliente {
    public String nombre;
    public double peso;
    public int duracion;
    public int tipoEjercicio; 
    public double calorias;

    public Problema_5_Cliente(String nombre, double peso, int duracion, int tipoEjercicio) {
        this.nombre = nombre;
        this.peso = peso;
        this.duracion = duracion;
        this.tipoEjercicio = tipoEjercicio;
        this.calorias = 0;
    }

    public void calcularCalorias() {
        double factor = 0;
        if (tipoEjercicio == 1) {
            factor = 0.08;
        } else if (tipoEjercicio == 2) {
            factor = 0.06;
        } else if (tipoEjercicio == 3) {
            factor = 0.09;
        }
        calorias = peso * duracion * factor;
    }

    public double getCalorias() {
        return calorias;
    }

    public String toString() {
        String tipo = (tipoEjercicio == 1) ? "Cardio" :
                      (tipoEjercicio == 2) ? "Pesas" : "Crossfit";

        return "Nombre: " + nombre +
               "\nPeso: " + peso + " kg" +
               "\nDuración: " + duracion + " min" +
               "\nEjercicio: " + tipo +
               "\nCalorías quemadas: " + String.format("%.2f", calorias);
    }
}
