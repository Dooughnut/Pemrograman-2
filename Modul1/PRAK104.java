import java.util.Scanner;
public class PRAK104{
    public static int referensi(char char1, char char2){
        if (char1 == char2){
            return 0;
        }else if ((char1 == 'B' && char2 == 'G')|| (char1 == 'G' && char2 == 'K')|| (char1 == 'K' && char2 == 'B')){
            return 1;
        }
        else {
            return -1;
        }
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input1 = scanner.nextLine().replace(" ","");
    String input2 = scanner.nextLine().replace(" ","");

    int skorAbu = 0;
    int skorBagas = 0;
        for (int i = 0; i < 3; i++){
            char Abu = input1.charAt(i);
            char Bagas = input2.charAt(i);
            int result = referensi(Abu, Bagas);
            if (result == 1){
                skorAbu++;
            }else if (result ==-1){
                skorBagas++;
            }

        }
    if (skorAbu > skorBagas){
        System.out.println("Abu");
    }else if (skorAbu < skorBagas){
        System.out.println("Bagas");
    }else{
        System.out.println("Seri");
    }
    scanner.close();
    }
}