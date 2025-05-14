package ejercicios_taller4;

/**
 *
 * @author paulo
 */
public class Problema_5_Gym {

    public Problema_5_Cliente[] personas;
    public int contador;

    public Problema_5_Gym(int capacidad) {
        personas = new Problema_5_Cliente[capacidad];
        contador = 0;
    }

    public void registrarPersona(Problema_5_Cliente persona) {
        if (contador < personas.length) {
            persona.calcularCalorias();
            personas[contador] = persona;
            contador++;
        }
    }

    public void mostrarResultados() {
        double total = 0;
        System.out.println("\n--- Resultados individuales ---");
        for (int i = 0; i < contador; i++) {
            System.out.println(personas[i].toString() + "\n");
            total += personas[i].getCalorias();
        }

        System.out.println("--- Resumen total ---");
        System.out.println("Calorías totales quemadas por todos: " + String.format("%.2f", total));
    }
}
