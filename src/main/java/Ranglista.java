import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ranglista {



    ArrayList<Rekord> rangsor = new ArrayList<>();

    public Ranglista() {}

    public ArrayList<Rekord> getRangsor() {
        return rangsor;
    }

    public void setRangsor(ArrayList<Rekord> rangsor) {
        this.rangsor = rangsor;
    }

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

    public void listaz() {
        for (Rekord r : rangsor) {
            System.out.println(r.getNev() + " " + r.getLepes());
        }
    }



    public void kiir(String file) {
        XMLEncoder encoder=null;
        try{
            encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream(file)));
        }catch(FileNotFoundException fileNotFound){
            System.out.println("ERROR: While Creating or Opening the File " + file);
        }
        encoder.writeObject(rangsor);
        encoder.close();
    }

    public void beolvas(String file) {
        XMLDecoder decoder = null;
        try {
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(file)));
            rangsor = (ArrayList<Rekord>)decoder.readObject();;
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File " + file + " not found");
        }
    }

}
