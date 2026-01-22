import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // JAVA SLOT MACHINE

        Scanner scanner = new Scanner(System.in);

        int saldo = 100;
        int apuesta;
        int premio;

        String[] fila;
        String jugarDeNuevo;

        System.out.println("¡Bienvenido a Java Slots!");
        System.out.println("Símbolos: @, #, %, &, *");

        while (saldo > 0) {
            
            System.out.println("Saldo actual: $" + saldo);
            System.out.print("Introduce la cantidad de apuesta: $");
            apuesta = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            if (apuesta > saldo) {
                System.out.println("Fondos insuficientes");
                continue;
            } else if (apuesta <= 0) {
                System.out.println("La apuesta tiene que ser mayor que 0");
                continue;
            } else {
                saldo -= apuesta;
            }

            System.out.println("Girando...");
            fila = girarFila();
            mostrarFila(fila);
            premio = calcularPremio(fila, apuesta);

            if (premio > 0) {
                System.out.println("¡Has ganado $" + premio + "!");
                saldo += premio;
            } else {
                System.out.println("Ronda perdida");
            }

            // Si el saldo llegó a 0 después de esta ronda, terminar el juego
            if (saldo == 0) {
                System.out.println("¡Has perdido todo tu saldo!");
                break;
            }

            System.out.print("¿Quieres seguir jugando? (Si/No): ");
            jugarDeNuevo = scanner.nextLine().toLowerCase();

            if (!jugarDeNuevo.equals("si")) {
                break;
            }

            System.out.println(); // línea en blanco para separar rondas
        }

        System.out.println("\n¡Gracias por jugar, saldo final: $" + saldo);

        scanner.close();
    }

    static String[] girarFila() {
        Random random = new Random();

        String[] simbolos = {"@", "#", "%", "&", "*"};
        String[] fila = new String[3];

        for (int i = 0; i < 3; i++) {
            fila[i] = simbolos[random.nextInt(simbolos.length)];
        }

        return fila;
    }

    static void mostrarFila(String[] fila) {
        System.out.println(" " + String.join(" | ", fila) + "\n");
    }

    static int calcularPremio(String[] fila, int apuesta) {
        if (fila[0].equals(fila[1]) && fila[1].equals(fila[2])) {
            return switch(fila[0]) {
                case "@" -> apuesta * 3;
                case "#" -> apuesta * 4;
                case "%" -> apuesta * 5;
                case "&" -> apuesta * 10;
                case "*" -> apuesta * 20;
                default -> 0;
            };
        } else if (fila[0].equals(fila[1]) || fila[1].equals(fila[2])) {
            return switch(fila[1]) {
                case "@" -> apuesta * 2;
                case "#" -> apuesta * 3;
                case "%" -> apuesta * 4;
                case "&" -> apuesta * 5;
                case "*" -> apuesta * 10;
                default -> 0;
            };
        }

        return 0;
    }
}
