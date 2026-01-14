public class Main {
    public static void main(String[] args) {
        
        // ternary operator ? = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;

        int nota = 55;

        /*if(nota >= 60){
            System.out.println("Aprobado");
        }
        else{
            System.out.println("Suspendido");
        }*/

        String aprobadoOSuspenso = (nota >= 60) ? "Aprobado" : "Suspenso";

        System.out.println(aprobadoOSuspenso);

        int numero = 4;

        String parOImpar = (numero % 2 == 0) ? "Par" : "Impar";

        System.out.println(parOImpar);

        int hora = 12;

        String franjaHoraria = (hora <= 12) ? "Mañana" : "Tarde" ;

        System.out.println(franjaHoraria);

        int salarioAnual = 60000;

        double porcentajeImpuestos = (salarioAnual >= 40000) ? 0.25 : 0.15;

        System.out.println(porcentajeImpuestos);
    }
}
