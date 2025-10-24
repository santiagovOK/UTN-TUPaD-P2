package actividad1;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Actividad1Main {

    public static void main(String[] args) {

        System.out.println("1. Creación de Entidades");
        // 1. Creamos el cliente
        // El cliente se crea primero porque el Pedido depende de él
        Cliente cliente1 = new Cliente("Santiago Varela", "santiago.varela@email.com");

        // 2. Creamos el pedido, inyectando la dependencia Notificable
        // Pedido solo conoce la interfaz Notificable, no la clase Cliente
        Pedido pedido1 = new Pedido(cliente1);

        // 3. Creamos y agregamos productos al pedido
        pedido1.agregarProducto(new Producto("Teclado Mecánico", 150.00));
        pedido1.agregarProducto(new Producto("Mouse Óptico", 45.50));
        pedido1.agregarProducto(new Producto("Monitor 24 pulgadas", 220.00));

        // 4. Calculamos el total usando la interfaz Pagable
        double totalPedido = pedido1.calcularTotal();
        System.out.println("\nTotal del pedido: $" + (totalPedido));

        System.out.println("\n=============================================");
        System.out.println("2. Simulación de Pago con PayPal ");

        // 5. Creamos una instancia de Pago (PayPal)
        Pago medioDePagoPayPal = new PayPal("santiago.varela@email.com");

        // 6. Procesamos el pago
        // El main (controlador) conecta el Pagable (pedido) con el Pago (paypal)
        medioDePagoPayPal.procesarPago(totalPedido);

        // 7. Cambiamos el estado del pedido (esto disparará la notificación)
        pedido1.cambiarEstado("Procesado con PayPal");

        System.out.println("\n=============================================");
        System.out.println("3. Simulación de Pago con Tarjeta de Crédito (con Descuento)");

        // 8. Creamos una instancia de PagoConDescuento (TarjetaCredito)
        // Usamos la interfaz más específica
        PagoConDescuento medioDePagoTarjeta = new TarjetaCredito("1234-5678-9012-3456", 0.10); // 10% descuento

        // 9. Aplicamos el descuento
        double totalConDescuento = medioDePagoTarjeta.aplicarDescuento(totalPedido);

        // 10. Procesamos el pago con el monto ya descontado
        medioDePagoTarjeta.procesarPago(totalConDescuento);

        // 11. Cambiamos el estado nuevamente
        pedido1.cambiarEstado("Procesado con Tarjeta y Enviado");
    }
}
