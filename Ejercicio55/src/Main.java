import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of a program
        //              (Dividing by zero, file not found, mismatch input type)
        //              Surround any dangerous code with a try{} block
        //              try{}, catch{}, finally{}

        //Scanner scanner = new Scanner(System.in);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            System.out.println(numero);
        } catch (InputMismatchException e) {
            System.out.println(e.getLocalizedMessage());
        } /*finally {
            scanner.close();
        }*/
        
    }
}
