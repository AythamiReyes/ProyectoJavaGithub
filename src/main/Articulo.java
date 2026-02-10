//** @author AythamiReyes */

public class Articulo {

    private String nombre;
    private int cantidad;
    private double precioUnidad;

    public Articulo(String nombre, int cantidad, double precioUnidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public double getSubtotal() {
        return cantidad * precioUnidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }
    
}