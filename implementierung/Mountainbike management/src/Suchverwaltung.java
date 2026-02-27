import java.util.ArrayList;
import java.util.List;
public class Suchverwaltung {

    private BinarySearchTree<Fahrrad> FahrradSuche;

    public Suchverwaltung () {
        FahrradSuche = new BinarySearchTree<>();
    }

    public void FahrradHinzuguegen (Fahrrad pHenry) {
        if (pHenry != null) {
            FahrradSuche.insert(pHenry);
        }
    }

    public List<Fahrrad> Suche(String typ, String marke, String farbe, String Laufradgroesse, String Rahmengroesse, int preis, int Erscheinungsjahr, String Daempfer, String Gabel, int Federweg, int Daempferweg, String Modellname, boolean Favorit) {
        List<Fahrrad> ergebnisListe = new ArrayList<>();
        sucheRekursiv(FahrradSuche, typ, marke, farbe, Laufradgroesse, Rahmengroesse, preis, Erscheinungsjahr, Erscheinungsjahr, Daempfer, Gabel, Federweg, Daempferweg, Modellname, Favorit) {
            return ergebnisListe;
        }
    }

    private void sucheRekursiv(BinarySearchTree<Fahrrad> Teilbaum, String typ, String marke, String farbe, String Laufradgroesse, String Rahmengroesse, int preis, int Erscheinungsjahr, String Daempfer, String Gabel, int Federweg, int Daempferweg, String Modellname, boolean Favorit, List<Fahrrad> ergebnisListe) {
        if (Teilbaum == null || Teilbaum.isEmpty()) {
            return;
        }

        Fahrrad aktuellesFahrrad = Teilbaum.getContent();
        if (passtZuSuche(aktuellesFahrrad, typ, marke, farbe, Laufradgroesse, Rahmengroesse, preis, Erscheinungsjahr, Erscheinungsjahr, Daempfer, Gabel, Federweg, Daempferweg, Modellname, Favorit)) {
            ergebnisListe.add(aktuellesFahrrad);
        }

        sucheRekursiv(Teilbaum.getLeftTree(), typ, marke, farbe, Laufradgroesse, Rahmengroesse, preis, Erscheinungsjahr, Erscheinungsjahr, Daempfer, Gabel, Federweg, Daempferweg, Modellname, Favorit);
        sucheRekursiv(Teilbaum.getRightTree(), typ, marke, farbe, Laufradgroesse, Rahmengroesse, preis, Erscheinungsjahr, Erscheinungsjahr, Daempfer, Gabel, Federweg, Daempferweg, Modellname, Favorit);

        private boolean passtZuSuche(Fahrrad f, typ, marke, farbe, Laufradgroesse, Rahmengroesse, preis, Erscheinungsjahr, Erscheinungsjahr, Daempfer, Gabel, Federweg, Daempferweg, Modellname, Favorit) {
            if (preis!= null && f.getPreis() < preis) {
                return false;
            }

            
        }

    }

}
