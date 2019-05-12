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


    public void kirajzol() {
        if (labda != null)
            labda.kirajzol();
        else
            System.out.print(".");
    }
}
