
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaroloTest {



    @Test
    public void testBerak() {
        Tarolo tarolo = new Tarolo();
        assertTrue(tarolo.probalBerakni(1, 7));
        assertFalse(tarolo.probalBerakni(3, 5));
        assertFalse(tarolo.probalBerakni(2, 17));
        assertFalse(tarolo.probalBerakni(9, 11));
        assertTrue(tarolo.ures(1));
        assertFalse(tarolo.ures(3));
    }

    @Test
    public void testNyert() {
        Tarolo tarolo = new Tarolo(new Mezo[]{new Mezo('p'), new Mezo('p'), new Mezo('p'), new Mezo('f'), new Mezo('f'), new Mezo('f')});
        assertTrue(tarolo.nyert());
        tarolo = new Tarolo(new Mezo[]{new Mezo('f'), new Mezo('f'), new Mezo('f'), new Mezo('p'), new Mezo('p'), new Mezo('p')});
        assertFalse(tarolo.nyert());
        tarolo = new Tarolo(new Mezo[]{new Mezo('p'), new Mezo('p'), new Mezo('p'), new Mezo(null), new Mezo('f'), new Mezo('f'), new Mezo('f')});
        assertFalse(tarolo.nyert());
        tarolo = new Tarolo(new Mezo[]{new Mezo('p'), new Mezo('p'), new Mezo('f'), new Mezo('f'), new Mezo('f')});
        assertFalse(tarolo.nyert());
    }
}
