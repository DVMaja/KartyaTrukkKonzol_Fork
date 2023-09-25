package nezet;

import java.util.Scanner;
import modell.Pakli;

public class KartyaTrukk {

    private static final Scanner sc = new Scanner(System.in);

    public KartyaTrukk() {
        indit();

    }

    private void indit() {
        Pakli pakli1 = new Pakli();

        for (int i = 0; i < 3; i++) {
            //pakli1.kirak();
            int oszlop = melyik();
            //pakli1.kever(oszlop);
        }
        //pakli1.ezVolt();
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
