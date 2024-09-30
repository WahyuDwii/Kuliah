/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author wahyu
 */
class Makanan extends Produk {  
    private String tanggalKadaluwarsa;  

    public Makanan(String namaProduk, int harga, String tanggalKadaluwarsa) {  
        super(namaProduk, harga);  
        this.tanggalKadaluwarsa = tanggalKadaluwarsa;  
    }  

    @Override  
    public void tampilkanInfo() {  
        super.tampilkanInfo();  
        System.out.println("Tanggal Kadaluwarsa: " + tanggalKadaluwarsa);  
    }  
}  
