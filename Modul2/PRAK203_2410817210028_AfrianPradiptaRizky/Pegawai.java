package PRAK203_2410817210028_AfrianPradiptaRizky;
//terdapat kesalahan pada penamaan file, tidak cocok dengan file Soal3Main
//public class Employee {
public class Pegawai{
    public String nama;
    // tipe data asal seharusnya merupakan string dan bukan char
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }
    //pada baris ini terjadi kesalahan karna ketiadaan parameter j
    //public void setJabatan() {
    public void setJabatan(String j){
        this.jabatan = j;
    }
}
