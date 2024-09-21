/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wahyu
 */
public class Hewan {  
    protected String nama;  
    protected String jenis;  

    public Hewan(String nama, String jenis) {  
        this.nama = nama;  
        this.jenis = jenis;  
    }  

    public String tampilkanInfo() {  
        return "Nama: " + nama + "\nJenis: " + jenis;  
    }  
}
