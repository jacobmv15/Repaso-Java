import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

class AlarmClock implements Runnable {

    private final LocalTime alarma;
    private final String rutaCancion;
    private final Scanner scanner;

    public AlarmClock(LocalTime alarma, String rutaCancion, Scanner scanner) {
        this.alarma = alarma;
        this.rutaCancion = rutaCancion;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        
        while (LocalTime.now().isBefore(alarma)) {
            try {
                Thread.sleep(1000);

                LocalTime ahora = LocalTime.now();

                System.out.printf("\r%02d:%02d:%02d" ,ahora.getHour(), ahora.getMinute(), ahora.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido");
            }
        }

        System.out.println("\nSuena la alarma");
        playSound(rutaCancion);
    }

    private void playSound(String rutaCancion) {

        File audioFile = new File(rutaCancion);

        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile)) {
            
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            System.out.println("Presiona INTRO y para la alarma");
            scanner.nextLine();
            clip.stop();
            
            scanner.close();

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Formato de audio no soportado");
        } catch (LineUnavailableException e) {
            System.out.println("El audio no está disponible");
        } catch (IOException e) {
            System.out.println("Error leyendo el audio");
        }
    }
}