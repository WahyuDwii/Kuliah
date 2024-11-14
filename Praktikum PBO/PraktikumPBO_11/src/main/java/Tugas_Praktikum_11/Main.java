/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum_11;

/**
 *
 * @author wahyu
 */ 
public class Main {  
    public static void main(String[] args) {  
        // Membuat pengarang  
        Pengarang pengarang1 = new Pengarang(" Fiersa Besari");  
        Pengarang pengarang2 = new Pengarang("Andrea Hirata");  

        // Membuat buku  
        Buku buku1 = new Buku("Kata Hati", pengarang1);  
        Buku buku2 = new Buku("Laskar Pelangi", pengarang2);  

        // Membuat perpustakaan  
        Perpustakaan perpustakaan = new Perpustakaan();  

        // Menambahkan buku ke perpustakaan  
        perpustakaan.tambahBuku(buku1);  
        perpustakaan.tambahBuku(buku2);  

        // Menampilkan informasi semua buku di perpustakaan  
        perpustakaan.infoPerpustakaan();  
    }  
}