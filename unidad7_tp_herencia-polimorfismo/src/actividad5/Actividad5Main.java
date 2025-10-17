package actividad5;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Actividad5Main {

    public static void main(String[] args) {
        // Creamos una instancia del procesador de pagos, encargado de manejar la lógica de procesamiento.
        ProcesadorPagos procesador = new ProcesadorPagos();

        // Creación de diferentes medios de pago

        // Instanciamos un pago en Efectivo.
        Pagable pagoEnEfectivo = new Efectivo(1500.0);

        // Instanciamos un pago por Transferencia.
        Pagable pagoPorTransferencia = new Transferencia("CBU-112233-A", "CBU-998877-B", 4500.0);

        // Instanciamos un pago con Tarjeta de Crédito.
        Pagable pagoConTarjeta = new TarjetaCredito("1234-5678-9012-3456", "12/25", "123", 15000.0);

        // Procesamiento de los pagos de forma polimórfica

        // Pasamos cada objeto al mismo método procesarPago.
        // El procesador no necesita saber de qué tipo concreto es cada objeto,solo que cumple con `Pagable`. [cite: 83]
        procesador.procesarPago(pagoEnEfectivo);
        procesador.procesarPago(pagoPorTransferencia);
        procesador.procesarPago(pagoConTarjeta);
    }
}