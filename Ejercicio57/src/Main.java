import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {

        // How to read a file using Java (3 popular options)

        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g., images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        String rutaFichero = "E:\\Repaso Java\\Ejercicio57\\fichero.txt";

        // ===== BufferedReader + FileReader =====
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaFichero))) {

            String linea;

            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ===== FileInputStream =====
        try (FileInputStream fileInputStream = new FileInputStream(rutaFichero)) {

            int byteLeido;

            while ((byteLeido = fileInputStream.read()) != -1) {
                System.out.print((char) byteLeido);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // ===== RandomAccessFile =====
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(rutaFichero, "r")) {

            randomAccessFile.seek(0);

            String linea;

            while ((linea = randomAccessFile.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
