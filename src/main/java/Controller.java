import org.pmw.tinylog.Logger;

import java.util.Scanner;

/**
 * Az osztály lényegi része a start() metódus amely
 * bekéri az adatokat és kommunikál a felhasználóval.
 */
public class Controller {

    Tarolo tarolo = new Tarolo();

    public void start() {
        Ranglista ranglista = new Ranglista();
        ranglista.beolvas("ranglista.xml");
        Logger.info("A ranglista.xml beolvasása sikeres volt.");
        ranglista.listaz();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a nevét!");
        String nev = scanner.next();
        System.out.println( "Üdvözöllek " + nev + "! Röviden ismertetném a játék szabályait!");
        System.out.println("A 'p' karaketer jelöli a piros golyót és az 'f' karakter jelöli a fekete golyót!");
        System.out.println("A játék lényege hogy az üres mezők segítségével a golyókat pppfff sorrendbe rakd az első 6 helyre.");
        System.out.println("Egyszerre 2 golyót emelhetsz ki majd rakhatszát egy üres helyre(az üres helyet a '.' karakter jelöli!)");
        System.out.println("A lépéseid számát számolni fogom és ez alapján az eredményed bekerül a felül látható ranglistába.");
        System.out.println("Kezdődjön a játék!");
        System.out.println("------------------------------------------------------------------------------------------------------");
        int lepes = 0;
        while (true) {
            int egyik = 0, masik = 0;
            tarolo.kirajzol();
            boolean error = true;
            while (error) {
                System.out.println("Melyik gólyót szeretnéd kiemelni?");
                egyik = scanner.nextInt();
                masik = scanner.nextInt();
                try {
                    if (Math.abs(egyik - masik) != 1) {
                        Logger.error("Szomszédos indexeket adj meg!");
                    } else {
                        error = false;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    Logger.error("Túl nagy számot adtál meg!");
                }
            }
            int cel;
            do {
                System.out.println("Hova szeretnéd visszarakni ezeket? (a bal indexet add meg!)");
                cel = scanner.nextInt();
            } while (!tarolo.probalBerakni(egyik < masik ? egyik - 1 : masik - 1, cel - 1));
            ++lepes;
            if (tarolo.nyert()) {
                System.out.println("Nyertél");
                ranglista.beszurHaTud(nev, lepes);
                ranglista.listaz();
                break;
            }
        }
        ranglista.kiir("ranglista.xml");
    }



}
