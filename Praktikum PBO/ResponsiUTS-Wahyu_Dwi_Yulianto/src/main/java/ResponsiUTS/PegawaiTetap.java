/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author wahyu
 */
class PegawaiTetap extends Pegawai {  
    private int tunjangan;   

    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan) {  
        super(namaPegawai, gaji);  
        this.tunjangan = tunjangan;  
    }  

    @Override  
    public void tampilkanInfo() {  
        super.tampilkanInfo();  
        System.out.println("Tunjangan: " + tunjangan); 
    }  
}  