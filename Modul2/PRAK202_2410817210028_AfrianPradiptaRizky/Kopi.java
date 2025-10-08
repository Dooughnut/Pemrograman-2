package PRAK202_2410817210028_AfrianPradiptaRizky;

public class Kopi {
    public String namaKopi;
    public String ukuran;
    public double harga;
    private String pembeli;

    public void info(){
        System.out.println("Nama Kopi: "+ this.namaKopi);
        System.out.println("Ukuran: "+ this.ukuran);
        System.out.println("Harga: "+ this.harga);
    }

    public void setPembeli(String nama){
        this.pembeli= nama;
    }

    public String getPembeli(){
        return this.pembeli;
    }
    public double getPajak(){
        double pajak = this.harga * 0.11;
        return pajak;
    }
}