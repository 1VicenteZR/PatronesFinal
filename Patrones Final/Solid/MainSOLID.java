package Solid;

public class MainSOLID {

    public static void main(String[] args) {

        MetodoPago tarjeta = new PagoTarjeta();
        MetodoPago efectivo = new PagoEfectivo();
        MetodoPago transferencia = new PagoTransferencia();

        ProcesadorPago p1 = new ProcesadorPago(tarjeta);
        p1.procesarPago(800);

        ProcesadorPago p2 = new ProcesadorPago(efectivo);
        p2.procesarPago(300);

        ProcesadorPago p3 = new ProcesadorPago(transferencia);
        p3.procesarPago(1200);
    }
}
