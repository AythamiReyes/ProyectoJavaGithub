//** @author AythamiReyes */

public class Pedido {
    private static int contadorIds = 1;
    private int id;
    private String cliente;
    private Articulo[] articulos;
    private int numArticulos;
    private EstadoPedido estado;

    public Pedido(String cliente) {
        this.id = contadorIds++;
        this.cliente = cliente;
        this.articulos = new Articulo[5];
        this.numArticulos = 0;
        this.estado = EstadoPedido.EN_PREPARACION;
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
