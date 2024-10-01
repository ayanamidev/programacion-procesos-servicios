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

        System.out.println("Hilo principal terminado");
    }

}
