/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author wahyu
 */
public class Main {  
    public static void main(String[] args) {  
        // Membuat objek dari kelas Kendaraan  
        Kendaraan kendaraan1 = new Kendaraan("Toyota", 180, "Bensin");  
        
        // Menampilkan informasi kendaraan  
        System.out.println("Informasi Kendaraan 1:");  
        kendaraan1.tampilkanInfoKendaraan();  
        
        // Mengubah nama kendaraan menggunakan setter  
        kendaraan1.setNama("Honda");  
        
        // Menampilkan informasi kendaraan setelah perubahan nama  
        System.out.println("\nSetelah mengubah nama:");  
        kendaraan1.tampilkanInfoKendaraan();  
    }  
}