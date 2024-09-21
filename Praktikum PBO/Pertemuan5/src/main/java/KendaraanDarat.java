/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wahyu
 */
class KendaraanDarat extends Kendaraan {
    protected String bahanBakar;

    public KendaraanDarat(String nama, int kecepatan, String bahanBakar) {
        super(nama, kecepatan);
        this.bahanBakar = bahanBakar;
    }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() +
               "\nBahan Bakar: " + bahanBakar;
    }
}