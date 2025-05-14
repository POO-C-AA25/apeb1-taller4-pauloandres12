package ejercicios_taller4;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Problema_2_Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc, porcentaje;
        double suma = 0;
        double promedio = 0;

        Problema_2_Empleados[] empleados = new Problema_2_Empleados[2];
        empleados[0] = new Problema_2_Empleados();
        empleados[1] = new Problema_2_Empleados();

        do {
            System.out.println("\nEscoja una opcion:");
            System.out.println("[1] Agregar Empleado");
            System.out.println("[2] Mostrar Informacion de los Empleados");
            System.out.println("[3] Calcular Aumento de Salario");
            System.out.println("[0] Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    for (int i = 0; i < empleados.length; i++) {
                        sc.nextLine();
                        System.out.println("\nEmpleado N.-" + (i + 1));
                        System.out.print("Ingrese su Nombre: ");
                        empleados[i].setNombre(sc.nextLine());
                        System.out.print("Ingrese su Salario: ");
                        empleados[i].setSalario(sc.nextDouble());
                        System.out.print("Ingrese su Edad: ");
                        empleados[i].setEdad(sc.nextInt());
                    }
                    break;
                case 2:
                    for (int i = 0; i < empleados.length; i++) {
                        System.out.println("\nEmpleado N.-" + (i + 1));
                        System.out.println(empleados[i].toString());

                    }
                    break;
                case 3:
                    System.out.print("Ingrese el Porcentaje de Aumento: ");
                    porcentaje = sc.nextInt();
                    for (int i = 0; i < empleados.length; i++) {
                        suma += empleados[i].calcularSalario(empleados, i);
                    }
                    for (int i = 0; i < empleados.length; i++) {
                        empleados[i].calcularPromedioSalarios(empleados, suma);
                    }
                    for (int i = 0; i < empleados.length; i++) {
                        empleados[i].aumento(porcentaje);
                    }

            }
        } while (opc != 0);
    }

}
