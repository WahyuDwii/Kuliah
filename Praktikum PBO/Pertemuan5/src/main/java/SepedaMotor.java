/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wahyu
 */
class SepedaMotor extends KendaraanDarat {
    private String jenisMesin;

    public SepedaMotor(String nama, int kecepatan, String bahanBakar, String jenisMesin) {
        super(nama, kecepatan, bahanBakar);
        this.jenisMesin = jenisMesin;
    }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + "\nJenis Mesin: " + jenisMesin;
    }
}