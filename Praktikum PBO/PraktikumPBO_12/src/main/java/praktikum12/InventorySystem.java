/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

/**
 *
 * @author wahyu
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventorySystem {
    private static final String TEXT_FILE = "produk.txt";  // Lokasi file teks
    private static final String SERIAL_FILE = "produk.ser"; // Lokasi file serial
    private static List<Produk> produkList = new ArrayList<>(); // Daftar produk

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu utama
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Simpan ke File Teks");
            System.out.println("3. Simpan Objek ke File (Serialisasi)");
            System.out.println("4. Tampilkan Semua Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Konsumsi newline

            // Proses berdasarkan pilihan
            switch (pilihan) {
                case 1 -> tambahProduk(scanner);  // Menambah produk
                case 2 -> simpanKeFileTeks();  // Menyimpan produk ke file teks
                case 3 -> simpanKeFileSerial();  // Menyimpan produk ke file serial
                case 4 -> tampilkanProduk();  // Menampilkan produk
                case 5 -> {
                    System.out.println("Keluar dari sistem.");
                    scanner.close();  // Menutup scanner dan keluar
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    // Menambah produk ke dalam daftar
    private static void tambahProduk(Scanner scanner) {
        System.out.print("Masukkan nama produk: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga: ");
        double harga = scanner.nextDouble();
        System.out.print("Masukkan stok: ");
        int stok = scanner.nextInt();
        produkList.add(new Produk(nama, harga, stok));
        System.out.println("Produk berhasil ditambahkan.");
    }

    // Menyimpan produk ke file teks
    private static void simpanKeFileTeks() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Produk produk : produkList) {
                writer.write(produk.toString() + "\n");
            }
            System.out.println("Data produk berhasil disimpan ke file teks.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file teks.");
            e.printStackTrace();
        }
    }

    // Menyimpan produk ke file serial
    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(produkList);
            System.out.println("Objek produk berhasil disimpan ke file serial.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file serial.");
            e.printStackTrace();
        }
    }

    // Menampilkan semua produk
    private static void tampilkanProduk() {
        System.out.println("Daftar Produk:");
        for (Produk produk : produkList) {
            produk.tampilkanInfo();
        }
    }

    // Kelas Produk untuk Serialisasi
    static class Produk implements Serializable {
        private String namaProduk;
        private double harga;
        private int stok;

        public Produk(String namaProduk, double harga, int stok) {
            this.namaProduk = namaProduk;
            this.harga = harga;
            this.stok = stok;
        }

        public void tampilkanInfo() {
            System.out.println("Nama Produk: " + namaProduk + ", Harga: " + harga + ", Stok: " + stok);
        }

        @Override
        public String toString() {
            return "Nama Produk: " + namaProduk + ", Harga: " + harga + ", Stok: " + stok;
        }
    }
}

