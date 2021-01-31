package Implementacion1;
import java.util.Scanner;

public class Main{
	
	private final static int ESPERA = 50;

	public static void main(String[] args) {
		System.out.println("Introduzca el limite superior");
		Integer entradaTeclado;
		Scanner entradaEscaner = new Scanner (System.in);
		entradaTeclado = entradaEscaner.nextInt();
		
		Pares primero = new Pares(entradaTeclado, ESPERA);
		Impares segundo = new Impares(entradaTeclado, ESPERA);

		primero.start();
		segundo.start();
	}
}