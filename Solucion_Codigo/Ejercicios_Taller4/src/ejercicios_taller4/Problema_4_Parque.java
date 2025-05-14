package ejercicios_taller4;

/**
 *
 * @author paulo
 */
public class Problema_4_Parque {

    public Problema_4_Visitor[] visitantes;
    public int contador;

    public Problema_4_Parque(int capacidad) {
        visitantes = new Problema_4_Visitor[capacidad];
        contador = 0;
    }

    public void registrarVisitante(Problema_4_Visitor visitante) {
        if (contador < visitantes.length) {
            visitante.verificarAcceso();
            visitantes[contador] = visitante;
            contador++;
        }
    }

    public void mostrarResultados() {
        int permitidos = 0;
        int rechazados = 0;

        for (int i = 0; i < contador; i++) {
            System.out.println(visitantes[i].toString() + "\n");
            if (visitantes[i].tieneAcceso()) {
                permitidos++;
            } else {
                rechazados++;
            }
        }

        System.out.println("Total permitidos: " + permitidos);
        System.out.println("Total rechazados: " + rechazados);
    }
}
