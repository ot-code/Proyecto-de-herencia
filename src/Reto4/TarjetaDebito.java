
package Reto4;

public class TarjetaDebito extends CuentaBase {
 
	public TarjetaDebito(double apertura) {
		super(apertura);
	}
 
    public boolean retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser positiva");
            return false;
        } else if (cantidad > montoActual) {
            System.out.println("No hay suficiente saldo para cubrir la retirada");
            return false;
        } else {
            montoActual -= cantidad;
            return true;
        }
    }
}
