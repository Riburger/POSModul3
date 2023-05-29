import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;


public class Medium {

    private String titel;

    private String Kommentar;

    private GregorianCalendar Erscheinungsdatum;

    private  Genre genre;

    private SimpleDateFormat datumsformatierer;

    public Medium(String titel, String kommentar, GregorianCalendar erscheinungsdatum, Genre genre) {

        this.titel = titel;
        Kommentar = kommentar;
        Erscheinungsdatum = datumsformatierer(erscheinungsdatum);
        this.genre = genre;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getKommentar() {
        return Kommentar;
    }

    public void setKommentar(String kommentar) {
        Kommentar = kommentar;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
