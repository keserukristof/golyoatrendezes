public class Mezo {
    /**
     * A labda értékét null-ra állítja
     */
    private Labda labda = null;

    /**
     *
     * @param labda a rajta lévő labdát várja paraméternek
     */
    public Mezo(Labda labda) {
        this.labda = labda;
    }

    /**
     *
     * @param c a labda szinét várja paraméterül
     */
    public Mezo(char c) {
        this.labda = new Labda(c);
    }

    /**
     * Megvizsgálja ,hogy üres-e a mező
     */
    public boolean ures() {
        return labda == null;
    }

    /**
     * A labda gettere.
     */
    public Labda getLabda() {
        return labda;
    }

    /**
     *
     * @return a labda színét, vagy pontot ha nincs labda
     */
    public char getLabdaSzin() {
        if (labda == null)
            return '.';
        else
            return labda.getSzin();
    }

    /**
     * A labda settere
     */
    public void setLabda(Labda l) {
        if (labda == null)
            labda = l;
    }

    /**
     * Törli a labdát
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
