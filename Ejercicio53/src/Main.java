public class Main {
    public static void main(String[] args) {
        
        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static Utility Methods.

        // Autoboxing
        Integer a = 123; //new Integer(123);
        Double b = 3.14; //new Double(3.14);
        Character c = '$'; //new Character('$');
        Boolean d = true; //new Boolean(true);

        // Unboxing
        int w = a;
        double x = b;
        char y = c;
        boolean z = d;

        // Método toString de Clases Wrapper
        String aa = Integer.toString(123);
        String bb = Double.toString(3.14);
        String cc = Character.toString('@');
        String dd = Boolean.toString(false);

        String zz = aa + bb + cc + dd;
        System.out.println(zz);

        // Método parse para pasar de string a datos primitivos
        int e = Integer.parseInt("123");
        double f = Double.parseDouble("3.14");
        char g = "Pizza".charAt(0); // No tiene parse
        boolean h = Boolean.parseBoolean("true");

        char letra = 'J';

        System.out.println(Character.isLetter(letra));
        System.out.println(Character.isUpperCase(letra));
    }
}
