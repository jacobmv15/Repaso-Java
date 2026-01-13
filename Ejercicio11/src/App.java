public class App {
    public static void main(String[] args) {
        
        String nombre = "   Bob Esponja    ";

        int lenght = nombre.length();
        int index = nombre.indexOf("E");
        int lastIndex = nombre.lastIndexOf("o");

        char letra = nombre.charAt(4);

        //nombre = nombre.toUpperCase();
        //nombre = nombre.toLowerCase();

        nombre = nombre.trim(); // Elimina los espacios adelante y al final del String
        
        //nombre = nombre.replace("o", "a");

        System.out.println(lenght);
        System.out.println(letra);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(nombre);
        
        if(nombre.isEmpty()){
            System.out.println("Tu nombre está vacío");
        }
        else{
            System.out.println("Hola " + nombre);
        }

        if(nombre.contains(" ")){
            System.out.println("Tu nombre tiene un espacio");
        }
        else{
            System.out.println("Tu nombre no tiene ningún espacio");
        }

        if(nombre.equalsIgnoreCase("contraseña")){
            System.out.println("Tu nombre no puede ser contraseña");
        }
        else{
            System.out.println("Hola " + nombre);
        }
    }
}
