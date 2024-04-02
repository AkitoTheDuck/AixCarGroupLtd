import com.example.Abteilung;
import com.example.BueroArbeiter;
import com.example.Manager;
import com.example.Schichtarbeiter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Schichtarbeiter
        Schichtarbeiter gustav = new Schichtarbeiter(3001, "Gustav", 12.0);
        gustav.setAnzahlStunden(160);
        Schichtarbeiter jan = new Schichtarbeiter(3002, "Jan", 18.0);
        jan.setAnzahlStunden(70);
        Schichtarbeiter vladislav = new Schichtarbeiter(3003, "Vladislav", 23.0);
        vladislav.setAnzahlStunden(40);
        Schichtarbeiter jean = new Schichtarbeiter(3004, "Jean", 20.0);
        jean.setAnzahlStunden(90);

        //BueroArbeiter
        BueroArbeiter steffen = new BueroArbeiter(5101, "Steffen", 1500.0);
        BueroArbeiter jochen = new BueroArbeiter(5102, "Jochen", 450.0);
        BueroArbeiter mara = new BueroArbeiter(5103, "Mara", 2000.0);
        BueroArbeiter filo = new BueroArbeiter(5104, "Filo", 1780.0);

        //Manager
        Manager florian = new Manager(5001, "Florian", 2350.0, 137.0);
        Manager sebastian = new Manager(5002, "Sebastian", 2040.0, 250.0);
        Manager dominik = new Manager(5003, "Dominik", 1580.0, 630.0);
        Manager hannes = new Manager(5004, "Hannes", 2480.0, 720.0);

        //Abteilungen
        Abteilung entwicklung = new Abteilung("Entwicklung", florian);
        Abteilung consulting = new Abteilung("Consulting", sebastian);

        entwicklung.changeLeiter(dominik);
        entwicklung.add(jochen);
        entwicklung.add(steffen);
        entwicklung.add(florian);
        System.out.println(entwicklung.gehaltsListe());

        consulting.changeLeiter(hannes);
        consulting.add(mara);
        consulting.add(filo);
        consulting.add(dominik);
        System.out.println(consulting.gehaltsListe());

        System.out.println("------------");
    }
}