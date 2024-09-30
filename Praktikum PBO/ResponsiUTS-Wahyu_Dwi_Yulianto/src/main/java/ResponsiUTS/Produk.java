/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author wahyu
 */
class Produk {  
    private String namaProduk;  
    private int harga;   

    public Produk(String namaProduk, int harga) {  
        this.namaProduk = namaProduk;  
        this.harga = harga;  
    }  

    public void tampilkanInfo() {  
        System.out.println("Nama Produk: " + namaProduk);  
        System.out.println("Harga: " + harga);    
    }  
}  