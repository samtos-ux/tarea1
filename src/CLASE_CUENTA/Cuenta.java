package CLASE_CUENTA;

/**
 * @author Samuel Santos Garcia
 * @author Ana Xiluva Simango
 * @author Sara Fernández Agudo
 * @author carlota Moreno García
 */
/*
 * Link del ejercicio: http://puntocomnoesunlenguaje.blogspot.com/2015/04/ejercicio-basico-poo-java.html
 */
import java.util.Scanner;

/*
 * Crea una clase Cuenta con los m�todos ingreso, reintegro y transferencia. 
 * La clase contendr� un constructor por defecto, un constructor con par�metros, 
 * un constructor copia y los m�todos getters y setters.
 */
public class Cuenta {
	// Atributos
	private String nombCli;
	private String numCuenta;
	private double tipoInteres;
	private double saldo;

	// Constructor por defecto
	public Cuenta() {
//		nombCli = "Alberto";
//		numCuenta = "NL18RABO6266038226";
//		tipoInteres = 3.5;
//		saldo = 87.40;
	}

	// Constructor copia
	public Cuenta(Cuenta obj) {
		this.nombCli = obj.getNombCli();
		this.numCuenta = obj.getNumCuenta();
		this.tipoInteres = obj.getTipoInteres();
		this.saldo = obj.getSaldo();
	}

	// Constructor con parametros
	public Cuenta(String nombCli, String numCuenta, double tipoInteres, double saldo) {
		this.nombCli = nombCli;
		this.numCuenta = numCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}

	/*
	 * Metodo Ingreso: true si la operaci�n se ha podido realizar o false en caso
	 * contrario
	 */
	public boolean ingreso(double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Metodo Reintregro: true si la operaci�n se ha podido realizar o false en caso
	 * contrario
	 */
	public boolean reintegro(double cantidad) {
		if ((saldo - cantidad) >= 0) {
			saldo -= cantidad;
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Metodo Transferencia: si hay saldo suficiente, le retiramos el importe y
	 * despues se lo ingresamos a la cuenta destino.
	 */
	public void transferencia(Cuenta cuentaDestino, double importe) {
		if (reintegro(importe)) {
			cuentaDestino.ingreso(importe);
		}
	}

	public String getNombCli() {
		return nombCli;
	}

	public void setNombCli(String nombCli) {
		this.nombCli = nombCli;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
