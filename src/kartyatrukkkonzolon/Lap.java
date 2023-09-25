package kartyatrukkkonzolon;

public class Lap {

    private String[] szinek = {"P", "T", "Z", "M"};
    private String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

    private String leiras;

    public Lap(String leiras) {
        this.leiras = leiras;
    }

    public String getLeiras() {
        return leiras;
    }

}
