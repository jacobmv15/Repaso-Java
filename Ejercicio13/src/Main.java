import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

        double peso;
        double nuevoPeso;
        
        int opcion;

        System.out.println("Bienvenid@ al programa de conversión de peso");
        System.out.println("1: Convierte Lb a Kg");
        System.out.println("2: Convierte Kb a Lg");

        System.out.print("Elige una opción: ");
        opcion = scanner.nextInt();

        if(opcion == 1){
            System.out.print("Introduce el peso en Lb: ");
            peso = scanner.nextDouble();
            nuevoPeso = peso * 0.453592;

            System.out.printf("El peso en Kg es %.2f" ,nuevoPeso);
        }
        else if(opcion == 2){
            System.out.print("Introduce el peso en Kb: ");
            peso = scanner.nextDouble();
            nuevoPeso = peso * 2.20462;

            System.out.printf("El peso en Lg es %.2f" ,nuevoPeso);
        }
        else{
            System.out.println("Opción incorrecta");
        }

        scanner.close();
    }
}
