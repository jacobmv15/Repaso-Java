import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int tamañoArray;

        String[] comidas;

        System.out.println("¿Cuántas comidas quieres introducir?");
        tamañoArray = scanner.nextInt();
        scanner.nextLine();

        comidas = new String[tamañoArray];

        for(int i = 0; i < comidas.length; i++) {
            System.out.print("Introduce una comida: ");
            comidas[i] = scanner.nextLine();
        }

        for(String comida : comidas) {
            System.out.println(comida);
        }

        scanner.close();
    }
}
