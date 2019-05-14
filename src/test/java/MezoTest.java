import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MezoTest {

    private static Mezo ures;
    private static Mezo piros;
    private static Mezo fekete;

    @BeforeEach
    public void init() {
        ures = new Mezo(null);
        piros = new Mezo('p');
        fekete = new Mezo('f');
    }

    @Test
    public void testUres() {
        assertTrue(ures.ures());
        assertFalse(piros.ures());
        assertFalse(fekete.ures());
    }

    @Test
    public void testGetter() {
        assertEquals(ures.getLabdaSzin(), '.');
        assertEquals(piros.getLabdaSzin(), 'p');
        assertEquals(fekete.getLabdaSzin(), 'f');
    }

    @Test
    public void testSetter() {
        ures.setLabda(new Labda('.'));
        piros.setLabda(new Labda('p'));
        fekete.setLabda(new Labda('f'));
        assertEquals(ures.getLabdaSzin(), '.');
        assertEquals(piros.getLabdaSzin(), 'p');
        assertEquals(fekete.getLabdaSzin(), 'f');
    }
}
