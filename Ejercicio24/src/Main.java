public class Main {
    public static void main(String[] args) {
        
        // method = a block of reusable code that is executed when called ()

        /*String nombre = "Francis";
        int edad = "10";

        happyBirthday(nombre, edad);*/

        System.out.println(alCuadrado(5));

        System.out.println(alCubo(3));

        String nombreCompleto = juntarNombre("Vicente", "Maroto");
        System.out.println(nombreCompleto);

        if(mayorDeEdad(18)){
            System.out.println("Puedes entrar al casino");
        }
        else{
            System.out.println("No tienes edad para entrar al casino");
        }
    }

    static void happyBirthday(String nombre, int edad){
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear " + nombre + "!");
        System.out.println("You are " + edad + " years old!");
        System.out.println("Happy birthday to you");
    }
    
    static double alCuadrado(double numero){
        return numero * numero;
    }

    static double alCubo(double numero){
        return numero * numero * numero;
    }

    static String juntarNombre(String nombre, String apellidos){
        return nombre + " " + apellidos;
    }

    static boolean mayorDeEdad(int edad){
        return edad >= 18;
    }
}
