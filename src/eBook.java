import java.util.GregorianCalendar;

public class eBook extends Medium{

private String Autor;

private String ISBN;

private String Seitenanzahl;

private String auflage;

    public eBook(String titel, String kommentar, GregorianCalendar erscheinungsdatum, Genre genre, String autor, String ISBN, String seitenanzahl, String auflage) {
        super(titel, kommentar, erscheinungsdatum, genre);
        Autor = autor;
        this.ISBN = ISBN;
        Seitenanzahl = seitenanzahl;
        this.auflage = auflage;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getSeitenanzahl() {
        return Seitenanzahl;
    }

    public void setSeitenanzahl(String seitenanzahl) {
        Seitenanzahl = seitenanzahl;
    }

    public String getAuflage() {
        return auflage;
    }

    public void setAuflage(String auflage) {
        this.auflage = auflage;
    }
}
