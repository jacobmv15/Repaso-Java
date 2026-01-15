import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // NUMBER GUESSING GAME
        
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int respuesta = 0;
        int intentos = 0;
        int numeroAleatorio = random.nextInt(1, 101);

        System.out.println("Adivina el número aleatorio");

        do {
            System.out.print("Elige un número entre 1 - 100: ");
            respuesta = scanner.nextInt();
            intentos++;

            if(respuesta < numeroAleatorio){
                System.out.println("¡Te has quedado corto! Prueba de nuevo");
            }
            else if(respuesta > numeroAleatorio){
                System.out.println("¡Te has pasado! Prueba de nuevo");
            }
            else{
                System.out.println("Has ganado en " + intentos + " intentos");
            }

        } while (respuesta != numeroAleatorio);

        scanner.close();
    }
}
