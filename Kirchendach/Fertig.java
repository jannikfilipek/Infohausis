package Kirchendach;

import java.util.Scanner;

public class Fertig {
    public static void main (String [] args){
        // Init
        Scanner scan = new Scanner (System.in);
        double qlaenge, laengev, hoehev, hoeheg, unten, oben, gesamt;

        // Abfrage
        System.out.println("----------------------------------");
        System.out.println("Willkommen zum Kirchendach-Berechnungsprogramm!");
        System.out.println("Das Programm kann die Oberfläche von Kirchendächern mit einer quadratischen Grundfläche und einer achteckigen Zwischenstufe berechnen.");

        do {
            System.out.println("Geben Sie bitte zunächst die gefragten Werte an:\n");
            System.out.println("Länge der quadratischen Grundfläche:");
            qlaenge = scan.nextDouble();
            System.out.println("Länge einer Seite des Achtecks:");
            laengev = scan.nextDouble();
            System.out.println("Abstand des Achtecks zur Grundfläche:");
            hoehev = scan.nextDouble();
            System.out.println("Gesamthöhe:");
            hoeheg = scan.nextDouble();

            // Frage nach Werterichtigkeit
            System.out.println("Sind dies die richtigen Werte? (y/n)");
            System.out.println("Länge der quadratischen Grundfläche: " + qlaenge);
            System.out.println("Länge einer Seite des Achtecks: " + laengev);
            System.out.println("Abstand des Achtecks zur Grundfläche: " + hoehev);
            System.out.println("Gesamthöhe: " + hoeheg);

            String abfrage = scan.next();
            if (abfrage.equalsIgnoreCase("n")) {
                continue; // Starte die Schleife erneut
            } else if (abfrage.equalsIgnoreCase("y")) {
                break; // Beende die Schleife
            } else {
                System.out.println("Ungültige Eingabe. Bitte geben Sie 'y' für Ja oder 'n' für Nein ein.");
            }
        } while (true);

        unten = gbism(qlaenge, laengev, hoehev);
        oben = mbiso(hoeheg, hoehev, laengev);
        gesamt = unten + oben;
        System.out.println("Die Gesamtfläche ohne die Grundfläche beträgt: " + gesamt + " Quadratmeter");

        // Schließt den Scanner
        scan.close();
    }

    public static double gbism(double laengeg, double laengev, double hoehe) {
        double radius = laengev / ( Math.tan(Math.toRadians(67.5)));
        double z = (laengeg - (2 * radius)) / 2;
        double b = (laengeg - laengev) / 2;
        double g = Math.sqrt(b * b + z * z);
        double seiteq = Math.sqrt(g * g + hoehe * hoehe);
        double seiteg = Math.sqrt(hoehe * hoehe + b * b);
        double ueber = Math.sqrt(seiteq * seiteq - seiteg * seiteg);
        double flaecheue = seiteg * ueber * 2;
        double ohneue = laengeg - (2 * ueber);
        double flaecheq = ohneue * seiteg * 4;
        double flaeched = Math.sqrt(seiteq * seiteq - (laengev * laengev)) * laengev * 2;
        return flaeched + flaecheue + flaecheq;
    }

    public static double mbiso(double hoeheg, double hoehev, double laengev) {
        double hoehe = hoeheg - hoehev;
        double radius = laengev / ( Math.tan(Math.toRadians(67.5)));
        double seite = Math.sqrt(hoehe * hoehe + radius * radius);
        double flaecheg = seite * laengev * 4;
        return flaecheg;
    }
}
