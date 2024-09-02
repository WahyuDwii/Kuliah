/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author wahyu dwi
 */
public class MainMobil {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Chevrolet", "Chevrolet Corvette Stingray", 2023, "Abu-abu");
        Mobil mobil2 = new Mobil("Aston Martin", "Aston Martin Vantage", 2022, "Putih");
        
        System.out.println("Informasi Mobil 1:");
        mobil1.displayInfo();
        System.out.println();
        
        System.out.println("Informasi Mobil 2:");
        mobil2.displayInfo();
        System.out.println();
        
        mobil1.startEngine();
        mobil2.startEngine();
        System.out.println();
        
        mobil1.setWarna("Putih");
        mobil2.setWarna("Hitam");
        
        System.out.println("Informasi Mobil 1 setelah perubahan warna:");
        mobil1.displayInfo();
        System.out.println();
        
        System.out.println("Informasi Mobil 2 setelah perubahan warna:");
        mobil2.displayInfo();
    }
}
