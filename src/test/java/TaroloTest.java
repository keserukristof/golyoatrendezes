import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaroloTest {

    @Test
    public void testKiemel() {
        Tarolo tarolo = new Tarolo();
        assertTrue(tarolo.probalKiemelni(1,2));
        assertTrue(tarolo.probalKiemelni(3,4));
        assertFalse(tarolo.probalKiemelni(9,10));
        assertFalse(tarolo.probalKiemelni(13,15));
    }

    @Test
    public void testBerak() {
        Tarolo tarolo = new Tarolo();
        assertTrue(tarolo.probalBerakni(1, 7));
        assertFalse(tarolo.probalBerakni(3, 5));
        assertFalse(tarolo.probalBerakni(2, 17));
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
