package nezet;

import java.util.Scanner;
import modell.Pakli;

public class KartyaTrukk {

    private Pakli pakli;
    private static final Scanner sc = new Scanner(System.in);
      
    public KartyaTrukk() {
        indit();
    }
    //this

    private void indit() {
        pakli = new Pakli();

        for (int i = 0; i < 3; i++) {
            kirak();
            int oszlop = melyik();            
            //pakli1.kever(int oszlop);
        }
        //pakli1.ezVolt();
        pakli.getLapok();
    }

    private void kirak() {
        //Lap[]

        for (int i = 1; i < pakli.getLapok().length; i++) {
            System.out.printf("%-8s", pakli.getLapok()[i].getLeiras());
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
