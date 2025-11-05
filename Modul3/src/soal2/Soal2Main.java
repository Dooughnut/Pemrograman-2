package soal2;
import java.util.LinkedList;
import java.util.Scanner;

public class Soal2Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Country> countryList = new LinkedList<>();
        int howmuch = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < howmuch; i++) {
            Country country = new Country();

            String countryName = scanner.nextLine();
            String leadership = scanner.nextLine();
            String leaderName = scanner.nextLine();
            country.setCountryDesc(countryName, leadership, leaderName);

            if (!leadership.equalsIgnoreCase("Monarki")) {
                int day = scanner.nextInt();
                int monthNumber = scanner.nextInt();
                int year = scanner.nextInt();
                scanner.nextLine();
                country.setIndependenceDate(day, monthNumber, year);
            }
            countryList.add(country);
        }
        int countrynumber = 1;
        for (Country C : countryList) {
            C.display();
            System.out.println();
            countrynumber++;
        }
        scanner.close();
    }
}