import java.util.GregorianCalendar;

public class Film extends Medium{


    private Urheber urheber;

    private String spielzeit;

    private boolean UHD;

    private boolean HD;

    public Film(String titel, String kommentar, GregorianCalendar erscheinungsdatum, Genre genre, Urheber regisseur, String spielzeit, boolean UHD, boolean HD) {
        super(titel, kommentar, erscheinungsdatum, genre);
        this.urheber = regisseur;
        this.spielzeit = spielzeit;
        this.UHD = UHD;
        this.HD = HD;
    }

    public Urheber getUrheber() {
        return urheber;
    }

    public void setUrheber(Urheber urheber) {
        this.urheber = urheber;
    }

    public String getSpielzeit() {
        return spielzeit;
    }

    public void setSpielzeit(String spielzeit) {
        this.spielzeit = spielzeit;
    }

    public boolean isUHD() {
        return UHD;
    }

    public void setUHD(boolean UHD) {
        this.UHD = UHD;
    }

    public boolean isHD() {
        return HD;
    }

    public void setHD(boolean HD) {
        this.HD = HD;
    }


    public void ausgeben() {
        super.ausgeben();
        System.out.println("Film: " + getTitel() + "\nRegisseur: " + getUrheber() + "\nSpielzeit: " + getSpielzeit() + "\nKommentar: " + getKommentar() + "\nUHD: " + isUHD() + "\nHD: " + isHD());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


