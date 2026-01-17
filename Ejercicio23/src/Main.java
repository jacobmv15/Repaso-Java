import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // nested loop = A loop inside another loop

        /*for(int i = 0; i < 3; i++){
            for(int j = 1; j <= 9; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }*/

        Scanner scanner = new Scanner(System.in);

        int filas;
        int columnas;

        char simbolo;

        System.out.print("Introduce el número de filas: ");
        filas = scanner.nextInt();

        System.out.print("Introduce el número de columnas: ");
        columnas = scanner.nextInt();

        System.out.print("Introduce el símbolo que quieres pintar: ");
        simbolo = scanner.next().charAt(0);

        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.print(simbolo);
            }
            System.out.println();
        }

        scanner.close();
    }
}
