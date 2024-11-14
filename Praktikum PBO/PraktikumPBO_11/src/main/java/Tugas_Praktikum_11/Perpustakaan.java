/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum_11;

/**
 *
 * @author wahyu
 */  
import java.util.ArrayList;  

public class Perpustakaan {  
    private ArrayList<Buku> daftarBuku;   
 
    public Perpustakaan() {  
        this.daftarBuku = new ArrayList<>();   
    }  
  
    public void tambahBuku(Buku buku) {  
        daftarBuku.add(buku);  
    }  
 
    public void infoPerpustakaan() {  
        if (daftarBuku.isEmpty()) {  
            System.out.println("Perpustakaan tidak memiliki buku.");  
        } else {  
            for (Buku buku : daftarBuku) {  
                System.out.println(buku.infoBuku());   
            }  
        }  
    }  
}