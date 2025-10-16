package Soal2;
import Soal1.Pet;
import java.util.Scanner;

public class Soal3Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Pet mypet = null;

        System.out.println("Pilih jenis hewan yang ingin di inputkan: ");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1){
            //using cat class
            System.out.print("Nama hewan peliharaan: ");
            String name = scanner.nextLine();
            System.out.print("Ras: ");
            String breed = scanner.nextLine();
            System.out.print("Warna bulu: ");
            String furcolor = scanner.nextLine();
            mypet = new Cat(name, breed, furcolor);
        }else if (choice == 2){
            //using dog class
            System.out.print("Nama hewan peliharaan: ");
            String name = scanner.nextLine();
            System.out.print("Ras: ");
            String breed = scanner.nextLine();
            System.out.print("Warna bulu: ");
            String furColor = scanner.nextLine();
            System.out.print("Kemampuan: ");
            String ability = scanner.nextLine();
            mypet = new Dog(name, breed, furColor, ability);
        }

        scanner.close();
        if (mypet != null){
            mypet.display();
        }
    }
}