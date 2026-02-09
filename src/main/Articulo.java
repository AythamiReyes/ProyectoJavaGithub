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

    public boolean agregarArticulo(Articulo articulo){
        if (numArticulos >= 5){
            System.out.println("No se pueden agregar más artículos.");
            return false;
        }
        articulos[numArticulos++] = articulo;
        numArticulos++;
        return true;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < numArticulos; i++){
            total += articulos[i].getSubtotal();
        }
        return total;
    }
}