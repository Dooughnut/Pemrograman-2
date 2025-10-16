package Soal1;

public class Pet {
    private String name;
    private String breed;

    public Pet(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public void display(){
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama Hewan Peliharaanku adalah: " + this.name);
        System.out.println("Dengan ras: " + this.breed);
    }

}
