package ejercicios_taller4;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Problema_3_Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de estudiantes: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        Problema_3_Autobus[] estudiantes = new Problema_3_Autobus[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nEstudiante: " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Grado: ");
            String grado = sc.nextLine();

            System.out.print("Permiso: \n1 = SI \n2 = NO: ");
            int opcionPermiso = sc.nextInt();
            sc.nextLine();

            estudiantes[i] = new Problema_3_Autobus(nombre, grado, opcionPermiso);
        }

        int aceptados = 0;
        int rechazados = 0;

        System.out.println("\nVerificación de permiso");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(estudiantes[i].toString());

            if (estudiantes[i].permiso()) {
                System.out.println("Permiso: Sí");
                System.out.println("Puede usar el bus\n");
                aceptados++;
            } else {
                System.out.println("Permiso: No");
                System.out.println("No puede usar el bus\n");
                rechazados++;
            }
        }

        System.out.println("Permisos aceptados: " + aceptados);
        System.out.println("Permisos rechazados: " + rechazados);

        sc.close();
    }
}
