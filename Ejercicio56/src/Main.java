import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // How to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String baseRuta = "E:\\\\Repaso Java\\\\Ejercicio56\\\\";

        // ================================
        //          FileWriter
        // ================================
        String mensaje = "Me gusta la pizza!\nCómprame una pizza";

        try (FileWriter fileWriter = new FileWriter(baseRuta + "filewriter.txt")) {

            fileWriter.write(mensaje);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // ================================
        //          BufferedWriter
        // ================================
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(baseRuta + "bufferedwriter.txt"))) {

            bufferedWriter.write("Texto usando BufferedWriter");
            bufferedWriter.newLine();
            bufferedWriter.write("Mejor rendimiento con mucho texto");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // ================================
        //          PrintWriter
        // ================================
        try (PrintWriter printWriter = new PrintWriter(baseRuta + "printwriter.txt")) {

            printWriter.println("Reporte de ventas");
            printWriter.println("-----------------");
            printWriter.println("Producto: Pizza");
            printWriter.println("Precio: $10");
            printWriter.printf("Cantidad: %d%n", 3);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // ================================
        //          FileOutputStream
        // ================================
        byte[] datos = {65, 66, 67, 68}; // A B C D en ASCII

        try (FileOutputStream fos = new FileOutputStream(baseRuta + "binario.dat")) {

            fos.write(datos);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
