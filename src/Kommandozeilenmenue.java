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
        System.out.println("2) Nach einem Titel suchen");
        System.out.println("3) exit");
        }

public void start() {
        String s = "-";
        while (!s.equals("3")) {
        MenueAnzeigen();
        s = scan.nextLine();
        switch(s)
        {
        case "1":
        this.ausgabe();
        break;
        case "2":
        this.rechnen();
        break;
        case "3":
        break;
default:
        this.fehler();
        break;
        }
        }
        scan.close();
        }

public void ausgabe()
        {
        System.out.println();
        }

public void rechnen()
        {
        System.out.println("RECHNEN 1+1 = 2");
        }

public void fehler()
        {
        System.out.println("Sie k�nnen nur 1,2 oder 3 eingeben!");
        }


        }
