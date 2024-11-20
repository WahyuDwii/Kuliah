/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

/**
 *
 * @author wahyu
 */
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileIOPractice {
    public static void main(String[] args) {
        String filePath = "data.txt"; // Lokasi file teks yang akan kita gunakan

        // Menulis data ke file
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Belajar File I/O di Java!\n");  // Menulis string pertama
            writer.write("Pemrograman Berorientasi Objek.\n"); // Menulis string kedua
            System.out.println("Data berhasil ditulis ke file: " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file.");
            e.printStackTrace();
        }

        // Membaca data dari file
        try (FileReader reader = new FileReader(filePath)) {
            int character;  // Variable untuk membaca karakter satu per satu
            System.out.println("\nIsi file:");
            while ((character = reader.read()) != -1) { // Membaca karakter hingga akhir file
                System.out.print((char) character); // Menampilkan karakter
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file.");
            e.printStackTrace();
        }
    }
}
