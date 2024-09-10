/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanpertemuan2.MenerapkanInterface;

/**
 *
 * @author User
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Membuat objek dari kelas Matematika
        Matematika matematika = new Matematika();
        
        // Mendefinisikan nilai-nilai untuk operasi
        int a1 = 20;
        int b1 = 10;
        int a2 = 10;
        int b2 = 5;
        int a3 = 10;
        int b3 = 3;
        int a4 = 21;
        int b4 = 2;
        
        // Menampilkan hasil operasi
        System.out.println("Pertambahan: " + a1 + " + " + b1 + " = " + matematika.Pertambahan(a1, b1));
        System.out.println("Pengurangan: " + a2 + " - " + b2 + " = " + matematika.Pengurangan(a2, b2));
        System.out.println("Perkalian: " + a3 + " * " + b3 + " = " + matematika.Perkalian(a3, b3));
        System.out.println("Pembagian: " + a4 + " / " + b4 + " = " + matematika.Pembagian(a4, b4));

    }
   
}
    
