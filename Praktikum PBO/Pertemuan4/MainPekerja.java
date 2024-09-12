/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author wahyu
 */
public class MainPekerja {  
    public static void main(String[] args) {  
        // Membuat objek dari kelas Pekerja  
        Pekerja pekerja1 = new Pekerja("Shevia", 21 , "Psikolog", 5000000);  

        // Menampilkan informasi pekerja  
        System.out.println("Informasi Pekerja 1:");  
        System.out.println(pekerja1.toString());  

        // Mengubah nama pekerja menggunakan metode setter  
        pekerja1.setNama("Aurelia");  
        
        // Menampilkan ulang informasi pekerja  
        System.out.println("\nSetelah mengubah nama:");  
        System.out.println(pekerja1.toString());
        
        // Akses langsung atribut (tidak diperbolehkan)  
        // System.out.println(pekerja.nama); // Error: nama bersifat private  
        // System.out.println(pekerja.usia); // Error: usia bersifat protected  
        // System.out.println(pekerja.gaji); // Error: gaji bersifat private 
    }  
}  
