package KirchendachV2;
public class Main {
    static private double gesamtHöheMeter, höheVieleckMeter, längeGrundflächeMeter, längeVieleckMeter;
    public static void main(String[] args){
        Abfrage.willkommensGruß();
        gesamtHöheMeter = Abfrage.gesamtHöheMeter();
        höheVieleckMeter = Abfrage.höheVieleckMeter();
        längeGrundflächeMeter = Abfrage.längeGrundflächeMeter();
        längeVieleckMeter = Abfrage.längeVieleckMeter();
    }
}
