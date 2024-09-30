/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author wahyu
 */  
class Pegawai {  
    private String namaPegawai;  
    private int gaji;  

    public Pegawai(String namaPegawai, int gaji) {  
        this.namaPegawai = namaPegawai;  
        this.gaji = gaji;  
    }  

    public void tampilkanInfo() {  
        System.out.println("Nama Pegawai: " + namaPegawai);  
        System.out.println("Gaji: " + gaji);  
    }  
}