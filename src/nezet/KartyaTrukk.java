package nezet;

import java.util.Scanner;
import modell.Pakli;

public class KartyaTrukk {

    private static final Scanner sc = new Scanner(System.in);

    public KartyaTrukk() {
        Pakli pakli1 = new Pakli();

        for (int i = 0; i < 3; i++) {
            kirak(pakli1);
            int oszlop = melyik();
            //pakli1.kever(oszlop);
        }
        //pakli1.ezVolt();
        pakli1.getPakli();

    }

    //private void indit() {}
    private void kirak(Pakli pakli1) {

        for (int i = 1; i < pakli1.getPakli().length; i++) {
            System.out.printf("%-8s", pakli1.getPakli()[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }

    private int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }

}
