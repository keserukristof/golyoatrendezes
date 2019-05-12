import java.util.ArrayList;
import java.util.Collections;

public class Ranglista {

    private class Rekord implements Comparable<Rekord> {
        public String nev;
        public int lepes;

        public Rekord(String nev, int lepes) {
            this.nev = nev;
            this.lepes = lepes;
        }

        @Override
        public int compareTo(Rekord o) {
            return lepes - o.lepes;
        }
    }

    ArrayList<Rekord> rangsor;

    public void beszurHaTud(String nev, int lepes) {
        rangsor.add(new Rekord(nev, lepes));
        Collections.sort(rangsor);
        if (rangsor.size() > 10) {
            rangsor.remove(10);
        }

    }

    public String toString() {
        String ret = "";
        for (Rekord r : rangsor) {
            ret += r.nev + " " + r.lepes + '\n';
        }
        return ret;
    }

    public void listaz() {
        System.out.println(toString());
    }

}
