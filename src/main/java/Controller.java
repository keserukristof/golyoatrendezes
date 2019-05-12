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
            System.out.println("Hova szeretnéd visszarakni ezeket?");
            int cel = scanner.nextInt();
            tarolo.probalBerakni(egyik > masik ? egyik : masik, cel);
        }
    }

    private void init() {

    }
}
