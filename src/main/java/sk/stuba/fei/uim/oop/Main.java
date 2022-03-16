package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.kontakty.Kontakt;

public class Main {
    public static void main(String[] args) {
        var tomas = new Kontakt("Tomas", "Kovacik");
        var jakub = new Kontakt("JAKUB", "Kovar");
        var dominik = new Kontakt("Dominik Pruzinsky");

        var prednasajuci = new Kontakt("Gabriel", "Juhas");

        prednasajuci.pridajZnamych(new Kontakt[] {new Kontakt(tomas), new Kontakt(jakub), new Kontakt(dominik)});

        prednasajuci.vypisZnamych();

        tomas.setMeno("Tomaskoo");
        prednasajuci.vypisZnamych();
    }
}
