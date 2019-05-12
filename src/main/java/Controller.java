import java.util.Scanner;

public class Controller {

    Tarolo tarolo = new Tarolo();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int egyik = 0, masik = 0;
            tarolo.kirajzol();
            boolean error = true;
            while (error) {
                System.out.println("Melyik gólyót szeretnéd kiemelni?");
                egyik = scanner.nextInt();
                masik = scanner.nextInt();
                try {
                    if (tarolo.ures(egyik) || tarolo.ures(masik)) {
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
            if (tarolo.nyert()) {
                System.out.println("Nyertél");
                break;
            }
        }
    }
}
