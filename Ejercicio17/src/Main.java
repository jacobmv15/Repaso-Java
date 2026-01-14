import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Calculator program

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        double resultado = 0;

        char operador;

        boolean operadorValido = true;

        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("¿Qué tipo de operación quieres hacer? (+, -, *, /, ^): ");
        operador = scanner.next().charAt(0);

        System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextDouble();

        switch(operador){
            case '+' -> resultado = num1 + num2;
            case '-' -> resultado = num1 - num2;
            case '*' -> resultado = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("No se puede dividir entre 0");
                    operadorValido = false;
                }
                else{
                    resultado = num1 / num2;
                }
            }
            case '^' -> resultado = Math.pow(num1, num2);
            
            default -> {
                System.out.println("Operador inválido");
                operadorValido = false;
            }
        }

        if(operadorValido){
            System.out.println(resultado);
        }
        
        scanner.close();
    }
}
