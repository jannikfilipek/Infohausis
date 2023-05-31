package Kirchendach;
import java.util.Scanner;
public class Test {
    public static void main (String [] args){
        //init
        Scanner scan = new Scanner(System.in);
        String abfrage;
        boolean abf = false;
        double hoeheg, qlaenge, hoehev, laengev;
        //abfrage
        System.out.println("----------------------------------");
        System.out.println("Willkommen zu dem Kirchendach berechnungsprogramm!");
        System.out.println("Das Programm kann leider lediglich die Oberfläche von Kirchendächern mit einer quadratischen Grundfläche und mit einer Achtekigen Zwischenstufe berechnen."); //vll. Spätere anpassung?
        do {
            abf = false;
            System.out.println("Geben Sie bitte zunächst die gefragten Werte an:");
            System.out.println();
            System.out.println("länge der quadratischen Grundfläche:");
            qlaenge = scan.nextDouble();
            System.out.println("länge einer Seite des Vielecks:");
            laengev = scan.nextDouble();
            System.out.println("Abstand des Vielecks zur Grundfläche: ");
            hoehev = scan.nextDouble();
            System.out.println("Gesamthöhe:");
            hoeheg = scan.nextDouble();
            //Frage nach Werterichtigkeit
            System.out.println("Sind dies die richtigen werte? (y/n)");
            System.out.println("länge der quadratischen Grundfläche: "+qlaenge);
            System.out.println("länge einer Seite des Vielecks: "+laengev);
            System.out.println("Abstand des Vielecks zur Grundfläche: "+hoehev);
            System.out.println("Gesamthöhe:"+hoeheg);
            abfrage = scan.next();
            if (abfrage == "n") abf = true; //nimmt bei falschangaben (nicht n oder y) Automatisch an ( nicht optimal)

        } while (abf == true); 

        //scannerschließung
        scan.close();
    }
}
