public class App {
    public static void main(String[] args) {
        
        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        /*String nombre = "Bob Esponja";
        
        char primeraLetra = 'B';

        int edad = 30;

        double altura = 60.5;

        boolean esEmpleado = true;

        System.out.printf("Hola %s\n", nombre);
        System.out.printf("Tu nombre empieza con la letra %c\n", primeraLetra);
        System.out.printf("Tienes %d años\n", edad);
        System.out.printf("Mides %fcm\n", altura);
        System.out.printf("Empleado: %b \n", esEmpleado);

        System.out.printf("%s tiene %d años\n", nombre, edad);*/

        //[FLAGS]
        // + = output a plus
        // , = coma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        /*double precio1 = 9.99;
        double precio2 = 100.15;
        double precio3 = -54.01;

        System.out.printf("% .2f\n", precio1);
        System.out.printf("% .2f\n", precio2);
        System.out.printf("% .2f\n", precio3);*/

        //[WIDTH]
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n" ,id1);
        System.out.printf("%-4d\n" ,id2);
        System.out.printf("%-4d\n" ,id3);
        System.out.printf("%-4d\n" ,id4);
    }
}
