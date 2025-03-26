
package Reto4;

public class Main {
 
	public static void main(String[] args) {
 
		System.out.println("\tProbando cuenta TarjetaDebito...");
		TarjetaDebito debito = new TarjetaDebito(100);
		System.out.println("Saldo inicial: " + debito.getSaldo());
		System.out.println("Intentando retirar una cantidad de 150...");
		debito.retirar(150);
		System.out.println("Aumentando saldo para poder cubrir la retirada...");
		debito.depositar(100);
		debito.retirar(150);
		System.out.println("Saldo final tras retirar: " + debito.getSaldo());
 
		System.out.println("\n\n\tProbando cuenta TarjetaCredito...");
		TarjetaCredito credito = new TarjetaCredito(300);
		System.out.println("Deuda inicial: " + credito.getSaldo());
		System.out.println("Aumentando deuda y aplicando intereses...");
		credito.depositar(200);
		credito.sumaInteres();
		System.out.println("Saldo final: " + credito.getSaldo());
 
		System.out.println("\n\n\tProbando CuentaAhorro...");
		CuentaAhorro ahorro = new CuentaAhorro(1000);
		System.out.println("Saldo inicial: " + ahorro.getSaldo());
		System.out.println("Aumentando la inversión...");
		ahorro.invertir();
		System.out.println("Saldo final: " + ahorro.getSaldo());
 
		System.out.println("\n\t\tFIN DE PROGRAMA");
 
	}
 
}
