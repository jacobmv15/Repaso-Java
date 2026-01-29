import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    public static void main(String[] args) {
        
        // How to PLAY AUDIO with Java (.wav, .au, .aiff)

        String rutaMusica = "E:\\Repaso Java\\Ejercicio58\\R.I.PLaManshon.wav";
        
        File file = new File(rutaMusica);

        try (Scanner scanner = new Scanner(System.in);
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {
            
            String respuesta = "";

            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            while (!respuesta.equals("S")) {
                
                System.out.println("T = Tocar");
                System.out.println("P = Pausar");
                System.out.println("R = Reiniciar");
                System.out.println("S = Salir");
                System.out.print("Introduce tu opción: ");
                respuesta = scanner.next().toUpperCase();

                switch (respuesta) {
                    case "T" -> clip.start();
                    case "P" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "S" -> clip.close();
                    default -> System.out.println("Opción inválida");
                }
            }

        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
