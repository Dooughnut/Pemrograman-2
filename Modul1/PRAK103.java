import java.util.Scanner;

public class PRAK103{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howlong = scanner.nextInt();
        int startingnum = scanner.nextInt();
        int sumshowed = 0;
        do{
            if (startingnum % 2 != 0){
                sumshowed++;
                if (sumshowed != howlong ){
                System.out.print(startingnum + ", ");
                
                } else{
                System.out.print(startingnum + ".");
                }
            }
            startingnum++;
        } while  (sumshowed < howlong);
        scanner.close();
    }
}