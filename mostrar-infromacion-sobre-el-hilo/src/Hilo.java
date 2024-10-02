import java.util.Random;

public class Hilo implements Runnable {
    private final String nombre;

    public Hilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.printf("Hola, soy el hilo %s, \n",this.nombre);
        Random r=new Random();
        for (int i=0;i<5;i++){
            int pausa=10+r.nextInt(500-10);
            System.out.printf("Hilo: %s hace pausa de %d ms.\n",this.nombre,pausa);
            try {
                Thread.sleep(pausa);
            } catch (InterruptedException e) {
                System.out.printf("Hilo: %s interrumpido.\n",this.nombre);
            }

        }
        System.out.printf("Hilo %s terminado\n",this.nombre);

    }
}