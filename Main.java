public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Ordenador", 799.99, 5);

        System.out.println("Información inicial del producto:");
        producto.mostrarInformacion();

        producto.setPrecio(749.99);

        System.out.println("\nInformación actualizada del producto:");
        producto.mostrarInformacion();
    }
}
