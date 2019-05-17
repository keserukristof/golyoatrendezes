public class Mezo {

    private Labda labda = null;

    public Mezo(Labda labda) {
        this.labda = labda;
    }


    public Mezo(char c) {
        this.labda = new Labda(c);
    }

    public boolean ures() {
        return labda == null;
    }

    public Labda getLabda() {
        return labda;
    }

    public char getLabdaSzin() {
        if (labda == null)
            return '.';
        else
            return labda.getSzin();
    }

    public void setLabda(Labda l) {
        if (labda == null)
            labda = l;
    }

    /**
     * @return függvényen belül definiált tmp segédváltozóval tér vissza
     */
    public Labda torolLabda() {
        Labda tmp = labda;
        labda = null;
        return tmp;
    }


    /**
     * Ha a mezőn van labda akkor kirajzolja azt,
     * egyébként '.' karaktert rak a helyére
     */
    public void kirajzol() {
        if (labda != null)
            labda.kirajzol();
        else
            System.out.print(".");
    }
}
