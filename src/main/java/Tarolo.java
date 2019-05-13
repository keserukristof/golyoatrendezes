import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tarolo {

    public static Logger logger = LoggerFactory.getLogger(Tarolo.class);

    private static int count = 16;

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

    public void kirajzol() {
        for (int i = 0; i < tarolo.length; ++i) {
            tarolo[i].kirajzol();
        }
        System.out.println();
    }

    public boolean probalBerakni(int golyo, int cel) {
        if (cel >= count - 1) {
            logger.error("Túl nagy számot adtál meg.");//System.out.println("Túl nagy számot adtál meg.");
            return false;
        }
        if (tarolo[golyo].ures() || tarolo[golyo + 1].ures()) {
            logger.error("Nincs golyó a megadott mezőn");
            return false;
        }
        if (tarolo[cel].ures() && tarolo[cel].ures()) {
            tarolo[cel].setLabda(tarolo[golyo].torolLabda());
            tarolo[cel + 1].setLabda(tarolo[golyo + 1].torolLabda());
            return true;
        } else {
            logger.error("A célmezők nem üresek");
            return false;
        }
    }

    public boolean ures(int index) {
        return tarolo[index].ures();
    }

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
