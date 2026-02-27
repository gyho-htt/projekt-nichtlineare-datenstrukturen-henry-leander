public class Fahrrad implements ComparableContent<Fahrrad> {


    private String typ;
    private String marke;
    private String farbe;
    private String Laufradgroesse;
    private String Rahmengroesse;
    private int preis;
    private int Erscheinungsjahr;
    private String Daempfer;
    private String Gabel;
    private int Federweg;
    private int Daempferweg;
    private String Modellname;
    private boolean Favorit;

    public Fahrrad(String pTyp, String pMarke, String pFarbe, String pLaufradgroesse, String pRahmengroesse, int pPreis, int pErscheinungsjahr, String pDaempfer, String pGabel, int pFederweg, int pDaempferweg, String pModellname, boolean pFavorit) {
        this.typ = pTyp;
        this.marke = pMarke;
        this.farbe = pFarbe;
        this.Laufradgroesse = pLaufradgroesse;
        this.Rahmengroesse = pRahmengroesse;
        this.preis = pPreis;
        this.Erscheinungsjahr = pErscheinungsjahr;
        this.Daempfer = pDaempfer;
        this.Gabel = pGabel;
        this.Federweg = pFederweg;
        this.Daempferweg = pDaempferweg;
        this.Modellname = pModellname;
        this.Favorit = pFavorit;
    }

    public String getTyp() {
        return typ;
    }

    public String getMarke() {
        return marke;
    }

    public String getFarbe() {
        return farbe;
    }

    public String getLaufradgroesse() {
        return Laufradgroesse;
    }

    public String getRahmengroesse() {
        return Rahmengroesse;
    }

    public int getPreis() {
        return preis;
    }

    public int getErscheinungsjahr() {
        return Erscheinungsjahr;
    }

    public String getDaempfer() {
        return Daempfer;
    }

    public String getGabel() {
        return Gabel;
    }

    public int getFederweg() {
        return Federweg;
    }

    public int getDaempferweg() {
        return Daempferweg;
    }

    public String getModellname() {
        return Modellname;
    }

    public boolean getFavorit() {
        return Favorit;
    }

    public boolean isLess(Fahrrad pHenry) {
        return this.preis < pHenry.preis;
    }

    public boolean isGreater(Fahrrad pHenry) {
        return this.preis > pHenry.preis;
    }

    public boolean isEqual(Fahrrad pHenry) {
        return this.preis == pHenry.preis;
    }

    public String toString() {
        return "Typ: " + typ + " Marke: " + marke + " Modellname: " + Modellname + " Farbe: " + farbe + " Laufrasgröße: " + Laufradgroesse + " Zoll Rahmengröße: " + Rahmengroesse + " Preis: " + preis + "€ Erscheinungsjahr: " + Erscheinungsjahr + " Dämpfer: " + Daempfer + " Gabel " + Gabel + " Dämpferweg: " + Daempferweg + "mm Gabelweg: " + Federweg + "mm Favorit: " + Favorit;
    }




}

