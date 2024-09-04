/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author wahyu dwi
 */
public class Main {
    public static void main(String[] args) {
        
        Hewan kucing = new Hewan("Mimi", 3);
        
        kucing.suara();
        kucing.info(); 
        
        
        System.out.println("Nama saat ini: " + kucing.getNama());
        System.out.println("Umur saat ini: " + kucing.getUmur());
        
        kucing.setNama("Luna");
        kucing.setUmur(4);
        
        System.out.println("Nama setelah diubah: " + kucing.getNama());
        System.out.println("Umur setelah diubah: " + kucing.getUmur());
    }
}

