public class Inventario {
    public static int calcularSubtotal(int precio,int cantidad){
        // Código para el inventario
        return precio * cantidad;
    }
    public static void main(String[] args) {
        // Código para el inventario
        int precio = 50;
        int cantidad = 4;
        int valorTotal = calcularSubtotal(precio, cantidad);
        System.out.println("Subtotal: " + valorTotal);
    }
}
