public class App {
    public static void main(String[] args) {
        
        boolean esEstudiante = true;
        boolean estaRetirado = true;

        double precio = 9.99;

        if(esEstudiante){
            if(estaRetirado){
                System.out.println("Tienes un descuento del 10% por ser estudiante");
                System.out.println("Tienes un descuento del 20% por estar retirado");
                precio *= 0.7;
            }
            else{
                System.out.println("Tienes un descuento del 10% por ser estudiante");
                precio *= 0.9;
            }
        }
        else{
            if(estaRetirado){
                System.out.println("Tienes un descuento del 20% por estar retirado");
                precio *= 0.8;
            }
        }

        System.out.printf("El precio del ticket es de: %.2f euros" ,precio);
    }
}
