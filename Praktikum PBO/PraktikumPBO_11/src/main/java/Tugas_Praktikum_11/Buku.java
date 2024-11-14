/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum_11;

/**
 *
 * @author wahyu
 */  
public class Buku {  
    private String judul;   
    private Pengarang pengarang; 
 
    public Buku(String judul, Pengarang pengarang) {  
        this.judul = judul;  
        this.pengarang = pengarang;  
    }  
 
    public String infoBuku() {  
        return "Judul Buku: " + judul + "\nPengarang: " + pengarang.infoPengarang();  
    }  
}
