import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // if statement = performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        String nombre;

        int edad;

        boolean esEstudiante;

        System.out.print("Introduce tu nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Introduce tu edad: ");
        edad = scanner.nextInt();

        System.out.print("¿Eres estudiante? (true/false): ");
        esEstudiante = scanner.nextBoolean();

        // Grupo 1
        if(nombre.isEmpty()){
            System.out.println("No has introducido tu nombre");
        }
        else{
            System.out.println("Hola " + nombre + "!");
        }


        // Grupo 2
        if(edad >= 65){
            System.out.println("Eres un pensionista :)");
        }
        else if(edad >= 18){
            System.out.println("Eres un adulto");
        }
        else if(edad < 0){
            System.out.println("No has nacido aun");
        }
        else if(edad == 0){
            System.out.println("Eres un recién nacido");
        }
        else{
            System.out.println("No eres un adulto");
        }

        // Grupo 3
        if(esEstudiante){
            System.out.println("Eres un estudiante!");
        }
        else{
            System.out.println("No eres un estudiante");
        }

        scanner.close();
    }
}
