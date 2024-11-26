/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpertemuan3no2;

/**
 *
 * @author User
 */
public class KonversiSuhu2 extends KonversiSuhu{
    public double fahrenheitToReamur (double fahrenheit) {
        
        // Mengubah Fahrenheit ke Celcius terlebih dahulu
        double celcius = (fahrenheit - 32) * 5 / 9;
        
        // Lalu mengubah dari Celcius ke Reamur
        return celcius * 4 / 5;
    }
}
