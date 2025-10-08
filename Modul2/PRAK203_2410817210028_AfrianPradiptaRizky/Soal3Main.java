package PRAK203_2410817210028_AfrianPradiptaRizky;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //Pada baris ini terjadi error karna tidak ada titik koma
        //p1.nama = "Roi"
        p1.nama = "Roi";
        //Pada baris ini terjadi kesalahan pada tipe data asal. yang mana tipe datanya merupakan char dan bukan string
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //pada baris ini saya menambahkan value dari variabel umur agar sistem dapat mengeluarkan hasil
        p1.umur = 17;
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur);
    }

}
