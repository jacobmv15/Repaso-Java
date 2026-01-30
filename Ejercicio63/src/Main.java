import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        
        // Java COUNTDOWN TIMER PROGRAM

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de segundos para empezar la cuenta atrás: ");
        int respuesta = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            

            int contador = respuesta;

            @Override
            public void run(){
                
                System.out.println(contador);
                contador--;

                if (contador < 0) {
                    System.out.println("Feliz año nuevo");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(timerTask, 0, 1000); //(task, delay, period)
        
        scanner.close();
    }
}
