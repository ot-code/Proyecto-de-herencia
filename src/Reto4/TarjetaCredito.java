
package Reto4;

public class TarjetaCredito extends CuentaBase {
 
	public TarjetaCredito(double apertura) {
		super(apertura);
	}
 
	@Override
	public double getSaldo() {
		return montoActual * -1;
	}
 
	public void sumaInteres() {
		montoActual -= montoActual * 0.15;
	}
 
}