package Implementacion1;
public class Impares extends Thread {
	
	private int iteraciones;
	private int espera;
	
	public Impares(int num, int esp){
		this.iteraciones = num;
		this.espera = esp;
	}

	public synchronized void run () {
		try {
			for (int i = 1; i < iteraciones; i++) {
				if (i%2 != 0) {
					System.out.println(i);
					Thread.sleep(espera);
				}
			}
		} catch (InterruptedException e) {}
	}
}
