/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author wahyu
 */ 
public class Manusia {  
    private String nama;          
    protected int usia;           
    public String pekerjaan;      

    // Constructor  
    public Manusia(String nama, int usia, String pekerjaan) {  
        this.nama = nama;  
        this.usia = usia;  
        this.pekerjaan = pekerjaan;  
    }  

    // Getter untuk nama  
    public String getNama() {  
        return nama;  
    }  

    // Setter untuk nama  
    public void setNama(String nama) {  
        this.nama = nama;  
    }  

    public void tampilinfo() {  
        System.out.println("Nama: " + getNama());  
        System.out.println("Usia: " + usia);  
        System.out.println("Pekerjaan: " + pekerjaan);  
    }  
}