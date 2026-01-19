import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();

        int cantidadDados;
        int sumaTotal = 0;

        System.out.print("Introduce el número de dados a tirar: ");
        cantidadDados = scanner.nextInt();

        if (cantidadDados > 0) {

            for (int i = 0; i < cantidadDados; i++) {
                int resultado = random.nextInt(1, 7);
                mostrarDado(resultado);
                sumaTotal += resultado;
            }

            System.out.println("Suma total: " + sumaTotal);

        } else {
            System.out.println("El número de dados debe ser mayor que 0");
        }

        scanner.close();
    }

    static void mostrarDado(int resultado) {

        String n1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String n2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String n3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String n4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String n5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String n6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (resultado) {
            case 1 -> System.out.print(n1);
            case 2 -> System.out.print(n2);
            case 3 -> System.out.print(n3);
            case 4 -> System.out.print(n4);
            case 5 -> System.out.print(n5);
            case 6 -> System.out.print(n6);
        }
    }
}
