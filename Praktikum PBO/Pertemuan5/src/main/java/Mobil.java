/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wahyu
 */
class Mobil extends KendaraanDarat {
    private int jumlahPintu;

    public Mobil(String nama, int kecepatan, String bahanBakar, int jumlahPintu) {
        super(nama, kecepatan, bahanBakar);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + "\nJumlah Pintu: " + jumlahPintu;
    }
}