/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wahyu
 */
class Kucing extends Hewan {  
    public Kucing(String nama) {  
        super(nama, "Kucing");  
    }  

    @Override  
    public String tampilkanInfo() {  
        return super.tampilkanInfo() + "\nSuara: Meow";  
    }  
}
