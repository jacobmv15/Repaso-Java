public class Main {
    public static void main(String[] args) {

        // Multithreading = Enables a program to run multiple threads concurrently
        //                  (Thread = A set of instructions that run independently)
        //                  Useful for background tasks or time-consuming operations

        Thread hilo1 = new Thread(new MyRunnable("PING"));
        Thread hilo2 = new Thread(new MyRunnable("PONG"));
        
        System.out.println("Game Start");

        hilo1.start();
        hilo2.start();
        
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            System.out.println("Hilo principal interrumpido");
        }

        System.out.println("Game Over");
    }
}
