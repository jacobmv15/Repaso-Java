import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Random random = new Random();

        int numero1;
        int numero2;
        int numero3;

        numero1 = random.nextInt(1,101); // El segundo número se excluye
        numero2 = random.nextInt(1,101);
        numero3 = random.nextInt(1,101);
        
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);

        double numero4 = random.nextDouble(); // Genera un número entre 0 y 1
        System.out.println("\n" + numero4);

        boolean esCara = random.nextBoolean();
        if(esCara){
            System.out.println("\nEs cara");
        }
        else{
            System.out.println("\nEs cruz");
        }

    }
}
