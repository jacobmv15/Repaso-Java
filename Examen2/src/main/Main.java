package main;

import java.util.Arrays;

import mandos.Mando;
import mandos.MandoAireAcondicionado;
import mandos.MandoAspiradora;
import mandos.MandoMinicadena;
import mandos.MandoTelevision;

public class Main {

    public static void main(String[] args) {

        Mando[] mandos = new Mando[10];

        mandos[0] = new MandoTelevision("Samsung", 5, 15, 20);
        mandos[1] = new MandoTelevision("LG", 5, 15, 22);
        mandos[2] = new MandoMinicadena("Sony", 4, 14, 18);
        mandos[3] = new MandoMinicadena("Panasonic", 4, 14, 19);
        mandos[4] = new MandoAspiradora("Rowenta", 6, 16, 25);
        mandos[5] = new MandoAspiradora("Bosch", 6, 16, 27);
        mandos[6] = new MandoAireAcondicionado("Daikin", 7, 17, 30);
        mandos[7] = new MandoAireAcondicionado("Mitsubishi", 7, 17, 32);
        mandos[8] = new MandoTelevision("Philips", 5, 15, 21);
        mandos[9] = new MandoMinicadena("JVC", 4, 14, 17);

        Arrays.sort(mandos);

        for (Mando mando : mandos) {
            System.out.println(mando);
        }

        for (Mando mando : mandos) {

            mando.encender();

            if (mando instanceof MandoTelevision mandoTv) {
                mandoTv.cambiarCanal();
                mandoTv.subirVolumen();
                mandoTv.bajarVolumen();
            }

            if (mando instanceof MandoMinicadena mandoMinicadena) {
                mandoMinicadena.subirVolumen();
                mandoMinicadena.bajarVolumen();
            }

            if (mando instanceof MandoAspiradora mandoAspiradora) {
                mandoAspiradora.subirVelocidad();
                mandoAspiradora.bajarVelocidad();
            }

            if (mando instanceof MandoAireAcondicionado mandoAire) {
                mandoAire.cambiarModo();
                mandoAire.cambiarTemperatura();
                mandoAire.subirVelocidad();
                mandoAire.bajarVelocidad();
            }
        }
    }
}
