package PRAK201_2410817210028_AfrianPradiptaRizky;

public class Fruit {
    private String fruit;
    private double price;
    private double weight;
    private double perprice;

    public Fruit(String fruit, double price, double perprice, double weight){
        this.fruit = fruit;
        this.price = price;
        this.perprice = perprice;
        this.weight = weight;
    }

    public double discount(){
        return (this.price * 0.02) * (this.weight-(this.weight%4));
    }

    public double totalprice(){
        return this.price * (this.weight/this.perprice);
    }

    public void printFruit(){
        double pricebeforediscount = totalprice();
        double totaldiscount = discount();
        System.out.println("\nNama Buah: "+ fruit);
        System.out.println("Berat: "+ perprice);
        System.out.println("Harga: "+ price);
        System.out.printf("Jumlah Beli: %.1fkg\n", weight);
        System.out.printf("Harga Sebelum Diskon: %.2f\n", pricebeforediscount);
        System.out.printf("Total Diskon: %.2f\n", totaldiscount);
        System.out.printf("Harga Setelah Diskon: %.2f\n", pricebeforediscount - totaldiscount);
    }
}