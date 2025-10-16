package Soal2;
import Soal1.Pet;

public class Dog extends Pet {
    private String furColor;
    private String ability;

    public Dog(String name, String breed, String furColor, String ability) {
        super(name, breed);
        this.furColor = furColor;
        this.ability = ability;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu: " + this.furColor);
        System.out.println("Memiliki kemampuan: " + this.ability);

    }
}
