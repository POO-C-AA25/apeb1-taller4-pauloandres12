package ejercicios_taller4;

/**
 *
 * @author paulo
 */
public class Problema_1_Producto {

    public double precioP;
    public int cantidadP;
    public double descuento;
    public double precioFinal;
    public double montoDescuento;

    public Problema_1_Producto() {
    }

    public Problema_1_Producto(double precioP, int cantidadP) {
        this.precioP = precioP;
        this.cantidadP = cantidadP;
    }

    public double calcularDescuento() {
        this.descuento = (this.precioP >= 1000 && this.cantidadP >= 10) ? (10) : (5);
        this.montoDescuento = (this.cantidadP * this.precioP) * (this.descuento / 100);
        return this.descuento;
    }

    public double calcularPrecioFinal() {
        this.precioFinal = (this.precioP * this.cantidadP) - this.montoDescuento;
        return this.precioFinal;
    }

    @Override
    public String toString() {
        return "\nPrecio del Producto: " + precioP
                + "\nCantidad del Producto: " + cantidadP
                + "\nDescuento: " + descuento
                + "\nMonto Descuento: " + montoDescuento
                + "\nPrecio Final del Prodcuto: " + precioFinal;
    }

}
