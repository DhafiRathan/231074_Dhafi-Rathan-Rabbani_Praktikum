/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * Class balok yang meng-extends BangunRuang
 */
public class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;
    
    //Constructor untuk Balok
    
    public Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar   = lebar;
        this.tinggi  = tinggi;
    }
    

    @Override
    public double hitungvolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi +lebar * tinggi);
    }
    
    
}
