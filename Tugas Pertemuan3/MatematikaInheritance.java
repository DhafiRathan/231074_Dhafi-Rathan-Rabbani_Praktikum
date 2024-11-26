/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanpertemuan3no1;

/**
 *
 * @author User
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek dari kelas Matematika2
        
        Matematika2 matematika = new Matematika2();
        
        // Memanggil semua method 
        
        System.out.println("Pertambahan; " + matematika.pertambah(10, 5));
        System.out.println("Pengurangan; " + matematika.pengurang(10, 5));
        System.out.println("Perkalian; " + matematika.perkalian(10, 5));
        System.out.println("Modulus; " + matematika.modulus(10, 5));
        
    }
    
}
