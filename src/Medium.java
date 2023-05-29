import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Medium {

    private String titel;
    private String kommentar;
    private GregorianCalendar erscheinungsdatum;
    private Genre genre;
    private SimpleDateFormat datumsformatierer;

    public Medium(String titel, String kommentar, GregorianCalendar erscheinungsdatum, Genre genre) {
        this.titel = titel;
        this.kommentar = kommentar;
        this.erscheinungsdatum = erscheinungsdatum;
        this.genre = genre;
        this.datumsformatierer = new SimpleDateFormat("dd.MM.yyyy");
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public GregorianCalendar getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public void setErscheinungsdatum(GregorianCalendar erscheinungsdatum) {
        this.erscheinungsdatum = erscheinungsdatum;
    }

    public void ausgeben() {
        String formatiertesDatum = datumsformatierer.format(erscheinungsdatum.getTime());
        System.out.println("Medium:\nTitel: " + titel + "\nKommentar: " + kommentar + "\nGenre: " + genre.getName() + " " + formatiertesDatum);

    }

    @Override
    public String toString() {
        return "Medium " +
                "titel = " + titel + '\'' +
                ", kommentar = " + kommentar + '\'' +
                ", erscheinungsdatum = " +   datumsformatierer.format(erscheinungsdatum.getTime()) +
                ", genre = " + genre.getName() +
                ' ';
    }
}
