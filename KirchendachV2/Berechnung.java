package KirchendachV2;

public class Berechnung {
    private double gesamtHöheMeter, höheVieleckMeter, längeGrundflächeMeter, längeVieleckMeter;
    
    public Berechnung (double gesamtHöheMeter, double höheVieleckMeter, double längeGrundflächeMeter, double längeVieleckMeter){
        this.gesamtHöheMeter = gesamtHöheMeter;
        this.höheVieleckMeter = höheVieleckMeter;
        this.längeGrundflächeMeter = längeGrundflächeMeter;
        this.längeVieleckMeter = längeVieleckMeter;
    }
    //Berechnung der unteren Hälfte des Daches
    public double radiusBerechnungMeter(){
        double innenWinkel = 135.0/2.0; // hier ist es wichtig später die Formel für innenwinkel einzusetzen
        double radius = Math.tan(Math.toRadians(innenWinkel)) * (längeVieleckMeter/2); 
        return radius;
    }
    public double grundflächeOhneDurchmesser(){
        double grundflächeOhneDurchmesser = längeGrundflächeMeter - (radiusBerechnungMeter()*2);
        return grundflächeOhneDurchmesser;
    } 
    public double höheTrapetzMeter(){
        double höheTrapetzMeter = Math.sqrt((grundflächeOhneDurchmesser()*grundflächeOhneDurchmesser())+(höheVieleckMeter*höheVieleckMeter)); 
        return höheTrapetzMeter;
    }
}
