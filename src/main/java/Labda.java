public class Labda {

    //piros = 'p', fekete = 'f'
    private char szin;

    public Labda(char szin) {
        this.szin = szin;
    }

    public void kirajzol() {
        System.out.print(szin);
    }

    public char getSzin() {
        return szin;
    }
}
