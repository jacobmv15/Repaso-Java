import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // while loop = repeat some code forever
        //              while some condition remains true
        
        Scanner scanner = new Scanner(System.in);

        String nombre = "";

        while(nombre.isEmpty()){
            System.out.print("Introduce tu nombre: ");
            nombre = scanner.nextLine();
        }

        System.out.println("Hola " + nombre);

        String respuesta = "";

        while(!respuesta.equals("Q")){
            System.out.println("Estás en un juego");
            System.out.println("Presiona \"Q\" para salir");
            respuesta = scanner.nextLine().toUpperCase();
        }

        System.out.println("El juego ha terminado");

        int edad = 0;

        /*System.out.print("Introduce tu edad: ");
        edad = scanner.nextInt();

        while (edad < 0) {
            System.out.print("Introduce tu edad correctamente: ");
            edad = scanner.nextInt();
        }

        System.out.println("Tienes " + edad + " años");*/

        do{
            System.out.print("Introduce tu edad: ");
            edad = scanner.nextInt();
        }while(edad > 0);

        System.out.println("Tienes " + edad + " años");

        scanner.close();

        int numero;

        do{
            System.out.print("Introduce un número entre 1 - 10");
            numero = scanner.nextInt();
        }while (numero < 1 || numero > 10);

        System.out.println("El número elegido es: " + numero);
    }
}
