import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        
        // Runtime polymorphism = When the method that gets executed is decided at runtime based on the actual type of the object

        Scanner scanner = new Scanner(System.in);

        int opcion;

        Animal animal;
        
        System.out.println("¿Quieres un perro o un gato? (1 = gato | 2 = perro)");
        opcion = scanner.nextInt();

        if (opcion == 1) {
            animal = new Perro();
            animal.hablar();
        } else if (opcion == 2) {
            animal = new Gato();
            animal.hablar();
        } else {
            System.out.println("Opción inválida");
        }
    }
}
