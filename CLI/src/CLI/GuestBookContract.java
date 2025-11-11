package CLI;
import java.util.List;

public interface GuestBookContract {
    void addGuest(String name, String purpose);
    List<GuestEntry> getAllGuest();
}
