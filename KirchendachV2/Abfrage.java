package KirchendachV2;
import java.util.Scanner;
public class Abfrage {
    static Scanner scan = new Scanner(System.in);
    
    public static void willkommensGruß(){
        System.out.println("----------------------------------");
        System.out.println("Willkommen zu dem Kirchendach berechnungsprogramm!");
        System.out.println("Das Programm kann leider lediglich die Oberfläche von Kirchendächern mit einer quadratischen Grundfläche und mit einer Achtekigen Zwischenstufe berechnen."); //vll. Spätere anpassung?
        System.out.println("Geben Sie bitte zunächst die gefragten Werte an:");
        System.out.println();
    }

    public static double gesamtHöheMeter(){
        System.out.println("Gesamthöhe: ");
        return scan.nextDouble();
    }

    public static double längeGrundflächeMeter(){
        System.out.println("Länge der Grundfläche: ");
        return scan.nextDouble();
    }

    public static double längeVieleckMeter(){
        System.out.println("Länge einer Seite des Vielecks: ");
        return scan.nextDouble();
    }

    public static double höheVieleckMeter(){
        System.out.println("Abstand des Vielecks zum Boden: ");
        return scan.nextDouble();
    }
}

