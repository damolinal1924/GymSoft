



package gymsoft;

public class Hilo extends Thread {

    splash ref;

    public Hilo(splash ref) {
        this.ref = ref;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(150);
                ref.Llena_Barra();

            } catch (InterruptedException ex) {

            }
        }
    }
}