import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // MAD LIBS GAME
        
        Scanner scanner = new Scanner(System.in);

        String adjetivo1;
        String sustantivo1;
        String adjetivo2;
        String verbo1;
        String adjetivo3;

        System.out.print("Introduce un adjetivo: ");
        adjetivo1 = scanner.nextLine();
        
        System.out.print("Introduce un sustantivo(animal): ");
        sustantivo1 = scanner.nextLine();
        
        System.out.print("Introduce un adjetivo: ");
        adjetivo2 = scanner.nextLine();
        
        System.out.print("Introduce un verbo: ");
        verbo1 = scanner.nextLine();
        
        System.out.print("Introduce un adjetivo: ");
        adjetivo3 = scanner.nextLine();

        System.out.println("\nHoy he estado en un " + adjetivo1 + " zoo.");
        System.out.println("En exhibición ví a un " + sustantivo1 + ".");
        System.out.println(sustantivo1 + " era " + adjetivo2 + " y " + verbo1 + "!");
        System.out.println("Yo estaba " + adjetivo3 + "!");

        scanner.close();
    }
}
