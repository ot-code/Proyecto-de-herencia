
package Reto4;

public class CuentaBase {
 
	protected double montoActual;
 
	public CuentaBase(double apertura) {
		montoActual = apertura;
	}
 
	public double getSaldo() {
		return montoActual;
	}
 
	public void depositar(double cantidad) {
		montoActual += cantidad;
	}
 
}