public class LanzaHiloYEsperanQueTerminen {
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
        try {
            h1.join();
            h2.join();
            h3.join();
            h4.join();
            h5.join();
        } catch (InterruptedException e) {
            System.out.println("Hilo `principal interrumpido.");
        }



        System.out.println("Hilo principal terminado");

    }
}
