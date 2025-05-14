package ejercicios_taller4;

/**
 *
 * @author paulo
 */
public class Problema_1_Ejecutor {

    public static void main(String[] args) {

        Problema_1_Producto producto1 = new Problema_1_Producto(5, 2);
        Problema_1_Producto producto2 = new Problema_1_Producto(3, 4);

        producto1.calcularDescuento();
        producto1.calcularPrecioFinal();
        producto2.calcularDescuento();
        producto2.calcularPrecioFinal();
        System.out.println(producto1.toString());
        System.out.println(producto2.toString());
    }
}
