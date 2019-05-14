import org.pmw.tinylog.Logger;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

public class Ranglista {

    private ArrayList<Rekord> rangsor = new ArrayList<>();

    public Ranglista() {}

    /**
     * @param nev a felhasználó neve
     * @param lepes a játékban megtett lépésszám
     * Ha a rangsor mérete nagyobb lesz mint 10 akkor az utolsót eltávolítja
     *
     */
    public void beszurHaTud(String nev, int lepes) {
        Rekord rekord = new Rekord();
        rekord.setNev(nev);
        rekord.setLepes(lepes);
        rangsor.add(rekord);
        rangsor.sort(new RekordKomparator());
        if (rangsor.size() > 10) {
            rangsor.remove(10);
        }

    }

    /**
     * @return Stringé alakított ret érték
     */
    @Override
    public String toString() {
        String ret = "";
        for (Rekord r : rangsor) {
            ret += r.getNev() + " " + r.getLepes() + "\n";
        }
        return ret;
    }

    public void listaz() {
        System.out.println(toString());
    }


    /**
     * @param file a fájl nevét várja paraméterül amibe ki fog írni
     */
    public void kiir(String file) {
        XMLEncoder encoder=null;
        try {
            encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream(file)));
            encoder.writeObject(rangsor);
            encoder.close();
        } catch(FileNotFoundException fileNotFound){
            Logger.error("ERROR: While Creating or Opening the File " + file);
        }

    }


    /**
     * @param file a fájl nevét kéri paraméterül amiből beolvassa a ranglistát
     */
    public void beolvas(String file) {
        XMLDecoder decoder = null;
        try {
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(file)));
            rangsor = (ArrayList<Rekord>)decoder.readObject();;
        } catch (FileNotFoundException e) {
            Logger.error("ERROR: File " + file + " not found");
        }
    }

}
