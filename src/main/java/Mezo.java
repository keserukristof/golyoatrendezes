public class Mezo {
    private Labda labda = null;

    public Mezo(Labda labda) {
        this.labda = labda;
    }

    public boolean ures() {
        return labda == null;
    }

    public Labda getLabda() {
        return labda;
    }

    public void setLabda(Labda l) {
        if (labda == null)
            labda = l;
    }

    public Labda torolLabda() {
        Labda tmp = labda;
        labda = null;
        return tmp;
    }

    public void kirajzol() {
        if (labda != null)
            labda.kirajzol();
        else
            System.out.print(".");
    }
}
