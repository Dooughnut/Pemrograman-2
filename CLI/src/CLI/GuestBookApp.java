package CLI;

import java.util.Scanner;

public class GuestBookApp {
    private Scanner scanner;
    private GuestBookContract GuestBookContract;
    private Abstractpage addGuestPage;
    private Abstractpage viewGuestPage;

    public GuestBookApp() {
        this.scanner = new Scanner(System.in);
        GuestBookContract = new ContractImplement();
        this.addGuestPage = new AddGuestPage(scanner, GuestBookContract);
        this.viewGuestPage = new ViewGuestPage(scanner, GuestBookContract);
    }

    public void run(){
        boolean running = true;

        while (running){
            printMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addGuestPage.display();
                    break;
                case "2":
                    viewGuestPage.display();
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    break;

            }

            if (running){
                System.out.println("Press anything to return...");
                scanner.nextLine();
            }
        }
        System.out.println("thankyou for using this shit");
        scanner.close();
    }

    private void printMenu(){
        System.out.println("----------buku kunjungan tamu----------");
        System.out.println("---------------------------------------");
        System.out.println("Pilih menu: ");
        System.out.println("1. tambah tamu");
        System.out.println("2. lihat daftar tamu");
        System.out.println("0. keluar");
    }
}