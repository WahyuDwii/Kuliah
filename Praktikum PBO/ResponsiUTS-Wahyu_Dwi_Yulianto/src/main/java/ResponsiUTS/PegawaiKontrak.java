/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author wahyu
 */
// Kelas PegawaiKontrak  
class PegawaiKontrak extends Pegawai {  
    private int lamaKontrak;  

    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrak) {  
        super(namaPegawai, gaji);  
        this.lamaKontrak = lamaKontrak;  
    }  

    @Override  
    public void tampilkanInfo() {  
        super.tampilkanInfo();  
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");  
    }  
}  