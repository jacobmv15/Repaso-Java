import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        // for loop = execute some code a CERTAIN amount of times

        Scanner scanner = new Scanner(System.in);

        /*int max;

        System.out.print("¿Cuántas veces quieres entrar en el bucle?: ");
        max = scanner.nextInt();

        for(int i = 0; i < max; i++){
            System.out.println(i);
        }*/
       
        int inicio;

        System.out.print("¿De cuántos segundos quieres que sea la cuenta atrás?: ");
        inicio = scanner.nextInt();

        for(int i = inicio; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Feliz año nuevo");

        scanner.close();
    }
}
