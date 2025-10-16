package Soal2;
import Soal1.Pet;

public class Cat extends Pet{
    private String furColor;
    public Cat(String name, String breed, String furColor) {
        super(name, breed);
        this.furColor = furColor;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu: " + this.furColor);

    }
}

