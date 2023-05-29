import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Medienbibliothek {
    private ArrayList<Medium> medienliste;


    public Medienbibliothek() {
        this.medienliste = new ArrayList<>();
    }


    public void mediumHinzufuegen(Medium medium){
        this.medienliste.add(medium);
    }

    public void alleAusgeben() {
        for (Medium m : medienliste){
            m.ausgeben();
        }
    }

    public void einzelTitelAusgeben(String titel){

        for (Medium m : medienliste){
            if (titel.equals(m.getTitel())){
                System.out.println(m);
            }

    }
    }






















    Medium m1 = new Medium("Stirb Langsam","Sehr guter Film", new GregorianCalendar(2017, Calendar.JUNE,23), new Genre("Horror"));

}