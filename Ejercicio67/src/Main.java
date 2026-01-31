import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Threading = Allows a program to run multiple tasks simultaneously
        //             Helps improve performance with time-consuming operations
        //             (File I/O, network communications, or any background tasks)

        // How to create a Thread
        // Option 1. Extend the Thread class (simpler)
        // Option 2. Implement the Runnable interface (better)

        Scanner scanner = new Scanner(System.in);

        MyRunnable runnable = new MyRunnable();
        Thread hilo = new Thread(runnable);

        System.out.println("Tienes 10 segundos para introducir tu nombre");
        hilo.setDaemon(true); // El hilo acaba cuando el main thread termine
        hilo.start();

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre);

        scanner.close();
    }
}
