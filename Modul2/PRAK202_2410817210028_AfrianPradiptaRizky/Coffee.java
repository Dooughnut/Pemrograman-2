package PRAK202_2410817210028_AfrianPradiptaRizky;

public class Coffee {
    public String nameCoffee;
    public String size;
    public double price;
    private String buyer;

    public void info(){
        System.out.println("Nama Kopi: "+ this.nameCoffee);
        System.out.println("Ukuran: "+ this.size);
        System.out.println("Harga: "+ this.price);
    }

    public void setBuyer(String name){
        this.buyer = name;
    }

    public String getBuyer(){
        return this.buyer;
    }
    public double getTax(){
        double tax = this.price * 0.11;
        return tax;
    }
}