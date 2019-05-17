import org.pmw.tinylog.Logger;

public class Tarolo {

    /**
     * A tároló mérete
     */
    private static int count = 16;


    /**
     * A tömb amiben vagy 'p','f' vagy null érték lehet
     */
    private Mezo[] tarolo = new Mezo[count];

    public Tarolo() {
        for (int i = 0; i < 3; ++i) {
            tarolo[2 * i] = new Mezo(new Labda('p'));
            tarolo[2 * i + 1] = new Mezo(new Labda('f'));
        }
        for (int i = 6; i < 16; ++i) {
            tarolo[i] = new Mezo(null);
        }
    }


    public Tarolo(Mezo[] tarolo) {
        this.tarolo = tarolo;
    }

    /**
     * Az aktuális tárolót rajzolja ki.
     */
    public void kirajzol() {
        for (int i = 0; i < tarolo.length; ++i) {
            tarolo[i].kirajzol();
        }
        System.out.println();
    }

    /**
     *
     * @param egyik az első kiemelni kívánt mezőt kéri be
     * @param masik a második kiemelni kivánt mezőt kéri be
     * @return false ha nem megfelelő golyót akar kiemelni a fehasználó
     */
    public boolean probalKiemelni(int egyik, int masik){
        try {
            if (Math.abs(egyik - masik) != 1) {
                Logger.error("Egymás melletti mezőket adj meg!");
                return false;
            } else if (tarolo[egyik].ures() || tarolo[masik].ures()){
                Logger.error("Üres mezőket nem tudsz kiemelni!");
                return false;
            };
        } catch (ArrayIndexOutOfBoundsException e) {
            Logger.error("Túl nagy számot adtál meg!");
            return false;
        }
        return true;
    }

    /**
     * @param golyo jelenti azt ,hogy melyik golyót szeretnénk kiemelni
     * @param cel jelenti azt ,hogy hova szeretnénk visszrakni
     * @return egy true vagy false értéket ami azt dönti el ,hogy berakhatja e
     * a kiszemelt helyre a golyót
     */
    public boolean probalBerakni(int golyo, int cel) {
        if (cel >= count - 1) {
            Logger.info("Túl nagy számot adtál meg.");
            return false;
        }
        if (tarolo[cel].ures() && tarolo[cel + 1].ures()) {
            tarolo[cel].setLabda(tarolo[golyo].torolLabda());
            tarolo[cel + 1].setLabda(tarolo[golyo + 1].torolLabda());
            return true;
        } else {
            Logger.info("A célmezők nem üresek");
            return false;
        }
    }

    /**
     * Megvizsgálja ,hogy a tároló aktuális indexe üres-e.
     */
    public boolean ures(int index) {
        return tarolo[index].ures();
    }

    /**
     * A függvény megvizsgálja ,hogy az aktuális állás megfelel e azoknak
     * a feltételeknek ami a játék megnyerését biztosítja, ha megfelel akkor
     * true értéket ad vissza egyébként pedig false értéket
     */
    public boolean nyert() {
        for (int i = 0; i < tarolo.length; ++i) {
            if (!tarolo[i].ures()) {
                char piros = 'p';
                char fekete = 'f';
                for (int j = i; j < i + 3; ++j) {
                    if (tarolo[j].getLabdaSzin() != piros) {
                        return false;
                    }
                }
                for (int k = i + 3; k < i + 6; ++k) {
                    if (tarolo[k].getLabdaSzin() != fekete) {
                        return false;
                    }
                }
                return true;
            }

        }
        return false;
    }
}
