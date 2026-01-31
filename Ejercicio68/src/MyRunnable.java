class MyRunnable implements Runnable {

    private final String TEXTO; 

    public MyRunnable(String TEXTO) {
        this.TEXTO = TEXTO;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(TEXTO);
            } catch (InterruptedException e) {
                System.out.println("El hilo ha sido interrumpido");
            }
        }        
    }
    
}
