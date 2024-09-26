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
import java.util.ArrayList;  
import java.util.List;  

public class KeranjangBelanja {  
    private List<Produk> produkList = new ArrayList<>();  
    private DecimalFormat df = new DecimalFormat("#,###.###");  

    public void tambahProduk(Produk produk) {  
        produkList.add(produk);  
    }  

    public double totalHargaSetelahDiskon() {  
        double total = 0;  
        for (Produk produk : produkList) {  
            total += produk.hitungDiskon();  
        }  
        return total;  
    }  

    public void tampilkanDetailBelanja() {  
        System.out.println("Detail Belanja:");  
        for (Produk produk : produkList) {  
            System.out.printf("%s - IDR %s (Setelah Diskon: IDR %s)%n",  
                produk.getNama(),  
                df.format(produk.getHarga()),  
                df.format(produk.hitungDiskon()));  
        }  
    }  
}