package unico;

public class Ejercicio15 {

	public static void main(String[] args) {

		/*
		 * Implementa un método que nos diga cuántos dígitos tiene un número entero que
		 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos. No se
		 * permite el uso de funciones de cadenas
		 */

		int numero;
		int digitos = 0;
		String cadena;
		do {
			numero = Util.leerInt("Introduzca el número (máximo 5 cifras): ");
			digitos = digitosNumero(numero);
		} while (digitos > 5);
		Util.escribir("El número " + numero + " tiene " + digitos + " dígitos");
	}

	public static int digitosNumero(int numero) {
		int num;
		int contador = 0;

		num = (numero < 0) ? (numero * -1) : numero;

		while (num > 0) {
			num = num / 10;
			contador += 1;
		}
		return contador;
	}
}
