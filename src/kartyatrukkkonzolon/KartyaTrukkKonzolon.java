package kartyatrukkkonzolon;

import java.util.Scanner;

public class KartyaTrukkKonzolon {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        KartyaTrukkKonzolon kt = new KartyaTrukkKonzolon();
        kt.indit();

    }

    public KartyaTrukkKonzolon() {

    }

    private void indit() {
        Pakli pakli1 = new Pakli();

        //feltolt();
        for (int i = 0; i < 3; i++) {
            pakli1.kirak();
            int oszlop = melyik();
            pakli1.kever(oszlop);           
            
            //kever(oszlop);
        }
        pakli1.ezVolt();
        //ezVolt();

    }

    private static int melyik() {
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
