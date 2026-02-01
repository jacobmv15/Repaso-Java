import java.util.Random;
import java.util.Scanner;

public class Main {

    // Scanner global para leer datos por teclado
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Variables para configuración del juego
        int numFilas;
        int numColumnas;
        int numBarcos;

        // Contadores de barcos restantes por jugador
        int contadorJugador1;
        int contadorJugador2;

        // Tablero real del juego (donde están los barcos)
        char tableroJuego[][];

        // Tableros que ve cada jugador
        char tableroJugador1[][];
        char tableroJugador2[][];

        // Control de turnos
        boolean turnoJugador1 = true;

        System.out.println("Bienvenido a hundir la flota");
        System.out.println("¿De que tamaño quieres el tablero? (Filas y Columnas tienen que ser mayores que 0)");

        // Pedimos filas y columnas y comprobamos que sean válidas
        do {
            System.out.println("Introduzca el número de filas");
            numFilas = scanner.nextInt();

            System.out.println("Introduzca el número de columnas");
            numColumnas = scanner.nextInt();
        } while (numColumnas <= 0 || numFilas <= 0);

        scanner.nextLine(); // Limpieza del buffer

        // Sumamos 1 para dejar espacio a las letras y números del tablero
        numFilas++;
        numColumnas++;

        // Calculamos el número de barcos según el tamaño del tablero
        numBarcos = (int) Math.sqrt((numFilas - 1) * (numColumnas - 1));

        // Creamos el tablero interno del juego
        tableroJuego = creaTablero(numFilas, numColumnas);
        tableroJuego[0][0] = ' '; // Esquina vacía

        // Inicializamos los tableros de los jugadores
        tableroJugador1 = inicializaTablero(numFilas, numColumnas);
        tableroJugador2 = inicializaTablero(numFilas, numColumnas);

        // Colocamos los barcos de forma aleatoria
        generarBarquitos(tableroJuego, numBarcos);

        // Cada jugador empieza con todos los barcos por hundir
        contadorJugador1 = numBarcos;
        contadorJugador2 = numBarcos;

        // Bucle principal del juego
        while (true) {

            if (turnoJugador1) {
                System.out.println();
                System.out.println("Turno del jugador 1");
                pintaTablero(tableroJugador1);

                // Si acierta, sigue jugando
                if (turnoJugador(tableroJuego, tableroJugador1)) {

                    contadorJugador1--;

                    // Si no quedan barcos, gana
                    if (contadorJugador1 == 0) {
                        System.out.println();
                        pintaTablero(tableroJugador1);
                        System.out.println("Enhorabuena Jugador 1, has ganado");
                        break;
                    }

                } else {
                    // Si falla, cambia el turno
                    turnoJugador1 = false;
                }

            } else {
                System.out.println();
                System.out.println("Turno del jugador 2");
                pintaTablero(tableroJugador2);

                if (turnoJugador(tableroJuego, tableroJugador2)) {

                    contadorJugador2--;

                    if (contadorJugador2 == 0) {
                        System.out.println();
                        pintaTablero(tableroJugador2);
                        System.out.println("Enhorabuena Jugador 2, has ganado");
                        break;
                    }

                } else {
                    turnoJugador1 = true;
                }
            }
        }

        // Cerramos el scanner
        scanner.close();
    }

    // Crea el tablero interno del juego y lo rellena con 'A' (agua)
    static char[][] creaTablero(int filas, int columnas) {

        char[][] tableroJuego = new char[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tableroJuego[i][j] = 'A';
            }
        }

        return tableroJuego;
    }

    // Inicializa el tablero visible del jugador con '-'
    static char[][] inicializaTablero(int filas, int columnas) {
        char[][] tableroJugador = new char[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tableroJugador[i][j] = '-';
            }
        }

        return tableroJugador;
    }

    // Coloca los barcos aleatoriamente en el tablero
    static void generarBarquitos(char tablero[][], int numBarquitos) {

        Random random = new Random();

        int cont = 0;
        int filaBarco;
        int columnaBarco;

        while (cont < numBarquitos) {

            // Generamos posiciones aleatorias (evitando la fila y columna 0)
            filaBarco = random.nextInt(1, tablero.length);
            columnaBarco = random.nextInt(1, tablero[0].length);

            // Si no hay ya un barco, lo colocamos
            if (tablero[filaBarco][columnaBarco] != 'B') {
                tablero[filaBarco][columnaBarco] = 'B';
                cont++;
            }
        }
    }

    // Muestra el tablero del jugador por pantalla
    static void pintaTablero(char tableroJugador[][]) {

        char filaNumeros = '1';
        char filaLetras = 'A';

        System.out.println();

        // Colocamos letras y números en los bordes
        for (int i = 0; i < tableroJugador.length; i++) {
            for (int j = 0; j < tableroJugador[0].length; j++) {

                if (i == 0 && j != 0) {
                    tableroJugador[i][j] = filaNumeros;
                    filaNumeros++;
                }

                if (j == 0 && i != 0) {
                    tableroJugador[i][j] = filaLetras;
                    filaLetras++;
                }
            }
        }

        // Pintamos el tablero
        for (int i = 0; i < tableroJugador.length; i++) {
            for (int j = 0; j < tableroJugador[0].length; j++) {
                System.out.printf("%c\t", tableroJugador[i][j]);
            }
            System.out.println();
        }
    }

    // Gestiona el turno de un jugador
    static boolean turnoJugador(char tablero[][], char tableroJugador[][]) {

        char filaRespuesta;
        int columnaRespuesta;
        int fila;

        // Pedimos coordenadas hasta que sean válidas
        do {
            System.out.print("Introduzca la fila mediante una letra: ");
            filaRespuesta = scanner.nextLine().toUpperCase().charAt(0);

            System.out.print("Introduzca el número de columna: ");
            columnaRespuesta = Integer.parseInt(scanner.nextLine());

            // Convertimos la letra en índice de fila
            fila = filaRespuesta - 'A' + 1;

        } while (fila < 1 || fila >= tablero.length ||
                 columnaRespuesta < 1 || columnaRespuesta >= tablero[0].length);

        // Comprobamos si hay barco
        if (tablero[fila][columnaRespuesta] == 'B') {
            tableroJugador[fila][columnaRespuesta] = 'B';
            System.out.println("****************************");
            System.out.println("HUNDIDO");
            return true;
        } else {
            tableroJugador[fila][columnaRespuesta] = 'A';
            System.out.println("****************************");
            System.out.println("AGUA");
            return false;
        }
    }
}
