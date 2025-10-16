package Soal1;
import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nama hewan peliharaan: ");
        String name = scanner.nextLine();
        System.out.printf("Ras: ");
        String breed = scanner.nextLine();
        Pet input = new Pet(name, breed);
        scanner.close();
        input.display();
    }
}
