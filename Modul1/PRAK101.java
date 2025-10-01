import java.util.Scanner;
public class PRAK101{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan nama lengkap: ");
    String name = scanner.nextLine();
    System.out.print("Masukkan tempat lahir: ");
    String bornplace = scanner.nextLine();
    System.out.print ("masukan tanggal lahir: ");
    String Date = scanner.nextLine();
    System.out.print ("masukan bulan lahir: ");
    String Month = scanner.nextLine();
    System.out.print ("masukan tahun lahir: ");
    String Year = scanner.nextLine();
    System.out.print("Masukkan tinggi badan: ");
    String Height = scanner.nextLine();
    System.out.print("Masukkan berat badan: ");
    String Weight = scanner.nextLine();

    switch (Month) {
        case "1" -> Month = " januari ";
        case "2" -> Month = " Februari ";
        case "3" -> Month = " Maret ";
        case "4" -> Month = " April ";
        case "5" -> Month = " Mei ";
        case "6" -> Month = " Juni ";
        case "7" -> Month = " Juli ";
        case "8" -> Month = " Agustus ";
        case "9" -> Month = " September ";
        case "10" -> Month = " Oktober ";
        case "11" -> Month = " November ";
        case "12" -> Month = " Desember ";
    }
    System.out.println("Nama Lengkap " + name +", Lahir di " + bornplace + " pada Tanggal " + Date + Month + Year + 
    "\nTinggi Badan " + Height +" cm dan Berat Badan " + Weight+" kilogram");

    scanner.close();
    }
}