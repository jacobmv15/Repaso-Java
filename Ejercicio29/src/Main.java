import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        // array = a collection of values of the same data type
        //         think of it as a variable that can store more than 1 value

        String [] frutas = {"manzana", "naranja", "plátano", "coco"};

        frutas [0] = "piña";

        int numeroDeFrutas = frutas.length;

        System.out.println(numeroDeFrutas);

        //System.out.println(frutas[0]);

        Arrays.sort(frutas);

        Arrays.fill(frutas, "piña");

        /*for(int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }*/

        for(String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
