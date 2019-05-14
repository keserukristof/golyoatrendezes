/**
 * A labda tulajdonságait leíró osztály
 */
public class Labda {

    private char szin;

    /**
     * @param szin: egy char tipusú változót kér amely a játék
     *            esetében vagy 'p' vagy 'f'
     */
    public Labda(char szin) {
        this.szin = szin;
    }


    /**
     * Kirajzolja a megadott színt
     */
    public void kirajzol() {
        System.out.print(szin);
    }


    /**
     * @return Visszaadja a mező színét.
     */
    public char getSzin() {
        return szin;
    }
}
