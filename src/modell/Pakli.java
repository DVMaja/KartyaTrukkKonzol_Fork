package modell;

public class Pakli {

    private Lap[] lapok;

    public Pakli() {
        lapok = new Lap[22];
        this.feltolt();
    }

    public Lap[] getLapok() {
        return lapok;
    }

    private void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < lapok.length; e++) {
                lapok[i++] = new Lap(szin + "_" + ertekek[e]);
            }
        }
    }

    private void kever(int oszlop) {//setter        
        Lap[] ujLapok = new Lap[22];
        switch (oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    ujLapok[i] = lapok[20 - (i - 1) * 3];
                    ujLapok[i + 7] = lapok[19 - (i - 1) * 3];
                    ujLapok[i + 14] = lapok[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    ujLapok[i] = lapok[19 - (i - 1) * 3];
                    ujLapok[i + 7] = lapok[20 - (i - 1) * 3];
                    ujLapok[i + 14] = lapok[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    ujLapok[i] = lapok[19 - (i - 1) * 3];
                    ujLapok[i + 7] = lapok[21 - (i - 1) * 3];
                    ujLapok[i + 14] = lapok[20 - (i - 1) * 3];
                }
                break;
        }
        lapok = ujLapok;
    }

    private void ezVolt() {
        //System.out.println("A választott lap: " + pakli[11]);
        Lap ezVolt =lapok[11];
    }

    
}
