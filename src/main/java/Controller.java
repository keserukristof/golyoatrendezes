import java.beans.XMLDecoder;
import java.io.*;
import java.util.Scanner;

public class Controller {

    Tarolo tarolo = new Tarolo();

    public void start() {
        Ranglista ranglista = new Ranglista();
        ranglista.beolvas("ranglista.xml");
        ranglista.listaz();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a nevét!");
        String nev = scanner.next();
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
                    if (tarolo.ures(egyik - 1) || tarolo.ures(masik - 1)) {
                        System.out.println("A megadott mezőn nincsen labda");
                    } else if (Math.abs(egyik - masik) != 1) {
                        System.out.println("Szomszédos indexeket adj meg!");
                    } else {
                        error = false;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Túl nagy számot adtál meg!");
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
