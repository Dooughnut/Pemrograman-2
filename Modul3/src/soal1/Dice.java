package soal1;
import java.util.Random;
import java.util.LinkedList;

public class Dice {
    Random random = new Random();

    private int RandomNumber(){
        return random.nextInt(6) + 1;
    }

    public void display(int numberRolls){
        LinkedList<Integer> diceResult = new LinkedList<>();

        for (int i = 0; i < numberRolls; i++){
            int results = RandomNumber();
            diceResult.add(results);
        }

        int sum = 0;
        int rollNumber = 1;

        for (int results : diceResult){
            System.out.println("Dadu ke-" + rollNumber + " bernilai " + results);

            sum += results;
            rollNumber++;
        }
        System.out.println("Total nilai dadu keseluruhan " + sum);
    }
}