package PRAK201_2410817210028_AfrianPradiptaRizky;

public class Soal1Main {
     public static void main() {
         Fruit apple = new Fruit("Apel", 7000, 0.4, 40);
         Fruit mango = new Fruit("mango", 3500, 0.2, 15);
         Fruit avocado = new Fruit("avocado", 10000, 0.25, 12);
         apple.printFruit();
         mango.printFruit();
         avocado.printFruit();
     }
}