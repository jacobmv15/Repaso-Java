import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String[] frutas = {"Manzana", "Naranja", "Plátano"};

        String frutaBuscada;

        int[] numeros = {1, 9, 2, 8, 3, 5, 4};

        int numeroBuscado = 7;

        boolean encontrado = false;

        for(int i = 0; i < numeros.length; i++) {
            
        if(numeroBuscado == numeros[i]) {
                System.out.println("Número encontrado en el índice " + i);
                encontrado = true;
                break;
            }

        }

        System.out.print("Introduce una fruta para buscar en el array: ");
        frutaBuscada = scanner.nextLine();
        
        for(int i = 0; i < frutas.length; i++) {
            
            if(frutas[i].equals(frutaBuscada)) {
                System.out.println("Fruta encontrada en el índice " + i);
                encontrado = true;
                break;
            }

        }

        if(!encontrado) {
            System.out.println("Elemento no encontrado en el array");
        }

        scanner.close();
    }
}
