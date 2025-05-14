package ejercicios_taller4;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Problema_5_Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas personas desea registrar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        Problema_5_Gym gimnasio = new Problema_5_Gym(cantidad);

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nPersona #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();

            System.out.print("Duración de ejercicio (min): ");
            int duracion = sc.nextInt();

            System.out.print("Tipo de ejercicio (1 = Cardio, 2 = Pesas, 3 = Crossfit): ");
            int tipo = sc.nextInt();
            sc.nextLine();

            Problema_5_Cliente persona = new Problema_5_Cliente(nombre, peso, duracion, tipo);
            gimnasio.registrarPersona(persona);
        }

        gimnasio.mostrarResultados();

        sc.close();
    }
}

