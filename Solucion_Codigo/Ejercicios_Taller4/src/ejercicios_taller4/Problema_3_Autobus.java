package ejercicios_taller4;

/**
 *
 * @author paulo
 */
public class Problema_3_Autobus {

    public String nombre;
    public String grado;
    public boolean permisoV;

    public Problema_3_Autobus(String nombre, String grado, int permisoVigente) {
        this.nombre = nombre;
        this.grado = grado;
        this.permisoV = (permisoVigente == 1);
    }

    public boolean permiso() {
        return permisoV;
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre
                + "\nGrado: " + grado;
    }
}
