/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author wahyu
 */
// Kelas Buku  
public class Buku extends Produk {  
    private final double diskon = 0.15;  

    public Buku(String nama, double harga) {  
        super(nama, harga);  
    }  

    @Override  
    public double hitungDiskon() {  
        return harga - (harga * diskon);  
    }  

    public double getDiskonPersen() {  
        return diskon * 100; // Mengembalikan diskon dalam persen  
    }  
}  