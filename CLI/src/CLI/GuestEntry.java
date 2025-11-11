package CLI;

public class GuestEntry {
    private String name;
    private String purpose;

    public GuestEntry(String name, String purpose) {
        this.name = name;
        this.purpose = purpose;
    }

    public String getName() {
        return name;
    }

    public String getPurpose() {
        return purpose;
    }

    @Override
    public String toString() {
        return "Nama: " + name + ", tujuan: " + purpose;
    }
}