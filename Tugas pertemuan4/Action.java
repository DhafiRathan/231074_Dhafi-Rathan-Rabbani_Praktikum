/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author User
 */
public class Action {

    public static void main(String[] args) {
        // Memebuat objek Balok
        
        Balok balok = new Balok (5, 3, 4);
        System.out.println("Volume Balok: " + balok.hitungvolume());
        System.out.println("Luas Permukaan Kubus: " + balok.hitungLuasPermukaan());
        
        
        // Membuat objek Kubus
        
        Kubus kubus = new Kubus(4);
        System.out.println("Volume Kubus: " + kubus.hitungvolume());
        System.out.println("Volume Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
    
}
