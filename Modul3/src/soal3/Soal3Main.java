package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Soal3Main {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name = scanner.nextLine();

                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String studentID = scanner.nextLine();

                    boolean idExists = false;
                    for (Student student : studentList) {
                        if (student.getStudentID().equals(studentID)) {
                            idExists = true;
                            break;
                        }
                    }

                    if (!idExists) {
                        Student newStudent = new Student(name, studentID);
                        studentList.add(newStudent);
                        System.out.println("Mahasiswa " + name + " ditambahkan.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String idToDelete = scanner.nextLine();

                    Student studentToRemove = null;
                    for (Student student : studentList) {
                        if (student.getStudentID().equals(idToDelete)) {
                            studentToRemove = student;
                            break;
                        }
                    }

                    if (studentToRemove != null) {
                        studentList.remove(studentToRemove);
                        System.out.println("Mahasiswa dengan NIM " + idToDelete + " dihapus.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String idToSearch = scanner.nextLine();
                    boolean isFound = false;

                    for (Student student : studentList) {
                        if (student.getStudentID().equals(idToSearch)) {
                            System.out.println("Mahasiswa ditemukan:");
                            System.out.println("NIM: " + student.getStudentID() + ", Nama: " + student.getName());
                            isFound = true;
                            break;
                        }
                    }

                    if (!isFound) {
                        System.out.println("Mahasiswa dengan NIM " + idToSearch + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    if (studentList.isEmpty()) {
                        System.out.println("(Tidak ada data mahasiswa)");
                    } else {
                        for (Student student : studentList) {
                            System.out.println("NIM: " + student.getStudentID() + ", Nama: " + student.getName());
                        }
                    }
                    System.out.println();
                    break;

                case 0:
                    isRunning = false;
                    System.out.println("Terima kasih!");
                    break;

                default:
                    break;
            }
        }

        scanner.close();
    }
}