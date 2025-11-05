package soal2;
import java.util.LinkedList;
import java.util.HashMap;

public class Country {
    LinkedList<String> countryDesc;
    LinkedList<Integer> independenceDate;
    private static HashMap<Integer, String> monthHash = new HashMap<>();

    static {
        monthHash.put(1, "Januari");
        monthHash.put(2, "Februari");
        monthHash.put(3, "Maret");
        monthHash.put(4, "April");
        monthHash.put(5, "Mei");
        monthHash.put(6, "Juni");
        monthHash.put(7, "Juli");
        monthHash.put(8, "Agustus");
        monthHash.put(9, "September");
        monthHash.put(10, "Oktober");
        monthHash.put(11, "November");
        monthHash.put(12, "Desember");
    }

    public void setCountryDesc(String countryName, String leadership, String leaderName) {
        this.countryDesc = new LinkedList<>();
        this.countryDesc.add(countryName);
        this.countryDesc.add(leadership);
        this.countryDesc.add(leaderName);
    }

    public void setIndependenceDate(int day, int month, int year){
        this.independenceDate = new LinkedList<>();
        this.independenceDate.add(day);
        this.independenceDate.add(month);
        this.independenceDate.add(year);
    }

    public void display(){

        String countryName = this.countryDesc.get(0);
        String leadership = this.countryDesc.get(1);
        String leaderName = this.countryDesc.get(2);

        if (leadership.equalsIgnoreCase("Monarki")){
            System.out.println("Negara " + countryName + " mempunyai Raja bernama "+ leaderName);

        }else{

            if(this.independenceDate != null) {
                int day = this.independenceDate.get(0);
                int monthNumber = this.independenceDate.get(1);
                int year = this.independenceDate.get(2);
                String monthname = monthHash.get(monthNumber);

                System.out.println("Negara " + countryName + " mempunyai "+ leadership +" bernama " + leaderName +
                        "\nDeklarasi Kemerdekaan pada Tanggal " + day + " " + monthname + " " + year);
            }
        }
    }
}