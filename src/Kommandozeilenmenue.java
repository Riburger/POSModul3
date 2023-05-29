import java.util.Date;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Kommandozeilenmenue {

    Scanner scan;

    public Kommandozeilenmenue() {
        this.scan = new Scanner(System.in);
    }

    public void MenueAnzeigen() {


        System.out.println("Willkommen in deiner persönlichen Medienbibliothek");
        System.out.println("1) Deine Medien ausgeben.");
        System.out.println("2) Nach einem Medium suchen");
        System.out.println("3) Medium hinzufügen");

        System.out.println("4) exit");
    }

    public void start() {

        Medienbibliothek medienbibliothek = new Medienbibliothek();
        String s = "-";
        while (!s.equals("3")) {
            MenueAnzeigen();
            s = scan.nextLine();
            switch (s) {
                case "1":
                    medienbibliothek.alleAusgeben();
                    break;
                case "2":
                    System.out.println("Bitte geben Sie den Titel den Sie suchen ein.");
                    String titel = scan.nextLine();
                    ;
                    medienbibliothek.einzelTitelAusgeben(titel);
                    break;
                case "3":
                    System.out.println("Möchten Sie einen Film oder ein eBook anlegen?");
                    String auswahl = scan.nextLine();


                    if (auswahl.contains("film")){
                        System.out.println("Nennen Sie den Titel des Films");
                        String neuerTitel = scan.nextLine();
                        System.out.println("Nennen Sie einen Kommentar zu dem Film");
                        String neuerKommentar = scan.nextLine();
                        System.out.println("Nennen Sie das Erscheinungsdatum(dd.MM.yyyy)");
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                        Date neuesDatum = dateFormat.parse(scan.nextLine());
                        GregorianCalendar gregorianischesDatum = new GregorianCalendar();
                        gregorianischesDatum.setTime(neuesDatum);
                        System.out.println("Nennen Sie ein Genre");
                        String genre = scan.nextLine();
                        System.out.println("Nennen Sie den Regisseur");
                        System.out.println("Vorname: ");
                        String vorname = scan.nextLine();
                        System.out.println("Nachname: ");
                        String nachname = scan.nextLine();
                        System.out.println("Firmenname: ");
                        String firmenname = scan.nextLine();
                        System.out.println("Nennen Sie die Spielzeit");
                        String spielzeit = scan.nextLine();
                        System.out.println("Ist der Film in UHD? Bitte true oder false angeben");
                        boolean uhd = scan.hasNextBoolean();
                        System.out.println("Ist der Film in HD? Bitte true oder false angeben");
                        boolean hd = scan.nextBoolean();
                        medienbibliothek.mediumHinzufuegen(new Film(neuerTitel,neuerKommentar,gregorianischesDatum, new Genre(genre), new Urheber(vorname,nachname,firmenname), spielzeit,uhd,hd));

                    }
                    break;
                case "4":
                    break;
                default:
                    this.fehler();
                    break;
            }
        }
        scan.close();
    }

    public void ausgabe() {
        System.out.println();
    }

    public void rechnen() {
        System.out.println("RECHNEN 1+1 = 2");
    }

    public void fehler() {
        System.out.println("Sie k�nnen nur 1,2 oder 3 eingeben!");
    }


}
