package CLI;
import java.util.Scanner;

public class AddGuestPage extends Abstractpage {
    public AddGuestPage(Scanner scanner, GuestBookContract guestBookContract) {
        super(scanner, guestBookContract);
    }

    @Override
    public void display() {
        System.out.println("1. tambah kunjungan tamu: ");
        System.out.println("Masukkan nama anda: ");
        String name = scanner.nextLine();

        System.out.println("Masukkan tujuan anda: ");
        String purpose = scanner.nextLine();

        GuestBookContract.addGuest(name, purpose);
    }
}
