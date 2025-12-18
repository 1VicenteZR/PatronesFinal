package Solid;

public class PagoTransferencia implements MetodoPago {

    @Override
    public void pagar(double monto) {
        System.out.println("Pago por transferencia por $" + monto);
    }
}
