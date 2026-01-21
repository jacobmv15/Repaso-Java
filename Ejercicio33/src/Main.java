public class Main {
    public static void main(String[] args) {
        
        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data

        //String[] frutas = {"Manzana", "Naranja", "Plátano"};
        //String[] verduras = {"Patata", "Cebolla", "Zanahoria"};
        //String[] carnes = {"Pollo", "Cerdo", "Pescado"};

        //String[][] compras = {frutas, verduras, carnes};
        /*String[][] compras = {{"Manzana", "Naranja", "Banana"},
                                {"Patata", "Cebolla", "Zanahoria"},
                                {"Pollo", "Cerdo", "Pescado"}};

        compras[0][0] = "Piña"; 
        compras[1][2] = "Tomate"; 
        compras[2][1] = "Huevos"; 

        for (String[] comidas : compras) {
            for(String comida : comidas) {
                System.out.println(comida);
            }

        }*/

        char[][] telefono = {{'1', '2', '3'}, 
                            {'4', '5', '6'}, 
                            {'7', '8', '9'}, 
                            {'*', '0', '#'}}; 

        
        for (char[] fila : telefono) {
            
            for(char numero : fila) {
                System.out.print(numero + " ");
            }
            System.out.println();

        }
    }
}
