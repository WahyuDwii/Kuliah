/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author wahyu
 */
public class Main {  
    public static void main(String[] args) {  
        // Output Produk  
        Elektronik laptop = new Elektronik("Laptop", 15000000, 2);  
        System.out.println("1. Output Produk:");  
        laptop.tampilkanInfo();  

        // Output Pegawai Tetap  
        PegawaiTetap pegawaiTetap = new PegawaiTetap("Wahyu Dwi Yulianto", 5000000, 1000000);  
        System.out.println("\n2. Output Pegawai Tetap:");  
        pegawaiTetap.tampilkanInfo();  

        // Output Pegawai Kontrak  
        PegawaiKontrak pegawaiKontrak = new PegawaiKontrak("Shevia"
                + "", 3000000, 6);  
        System.out.println("\n3. Output Pegawai Kontrak:");  
        pegawaiKontrak.tampilkanInfo();  

        // Output Makanan  
        Makanan snack = new Makanan("Snack", 15000, "2023-12-30");  
        System.out.println("\n4. Output Makanan:");  
        snack.tampilkanInfo();  
    }  
}  