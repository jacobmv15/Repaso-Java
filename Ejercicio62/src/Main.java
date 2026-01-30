import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        // Timer = Class that schedules tasks at specific times or periodically
        //         Useful for: sending notifications, scheduled updates, repetitive actions

        // TimerTask = Represents the task that will be executed by the Timer
        //             You will extend the TimerTask class to define your task
        //             Create a subclass of TimerTask and @Override run()

        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask() {

            int cont = 0;
            @Override
            public void run() {
                System.out.println("Hola");
                cont++;

                if (cont == 3) {
                    System.out.println("Tarea completada");
                    timer.cancel();
                }
            }
        };

        timer.schedule(timerTask, 3000, 1000);
    }
}
