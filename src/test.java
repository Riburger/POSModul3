import java.util.GregorianCalendar;

public class test {

    public static void main(String[] args) {

        Medium m1 = new Medium("test", "test", new GregorianCalendar(2023,6,23), new Genre("test"));
        Film f1 = new Film("Herr der Ringe", "Gut", new GregorianCalendar(2002,6,23), new Genre("Abenteuer"), "Peter Jackson", "280 Minuten", true, true);
        eBook e1= new eBook("Harry Potter", "Sehr gut", new GregorianCalendar(2000, 5,29), new Genre("Fantasy"), "J.K.Rowling", "259875", "365", "Erste Auflage" );

       // f1.ausgeben();

        Medienbibliothek media = new Medienbibliothek();

        media.mediumHinzufuegen(f1);
        System.out.println();
        media.mediumHinzufuegen(m1);
        System.out.println();
        media.mediumHinzufuegen(e1);

        media.alleAusgeben();



    }
}
