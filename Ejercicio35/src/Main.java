import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"piedra", "papel", "tijeras"};

        String seleccionJugador;
        String seleccionCPU;
        String volverAJugar = "si";

        do {
            System.out.print("Introduce tu movimiento (Piedra, Papel o Tijeras): ");
            seleccionJugador = scanner.nextLine().toLowerCase();

            if (!seleccionJugador.equals("piedra")
                    && !seleccionJugador.equals("papel")
                    && !seleccionJugador.equals("tijeras")) {

                System.out.println("Opción inválida");
                continue;
            }

            seleccionCPU = opciones[random.nextInt(opciones.length)];
            System.out.println("La CPU eligió: " + seleccionCPU);

            if (seleccionJugador.equals(seleccionCPU)) {
                System.out.println("Empate");
            } else if ((seleccionJugador.equals("piedra") && seleccionCPU.equals("tijeras"))
                    || (seleccionJugador.equals("papel") && seleccionCPU.equals("piedra"))
                    || (seleccionJugador.equals("tijeras") && seleccionCPU.equals("papel"))) {

                System.out.println("Ganaste");
            } else {
                System.out.println("Perdiste");
            }

            System.out.print("¿Quieres jugar otra vez? (Si/No): ");
            volverAJugar = scanner.nextLine().toLowerCase();

        } while (volverAJugar.equals("si"));

        System.out.println("Gracias por jugar");

        scanner.close();
    }
}
