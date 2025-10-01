import java.util.Scanner;

public class PRAK102{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num != 0){
            for (int i = num; i <= num + 10; i++){
                if (i % 5 == 0) {
                    int newValue = i / 5 - 1;
                    System.out.print(newValue);
                }else{
                    System.out.print(i);
                }

                if (i != num + 10){
                    System.out.print(", ");
                }else{
                    System.out.print(". ");
                }
            }
        System.out.println();
        num = scanner.nextInt();
        } 
     scanner.close();
    }
}