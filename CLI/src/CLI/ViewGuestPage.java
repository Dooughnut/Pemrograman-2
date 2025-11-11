package CLI;
import java.util.List;
import java.util.Scanner;

public class ViewGuestPage extends Abstractpage {
    public ViewGuestPage(Scanner scanner, GuestBookContract guestBookContract) {
        super(scanner, guestBookContract);
    }

    @Override
    public void display() {
        System.out.println("2. Lihat daftar tamu: ");
        List<GuestEntry> guests = GuestBookContract.getAllGuest();

        if (guests.isEmpty()){
            System.out.println("belum ada tamu yang berkunjung");
        }else{
            int i = 1;
            for (GuestEntry guest : guests){
                System.out.println(i +". " + guest.toString());
                i++;
            }
        }
    }
}
