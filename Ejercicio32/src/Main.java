public class Main {
    public static void main(String[] args) {
        
        // varargs = allow a metho to accept a varying number of arguments
        //           make methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array
        //           ... (ellipsis)

        System.out.println(sumar(1, 2, 3, 4, 5, 6));

        System.out.println(media(1, 2, 3, 4, 5, 6, 7));

    }

    static int sumar(int... numeros) {
        
        int suma = 0;

        for(int numero : numeros) {
            suma += numero;
        }

        return suma;
    }

    static double media(double... numeros) {

        double suma = 0;

        if(numeros.length == 0) {
            return 0;
        }

        for (double numero : numeros) {
            suma += numero;
        }

        return suma / numeros.length;
    }
}
