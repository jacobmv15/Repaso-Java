import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] preguntas = {
                "¿Cuál es la función principal de un router?",
                "¿Qué parte del ordenador es considerada el cerebro?",
                "¿En qué año se lanzó Facebook?",
                "¿Quién es conocido como el padre de los ordenadores?",
                "¿Cuál fue el primer lenguaje de programación?"
        };

        String[][] respuestas = {
                {"1. Guardar ficheros", "2. Encriptar datos", "3. Direccionar el tráfico en Internet", "4. Gestionar contraseñas"},
                {"1. CPU", "2. Disco duro", "3. RAM", "4. GPU"},
                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}
        };

        int[] opcionCorrecta = {3, 1, 2, 4, 3};

        int puntuacion = 0;
        int seleccion;

        System.out.println("Bienvenido a este cuestionario en Java");
        System.out.println("***************************************");

        for (int i = 0; i < preguntas.length; i++) {

            System.out.println(preguntas[i]);

            for (String respuesta : respuestas[i]) {
                System.out.println(respuesta);
            }

            System.out.print("\nElige tu respuesta: ");
            seleccion = scanner.nextInt();

            if (seleccion == opcionCorrecta[i]) {
                System.out.println("¡Correcto!\n");
                puntuacion++;
            } else {
                System.out.println("¡Incorrecto!\n");
            }
        }

        System.out.println("Puntuación final: " + puntuacion + "/" + preguntas.length);

        scanner.close();
    }
}
