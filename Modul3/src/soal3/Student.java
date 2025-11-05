package soal3;

// Nama kelas diubah dari Mahasiswa menjadi Student
public class Student {

    // Nama atribut diubah dari nama/nim menjadi name/studentID
    private String name;
    private String studentID;

    // Konstruktor diperbarui
    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    // Getter diperbarui
    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }
}