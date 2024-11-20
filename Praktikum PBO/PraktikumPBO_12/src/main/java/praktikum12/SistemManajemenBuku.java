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
import java.util.*;

public class SistemManajemenBuku {

    private List<Buku> bukuList;

    public SistemManajemenBuku() {
        bukuList = new ArrayList<>();
        loadBuku();  // Muat buku dari file saat aplikasi dimulai
    }

    // Menyimpan daftar buku ke dalam file teks
    public void simpanKeFileText() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("buku.txt"))) {
            for (Buku buku : bukuList) {
                writer.write(buku.getJudul() + "," + buku.getPengarang() + "," + buku.getTahunTerbit());
                writer.newLine();
            }
            System.out.println("Buku berhasil disimpan ke buku.txt");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke buku.txt: " + e.getMessage());
        }
    }

    // Menyimpan daftar buku ke dalam file serialisasi
    public void simpanKeFileSerialisasi() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("buku.ser"))) {
            for (Buku buku : bukuList) {
                out.writeObject(buku);
            }
            System.out.println("Buku berhasil disimpan ke buku.ser");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke buku.ser: " + e.getMessage());
        }
    }

    // Memuat buku dari file teks
    public void tampilkanBukuDariFileText() {
        try (BufferedReader reader = new BufferedReader(new FileReader("buku.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("Judul: " + data[0] + ", Pengarang: " + data[1] + ", Tahun Terbit: " + data[2]);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca buku.txt: " + e.getMessage());
        }
    }

    // Menampilkan buku dari file serialisasi
    public void tampilkanBukuDariFileSerialisasi() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("buku.ser"))) {
            while (true) {
                Buku buku = (Buku) in.readObject();
                System.out.println(buku);
            }
        } catch (EOFException e) {
            // End of file, tidak ada masalah
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca buku.ser: " + e.getMessage());
        }
    }

    // Menambahkan buku baru ke dalam daftar buku
    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    // Mencari buku berdasarkan judul atau pengarang
    public List<Buku> cariBuku(String query) {
        List<Buku> hasilCari = new ArrayList<>();
        for (Buku buku : bukuList) {
            if (buku.getJudul().toLowerCase().contains(query.toLowerCase()) || 
                buku.getPengarang().toLowerCase().contains(query.toLowerCase())) {
                hasilCari.add(buku);
            }
        }
        return hasilCari;
    }

    // Mengupdate informasi buku
    public void updateBuku(Buku buku, String judul, String pengarang, int tahunTerbit) {
        buku.setJudul(judul);
        buku.setPengarang(pengarang);
        buku.setTahunTerbit(tahunTerbit);
    }

    // Menghapus buku dari daftar buku
    public void hapusBuku(Buku buku) {
        bukuList.remove(buku);
    }

    // Memuat buku dari file serialisasi
    private void loadBuku() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("buku.ser"))) {
            while (true) {
                Buku buku = (Buku) in.readObject();
                bukuList.add(buku);
            }
        } catch (EOFException e) {
            // End of file, tidak ada masalah
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat memuat data buku: " + e.getMessage());
        }
    }

    // Menampilkan semua buku
    public void tampilkanSemuaBuku() {
        if (bukuList.isEmpty()) {
            System.out.println("Tidak ada buku dalam daftar.");
        } else {
            for (Buku buku : bukuList) {
                System.out.println(buku);
            }
        }
    }

    // Kelas Buku yang berfungsi untuk mendefinisikan objek Buku
    static class Buku implements Serializable {
        private String judul;
        private String pengarang;
        private int tahunTerbit;

        // Constructor
        public Buku(String judul, String pengarang, int tahunTerbit) {
            this.judul = judul;
            this.pengarang = pengarang;
            this.tahunTerbit = tahunTerbit;
        }

        // Getter dan Setter
        public String getJudul() {
            return judul;
        }

        public void setJudul(String judul) {
            this.judul = judul;
        }

        public String getPengarang() {
            return pengarang;
        }

        public void setPengarang(String pengarang) {
            this.pengarang = pengarang;
        }

        public int getTahunTerbit() {
            return tahunTerbit;
        }

        public void setTahunTerbit(int tahunTerbit) {
            this.tahunTerbit = tahunTerbit;
        }

        // Menampilkan informasi buku
        @Override
        public String toString() {
            return "Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun Terbit: " + tahunTerbit;
        }
    }

    // Fungsi utama untuk menjalankan aplikasi
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemManajemenBuku manajemenBuku = new SistemManajemenBuku();

        int pilihan;
        do {
            System.out.println("\nMenu Sistem Manajemen Buku");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Tampilkan Daftar Buku (buku.txt)");
            System.out.println("3. Tampilkan Daftar Buku (buku.ser)");
            System.out.println("4. Cari Buku");
            System.out.println("5. Update Buku");
            System.out.println("6. Hapus Buku");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                    // Menambah buku baru
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan pengarang buku: ");
                    String pengarang = scanner.nextLine();
                    System.out.print("Masukkan tahun terbit buku: ");
                    int tahunTerbit = scanner.nextInt();
                    Buku bukuBaru = new Buku(judul, pengarang, tahunTerbit);
                    manajemenBuku.tambahBuku(bukuBaru);
                    manajemenBuku.simpanKeFileText();
                    manajemenBuku.simpanKeFileSerialisasi();
                    break;
                case 2:
                    // Menampilkan buku dari file teks
                    manajemenBuku.tampilkanBukuDariFileText();
                    break;
                case 3:
                    // Menampilkan buku dari file serialisasi
                    manajemenBuku.tampilkanBukuDariFileSerialisasi();
                    break;
                case 4:
                    // Mencari buku
                    System.out.print("Masukkan kata kunci pencarian: ");
                    String query = scanner.nextLine();
                    var hasilCari = manajemenBuku.cariBuku(query);
                    if (hasilCari.isEmpty()) {
                        System.out.println("Buku tidak ditemukan.");
                    } else {
                        for (Buku buku : hasilCari) {
                            System.out.println(buku);
                        }
                    }
                    break;
                case 5:
                    // Update buku
                    System.out.print("Masukkan judul buku yang ingin diupdate: ");
                    String judulUpdate = scanner.nextLine();
                    Buku bukuUpdate = null;
                    for (Buku buku : manajemenBuku.bukuList) {
                        if (buku.getJudul().equalsIgnoreCase(judulUpdate)) {
                            bukuUpdate = buku;
                            break;
                        }
                    }
                    if (bukuUpdate != null) {
                        System.out.print("Masukkan judul baru: ");
                        String newJudul = scanner.nextLine();
                        System.out.print("Masukkan pengarang baru: ");
                        String newPengarang = scanner.nextLine();
                        System.out.print("Masukkan tahun terbit baru: ");
                        int newTahunTerbit = scanner.nextInt();
                        manajemenBuku.updateBuku(bukuUpdate, newJudul, newPengarang, newTahunTerbit);
                        manajemenBuku.simpanKeFileText();
                        manajemenBuku.simpanKeFileSerialisasi();
                    } else {
                        System.out.println("Buku tidak ditemukan.");
                    }
                    break;
                case 6:
                    // Hapus buku
                    System.out.print("Masukkan judul buku yang ingin dihapus: ");
                    String judulHapus = scanner.nextLine();
                    Buku bukuHapus = null;
                    for (Buku buku : manajemenBuku.bukuList) {
                        if (buku.getJudul().equalsIgnoreCase(judulHapus)) {
                            bukuHapus = buku;
                            break;
                        }
                    }
                    if (bukuHapus != null) {
                        manajemenBuku.hapusBuku(bukuHapus);
                        manajemenBuku.simpanKeFileText();
                        manajemenBuku.simpanKeFileSerialisasi();
                        System.out.println("Buku berhasil dihapus!");
                    } else {
                        System.out.println("Buku tidak ditemukan.");
                    }
                    break;
                case 7:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 7);

        scanner.close();
    }
}


