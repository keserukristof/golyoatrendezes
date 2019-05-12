import java.util.Scanner;

public class Controller {

    Tarolo tarolo = new Tarolo();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            tarolo.kirajzol();
            System.out.println("Melyik gólyót szeretnéd kiemelni?");
            int egyik = scanner.nextInt();
            int masik = scanner.nextInt();
            System.out.println("Hova szeretnéd visszarakni ezeket? (a bal indexet add meg!)");
            int cel = scanner.nextInt();
            tarolo.probalBerakni(egyik < masik ? egyik - 1 : masik - 1, cel - 1);
            if (tarolo.nyert()) {
                System.out.println("Nyertél");
                break;
            }
        }
    }

    private void init() {

    }
}
