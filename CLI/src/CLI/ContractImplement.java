package CLI;
import java.util.ArrayList;
import java.util.List;

public class ContractImplement implements GuestBookContract {
    private List<GuestEntry> entries = new ArrayList<>();

    @Override
    public void addGuest(String name, String purpose) {
        GuestEntry newEntry = new GuestEntry(name, purpose);
        this.entries.add(newEntry);
        System.out.println("\n Tamu '"+ name + "' berhasil ditambahkan.");
    }

    @Override
    public List<GuestEntry> getAllGuest() {
        return this.entries;
    }
}
