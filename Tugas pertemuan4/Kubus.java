/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * Class Kubus yang meng-extends BangunRuang
 */
public class Kubus extends BangunRuang{
    private double sisi;
    
    // Constructor untuk kubus 
    
    public Kubus(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double hitungvolume() {
        return sisi * sisi * sisi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
    
}
