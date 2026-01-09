import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // SHOPPING CART PROGRAM
        Scanner scanner = new Scanner(System.in);

        String objeto;

        double precio;
        double total;

        int cantidad;

        char moneda = '$';
        
        System.out.print("¿Que objeto te gustaria comprar?: ");
        objeto = scanner.nextLine();

        System.out.print("¿Cual es el precio para cada una?: ");
        precio = scanner.nextDouble();

        System.out.print("¿Cuantas quieres comprar?: ");
        cantidad = scanner.nextInt();

        total = precio * cantidad;

        System.out.println("\nHas comprado " + cantidad + " " + objeto + "/s");
        System.out.println("El total de tu compra es " + total + moneda);

        scanner.close();
    }
}
