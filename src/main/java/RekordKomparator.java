import java.util.Comparator;

public class RekordKomparator implements Comparator<Rekord> {

    /**
     * A függvény a ranglista felállításához szügséges összehasonlításokat végzi el.
     */
    @Override
    public int compare(Rekord o1, Rekord o2) {
        return o1.getLepes() - o2.getLepes();
    }
}
