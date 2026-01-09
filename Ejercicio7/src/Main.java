import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // RECORDATORIO DE LOS DIFERENTES METODOS DE LA CLASE Math
        
        /*System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2, 5);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14);
        result = Math.floor(3.99);
        result = Math.max(10, 20);
        result = Math.min(10, 20);

        System.out.println(result);*/

        //DIFERENTES EJERCICIOS

        // HYPOTENUSE c = Math.sqrt(a² + b²);

        /*Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.print("Ingresa la longitud del cateto a: ");
        a = scanner.nextDouble();

        System.out.print("Ingresa la longitud del cateto b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("La hipotenusa es: " + c + "cm");

        scanner.close();*/

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        Scanner scanner = new Scanner(System.in);

        double radio;
        double circumferencia;
        double area;
        double volumen;


        System.out.print("Introduce el radio: ");
        radio = scanner.nextDouble();

        circumferencia = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        System.out.println("La cirfunferencia es: " + circumferencia + "cm");
        System.out.println("El área es: " + area + "cm²");
        System.out.println("El volumen es: " + volumen + "cm³");

        scanner.close();
    }
}
