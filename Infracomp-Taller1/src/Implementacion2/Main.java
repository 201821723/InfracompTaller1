package Implementacion2;
import java.util.Scanner;

public class Main{
	
	private final static int ESPERA = 50;

	public static void main(String[] args) {
		System.out.println("Introduzca el limite superior");
		Integer entradaTeclado;
		Scanner entradaEscaner = new Scanner (System.in);
		entradaTeclado = entradaEscaner.nextInt();		
		
		Thread primero = new Thread(new Pares(entradaTeclado, ESPERA));
		Thread segundo = new Thread(new Impares(entradaTeclado, ESPERA));
		
		primero.start();
		segundo.start();
	}
}