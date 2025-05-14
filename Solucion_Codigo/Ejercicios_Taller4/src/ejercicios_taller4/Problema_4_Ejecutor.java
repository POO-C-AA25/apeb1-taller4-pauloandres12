package ejercicios_taller4;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Problema_4_Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese numero de visitantes: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        Problema_4_Parque parque = new Problema_4_Parque(cantidad);

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nVisitante: " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();

            System.out.print("Altura (en metros): ");
            double altura = sc.nextDouble();
            sc.nextLine();

            Problema_4_Visitor visitante = new Problema_4_Visitor(nombre, edad, altura);
            parque.registrarVisitante(visitante);
        }

        parque.mostrarResultados();

        sc.close();
    }
}
