    import java.time.LocalTime;
    import java.time.format.DateTimeFormatter;
    import java.time.format.DateTimeParseException;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            // JAVA ALARM CLOCK

            Scanner scanner = new Scanner(System.in);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

            LocalTime alarma = null;

            String rutaAlarma = "Ejercicio69\\R.I.PLaManshon.wav";

            while (alarma == null) {
                try {
                    System.out.print("Establece la hora de la alarma (HH:MM:SS): ");
                    String inputTime = scanner.nextLine();

                    alarma = LocalTime.parse(inputTime, formatter);

                    System.out.println("La alarma se ha establecido a las " + alarma);

                } catch (DateTimeParseException e) {
                    System.out.println("Formato inválido, usa HH:MM:SS");
                }
            }

            AlarmClock alarmClock = new AlarmClock(alarma, rutaAlarma, scanner);
            Thread hiloAlarma = new Thread(alarmClock);

            hiloAlarma.start();

        }
    }
