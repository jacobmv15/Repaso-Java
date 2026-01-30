public class Main {
    public static void main(String[] args) {

        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                   Add custom behavior without having to create a new class.
        //                   Often used for one time uses (TimerTask, Runnable, callbacks)

        Perro perro1 = new Perro();
        
        Perro perro2 = new Perro(){

            @Override
            void ladrar() {
                System.out.println("Scooby Doo habla español");
            }
        };
        
        perro1.ladrar();
        perro2.ladrar();
    }
}
