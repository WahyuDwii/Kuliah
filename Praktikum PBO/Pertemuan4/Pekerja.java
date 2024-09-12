/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author wahyu
 */
public class Pekerja extends Manusia {  
    private double gaji; // Atribut tambahan dengan akses modifier private  
    
    // Constructor  
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {  
        super(nama, usia, pekerjaan); // Memanggil constructor dari kelas induk  
        this.gaji = gaji;  
    }  

    // Getter untuk gaji  
    public double getGaji() {  
        return gaji;  
    }  

    // Override metode toString  
    @Override  
    public String toString() {  
        return "Nama: " + getNama() +  
               ", Usia: " + usia +  
               ", Pekerjaan: " + pekerjaan +  
               ", Gaji: " + gaji;  
    }  
}

