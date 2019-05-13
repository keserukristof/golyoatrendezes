import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RanglistaTest {

    @Test
    public void testBeszur(){
        Ranglista ranglista = new Ranglista();
        ranglista.beszurHaTud("Kristof", 7);
        ranglista.beszurHaTud("Máté", 5);
        ranglista.beszurHaTud("Józsi", 9);
        ranglista.beszurHaTud("Andrea", 8);
        ranglista.beszurHaTud("Zoltán", 12);
        ranglista.beszurHaTud("Kristof", 1);
        ranglista.beszurHaTud("Máté", 2);
        ranglista.beszurHaTud("Józsi", 3);
        ranglista.beszurHaTud("Andrea", 4);
        ranglista.beszurHaTud("Zoltán", 6);
        ranglista.beszurHaTud("Zoltán", 18);
        String elvart = "Kristóf 1\nMáté 2\nJózsi 3\nAndrea 4\nMáté 5\nZoltán 6\nKristóf 7\nAndrea 8\nJózsi 9\nZoltán 12\n";
        //assertTrue(ranglista.toString().equals(elvart));

    }

    @Test
    public void testXML(){
        Ranglista ranglista = new Ranglista();
        ranglista.beszurHaTud("Kristof", 7);
        ranglista.beszurHaTud("Máté", 5);
        ranglista.beszurHaTud("Józsi", 9);
        ranglista.kiir("test.xml");
        Ranglista ranglista2 = new Ranglista();
        ranglista2.beolvas("test.xml");
        assertTrue(ranglista.toString().equals(ranglista2.toString()));

    }
}
