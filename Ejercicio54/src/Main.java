import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArrayList = A resizable array that stores objects (autoboxing).
        // Arrays are fixed in size, but ArrayLists can change.

        /*ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Manzana");
        frutas.add("Plátano");
        frutas.add("Coco");
        frutas.add("Sandía");

        frutas.remove(3);

        frutas.set(1, "Piña");

        //System.out.println(frutas.get(1));
        System.out.println(frutas.size());

        Collections.sort(frutas);

        for (String fruta : frutas) {
            System.out.println(fruta);
        }*/

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> comidas = new ArrayList<>();

        int numeroComidas;

        System.out.print("Introduce el número de comidas que quieres: ");
        numeroComidas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numeroComidas; i++) {
            System.out.print("Introduce la comida número " + i + ": ");
            String comida = scanner.nextLine();
            comidas.add(comida);
        }

        System.out.println(comidas);

        scanner.close();
    }
}
