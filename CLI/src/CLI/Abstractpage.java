package CLI;

import java.util.Scanner;

public abstract class Abstractpage {
    protected Scanner scanner;
    protected GuestBookContract GuestBookContract;

    public Abstractpage(Scanner scanner, GuestBookContract guestBookContract) {
        this.scanner = scanner;
        GuestBookContract = guestBookContract;
    }

    public abstract void display();
}
