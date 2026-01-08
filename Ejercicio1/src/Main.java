import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        String color;

        int edad;

        double notaMedia;

        boolean esEstudiante;

        /*System.out.print("Introduce tu nombre completo: ");
        nombre = scanner.nextLine();

        System.out.print("Introduce tu edad: ");
        edad = scanner.nextInt();

        System.out.print("Introduce tu nota media: ");
        notaMedia = scanner.nextDouble();

        System.out.print("¿Eres un estudiante? (true o false): ");
        esEstudiante = scanner.nextBoolean();

        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tienes " + edad + " años");
        System.out.println("Tu nota media es " + notaMedia);
        
        if(esEstudiante){
            System.out.println("Estas matriculado como estudiante");
        }
        else{
            System.out.println("No estas matriculado como estudiante");
        }*/

        
        //POBLEMA RECURRENTE
        /*System.out.print("Introduce tu edad: ");
        edad = scanner.nextInt();

        scanner.nextLine(); // Sirve para limpiar el \n del buffer del scanner

        System.out.print("Introduce tu color favorito: ");
        color = scanner.nextLine();

        System.out.println("Tienes " + edad + " años");
        System.out.println("Tu color favorito es el " + color);*/


        //CALCULAR EL AREA DE UN RECTANGULO

        double ancho = 0;
        double alto = 0;
        double area = 0 ;

        System.out.print("Introduce el ancho: ");
        ancho = scanner.nextDouble();

        System.out.print("Introduce el alto: ");
        alto = scanner.nextDouble();

        area = ancho * alto;

        System.out.println("El area es: " + area + "cm^2");
        
        scanner.close();
    }
}
