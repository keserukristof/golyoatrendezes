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

    public void testTorol() {
        assertEquals(ures.torolLabda().getSzin(), '.');
        assertEquals(piros.torolLabda().getSzin(), 'p');
        assertEquals(fekete.torolLabda().getSzin(), 'f');
    }

    public void testSetter() {
        ures.setLabda(new Labda('p'));
        piros.setLabda(new Labda('f'));
        fekete.setLabda(null);
        assertEquals(ures.getLabdaSzin(), 'p');
        assertEquals(piros.getLabdaSzin(), 'f');
        assertEquals(fekete.getLabdaSzin(), '.');
    }
}
