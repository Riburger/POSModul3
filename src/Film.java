import java.util.GregorianCalendar;

public class Film extends Medium{


    private String regisseur;

    private String spielzeit;

    private boolean UHD;

    private boolean HD;

    public Film(String titel, String kommentar, GregorianCalendar erscheinungsdatum, Genre genre, String regisseur, String spielzeit, boolean UHD, boolean HD) {
        super(titel, kommentar, erscheinungsdatum, genre);
        this.regisseur = regisseur;
        this.spielzeit = spielzeit;
        this.UHD = UHD;
        this.HD = HD;
    }

    public String getRegisseur() {
        return regisseur;
    }

    public void setRegisseur(String regisseur) {
        this.regisseur = regisseur;
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
}


