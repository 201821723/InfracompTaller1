package Implementacion2;

public class Pares implements Runnable {
	
	private int iteraciones;
	private int espera;
	
	public Pares(int num, int esp){
		this.iteraciones = num;
		this.espera = esp;
	}

	public synchronized void run () {
		try {
			for (int i = 1; i < iteraciones; i++) {
				if (i%2 == 0) {
					System.out.println(i);
					Thread.sleep(espera);
				}
			}
		} catch (InterruptedException e) {}
	}
}