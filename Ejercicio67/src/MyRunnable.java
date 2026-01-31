class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("El hilo ha sido interrumpido");
            }

            if (i == 10) {
                System.out.println("Se te ha acabado el tiempo");
                System.exit(0);
            } 
        }
    }
}
