import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double temperatura;
        double temperaturaConvertida;

        String unidad;

        System.out.print("Introduce la temperatura a convertir: ");
        temperatura = scanner.nextDouble();

        System.out.print("¿A qué unidad quieres convertir la temperatura? (C/F): ");
        unidad = scanner.next().toUpperCase();

        temperaturaConvertida = (unidad.equals("C")) ? (temperatura -32) * 5 / 9 : (temperatura * 5 / 9) + 32;

        System.out.printf("%.1fº%s" ,temperaturaConvertida, unidad);

        scanner.close();
    }
}
