/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author wahyu
 */
import java.text.DecimalFormat;  

public class MainBelanja {  
    public static void main(String[] args) {  
        // Membuat objek produk  
        Produk buku = new Buku("Java Programming", 200000);  
        Produk elektronik = new Elektronik("Smartphone", 3000000);  
        Produk pakaian = new Pakaian("T-shirt", 150000);  

        // Membuat keranjang belanja  
        KeranjangBelanja keranjang = new KeranjangBelanja();  
        keranjang.tambahProduk(buku);  
        keranjang.tambahProduk(elektronik);  
        keranjang.tambahProduk(pakaian);  

        // Format angka  
        DecimalFormat df = new DecimalFormat("#,###");  

        // Menampilkan detail belanja  
        keranjang.tampilkanDetailBelanja();  
        
        // Menampilkan total harga setelah diskon  
        System.out.println("Total harga setelah diskon: IDR " + df.format(keranjang.totalHargaSetelahDiskon()));  
    }  
}