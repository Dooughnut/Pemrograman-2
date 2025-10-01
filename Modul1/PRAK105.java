import java.util.Scanner;
public class PRAK105{
    public static void main(String[] args) {
    final double phi = 3.14;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan jari-jari: ");
    double r = scanner.nextDouble();
    System.out.print("Masukkan tinggi: ");
    double height = scanner.nextDouble();
    double tubevolume = phi*r*r*height;
    System.out.println("Volume tabung dengan jari-jari "+ r +" cm dan tinggi "+ height + " cm adalah " + String.format("%.3f", tubevolume) + " m3");
    scanner.close();
    }    
}