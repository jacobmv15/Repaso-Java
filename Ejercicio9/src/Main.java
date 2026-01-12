import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double capitalInicial;
        double tasaInteres;
        double montoFinal;

        int vecesCapitalizado;
        int años;

        System.out.print("Ingrese el capital inicial: ");
        capitalInicial = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés (en %): ");
        tasaInteres = scanner.nextDouble() / 100;

        System.out.print("Ingrese el número de veces que se capitaliza por año: ");
        vecesCapitalizado = scanner.nextInt();

        System.out.print("Ingrese el número de años: ");
        años = scanner.nextInt();

        montoFinal = capitalInicial * Math.pow(1 + tasaInteres / vecesCapitalizado, vecesCapitalizado * años);

        System.out.printf("El monto final despues de %d años es: %.2f euros", años, montoFinal);

        scanner.close();
    }
}
