public class LanzaHilo {
    public static void main(String[] args) {
        Thread h1 = new Thread(new Hilo("H1"));
        Thread h2 = new Thread(new Hilo("H2"));
        Thread h3 = new Thread(new Hilo("H3"));
        Thread h4 = new Thread(new Hilo("H4"));
        Thread h5 = new Thread(new Hilo("H5"));
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        
        System.out.println("Información de los hilos después de iniciarlos:");
        mostrarInformacionHilo(h1);
        mostrarInformacionHilo(h2);
        mostrarInformacionHilo(h3);
        mostrarInformacionHilo(h4);
        mostrarInformacionHilo(h5);
        
        try {
            h1.join();
            h2.join();
            h3.join();
            h4.join();
            h5.join();
        } catch (InterruptedException e) {
            System.out.println("Hilo `principal interrumpido.");
        }

        //Minima prioridad y máxima prioridad de un hilo
        System.out.println("\nLa mínima prioridad de un hilo es: " + Thread.MIN_PRIORITY);
        System.out.println("La máxima prioridad de un hilo es: " + Thread.MAX_PRIORITY);
    


        System.out.println("Hilo principal terminado");
    }
    public static void mostrarInformacionHilo(Thread hilo) {
        System.out.println("ID del hilo: " + hilo.getId());
        System.out.println("Nombre del hilo: " + hilo.getName());
        System.out.println("Prioridad del hilo: " + hilo.getPriority());
        System.out.println("¿Está vivo el hilo?: " + hilo.isAlive());
        System.out.println("Estado del hilo: " + hilo.getState());
        System.out.println("¿Es un hilo daemon?: " + hilo.isDaemon());
        System.out.println();
    }
}
