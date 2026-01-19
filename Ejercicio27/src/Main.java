import java.util.Scanner;

public class Main {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double saldo = 0;
        int opcion;

        System.out.println("Bienvenido a tu banco");

        do {
            System.out.println("\n1. Ver saldo de la cuenta");
            System.out.println("2. Depositar dinero en la cuenta");
            System.out.println("3. Retirar dinero de la cuenta");
            System.out.println("4. Salir");

            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> mostrarSaldo(saldo);
                case 2 -> saldo += depositarDinero();
                case 3 -> saldo -= retirarDinero(saldo);
                case 4 -> System.out.println("Gracias por confiar en nuestro banco");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 4);

        scanner.close();
    }

    static void mostrarSaldo(double saldo) {
        System.out.printf("\nSaldo actual: $%.2f\n", saldo);
    }

    static double depositarDinero() {

        double cantidad;

        System.out.print("Introduce la cantidad que deseas depositar: ");
        cantidad = scanner.nextDouble();

        if (cantidad < 0) {
            System.out.println("\nLa cantidad no puede ser negativa");
            return 0;
        }
        return cantidad;
    }

    static double retirarDinero(double saldo) {

        double cantidad;

        System.out.print("¿Cuánto dinero deseas retirar?: ");
        cantidad = scanner.nextDouble();

        if (cantidad > saldo) {
            System.out.println("\nSaldo insuficiente");
            return 0;
        } else if (cantidad < 0) {
            System.out.println("\nLa cantidad no puede ser negativa");
            return 0;
        }
        return cantidad;
    }
}
