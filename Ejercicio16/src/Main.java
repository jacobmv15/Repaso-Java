import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Enhanced switch = A replacement for many else-if statements
        //                   (Java 14 feature)

        Scanner scanner = new Scanner(System.in);

        String dia;

        System.out.print("Introduce el día de la semana: ");
        dia = scanner.nextLine();

        switch (dia) {
            case "Lunes", "Martes", "Miércoles", "Jueves", "Viernes" ->
                    System.out.println("Es un día entre semana");
            // case "Martes" -> System.out.println("Es un día entre semana");
            // case "Miércoles" -> System.out.println("Es un día entre semana");
            // case "Jueves" -> System.out.println("Es un día entre semana");
            // case "Viernes" -> System.out.println("Es un día entre semana");

            case "Sábado", "Domingo" ->
                    System.out.println("Es fin de semana");
            // case "Domingo" -> System.out.println("Es fin de semana");

            default ->
                    System.out.println(dia + " no es un día");
        }

        scanner.close();
    }
}
