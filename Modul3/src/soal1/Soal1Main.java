package soal1;
import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberofdice = scanner.nextInt();

        Dice mydice = new Dice();
        mydice.display(numberofdice);
        scanner.close();

    }
}