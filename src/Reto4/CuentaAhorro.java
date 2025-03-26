
package Reto4;

public class CuentaAhorro extends CuentaBase {
 
	public CuentaAhorro(double apertura) {
		super(apertura);
	}
 
	public void invertir() {
		montoActual += montoActual * 0.10;
	}
}