package Kirchendach;
import java.util.Scanner;
public class Test {
    public static void main (String [] args){
        //init
        Scanner scan = new Scanner(System.in);
        String abfrage;
        boolean abf = false;
        double hoeheg, qlaenge, hoehev, laengev,unten,oben,gesamt;
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
        unten = gbism(qlaenge,laengev,hoehev);
        oben =mbiso(hoeheg, hoehev, laengev);
        gesamt = unten + oben;
        System.out.println("Die Gesamtfläche ohne die Grundfleache beträgt: "+ gesamt +" quadrat Meter");
        //scannerschließung
        scan.close();
    }
    public static double grundflaeche (double laenge){
        double r = laenge * laenge;
        return r;
    }
    public static double gbism (double laengeg, double laengev, double hoehe){ // von grundflaenche bis mitte mit allen rechnungen 
        // zuerst wird der radius des vielecks (noch 8) bestimmt (Aufräumen notwendig!)
        double a = laengev/2; 
        double radius =  a* Math.tan(Math.toRadians(67.5));
        double d = radius  *2;
        double za = laengeg - d;
        double z = za/2;
        double ba = laengeg - laengev;
        double b = ba/2;
        double zz = z*z;
        double bb = b*b;
        double g = Math.sqrt(bb+zz);
        double hh = hoehe * hoehe; 
        double gg = g*g;
        double seiteq = Math.sqrt(gg+hh);
        double seiteg = Math.sqrt(hh+bb);
        double seitegg = seiteg* seiteg;
        double seiteqq = seiteq * seiteq;
        double ueber = Math.sqrt(seiteqq - seitegg);
        //jetzt werden die flächen der trapetze bestimmt
        double flaecheue = seiteg*ueber*2;
        double ohneue = laengeg- ueber*2;
        double flaecheq = ohneue*seiteg*4;
        // jetzt noch die dreieecke
        double laengevv = laengev*laengev;
        double t = Math.sqrt(seiteqq-laengevv);
        double flaeched = t*laengev*2;
        double flaechegesamt = flaeched + flaecheue + flaecheq;
        return flaechegesamt;
    }
    public static double mbiso (double hoeheg,double hoehev, double laengev){
        double hoehe = hoeheg - hoehev;
        double a = laengev/2; 
        double radius =  a* Math.tan(Math.toRadians(67.5));
        double rr = radius*radius;
        double hh = hoehe* hoehe;
        double seite = Math.sqrt(hh+rr);
        double flaecheg = seite*laengev*4;
        return flaecheg;
    }

}
