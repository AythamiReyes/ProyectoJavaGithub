/** @author AlejandroAcosta */
public class Main {
    public static void main(String[] args) {
        Pedido miPedido = new Pedido("Pepe Suarez");

        Articulo art1 = new Articulo("Teclado RGB", 1, 49.99);
        Articulo art2 = new Articulo("Ratón Inalámbrico", 2, 19.50);

        miPedido.agregarArticulo(art1);
        miPedido.agregarArticulo(art2);

        System.out.println("=== SISTEMA DE PEDIDOS ===");
        System.out.println("Cliente: " + miPedido.getCliente());
        System.out.println("Total Pedido: " + miPedido.calcularTotal() + "€");
        System.out.println("Estado actual: " + miPedido.getEstado());

        System.out.println("\nProcesando pedido...");
        miPedido.avanzarEstado();
        System.out.println("Nuevo estado: " + miPedido.getEstado());
    }
}