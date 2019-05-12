public class Tarolo {
    private Mezo [] tarolo = new Mezo[16];

    public Tarolo() {
        for (int i = 0; i < 3; ++i) {
            tarolo[2 * i] = new Mezo(new Labda('p'));
            tarolo[2 * i + 1] = new Mezo(new Labda('f'));
        }
        for (int i = 6; i < 16; ++i) {
            tarolo[i] = new Mezo(null);
        }
    }

    public void kirajzol() {
        for (int i = 0; i < tarolo.length; ++i){
            tarolo[i].kirajzol();
        }
        System.out.println();
    }

    public boolean probalBerakni(int golyo, int cel) {

    }
}
