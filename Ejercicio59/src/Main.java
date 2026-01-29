import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // JAVA HANGMAN GAME


        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> wordState = new ArrayList<>();
        ArrayList<String> palabras = new ArrayList<>();

        String rutaPalabras = "E:\\Repaso Java\\Ejercicio59\\palabras.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaPalabras))) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                palabras.add(linea.trim());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Random random = new Random();

        String palabra = palabras.get(random.nextInt(palabras.size()));

        char letra;

        int fallos = 0;

        for (int i = 0; i < palabra.length(); i++) {
            wordState.add('_');
        }

        System.out.println("Bienvenid@ al ahorcado en JAVA");

        while (fallos < 6) {

            System.out.println(getHangmanArt(fallos));

            System.out.print("Palabra: ");
            
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Introduce una letra: ");
            letra = scanner.next().toLowerCase().charAt(0);

            if (palabra.indexOf(letra) >= 0) {

                System.out.println("!Correcto!");

                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra) {
                        wordState.set(i, letra);
                    }
                }

                if (!wordState.contains('_')) {
                    System.out.println(getHangmanArt(fallos));
                    System.out.println("Has ganado !!!!");
                    System.out.println("La palabra era: " + palabra);
                    break;
                }

            } else {
                System.out.println("!Incorrecto!");
                fallos ++;
            }
        }

        if (fallos >= 6) {
            System.out.println(getHangmanArt(fallos));
            System.out.println("Has perdido :(");
            System.out.println("La palabra era: " + palabra);
        }

        scanner.close();
    }

    static String getHangmanArt(int fallos) {

        return switch (fallos) {
            case 0 -> """
                    

            
                    """;
            case 1 -> """ 
                     o


                    """;  
            case 2 -> """ 
                     o
                    |

                    """;  
            case 3 -> """ 
                     o
                    /|

                    """;  
            case 4 -> """ 
                     o
                    /|\\

                    """;  
            case 5 -> """ 
                     o
                    /|\\
                    /
                    """;  
            case 6 -> """ 
                     o
                    /|\\
                    / \\
                    """;  
            default -> ""; 
        };
    }


}
