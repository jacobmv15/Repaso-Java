import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Enums = (Enumerations) A special kind of class that
        // represents a fixed set of constants.
        // They improve code readability and are easy to maintain.
        // More efficient with switches when comparing Strings.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el día de la semana: ");
        String respuesta = scanner.nextLine().toUpperCase();

        try {
            Dia dia = Dia.valueOf(respuesta);

            System.out.println(dia);
            System.out.println(dia.getNumeroDia());

            switch (dia) {
                case LUNES, MARTES, MIERCOLES, JUEVES, VIERNES -> System.out.println("Es un día entre semana");
                case SABADO, DOMINGO -> System.out.println("Es fin de semana");
            }

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println();
            System.out.println(respuesta + " no es un día de la semana");
        }



        scanner.close();
    }
}
