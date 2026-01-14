import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // && = AND
        // || = OR
        // ! = NOT

        /*double temperatura = 20;

        boolean estaSoleado = false;

        if(temperatura <= 30 && temperatura >= 0 && estaSoleado){
            System.out.println("Hace buen tiempo");
            System.out.println("El sol está afuera");
        }
        else if(temperatura <= 30 && temperatura >= 0 && !estaSoleado){
            System.out.println("Hace buen tiempo");
            System.out.println("Está nublado");
        }
        else if(temperatura > 30 || temperatura < 0){
            System.out.println("Hace mal tiempo");
        }*/

        // username must be between 4-12 caracters
        // username must not contain spaces or underscores

        Scanner scanner = new Scanner(System.in);

        String nombreUsuario;

        System.out.print("Introduce tu nombre de usuario: ");
        nombreUsuario = scanner.nextLine();

        if(nombreUsuario.length() < 4 || nombreUsuario.length() > 12){
            System.out.println("El nombre de usuario debe tener entre 4 y 12 letras");
        }
        else if(nombreUsuario.contains(" ") || nombreUsuario.contains("_")){
            System.out.println("El nombre de usuario no debe tener espacios ni guiones bajos");
        }
        else{
            System.out.println("Bienvenido " + nombreUsuario);
        }

        scanner.close();
    }
}
