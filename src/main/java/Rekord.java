import java.io.Serializable;

public class Rekord implements Serializable {
    private String nev;
    private int lepes;

    public Rekord() {
    }

    public String getNev() {
        return nev;
    }

    public int getLepes() {
        return lepes;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setLepes(int lepes) {
        this.lepes = lepes;
    }



}
