/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wahyu
 */
public class MainKendaraan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Chevrolet Corvette Stingray", 290, "Bensin", 2);
        SepedaMotor sepedaMotor = new SepedaMotor("Honda Vario", 150, "Bensin", "Mesin 150cc");

        System.out.println(mobil.tampilkanInfo());
        System.out.println();
        System.out.println(sepedaMotor.tampilkanInfo());
    }
}

