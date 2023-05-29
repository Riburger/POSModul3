import java.util.GregorianCalendar;

public class eBook extends Medium{

private Urheber autor;

private String ISBN;

private String Seitenanzahl;

private String auflage;

    public eBook(String titel, String kommentar, GregorianCalendar erscheinungsdatum, Genre genre, Urheber autor, String ISBN, String seitenanzahl, String auflage) {
        super(titel, kommentar, erscheinungsdatum, genre);
        this.autor = autor;
        this.ISBN = ISBN;
        Seitenanzahl = seitenanzahl;
        this.auflage = auflage;
    }

    public Urheber getAutor() {
        return autor;
    }

    public void setAutor(Urheber autor) {
        this.autor = autor;
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

    public void ausgeben() {
        super.ausgeben(); // Aufruf der Ausgabemethode der Superklasse Medium
        System.out.println("eBook: " + getTitel() + "\nAutor: " + getAutor() + "\nISBN: " + getISBN() + "\nSeitenanzahl: " + getSeitenanzahl() + "\nAuflage: " + getAuflage());
    }

}
